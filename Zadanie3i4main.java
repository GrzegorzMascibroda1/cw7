public class Zadanie3i4main {
    public static void main(String[] args) {
        Animal zwierz = new Animal();
        Animals.Dog dog = new Animals.Dog();
        Animals.Lion lion = new Animals.Lion();
        zwierz.MakeNoise();
        System.out.println("-----");
        dog.roam();
        dog.makeNoise();
        lion.roam();
        lion.makeNoise();

    }
}
