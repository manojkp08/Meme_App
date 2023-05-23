# MemeApp

MemeApp is an Android application developed using Kotlin and XML. It allows users to fetch and display memes from the [Meme API](https://meme-api.com/gimme). The app utilizes Retrofit for making HTTP requests and Gson for handling JSON data. Image loading and caching are handled by the Glide library.

## Dependencies

To build and run the MemeApp project, the following dependencies are required:

- Retrofit and Gson:
  - `implementation 'com.google.code.gson:gson:2.9.1'`
  - `implementation 'com.squareup.retrofit2:retrofit:2.9.0'`
  - `implementation 'com.squareup.retrofit2:converter-gson:2.9.0'`

- Glide:
  - `implementation 'com.github.bumptech.glide:glide:4.15.1'`

Make sure to add these dependencies to your project's build.gradle file.

## Installation

To run the MemeApp project, follow these steps:

- 1. Clone this repository to you local machine.
- 2. Open the project in Android Studio.
- 3. Build and run the project on an Android emulator or a connected device.

## Features

- Fetches memes from the Meme API using Retrofit.
- Displays memes in the app's user interface.
- Uses Glide to load and cache images from the API.

## Usage
Once you have the MemeApp running on your Android device, follow these steps to use the app:

 - Launch the app.
 - The app will automatically fetch a meme from the Meme API and display it on the screen.
 - You can tap on a button or perform a specific action to fetch a new meme from the API and display it.
 - Feel free to explore the app's functionality and enjoy the memes!