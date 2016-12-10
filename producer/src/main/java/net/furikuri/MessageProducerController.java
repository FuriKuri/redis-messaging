package net.furikuri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducerController {

  @Autowired
  StringRedisTemplate template;

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public String sendMessage(
      @RequestParam(name = "msg", defaultValue = "Hello World") String message) {
    template.convertAndSend("chat", message);
    return "ok";
  }
}
