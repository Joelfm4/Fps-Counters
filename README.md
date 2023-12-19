
# FPS Counter Overview

I've created a basic FPS (Frames Per Second) counter in Java to measure the frequency of consecutive frame rendering within a game loop. This counter assists in monitoring performance and ensuring smooth motion within graphical applications or games.

## How this Java FPS Counter Works

This Java code functions as a simple FPS counter within a game loop:

1. **Time Measurement:**
   - I use `System.nanoTime()` to record timestamps (`lastTime` and `now`) for measuring processing duration in each loop iteration.

2. **Frame Counting:**
   - The `tick()` method simulates game logic processing per frame. It increments the `ticks` counter for each iteration.
   - The `render()` method simulates frame rendering, incrementing the `frames` counter when rendering occurs.

3. **FPS Calculation:**
   - Using `delta` and `nsPerTick`, I calculate elapsed time between frames and manage update/render logic to maintain the desired FPS (`TARGET_FPS`).

4. **Frame Rate Display:**
   - Every second (`System.currentTimeMillis()`), I print the counts of ticks and frames to show the achieved FPS.

![image](https://github.com/Joelfm4/FpsCounter/assets/48136794/de6253fb-e0cc-4bf1-a5a7-d479a7c6498b)

<p>Note: The other fps counters follow a similar logic</p>
