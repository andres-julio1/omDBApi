package movie;

import com.google.gson.annotations.SerializedName;

public class Ratings {
    @SerializedName("Source")
    private String source;

    @SerializedName("Value")
    private String value;

    public Ratings(String source, String value) {
        this.source = source;
        this.value = value;
    }

    public Ratings() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "{\"Source\":\"" + source + "\", \"Value\":\"" + value + "\"}";
    }
}
