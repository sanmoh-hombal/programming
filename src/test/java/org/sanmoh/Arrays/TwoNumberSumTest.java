package org.sanmoh.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoNumberSumTest {
  @Test
  public void testBruteForceWhereTargetSumExists() {
    Integer[] result = TwoNumberSum.BruteForce(new Integer[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
    assertEquals(2, result.length);
  }

  @Test
  public void testBruteForceWhereTargetSumDoesNotExist() {
    Integer[] result = TwoNumberSum.BruteForce(new Integer[] {3, 5, -4, 8, 11, 1, -1, 6}, 30);
    assertArrayEquals(new Integer[] {}, result);
  }

  @Test
  public void testLinearTimeWhereTargetSumExists() {
    Integer[] result = TwoNumberSum.LinearTime(new Integer[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
    assertEquals(2, result.length);
  }

  @Test
  public void testLinearTimeWhereTargetSumDoesNotExist() {
    Integer[] result = TwoNumberSum.LinearTime(new Integer[] {3, 5, -4, 8, 11, 1, -1, 6}, 30);
    assertArrayEquals(new Integer[] {}, result);
  }
}