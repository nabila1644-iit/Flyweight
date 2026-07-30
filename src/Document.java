import java.util.ArrayList;

public class Document {

    private ArrayList<DocumentCharacter> characters =
            new ArrayList<>();

    public void insert(DocumentCharacter ch) {

        characters.add(ch);

        System.out.println("Character Inserted.");
    }

    public void delete(int index) {

        if(index>=0 && index<characters.size()){

            characters.remove(index);

            System.out.println("Character Deleted.");
        }
    }

    public void modifyCharacter(int index,char newChar){

        if(index>=0 && index<characters.size()){

            characters.get(index).setCharacter(newChar);

            System.out.println("Character Modified.");
        }

    }

    public void modifyStyle(int index, CharacterStyle style){

        if(index>=0 && index<characters.size()){

            characters.get(index).setStyle(style);

            System.out.println("Style Updated.");
        }

    }

    public void displayDocument(){

        System.out.println("\nDocument Contents");

        for(DocumentCharacter c:characters){

            c.display();
        }

    }

    public int getCharacterCount(){

        return characters.size();
    }
}