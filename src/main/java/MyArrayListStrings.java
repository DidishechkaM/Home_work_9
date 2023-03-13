import java.util.ArrayList;

public class MyArrayListStrings {
    private ArrayList<String> list = new ArrayList<String>();

    public void addString(String value) {
        list.add(value);
    }

    public void deleteString(String value) {
        list.remove(value);
    }

    public  void searchString(String value) {
         list.contains(value);
    }
    public void printAllStrings(){
        System.out.println(list);
    }
    }













