import java.time.LocalDateTime;

public class Audio extends Message {
    private long length;
    private String quality;

    public Audio(LocalDateTime createdAt, long length, String quality) {
        super(createdAt);
        this.length = length;
        this.quality = quality;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

}
