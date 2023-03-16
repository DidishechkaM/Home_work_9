import java.util.HashSet;

public class MySetStrings {

   HashSet <String> vegetables   = new HashSet<>();


   public void add (String value){
       vegetables.add((value));
   }

    public void printAllContetnt() {
        System.out.println();

        for (String strvegetables: vegetables){
            System.out.println(strvegetables);
        }
        System.out.println();
    }

   public void isAdded (String value) {
       boolean veg = vegetables.add(value);
       System.out.println(veg);




   }


      //  boolean isAdded = vegetables.add("Carrot");
      //  System.out.println(isAdded);

}
