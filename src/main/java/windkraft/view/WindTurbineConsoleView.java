package windkraft.view;

/**
 * Renders a turbine in the console.
 */
public class WindTurbineConsoleView {

  private static int bladePosition = 0;

  /**
   * Renders the turbine.
   */
  public static void renderTurbine() {

    //For a prettier rendering of the turbines I could've added more cases and instead counted up, but this gets the point accross imo.
    switch (bladePosition) {
      case 0:
        System.out.println("  \\    /");
        System.out.println("    \\/  ");
        System.out.println("     |   ");
        System.out.println("     |   ");
        break;
      case 1:
        System.out.println("    |    ");
        System.out.println("    |    ");
        System.out.println("   / \\  ");
        System.out.println("  /   \\ ");
        break;
    }
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");

    if (bladePosition == 0) {
      bladePosition = 1;
    } else {
      bladePosition = 0;
    }

    //Separates the turbines.
    System.out.println("");
    System.out.println("---");
    System.out.println("");
  }
}
