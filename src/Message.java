import java.time.LocalDateTime;

public class Message {
    private LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Message(LocalDateTime createdAt) {
        this.createdAt = createdAt;

    }


}
