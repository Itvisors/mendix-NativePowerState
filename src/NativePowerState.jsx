import { createElement, useEffect, useState } from "react";
import { View } from "react-native";
import { usePowerState } from "react-native-device-info";

export function NativePowerState({ powerStateAttr, onPowerStateChanged }) {
    const powerState = usePowerState();
    const [currentBatteryState, setCurrentBatteryState] = useState("");
    useEffect(() => {
        if (!currentBatteryState || currentBatteryState !== powerState.batteryState) {
            // console.info("Power state change, old: " + currentBatteryState + ", new: " + powerState.batteryState);
            const newBatteryState = "" + powerState.batteryState;
            setCurrentBatteryState(newBatteryState);
            powerStateAttr.setTextValue(newBatteryState);
            if (onPowerStateChanged && onPowerStateChanged.canExecute && !onPowerStateChanged.isExecuting) {
                onPowerStateChanged.execute();
            }
        }
    }, [currentBatteryState, powerState, powerStateAttr, onPowerStateChanged]);

    return <View />;
}
