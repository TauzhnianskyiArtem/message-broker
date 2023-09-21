package ua.example.broker;

public interface Receiver {
    String name();

    void receive(String text);
}
