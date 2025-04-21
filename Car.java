public class Car extends Vehical {
    private int NumberOfSeats;
    /* zadanie 2
    @Override
    public void start(){
        System.out.println("Car starts inaczej");
    }
    @Override
    public void stop(){
        System.out.println("Car stops inaczej");
    }
     */
    public Car(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }
    public int getNumberOfSeats() {
        return NumberOfSeats;
    }
}
