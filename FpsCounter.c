#include <stdio.h>
#include <time.h>

#define TARGET_FPS 60

int main() {
    clock_t lastTime = clock();
    int ticks = 0;
    int frames = 0;

    while (1) {
        clock_t now = clock();
        double elapsed = (double)(now - lastTime) / CLOCKS_PER_SEC;

        if (elapsed >= 1.0) {
            printf("Ticks: %d, Frames: %d\n", ticks, frames);
            ticks = 0;
            frames = 0;
            lastTime = now;
        }

        // Simulate game logic here (tick function)

        ticks++;

        // Simulate frame rendering here (render function)

        frames++;

        // Adjust frame rate here if needed to maintain TARGET_FPS
    }

    return 0;
}
