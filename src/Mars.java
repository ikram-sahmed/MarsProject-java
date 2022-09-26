public class Mars
{
    public static void main(String[] args) throws InterruptedException {
        //Part 1

        String ColonyName = "SpaceX";

        int ShipPopulation = 300;

        double ShipFood = 4000.00;

        boolean Landing = true;


        // Upon reaching Mars everyone will eat 0.75 meals a day, to preserve food
        // The landing process takes 2 days, calculate how much food is left after landing
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);

        System.out.println(ShipFood);

        // increasing ShipFood by 50%
        ShipFood = ShipFood + (ShipFood * .5);

        //5 more babies join the ShipPopulation
        ShipPopulation = ShipPopulation + 5;

        //choose where to land
        String LandingLocation = "The Hill";

        if (LandingLocation.equalsIgnoreCase("The Plain")) {

            System.out.println("Bbzzz Landing on the Plain");
        }
        else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");

        }

        Landing = LandingCheck(100);

        //part 2

        new GuessingGame();

      //part 3

        new MarsExpedition();

        //part 4

        new FindingsLists();
    }

    private static boolean LandingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            }
            else if ((i % 5) == 0) {
                System.out.println("Right");
            }
            else if ((i % 3) == 0) {
                System.out.println("Left");
            }
            else {
                System.out.println("Calculating");
            }

            Thread.sleep(250);
        }
        System.out.println("Landed");

        //The ship has landed on Mars. Return the value false;
        return false;
    }
}