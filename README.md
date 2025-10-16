## Practical-5

##  Aim
To create an Android application that includes Login and Registration screens using Jetpack Compose.

## ⚙️ Features
- **Modern UI:** Built entirely with Jetpack Compose and Material 3.
- **Login Screen:** Includes email and password fields with validation placeholders.
- **Registration Screen:** Allows new users to register with name, phone, city, email, and password.
- **Navigation:** Seamless transition between Login and Registration screens using `NavHost` and `NavController`.
- **Reusable Components:** Custom `formField` composable for flexible input fields (text, password, number).
- **Material Design:** Uses Material3 components, color schemes, and rounded buttons.

## Concepts Used
- **Jetpack Compose UI**
- **Composable functions**
- **State management (`remember` and `mutableStateOf`)**
- **Navigation component for Compose**
- **Material 3 components**
- **Preview composables**


## Project Structure

app/
└── src/
├── main/
│ ├── java/com/example/mad_23012011110_practical5/
│ │ ├── MainActivity.kt
│ │ ├── AppNavigation.kt
│ │ └── screen/components/
│ │ ├── LoginScreen.kt
│ │ ├── RegisterationScreen.kt
│ │ └── FormFields.kt
│ └── res/
│ ├── drawable/
│ │ └── guni_logo.png
│ └── values/
│ └── themes.xml

##  File Descriptions

### `MainActivity.kt`
- Entry point of the app.  
- Sets up the Compose theme and navigation between screens using `NavHost`.

### `AppNavigation.kt`
- Defines navigation routes for the app (`login` → `register` and vice versa).

### `LoginScreen.kt`
- Contains the UI for the login form (email & password).  
- Includes a **Sign Up** button that navigates to the registration screen.

### `RegisterationScreen.kt`
- Contains the UI for user registration (name, phone, city, email, password, confirm password).  
- Includes a **Login** button to return to the login screen.

### `FormFields.kt`
- Custom composable for input fields (supports text, password, and numeric types).


##  Screenshots
| **Screen Name**         | **Description**                                                                                                                                           | **Screenshot**                                                                            |
| ----------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| **Login Screen**        | Displays the login form with fields for Email and Password, along with a “Forgot Password?” link and navigation to the Sign-Up screen.                    |<img width="432" height="961" alt="image" src="https://github.com/user-attachments/assets/84ab3d79-0b93-47b4-a287-b1fb3c64b636" />|
| **Registration Screen** | Allows new users to register by entering their Name, Phone Number, City, Email, Password, and Confirm Password, with navigation back to the Login screen. | <img width="440" height="958" alt="image" src="https://github.com/user-attachments/assets/37c5e0dc-5d00-4215-955a-756880fb207a" /> |

## How to Run the App

You’ll see:

Login screen by default

Click “SIGN UP” → goes to Registration screen

Click “LOGIN” → returns to Login screen
