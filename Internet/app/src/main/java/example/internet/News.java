package example.internet;

/**
 * Created by Franck on 02.12.2017.
 */


        import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("friends")
    @Expose
    private List<Friend> friends = null;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

}
