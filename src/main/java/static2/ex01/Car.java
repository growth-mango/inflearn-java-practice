package static2.ex01;

public class Car {
    private String name; // 객체마다 이름이 다름
    private static int totalCars = 0; // 누적, 공용
//    private static int totalCars; // 0으로 초기화 하지 않아도 됨. 기본자료형이기 때문에 알아서 0으로 초기화 됨.

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
