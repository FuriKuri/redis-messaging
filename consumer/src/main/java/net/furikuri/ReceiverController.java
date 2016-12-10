package net.furikuri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceiverController {

  @Autowired private Receiver receiver;

  @RequestMapping("/")
  public List<String> getMessages() {
    return receiver.getMessages();
  }
}
