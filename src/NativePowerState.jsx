import { createElement, useEffect, useState } from "react";
import { View } from "react-native";
import { usePowerState } from "react-native-device-info";

export function NativePowerState({ powerStateAttr, onPowerStateChanged }) {
    const powerState = usePowerState();
    const [currentBatteryState, setCurrentBatteryState] = useState(undefined);
    useEffect(() => {
        const newBatteryState = powerState?.batteryState ? "" + powerState.batteryState : undefined;
        if (newBatteryState !== currentBatteryState) {
            console.info("Power state change, old: " + currentBatteryState + ", new: " + newBatteryState);

            // We keep a state value too. It may take several renders before the current value of the atttribute property reflects the change.
            // That could result in multiple calls to the action
            setCurrentBatteryState(newBatteryState);

            // Update the attribute value
            powerStateAttr.setValue(newBatteryState);

            // Call the action
            if (onPowerStateChanged && onPowerStateChanged.canExecute && !onPowerStateChanged.isExecuting) {
                onPowerStateChanged.execute();
            }
        }
    }, [currentBatteryState, powerState, powerStateAttr, onPowerStateChanged]);

    return <View />;
}