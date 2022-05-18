package fr.maif.demo.part9.time;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.*;

public class TimeStuffTest {
    @Test
    public void isThis2023ShouldReturnTrueToday() {
        final TimeStuff timeStuff = new TimeStuff(InstantSource.system());

        assertFalse(timeStuff.isThis2050());
    }

    @Test
    public void isThis2023ShouldReturnTrueIfYearIs2050() {
        final LocalDateTime time = LocalDateTime.of(2050, 1, 1, 0, 0);
        final Instant instant = time.atZone(ZoneId.systemDefault()).toInstant();
        final TimeStuff timeStuff = new TimeStuff(InstantSource.fixed(instant));

        assertTrue(timeStuff.isThis2050());
    }
}
