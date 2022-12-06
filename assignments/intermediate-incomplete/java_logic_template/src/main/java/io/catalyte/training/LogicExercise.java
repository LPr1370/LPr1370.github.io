package io.catalyte.training;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Contains multiple common logic exercises.
 */
public class LogicExercise {

  /**
   * Takes a BigDecimal for the unit price and an int for number of units sold and returns a
   * discounted sales total based on the quantity sold: if more than 99 units are sold, apply a 15%
   * discount to the total price; if more than 49 units are sold, apply a 10% discount 10% to the
   * total price; if less than 50 units are sold, do not apply a discount to the price. For example,
   * if the unit price was 1.00 and the quantity sold was 100, the method should return 85.00 for
   * the total sales amount.
   */
  public BigDecimal getDiscount(BigDecimal unitPrice, int unitAmount) {
      BigDecimal discount = new BigDecimal("0.00");
      if (unitAmount < 50){
        return unitPrice.multiply(BigDecimal.valueOf(unitAmount));
      } else if (unitAmount < 99) {
        discount = BigDecimal.valueOf(0.9);
        return discount.multiply(unitPrice.multiply(BigDecimal.valueOf(unitAmount)));
      } else {
        discount = BigDecimal.valueOf(0.85);
        return discount.multiply(unitPrice.multiply(BigDecimal.valueOf(unitAmount)));
      }
  }

  /**
   * This method takes an int representing a percentile score and should return the appropriate
   * letter grade. If the score is above 90, return 'A'; if the score is between 80 and 89, return
   * 'B'; if the score is between 70 and 79, return 'C'; if the score is between 60 and 69, return
   * 'D'; if the score is below 60, return 'F'.
   */
  public char getGrade(int score) {
    if(score>=90){
      return 'A';
    } else if(score>=80) {
      return 'B';
    }else if(score>=70){
      return 'C';
    }else if(score>=60){
      return 'D';
    }else {
      return 'F';
    }
  }

  /**
   * This method should take an ArrayList of strings, remove all the elements in the array
   * containing an even number of letters, and then return the result. For example, if given an
   * array of "Cat", "Dog", "Bird", the method should return an array containing only "Cat" and
   * "Dog".
   */
  public ArrayList<String> removeEvenLength(ArrayList<String> a) {

    return null;
  }


  /**
   * This method should take an double array, a, and return a new array containing the square of
   * each element in a.
   */
  public double[] powerArray(double[] a) {
    for(int counter = 0; counter < a.length; counter++){
      double powered = a[counter];
      powered = powered * powered;
      a[counter] = powered;
    }
    return a;
  }


  /**
   * This method should take an int array, a, and return the index of the element with the greatest
   * value.
   */
  public int indexOfMax(int[] a) {
    int greatest = 0;
    int index = 0;
    for (int counter = 0; counter < a.length; counter++){
      if(a[counter] > greatest){
        greatest = a[counter];
        index = counter;
      }
    }
    return index;
  }


  /**
   * This method should take an ArrayList of Integers, a, and returns true if all elements in the
   * array are divisible by the given int, i.
   */
  public boolean isDivisibleBy(ArrayList<Integer> a, int i) {
    for (int counter = 0; counter < a.size(); counter++){
      if(a.get(counter)%i != 0){
        return false;
      }
    }
    return true;
  }

  /**
   * A word is "abecedarian" if its letters appear in alphabetical order--the word 'biopsy' for
   * example. This method should take String s and return true if it is abecedarian.
   */
  public boolean isAbecedarian(String s) {
    return false;
  }

  /**
   * This method should take 2 strings and return true if they are anagrams of each other. For
   * example, "stop" is an anagram for "pots".
   */
  public boolean areAnagrams(String s1, String s2) {
    return false;
  }

  /**
   * This method should take a String and return the number of unique characters. For example, if
   * the method is given "noon", it should return a value of 2.
   */
  public int countUniqueCharacters(String s) {

    return 0;

  }

  /**
   * This method should take a string and return true if it is a palindrome, i.e. it is spelled the
   * same forwards and backwards. For example, the words "racecar" and "madam" are palindromes.
   */
  public boolean isPalindrome(String s) {

    return false;

  }

  /**
   * This method should take a string and return a HashMap which is a map of characters to a list of
   * their indices in a string (i.e., which characters occur where in a string). For example for the
   * string "Hello World", the map would look something like: d=[9], o=[4, 6], r=[7], W=[5], H=[0],
   * l=[2, 3, 8], e=[1].
   */
  public HashMap<String, ArrayList<Integer>> concordanceForString(String s) {

    return null;

  }

}