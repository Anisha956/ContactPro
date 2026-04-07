# ContactPro 📇

**ContactPro** is a sophisticated, offline-first Android application designed for seamless contact management. Built with **Jetpack Compose** and the **Room Persistence Library**, it demonstrates high proficiency in modern Android architecture, local data synchronization, and reactive UI patterns.

---

## 🏗 Architecture (MVVM + Repository Pattern)
The project is engineered with a strict **Separation of Concerns** to ensure the codebase is scalable, testable, and maintainable:

* **`data.local`**: Implements the **Room Database**, including Entity definitions and Data Access Objects (DAO) for structured SQLite storage.
* **`data.repository`**: Acts as the **Single Source of Truth**, mediating between the Room DAO and the rest of the application.
* **`viewmodel`**: Leverages `viewModelScope` and `StateFlow` to manage UI states and expose data from the repository reactively.
* **`presentation`**: A 100% declarative UI built with **Jetpack Compose**, utilizing Material 3 components and optimized image rendering.

---

## 🚀 Technical Highlights
* **Offline-First Persistence:** Utilizes Room to ensure all contact data is available instantly, regardless of network connectivity.
* **Reactive Data Streams:** Employs **Kotlin Flow** to push real-time updates from the database directly to the UI.
* **Asynchronous Image Loading:** Integrated **Coil** for high-performance, lifecycle-aware loading of contact avatars.
* **Clean UI/UX:** Built with a focus on Material 3 guidelines, providing a fluid and intuitive user experience.

---

## 🛠 Tech Stack
* **Language:** Kotlin
* **UI Framework:** Jetpack Compose (Material 3)
* **Database:** Room (SQLite Abstraction)
* **Architecture:** MVVM + Repository Pattern
* **Image Loading:** Coil
* **Concurrency:** Coroutines & Flow

---

## 📸 Preview
<img src="home_screen.jpg" width="200"> <img src="add_contact.jpg" width="200"> <img src="detail_screen.jpg" width="200"> <img src="edit_screen.jpg" width="200">


## 📥 Getting Started
1. Clone the repository:
   ```bash
   git clone [https://github.com/Anisha956/ContactPro.git](https://github.com/Anisha956/ContactPro.git)
   
2.Open the project in Android Studio.

3.Build and run on an emulator or physical device.
