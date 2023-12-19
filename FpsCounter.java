init(); // Initialization method for the application or game

while (true) {
    long time = System.currentTimeMillis(); // Record the current time

    tick(); // Execute game logic or update game state

    long now = System.currentTimeMillis(); // Record the time after processing
    long elapsed = (now - time); // Calculate the time taken for processing

    // Calculate the time to sleep in order to achieve the desired FPS
    long sleepTime = 1000 / getMaxFPS() - elapsed;

    try {
        if (sleepTime > 0) {
            // If the sleep time is positive, sleep for that duration
            Thread.sleep(sleepTime);
            //System.out.println("FPS: " + getMaxFPS());
        } /* else {
            // If sleep time is non-positive (negative or zero), optionally display FPS
            System.out.println("FPS: " + 1000 / elapsed);
        } */
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
