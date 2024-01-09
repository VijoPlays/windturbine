package windkraft;

import windkraft.controller.TurbineController;
import windkraft.service.ReadService;
import windkraft.service.SpeedService;
import windkraft.service.TurbineService;

public class Main {

  public static void main(String[] args) {

    var readService = new ReadService();
    var speedService = new SpeedService(readService);
    var turbineService = new TurbineService(speedService);
    var controller = new TurbineController(turbineService);

    controller.startTurbine();
  }
}