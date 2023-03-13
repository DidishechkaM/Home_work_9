import java.util.ArrayList;
import java.util.List;

public class FruitsBasketList {
    static List<String> fruct = new ArrayList<>();

    public static void main(String[] args) {
        fruct.add("Яблоко");
        fruct.add("Груша");
        fruct.add("Слива");
        fruct.add("Арбуз");
        fruct.add("Арбуз");//Можем положить в List
        System.out.println(fruct.get(0));// Вывод по индексу элемента
        if (fruct.contains("Яблоко")) {
            System.out.println("I here");


        }
    }
}




