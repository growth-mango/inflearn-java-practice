package static2.ex01;

import static static2.ex01.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        // 생성자를 private 으로 막아놨기 때문에 생성 자체가 되질 않음
//        MathArrayUtils mathArrayUtils = new MathArrayUtils();

        int[] values = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("sum= " + sum(values));
        System.out.println("average= " + average(values));
        System.out.println("min= " + min(values));
        System.out.println("max= " + max(values));
    }
}
