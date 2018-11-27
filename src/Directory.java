import java.util.ArrayList;
import java.util.Scanner;

public class Directory extends Node{

    private Node parent;
    protected ArrayList<File> fileCollection = new ArrayList<>();
    protected ArrayList<DirectoryDecorator> dirCollection = new ArrayList<>();

    //Setters and getters of parent
    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    //Add file
    public void addNode(){
        File file = new File();
        Scanner scan= new Scanner(System.in);
        Check check=new Check();
        System.out.print("Nazwa pliku: ");

        while (true) {
            String imie = scan.nextLine();
            check.setCreated(imie);
            if (check.checkName()) {
                file.setName(check.getCreated());
                break;
            }
            System.out.print("Bledna nazwa! Podaj ja jeszcze raz: ");
        }

        System.out.print("Zawartosc pliku: ");
        String value = scan.nextLine();
        file.setValue(value);

        file.setParent(this);
        this.fileCollection.add(file);
    }

    public Node findNode(String name){
        for(Node i: this.fileCollection){
            if((i.getName()).equals(name)) return i;
        }
        return null;
    }

    public ArrayList<File> findAll(){
        return this.fileCollection;
    }


}
