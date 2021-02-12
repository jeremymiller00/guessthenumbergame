package com.jeremy.console;

import com.jeremy.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  private static final Logger log = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    log.info("Guess the number game");

    // create the context (container)
    ConfigurableApplicationContext context
        = new AnnotationConfigApplicationContext(GameConfig.class);

    // close context (container)
    context.close();
  }
}
