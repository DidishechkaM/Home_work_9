public class MyMainClass {
    public static void main(String[] args) {
        MyArrayListStrings myArrayListStrings = new MyArrayListStrings();
        myArrayListStrings.addString("Element");
        myArrayListStrings.addString("TwoElement");
        myArrayListStrings.addString("Three");
        myArrayListStrings.printAllStrings();
        myArrayListStrings.searchString("TwoElement");

        for (String element: myArrayListStrings) {
            System.out.println(element);
        }




    }


   }






