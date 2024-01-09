package windkraft.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Service that reads files for configuration.
 */
public class ReadService {

  /**
   * Reads the turbine speed and returns it.
   *
   * @return turbine speed, parsed from the file. Default: 1.
   */
  public int readTurbineSpeed() {
    String filePath = "src/main/java/windkraft/config/turbinespeed";

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line = reader.readLine();
      if (line != null) {
        return Integer.parseInt(line);
      }
    } catch (IOException e) {
      e.printStackTrace();  //For bigger applications, obviously use proper logging/exception handling.
    }
    return 1;
  }
}
