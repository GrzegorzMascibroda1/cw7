public class Zadanie1Main {
    public static void main(String[] args) {
        Car MyCar = new Car(5);
        MyCar.start();
        System.out.println(MyCar.getNumberOfSeats());
        MyCar.stop();
    }
}
