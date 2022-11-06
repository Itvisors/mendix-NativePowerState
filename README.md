## NativePowerState
Access the power state of the device and get notified of changes.

## Features
Access the power state of the device and receive notification when the device gets plugged in or unplugged from a charger. On iOS, you can also tell whether the device is fully charged.

## Usage
- Add a string or enum attribute to your context entity to receive the power state
- Put the widget on your page
- Configure the attribute
- If desired, configure an action to perform when the power state changes

Useful to perform actions only when you know the device is charging. Like a barcode scanner that is put on its charger for the night. Keep the app running and synchronize data when the device is not in use.

### Enum values:
- unknown
- unplugged
- charging
- full

Create an enumeration with these values as the name, caption can be anything, for example a translation in the project language.
