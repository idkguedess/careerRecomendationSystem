package hpi.ulpgc.model;

public class NetworkingTool {
    public String user1;
    public String user2;

    public NetworkingTool(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                '}';
    }
}
