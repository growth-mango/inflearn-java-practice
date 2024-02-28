package poly.basic;

public class polyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        // 부모는 자식을 담을 수 있다. 자바에서 허용한다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
