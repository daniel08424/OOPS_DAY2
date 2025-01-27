package oops_concepts.interfaceExample;

public class musicPlayer implements Music{
    @Override
    public void start() {
        System.out.println("Play the music");
    }

    @Override
    public void stop() {
        System.out.println("Stop music");
    }
}
