package lab6;

/*
1. Create an interface  Camera and MusicPlayer with some methods , then implement these methods in Smartphone
class  and display messages according to that
*/
interface Camera {
    void takePhoto();

    void recordVideo();

    void exitCamera();
}

interface MusicPlayer {
    void play();

    void pause();

    void playNext();

    void playPrevious();

    void exitMusicPlayer();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void play() {
        System.out.println("Playing Music");
    }

    @Override
    public void pause() {
        System.out.println("You Paused the music");
    }

    @Override
    public void playNext() {
        System.out.println("Next song will play now");
    }

    @Override
    public void playPrevious() {
        System.out.println("Previous song will play now");
    }

    @Override
    public void exitMusicPlayer() {
        System.out.println("You exited the music player");
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video recording is in progress");
    }

    @Override
    public void exitCamera() {
        System.out.println("You exited the camera");
    }

}

public class SmartPhoneDriver {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        System.out.println("#== Methods implementation details from camera ==>");
        sp.takePhoto();
        sp.recordVideo();
        sp.exitCamera();

        System.out.println("\n" + "#== Methods implementation details from Music Player ==>");
        sp.play();
        sp.pause();
        sp.playNext();
        sp.playPrevious();
        sp.exitMusicPlayer();

    }
}
