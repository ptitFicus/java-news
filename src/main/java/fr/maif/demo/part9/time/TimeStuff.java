package fr.maif.demo.part9.time;

import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeStuff {
  private final InstantSource instantSource;

  public TimeStuff(InstantSource instantSource) {
    this.instantSource = instantSource;
  }

  public boolean isThis2050() {
    return LocalDateTime
        .ofInstant(instantSource.instant(), ZoneId.systemDefault())
        .getYear() == 2050;
  }
}
