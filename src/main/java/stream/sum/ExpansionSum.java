package stream.sum;

import java.util.ArrayList;
import java.util.List;

public class ExpansionSum {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        // listに格納されているデータ
        System.out.println(list);

        int sum = 0;
        for (String i : list) {
            sum += Integer.parseInt(i);
        }
        System.out.println(sum);
    }
}
