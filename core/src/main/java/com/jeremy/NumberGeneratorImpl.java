package com.jeremy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

  private final Random random = new Random();
  private final int maxNumber;
  private final int minNumber;

  @Autowired
  public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
    this.maxNumber = maxNumber;
    this.minNumber = minNumber;
  }

  @Override
  public int next() {
    int range = maxNumber - minNumber;
    int base = random.nextInt(range);
    return base + minNumber;
  }

  @Override
  public int getMaxNumber() {
    return maxNumber;
  }

  @Override
  public int getMinNumber() {
    return minNumber;
  }
}