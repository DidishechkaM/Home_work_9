import java.util.HashSet;

public class MyMainClass {
    public static void main(String[] args) {
        MyArrayListStrings myArrayListStrings = new MyArrayListStrings();
       myArrayListStrings.addString("Eleme nt");
        myArrayListStrings.addString("TwoElement");
        myArrayListStrings.addString("Three");
        myArrayListStrings.printAllStrings();


        for (String element: myArrayListStrings.getlist()) {
            System.out.println(element);
        }

        MySetStrings vegetables   = new MySetStrings();
        vegetables.add("Onion");
        vegetables.add("Carrot");
        vegetables.add("Beet");
        vegetables.printAllContetnt();
        vegetables.isAdded("Carrot");





    }


   }






