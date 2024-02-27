package static2.ex01;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("casper"); // 이름은 생성할 때 마다 개별적으로 넣어주어야 함 -> 인스턴스 변수

        Car.showTotalCars() ; // 구매한 차량 수를 출력하는 static 메서드 // 차량 수는 공용으로 사용해야 하니까 static 변수
    }
}
