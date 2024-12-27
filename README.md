# Add Number - Kotlin Multiplatform Mobile (KMM) Demo

This project is a simple demonstration of a Kotlin Multiplatform Mobile (KMM) application that showcases shared business logic and platform-specific UI for an "Add Number" feature.

## Features

- **Shared Logic**: The core logic for incrementing numbers is implemented in the shared KMM module.
- **Native UI**:

  - **Android**: Built using Jetpack Compose.
  - **iOS**: Built using SwiftUI.

---

## Project Structure

```plaintext
add-number-kmm/
├── androidApp/         # Android-specific UI
├── iosApp/             # iOS-specific UI
├── shared/             # Shared logic module
│   ├── src/
│   │   ├── commonMain/ # Shared Kotlin logic
│   │   ├── androidMain/ # Android-specific Kotlin code
│   │   ├── iosMain/     # iOS-specific Kotlin code

```
<div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
  <img src="https://github.com/user-attachments/assets/291d1b39-7be5-48e8-959d-755d6adcabce" alt="iOS Screenshot" width="300"/>
  <img src="https://github.com/user-attachments/assets/e3d75549-f0fc-48f1-91c7-253cad695a2a" alt="Android Screenshot" width="300"/>
</div>
