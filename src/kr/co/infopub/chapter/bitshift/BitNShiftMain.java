package kr.co.infopub.chapter.bitshift;

public class BitNShiftMain {
    // >> shift ? 삼항연산자
    // 10진수 정수를 2진수 문자열(스트링)로 변환하기
    public static String shifts(int a) {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            int aa = a % 2;
            s = (aa >= 0)? aa + s : (-aa) + s;  // s = (a & BITMASK) + s;
            a >>= 1; // a /= 2;
        }
        return s;
    }

    public static void main(String[] args) {
        int intNum1 = 123;
        int intNum2 = -123;
        System.out.printf("%d : %s%n", intNum1, shifts(intNum1));
        System.out.printf("%d : %s%n", intNum2, shifts(intNum2));
    }
}
