# PictoChat 🎨 

A modern, localized peer-to-peer drawing chat application for Android. 

Inspired by classic localized chat rooms, PictoChat allows users to connect with friends in the same room entirely offline. Instead of typing, users communicate by sending hand-drawn sketches, bringing back the tactile, collaborative fun of local multiplayer experiences.

## 🚀 Project Philosophy
Instead of trying to build a jack-of-all-trades messaging giant, this project takes a "master of one" approach. It commits 100% to delivering a flawless, offline, peer-to-peer drawing experience. By focusing deeply on a single core feature set, the app demonstrates a robust understanding of modern Android architecture, state management, and localized networking.

## ✨ Key Features
* **100% Offline Connectivity:** Utilizes Google's Nearby Connections API to bridge devices via WiFi Direct and Bluetooth. No internet connection required.
* **Interactive Canvas:** A custom-built Jetpack Compose drawing surface with advanced touch handling, multi-touch rejection, and mathematical path smoothing (Bezier curves).
* **Responsive UI:** The canvas and chat feed are built to scale seamlessly. Whether running on a standard candy-bar display or an expansive inner folding screen, the coordinate data normalizes perfectly to the device's aspect ratio.
* **Real-Time Data Serialization:** Translates complex visual stroke data into lightweight byte arrays for instant, latency-free transmission.

## 🛠 Tech Stack & Architecture
* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose
* **Architecture:** MVVM (Model-View-ViewModel)
* **Asynchrony:** Coroutines & StateFlow
* **Networking:** Nearby Connections API (P2P_CLUSTER strategy)
* **Serialization:** kotlinx.serialization

## 📱 Installation & Setup
1. Clone this repository: `git clone https://github.com/JNapzz/PictoChat-App.git`
2. Open the project in Android Studio.
3. Sync Gradle files.
4. Build and run the app on two physical Android devices (emulators do not support Nearby Connections effectively).
5. Grant the necessary Bluetooth and Nearby Devices permissions upon first launch.

## 🗺️ Roadmap
Check out the [GitHub Projects Board](link-to-your-board) to see current sprints and active development tasks. 
* **Phase 1:** Interactive Canvas Optimization
* **Phase 2:** Data Serialization
* **Phase 3:** Chat UI Construction
* **Phase 4:** P2P Networking Integration

## 🤝 Contributors
* Justyn Napolitano / https://github.com/JNapzz
# PictoChat

A distributed, real-time drawing and chat communication platform built natively for Android. 

## Overview
This project aims to reimagine the classic localized drawing experience for the modern web. By utilizing an event-driven cloud backend, users can connect, draw, and chat simultaneously across disparate global networks with near-zero latency. 

## Technical Stack
*Client Enviornment:* Native Android Development

*Language:* Kotlin

*Backend Infastructure:* Firebase Realtime Database

*Data Transport:* JSON Serialization

*Version Control:* Git

## Repository MAnagement
~ This repository simulates a strict, professional engineering enviornment

~ Direct pushes to the main branch are explitly disable via GitHub Branch Protection rules

~ All code modification require a formalized Pull Request, accompanied by a mandatory review and approval from designated CODEWONERS before merging. 

## Core Development Milestones
*The Interactive Canvas:* Engineering the custom Android views to capture and redner raw touch coordinates. 

*State Serialization:* Compressing the vector data for efficient network transmission. 

*The Firebase Listener:* Implementing the cloud observers to instantly pull and render remote data on the local client canvas. 
