public class Main {
    public static void main(String[] args) {

        MediaPlayable[] players = new MediaPlayable[2];
        players[0] = new AudioPlayer();
        players[1] = new VideoPlayer();


        // Demonstrerer polymorfisme ved at iterere over media players og kalde metoder
        for (MediaPlayable player : players) {
            player.play();
            player.pause();
            player.stop();
            System.out.println(); // Tilføjer en tom linje mellem hver spillers output
        }
    }
}