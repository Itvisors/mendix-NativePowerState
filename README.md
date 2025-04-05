## NativePowerState
Access the power state of the device and get notified of changes.

## Features
Access the power state of the device and receive notification when the device gets plugged in or unplugged from a charger. On iOS, you can also tell whether the device is fully charged.

## Usage
- Put the widget on your page
- Use a nanoflow as the action to perform when the power state changes. it can receive the power state as string

Useful to perform actions only when you know the device is charging. Like a barcode scanner that is put on its charger for the night. Keep the app running and synchronize data when the device is not in use.

### Possible values:
- unknown
- unplugged
- charging
- full
