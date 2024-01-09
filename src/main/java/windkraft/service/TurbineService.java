package windkraft.service;

import windkraft.view.WindTurbineConsoleView;

/**
 * Service that controls the turbine.
 */
public class TurbineService {

  private final SpeedService speedService;

  /**
   * Constructor.
   */
  public TurbineService(SpeedService speedService) {
    this.speedService = speedService;
  }

  /**
   * Starts the turbine.
   */
  public void startTurbine() {

    int turbineSpeed = speedService.getTurbineSpeed();
    long lastUpdateTime = System.currentTimeMillis();

    try {
      while (true) {
        WindTurbineConsoleView.renderTurbine();

        // Check if approximately 5 seconds have passed since the last update
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastUpdateTime >= 5000) {
          turbineSpeed = speedService.getTurbineSpeed();
          lastUpdateTime = currentTime;
        }

        //Manages the speed of the turbine update
        Thread.sleep(1000 / turbineSpeed);
      }

    } catch (InterruptedException e) {
      throw new RuntimeException(
          e); //For bigger applications, obviously use proper logging/exception handling.
    }
  }
}
