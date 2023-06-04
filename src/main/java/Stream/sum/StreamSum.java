package Stream.sum;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);

        int sum = list.stream()        // listをStreamに変換する
                .mapToInt(i -> Integer.parseInt(i))  // StreamをIntStreamに変換する
                .sum();                // intに変換された要素を合計する

        System.out.println(sum);

    }
}
