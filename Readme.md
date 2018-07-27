# Bootcamp Kotlin
---

## Getting Started
### Prerequisites
1) Install Java
    - [Direct Link](https://www.java.com/en/download/help/mac_install.xml)
                        (or)
    - using homebrew - ```brew cask install java```

2) Install Android Studio
    - [Direct Link](https://developer.android.com/studio/index.html)
                        (or)
    - using homebrew - ```brew cask install android-studio```

3) Install Android SDK
    - Install it inside android studio ( Tools -> Android -> SDK Manager )
                        (or)
    - using homebrew - ```brew cask install android-sdk```

4) Install gradle
    - [Direct Link](https://gradle.org/install/)
                        (or)
    - ```brew install gradle```

5) Configuring path variable
    ```
    export ANDROID_HOME=$HOME/Library/Android/sdk
    export PATH=$ANDROID_HOME/tools:$PATH
    export PATH=$ANDROID_HOME/platform-tools:$PATH
    ```
    Add these three to ~/.zshrc file and run ```source ~/.zshrc```

### Clone the repository
```git clone https://github.com/vrushaliraut/BootcampKotlin.git```

## Build Types, Flavours, Dimensions

Build Types - Environment
1) Debug
2) Release

## Project aliases, guidelines, dependencies and requirements

## Reference i use while learning Kotlin
1. https://classroom.udacity.com/courses/ud9011/lessons/c1e0188b-4ae4-45cc-896e-7a7d6c687dd3/concepts/727e79d0-dd36-4efb-a317-a34e67dade97
2. https://pspdfkit.com/blog/2018/simple-kotlin-tricks/#