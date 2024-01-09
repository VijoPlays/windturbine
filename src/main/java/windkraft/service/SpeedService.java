package windkraft.service;

/**
 * Service that reads the speed of a turbine.
 */
public class SpeedService {

  private final ReadService readService;

  /**
   * Constructor.
   */
  public SpeedService(ReadService readService) {
    this.readService = readService;
  }

  /**
   * Gets and returns the speed of the turbine. Limits the speed from 1 to 10.
   *
   * @return Returns the turbineSpeed. If the turbineSpeed is not between 1 and 10, it will default
   * to 1.
   */
  public int getTurbineSpeed() {
    int turbineSpeed = readService.readTurbineSpeed();
    return switch (turbineSpeed) {
      case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> turbineSpeed;
      default -> 1;
    };
  }
}
