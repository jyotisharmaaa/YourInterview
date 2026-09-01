# AI Interview Coach
## Planned Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Coroutines / Flow
- MVVM
- Clean Architecture
- Hilt
- Room
- Retrofit / OkHttp
- LLM API (OpenAI/Gemini)
- Speech-to-Text
- JUnit
- Compose UI Testing
- GitHub Actions
- CI/CD

## Current Status

**Sprint 0 — Setup**
Decision	Choice	Rationale
Interview mode (MVP)	Text-first	Prove the loop before adding audio complexity
LLM	OpenAI API primary, MediaPipe/Gemma fallback	Cloud quality now, offline path later
Package structure	Package-by-feature	Independent feature boundaries as app scales

## Development Workflow

This project follows a branch → pull request → CI → review → merge workflow.

All changes should pass automated checks before being merged into `main`.