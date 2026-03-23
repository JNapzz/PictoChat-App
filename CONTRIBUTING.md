# Contributing to PictoChat App!

First off, thanks for taking the time to contribute! This document outlines the workflow we use to keep our codebase clean, stable, and professional.

## 🌿 Branching Strategy
We use a feature-branch workflow. **Never commit directly to the `main` branch.**
* **Feature Branches:** For new additions. Naming convention: `feature/short-description` (e.g., `feature/canvas-viewmodel`)
* **Bugfix Branches:** For squashing bugs. Naming convention: `bugfix/short-description` (e.g., `bugfix/multitouch-crash`)

## 🛠 Pull Request (PR) Workflow
1. **Assign an Issue:** Claim a ticket from the GitHub Projects board and move it to the "In Progress" column.
2. **Branch Out:** Create your new branch locally from the latest version of `main`.
3. **Commit Often:** Write clear, descriptive commit messages so it is easy to track what changed.
4. **Open a PR:** Once your code is tested and working, push the branch to GitHub and open a Pull Request against the `main` branch.
5. **Peer Review:** Tag the other contributor for a code review. **At least one approval is required before merging.**
6. **Merge & Clean Up:** Once approved, "Squash and Merge" the PR into main, and delete your feature branch to keep the repository tidy.

## 📏 Code Style & Standards
* We follow standard Kotlin formatting conventions. (Ensure the `.editorconfig` rules are applied).
* Before opening a PR, ensure there are no unresolved warnings or critical errors in Android Studio.

Contributors
Justyn Napolitano | github.com/JNapzz
