package windkraft.controller;

import windkraft.service.TurbineService;

/**
 * Controller for the turbine.
 */
public class TurbineController {

  private final TurbineService turbineService;

  /**
   * Constructor.
   */
  public TurbineController(TurbineService turbineService) {
    this.turbineService = turbineService;
  }

  /**
   * Starts the turbine.
   */
  public void startTurbine() {
    turbineService.startTurbine();
  }
}
