import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int sum=0;
      int n=inp.nextInt();
      while(n>0){
        int i=n%10;
        sum+=i;
        n=n/10;
      }
      System.out.println(sum);
      
    }
  }




// Question:
// Sum of Digits
// PrepBuddy gave you a number 
// X
//  and asks you to find the sum of the digits present in the number.

// Input format
// One integer is provided denoting the value of 
// X
// .

// Output format
// Print the sum of digits of 
// X
// .

// Constraints
// 1
// <=
// X
// <=
// 10
// 6

// Time Limit
// 1
//  second

// Example
// Input
// 102345

// Output
// 15

// Sample test case explanation
// Sum of digit 
// =
// 1
// +
// 0
// +
// 2
// +
// 3
// +
// 4
// +
// 5
// =
// 15

