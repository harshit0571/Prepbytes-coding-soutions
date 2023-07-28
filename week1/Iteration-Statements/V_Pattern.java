import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      char ch=inp.next().charAt(0);
      int n=5;
      for(int i=0;i<n;i++){
        for(int j=1;j<=i+1;j++){
          System.out.print(j);
        }
        for(int s=0;s<2*(n-i-1);s++){
          System.out.print(" "+ " ");
        }
        for(int k=i+1;k>=1;k--){
          System.out.print(k);
        }
        System.out.println();
      }
      
      
    }
  }

// Question:
// V Pattern
// Print in the output the exact pattern provided below
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

// Input format
// A single character denoted by 
// c
// h

// Output format
// Print the same pattern provided in the problem statement.

// Constraints
// c
// h
// =
// ′
// V
// ′

// Time Limit
//  1 second 

// Input
// V

// Output
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
