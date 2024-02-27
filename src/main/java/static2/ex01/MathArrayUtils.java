package static2.ex01;

public class MathArrayUtils {
    private MathArrayUtils(){
        //private 생성자로 인스턴스 생성을 막아버리기
    }

    public static int sum(int[] values){
        int total = 0;
        for (int value : values) {
            total+=value;
        }
        return total;
    }

    public static double average(int[] values){
        return (double) sum(values) / values.length; // static 에서는 static을 불러다 쓸 수 있음
    }

    public static int min(int[] values){
        int minValue = values[0];
        for (int value : values) {
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values){
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }

}
