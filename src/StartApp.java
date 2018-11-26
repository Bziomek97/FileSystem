public class StartApp {

    static public void main(String[] args){
        File ok;
        DirectoryDecorator dir=new DirectoryDecorator();
        dir.setName("/");
        for(int i=0;i<3;i++){
            dir.addNote();
        }

        dir.addNode();

        for(DirectoryDecorator i: dir.dirCollection){
            i.addNode();
        }

        dir.printFileContent();
        System.out.println();
        dir.printUnderFileContent(0);
    }

}
