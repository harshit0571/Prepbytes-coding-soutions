import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int m=inp.nextInt();
      int n=inp.nextInt();
      int k=inp.nextInt();
      int[][] arr=new int[m][n];
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          int N=inp.nextInt();
          arr[i][j]=N*k;
        }
      }
      
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
  }


// Question:
// Scalar Multiplication
// You are given a 
// M
// ∗
// N
//  matrix, and a variable 
// K
// , print the resultant matrix after scalar multiplication.

// Input format
// First line contains 
// M
// , 
// N
//  and 
// K
//  representing rows, columns and scalar.
// Each of the next 
// M
//  lines contains 
// N
//  integers.

// Output format
// Print the resultant matrix.

// Constraints
// 1
// <=
// M
// ,
// N
// <=
// 5

// 1
// <=
// K
// <=
// 100

// Time limit
// 1
//  second

// Example
// Input
// 2
 
// 2
 
// 5

// 1
 
// 2

// 3
 
// 4

// Output
// 5
 
// 10

// 15
 
// 20

