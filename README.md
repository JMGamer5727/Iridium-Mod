# Iridium Mod

Fabric mod project for Minecraft 26.3.

## Project layout

```text
Iridium-Mod/
├── .github/
│   └── workflows/
│       └── build.yml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/jmgamer5727/iridium/
│       │       └── IridiumMod.java
│       └── resources/
│           ├── assets/
│           │   └── iridium/
│           │       ├── blockstates/
│           │       ├── models/
│           │       │   ├── block/
│           │       │   └── item/
│           │       └── textures/
│           │           ├── block/
│           │           └── item/
│           └── fabric.mod.json
├── build.gradle
├── gradle.properties
└── settings.gradle
```

Builds run through GitHub Actions with Java 25 and Gradle 9.7.1.
