# Bootcamp Kotlin For Android -

    - Kotlin is a great fit for developing Android applications,
     bringing all of the advantages of a modern language to the Android platform without introducing any new restrictions:

    - This project is based on Kotlin bootcamp course  provided by Udacity. It would boost kotlin exploration by the end of this project.

    - It covers most of the concept of Kotlin language along with small examples.


## Getting Started -


### Prerequisites
    1. Android Studio
    2. Install Android SDK
    3. Install gradle

### Installing
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

### Deployment
   1. `./gradlew clean assembleDebug` - Compile
   2. `./gradlew clean installDebug`  - Run on emulator or mobile device

## Build Types, Flavours, Dimensions

Build Types - Environment
1) Debug
2) Release

## Project aliases, guidelines, dependencies and requirements

## Reference i use while learning Kotlin
1. Kotlin Bootcamp course from Udacity - `https://classroom.udacity.com/courses/ud9011/lessons/c1e0188b-4ae4-45cc-896e-7a7d6c687dd3/concepts/727e79d0-dd36-4efb-a317-a34e67dade97`
2. Kotlin standard library - https://kotlinlang.org/api/latest/jvm/stdlib/index.html
3. https://kotlinlang.org/docs/kotlin-docs.pdf
4. https://pspdfkit.com/blog/2018/simple-kotlin-tricks/#

## Author
   - Vrushali S. Raut

## License
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.