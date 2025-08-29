package Lesson02.Constructors;


    public class CircleTest02 {
        public static void main(String[] args) {
            circleAreal();
        }

        public static void circleAreal()
        {
            // Opret cirkler
            Circle01 c1 = new Circle01(5);
            Circle01 c2 = new Circle01(10);

            // Udskriv og vurder arealer
            double areal1 = c1.beregnAreal();
            double areal2 = c2.beregnAreal();

            System.out.println("Areal af cirkel 1: " + areal1);
            if (areal1 > 100) {
                System.out.println("Cirklen 1 er stor!");
            } else {
                System.out.println("Cirklen 1 er lille.");
            }

            System.out.println("Areal af cirkel 2: " + areal2);
            if (areal2 > 100) {
                System.out.println("Cirklen 2 er stor!");
            } else {
                System.out.println("Cirklen 2 er lille.");
            }
        }
    }


