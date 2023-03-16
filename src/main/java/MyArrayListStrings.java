import java.util.ArrayList;

public class MyArrayListStrings {

    private ArrayList<String> list = new ArrayList<String>();

    public void addString(String value) {
        list.add(value);
    }

    public void deleteString(String value) {
        list.remove(value);
    }

    public void searchString(String value) {
        list.contains(value);
        System.out.println("yes");
    }
    public void printAllStrings() {
        System.out.println();

        for (String str: list){
            System.out.println(str);
        }
        System.out.println();
    }


    public ArrayList <String> getlist() {
        return list;
    }
}















