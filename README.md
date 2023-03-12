# Programmer Calculator Challenge
> This project is a simple programmer calculator app written in Kotlin using Android Studio.The app provides a user interface for converting decimal, binary, octal, and hexadecimal numbers in real-time.

## Features
  - The user can enter a number in one of the input fields, and the app will automatically convert it to the other three formats.
  - The user can clear all input fields by tapping on the "Clear" button.

## Technologies Used
  - Kotlin
  - Android Studio

## Getting Started
To use the app, simply download or clone the repository, open the project in Android Studio, and run it on an emulator or physical device.
```git
git clone https://github.com/M7mdSh3banX/Programmer-Calculator-Challenge
```

## Screenshot demo for the android screen
<p align="center">
<img alt="screenshot" src="https://github.com/M7mdSh3banX/Programmer-Calculator-Challenge/blob/master/Screenshot%20Demo.jpeg">
</p>

## How It Works
  - The app listens to the text changes in each input field using ```TextWatcher```. Whenever the user types a number in any of the input fields, the app converts it to the other three formats using the built-in Kotlin functions ```toULongOrNull()``` and ```toString()```. The converted values are then set to the remaining input fields.

## Contributions
  - Contributions to the project are always welcome. If you would like to contribute, please fork the repository and submit a pull request.

## License
  - This project is licensed under the Apache License 2.0 - see the [LICENSE](https://github.com/M7mdSh3banX/Programmer-Calculator-Challenge/blob/master/LICENCE.md) file for details.
