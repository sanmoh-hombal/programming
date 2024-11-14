package org.sanmoh.Arrays;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Validate Subsequence
 *
 * <h2>Problem Statement
 *
 * <p>Given two non-empty arrays of integers, write a function that determines whether the second
 * array is a subsequence of the first one.
 *
 * <p>A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array
 * but that are in the same order as they appear in the array. For instance, the numbers.
 *
 * <h3>Sample Input
 *
 * <pre>
 *     array = [5, 1, 22, 25, 6, -1, 8, 10]
 *     sequence = [1, 6, -1, 10]
 *
 * <h3>Sample Output
 *
 * <pre>
 *     true
 */
public class ValidateSubsequence {
  /**
   * Brute Force Algorithm
   *
   * <p>Determines if any element in the sequence is present in the array. This is a brute force
   * approach so the time complexity is O(n^2)
   *
   * @param array the array to be searched
   * @param sequence the sequence to be checked against the array
   * @return true if any element in the sequence is found in the array, false otherwise
   */
  @Contract(pure = true)
  public static @NotNull Boolean BruteForce(
      Integer @NotNull [] array, Integer @NotNull [] sequence) {
    return Boolean.FALSE;
  }

  /**
   * Optimal Algorithm
   *
   * <p>Determines whether the second array is a subsequence of the first one using an optimized
   * approach.
   *
   * @param array the array to be searched
   * @param sequence the sequence to be checked against the array
   * @return true if the sequence is a subsequence of the array, false otherwise
   */
  @Contract(pure = true)
  public static @NotNull Boolean Optimal(Integer @NotNull [] array, Integer @NotNull [] sequence) {
    return Boolean.FALSE;
  }
}
