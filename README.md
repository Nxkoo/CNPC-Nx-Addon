# CNPC-Nx-Addon

**CNPC-Nx-Addon** is an add-on library for Forge, designed to extend **CustomNPC+** functionality using **NxLib** and **Geckolib** to bring advanced animation support for player entities. This library introduces new capabilities for creating, managing, and customizing animations in **CustomNPC+** scripts and events.

## 🚧 Development Status

CNPC-Nx-Addon is currently under development. The initial version provides foundational animation features and integration, but future updates will expand functionality, improve performance, and refine the API.

## 🔗 Features

- **NxLib Integration**: Leverages NxLib's animation framework to support advanced, customizable animations.
- **Geckolib Animation System**: Smooth animations for both first-person and third-person perspectives.
- **CustomNPC+ Compatibility**: Adds enhanced animation features to CustomNPC+ for dynamic scripting and gameplay.
- **Player-Specific Animations**: Control animations on a per-player basis for more immersive interactions.

## 📦 Installation

1. **Dependencies**:
    - **Minecraft Forge** (1.16.5 or later).
    - **CustomNPC+** (compatible version).
    - **NxLib** (required library).

2. **Installation Steps**:
    - Download the latest release of CNPC-Nx-Addon from the [Releases](https://github.com/nxkoo/CNPC-Nx-Addon/releases) page.
    - Place the `.jar` file in the `mods` folder of your Minecraft instance.
    - Ensure that all dependencies are also installed.

## 🛠️ Usage

This add-on introduces several new methods and functionalities for CustomNPC+ scripting. Below is an example of what the mod enables:

### Mixin Class

The core functionality is implemented through mixins for the `PlayerWrapper` class. Here's an overview of key methods available:

#### Methods:

- **`NxAnimation registerAnimation(String animationName, int duration, boolean separateLeftAndRight, boolean lockHeldItemMainHand, String loopType)`**
    - Registers a new animation for a player.
    - The loop types are: “play_once”, “hold_on_last_frame”, “loop”

- **`void startAnimation(NxAnimation animation)`**
    - Starts a specific animation for the player.

- **`void stopAnimation()`**
    - Stops the current animation for the player.

- **`List<Animation> getFirstPersonAnimations()`**
    - Retrieves a list of all first-person animations.

- **`List<Animation> getThirdPersonAnimations()`**
    - Retrieves a list of all third-person animations.

- **`List<Animation> getAllAnimations()`**
    - Retrieves a combined list of all animations.

## ✨ Example Code

Here is an example of how to use the add-on in a CustomNPC+ script:

```javascript
var playerWrapper = npc.player; // Get the player wrapper
var demoAnimation = "demo";

// Register a new animation
var animation = playerWrapper.registerAnimation(demoAnimation, 10, false, false, "LOOP");

// Start the animation
playerWrapper.startAnimation(animation);

// Stop the animation
playerWrapper.stopAnimation();
```

This add-on simplifies the process of adding dynamic animations for scripted NPC interactions.

## 📝 Credits

- **Authors**: [NykooX](https://github.com/nxkoo)
- **Credits** [Goodbird](https://github.com/goodbird-git)
- **Contact**: [Discord Server](https://discord.gg/WbKXXKm5Gb)

## 📝 License

This add-on is licensed under the [NxLicense](LICENSE.md). All rights are reserved to the authors, and usage is subject to the terms specified in the license file.