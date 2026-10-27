# Contributing to PictoChat App!

~ This document outlines the strict version control and collaboration protocols for the core development team. 

~ External pull requests are currently not being accepted as this repository serves as a closed-scope architectural demonstration. 

## 🌿 Branching Strategy
*All Development must occur on isolated, feature-specific branches. Direct commits to main are restricted*

~ Please adhere to the following prefix standards when creating a new branch:

  **feature/** : For new architectural additions (e.g., feature/interactive-canvas) 
  
  **fix/** : For bug tracking and resoltuion (e.g., fix/firebase-serialization-latency)
  
  **chore/** : For dependency updates, documentation or gradle adjustments (e.g., chore/README-add-     contributor)

## 🛠 Pull Request (PR) Workflow
*To maintain the integrity of the Firebase integration and core logic, the following merge constraints are mechanically enforced via GitHub:*

  **No direct Pushes**: All code must be submitted via a Pull REquest against the main branch

  **Mandatory Review**: Every PR requires a minimum of one (1) approving review from a               designated code owner

  **Contexual Descriptions**: All PR's must include a summary of the technical changes made, the     specific file targets, and any new Firebase Database rules introduced

## 📏 Code Style & Standards
*Keep the commit message clean so your history tells a story.*

~ Commit messages should be concise and clearly state the mechanical change.

  **Good**: "Serialize canvas vector data to JSON for Firebase transport" 
  
  **Bad**: "Fixed the drawing bug" 
