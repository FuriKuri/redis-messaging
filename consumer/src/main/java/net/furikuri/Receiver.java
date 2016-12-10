package net.furikuri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Receiver {
  private static final Logger LOGGER = LoggerFactory.getLogger(ReceiverController.class);

  private List<String> messages = new ArrayList<>();

  public void receiveMessage(String message) {
    LOGGER.info("Received <" + message + ">");
    messages.add(message);
  }

  public List<String> getMessages() {
    return messages;
  }
}
