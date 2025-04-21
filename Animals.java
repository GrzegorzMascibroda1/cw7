public class Animals {
    public static class Lion extends Feline {
        public void makeNoise() {
            System.out.println("Lion makes noise");
        }
    }
    public static class cat extends Feline {
        public void makeNoise() {
            System.out.println("cat makes noise");
        }
    }
    public static class Dog extends Canine {
        public void makeNoise() {
            System.out.println("Dog makes noise");
        }
    }
    public static class Wolf extends Canine {
        public void makeNoise() {
            System.out.println("Wolf makes noise");
        }
    }

}
