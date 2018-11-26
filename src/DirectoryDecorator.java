import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class DirectoryDecorator extends Directory {

    //Create new dir
    public Node addNote() {
        Scanner scan = new Scanner(System.in);
        DirectoryDecorator dir = new DirectoryDecorator();

        System.out.print("Nazwa folderu: ");
        do {
            String imie = scan.nextLine();
            dir.setName(imie);
        } while (!this.checkNode(dir));

            dir.setParent(this);
            this.dirCollection.add(dir);
            return dir;
        }


        // if exist
        public boolean checkNode (Directory dir) {
            for(Directory i: dirCollection) {
                if (i.getName().equals(dir.getName())) {
                    System.out.print("Dany folder istnieje! Sprobuj jeszcze raz: ");
                    return false;
                }
            }
            return true;
        }

        public void printFileContent () {
            System.out.println(this.getName());
            for (Node i : this.dirCollection) {
                System.out.println("Folder: " + i.getName());
            }
            for (Node i : this.fileCollection) {
                System.out.println("Plik: " + i.getName());
            }

        }

        public void printUnderFileContent (int number) {

        String tmp="";
        for(int i=0;i<number;i++) tmp += "  ";
        number+=1;

        System.out.println(tmp+this.getName()+":");
        for(DirectoryDecorator i:this.dirCollection){
            i.printUnderFileContent(number);
        }
        for(File j:this.findAll()){
            System.out.println(tmp+"  "+j.getName());
        }
    }


}
