package ua.example.broker;

public interface Schema extends Runnable {
    void addReceiver(Receiver receiver);

    void publish(Message message);
}
