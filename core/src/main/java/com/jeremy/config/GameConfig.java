package com.jeremy.config;

import com.jeremy.GuessCount;
import com.jeremy.MaxNumber;
import com.jeremy.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "com.jeremy")
public class GameConfig {

  @Value("${game.minNumber:1}")
  private int minNumber;
  @Value("${game.maxNumber:20}")
  private int maxNumber;
  @Value("${game.guessCount:5}")
  private int guessCount;


  // bean methods
  @Bean
  @MinNumber
  public int minNumber() {
    return minNumber;
  }

  @Bean
  @MaxNumber
  public int maxNumber() {
    return maxNumber;
  }

  @Bean
  @GuessCount
  public int guessCount() {
    return guessCount;
  }

}
