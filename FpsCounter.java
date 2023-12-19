public class FPSCounter {
    private static final int TARGET_FPS = 60; // Desired FPS
    private static long lastTime = System.nanoTime();
    private static double nsPerTick = 1000000000.0 / TARGET_FPS;
    private static int ticks;
    private static int frames;
    private static long lastTimer = System.currentTimeMillis();
    private static double delta = 0;

    public static void main(String[] args) {
        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nsPerTick;
            lastTime = now;
            boolean shouldRender = false;

            while (delta >= 1) {
                tick(); // Game logic update
                ticks++;
                delta--;
                shouldRender = true;
            }

            if (shouldRender) {
                render(); // Render the frame
                frames++;
            }

            if (System.currentTimeMillis() - lastTimer > 1000) {
                lastTimer += 1000;
                System.out.println("Ticks: " + ticks + ", Frames: " + frames);
                ticks = 0;
                frames = 0;
            }
        }
    }

    private static void tick() {
        // Simulate game logic here
        // This method represents the processing done in a single frame
        // Example: updating game state, handling input, etc.
    }

    private static void render() {
        // Simulate rendering here
        // This method represents the visual rendering of the game
        // Example: drawing graphics, displaying objects, etc.
    }
}
