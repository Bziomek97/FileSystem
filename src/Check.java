import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check extends Node{

    private Node created = new Node();

    public boolean checkName(){
        Pattern regex = Pattern.compile("([A-Za-z0-9\\.]+)");
        Matcher matcher = regex.matcher(created.getName());
        return matcher.matches();
    }

    public String getCreated() {
        return this.created.getName();
    }

    public void setCreated(String created) {
        this.created.setName(created);
    }
}
