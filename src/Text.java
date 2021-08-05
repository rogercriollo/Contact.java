import java.time.LocalDateTime;
public class Text extends Message {
    private String message;
    private long length;


    public Text(LocalDateTime createdAt, String message) {
        super(createdAt);
        this.message = message;
        this.length = message.length();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }


}
