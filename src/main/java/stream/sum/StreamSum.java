package stream.sum;

import java.util.ArrayList;
import java.util.List;

public class StreamSum {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);

        // Stream
        int sum = list.stream()   // listをStreamに変換する
                .mapToInt(i -> Integer.parseInt(i))  // StreamをIntStreamに変換する(敢えてメソッド参照に変更しない）
                .sum();           // intに変換された要素を合計する

        System.out.println(sum);
    }
}
