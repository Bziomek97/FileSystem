import java.util.ArrayList;

public class Directory extends Node{

    private Node parent;
    protected ArrayList<Node> fileCollection;

    //Setters and getters of parent
    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node findNode(String name){
        for(Node i: this.fileCollection){
            if((i.getName()).equals(name)) return i;
        }
        return null;
    }

    public void addNode(Node file){
        this.fileCollection.add(file);
    }

    public ArrayList<Node> findAll(){
        return this.fileCollection;
    }


}
