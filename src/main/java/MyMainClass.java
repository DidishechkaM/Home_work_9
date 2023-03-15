import java.util.HashSet;

public class MyMainClass {
    public static void main(String[] args) {
        MyArrayListStrings myArrayListStrings = new MyArrayListStrings();
       myArrayListStrings.addString("Element");
        myArrayListStrings.addString("TwoElement");
        myArrayListStrings.addString("Three");
        myArrayListStrings.printAllStrings();


        for (String element: myArrayListStrings.getlist()) {
            System.out.println(element);
        }

       MySetStrings mySet   = new MySetStrings();




    }


   }






