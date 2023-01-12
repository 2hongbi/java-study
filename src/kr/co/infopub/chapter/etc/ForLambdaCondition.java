package kr.co.infopub.chapter.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition {
    // use stream list filter map reduce
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int s = 0;
        for (int i = 0; i <= 10 ; i++) {
            list.add(i);
        }

        // stream filter map collect
        list = list.stream()
                .filter(i -> i % 2 == 1)    // 조건에 맞는 수 찾기
                .map(i -> i * i)    // filter로 찾은 수에 대해 이렇게 처리 하라
                .collect(Collectors.toList()); // 해당 수의 ㅏㄱㅂㅅ을 새로운 리스트에 저장하자

        list.forEach(i -> {System.out.printf(i + "\t");});
        System.out.println();

        // stream reduce
        s = list.stream().reduce(0, Integer::sum);
        System.out.println("1~10 사이의 홀수에 대한 제곱합: " + s);
    }
}
