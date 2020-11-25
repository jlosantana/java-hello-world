import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

  static final Logger log = Logger.getLogger(HelloWorld.class.getName());

  public static void main(String args[]) {

    log.info("info message...");
    log.warning("warning message...");
    log.severe("severe message...");
    log.config("config message...");

    System.out.println("Hello world");
  }
}
