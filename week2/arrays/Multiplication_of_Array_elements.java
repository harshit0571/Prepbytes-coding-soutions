import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int t=inp.nextInt();
      while(t>0){
        int n=inp.nextInt();
        int[] arr=new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
          arr[i]=inp.nextInt();
          prod=prod*arr[i];
        }
        System.out.println(prod);
        t--;
      }
    }
  }


// Question:
// Multiplication of Array elements
// PrepBuddy is happy that you solved the previous questions, just to be sure that you are comfortable with operators and arrays, he is giving you this problem.
// You are provided with the size of the array represented by 
// N
//  and 
// N
//  array elements. 
// You need to output the multiplication of all the elements. See sample test cases for better understanding.

// Input Format
// First line contains the value of test case variable 
// T
// .
// Then follows 
// T
//  test cases.
// First line contains 
// N
//  representing the size of the array.
// Second line contains 
// N
//  space-separated integers.

// Output Format
// For each test case 
// T
//  on a new line, print the multiplication.

// Constraints
// 1
// <=
// N
// <=
// 9

// 1
// <=
// A
// [
// i
// ]
// <=
// 10

// Time limit
// 1
//  second

// Example
// Input
// 2

// 5

// 1
 
// 2
 
// 3
 
// 4
 
// 5

// 7

// 9
 
// 8
 
// 4
 
// 3
 
// 1
 
// 2
 
// 3

// Output
// 120

// 5184

// Sample test case explanation
// Test case variable 
// T
// =
// 2

// For 
// T
// =
// 1

// N
// =
// 5

// Array = 
// [
// 1
// , 
// 2
// , 
// 3
// , 
// 4
// , 
// 5
// ]

// Multiplication = 
// 1
// ∗
// 2
// ∗
// 3
// ∗
// 4
// ∗
// 5
// =
// 120

// For 
// T
// =
// 2

// N
// =
// 7

// Array = 
// [
// 9
// , 
// 8
// , 
// 4
// , 
// 3
// , 
// 1
// , 
// 2
// , 
// 3
// ]

// Multiplication = 
// 9
// ∗
// 8
// ∗
// 4
// ∗
// 3
// ∗
// 1
// ∗
// 2
// ∗
// 3
// =
// 5184

