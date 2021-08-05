import java.time.LocalDateTime;
import java.util.List;


public class Chat{

    private Contact sender;
    private List<Message> messages;
    private Contact reciever;
    private LocalDateTime readAt;

    public Chat(Contact sender, Contact reciever, LocalDateTime readAt) {
        this.sender = sender;
        this.reciever = reciever;
        this.readAt = readAt;
    }

    public Contact getSender() {
        return sender;
    }

    public void setSender(Contact sender) {
        this.sender = sender;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public Contact getReciever() {
        return reciever;
    }

    public void setReciever(Contact reciever) {
        this.reciever = reciever;
    }

    public LocalDateTime getReadAt() {
        return readAt;
    }

    public void setReadAt(LocalDateTime readAt) {
        this.readAt = readAt;
    }
}


