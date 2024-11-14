package org.sanmoh.Arrays;

import java.util.HashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Two Number Sum
 *
 * <h2>Problem Statement
 *
 * <p>Write a function that takes in a non-empty array of distinct integers and an integer
 * representing a target sum. If any two numbers in the input array sum up to the target sum, the
 * function should return them in an array, in any order. If no two numbers sum up to the target
 * sum, the function should return an empty array.
 *
 * <p>Note that the target sum has to be obtained by summing two different integers in the array;
 * you can't add a single integer to itself in order to obtain the target sum.
 *
 * <h3>Sample Input
 *
 * <pre>
 *     array = [3, 5, -4, 8, 11, 1, -1, 6]
 *     targetSum = 10
 *
 * <h3>Sample Output
 *
 * <pre>
 *     [-1, 11] // the numbers could be in reverse order
 */
public class TwoNumberSum {
  /**
   * Brute Force Algorithm
   *
   * <p>Finds two distinct integers in the input array that sum up to the target sum. If such a pair
   * is found, it returns them in an array. If no such pair exists, it returns an empty array.
   *
   * @param array the input array of distinct integers
   * @param targetSum the target sum to find from the array elements
   * @return an array containing the two integers that sum up to the target sum, or an empty array
   *     if no such pair exists
   */
  @Contract(value = "_, _ -> new", pure = true)
  public static Integer @NotNull [] BruteForce(Integer @NotNull [] array, Integer targetSum) {
    // Iterate through the array and check for the sum of each pair of elements
    for (int i = 0; i < array.length; i++)
      // Iterate through the array starting from the next element
      for (int j = i + 1; j < array.length; j++)
        // If the sum of the pair of elements is equal to the target sum, return the pair
        if (array[i] + array[j] == targetSum) return new Integer[] {array[i], array[j]};

    // If no pair of elements sum up to the target sum, return an empty array
    return new Integer[] {};
  }

  /**
   * Linear Time Algorithm
   *
   * <p>Finds two distinct integers in the input array that sum up to the target sum using a linear
   * time algorithm. If such a pair is found, it returns them in an array. If no such pair exists,
   * it returns an empty array.
   *
   * @param array the input array of distinct integers
   * @param targetSum the target sum to find from the array elements
   * @return an array containing the two integers that sum up to the target sum, or an empty array
   *     if no such pair exists
   */
  @Contract(value = "_, _ -> new", pure = true)
  public static Integer @NotNull [] Optimal(Integer @NotNull [] array, Integer targetSum) {
    // Create a hash set to store the elements of the array
    HashSet<Integer> set = new HashSet<>();

    // Iterate through the array
    for (Integer num : array) {
      // Calculate the difference between the target sum and the current element
      Integer diff = targetSum - num;

      // If the difference is present in the hash set, return the pair of elements
      if (set.contains(diff)) return new Integer[] {diff, num};

      // Add the current element to the hash set
      set.add(num);
    }

    return new Integer[] {};
  }
}
