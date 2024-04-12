public class AudioPlayer implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("Playing audio...");
    }

    @Override
    public void pause() {
        System.out.println("Audio paused.");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped.");
    }
}
