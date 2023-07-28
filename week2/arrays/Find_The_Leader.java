import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int t=inp.nextInt();
      while(t>0){
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=inp.nextInt();
        }
        int max=arr[n-1];
        for(int i=n-1;i>=0;i--){
          if(arr[i]>=max){
            System.out.print(arr[i]+" ");
          }
          max=Integer.max(arr[i], max);
        }
        System.out.println();
        
        t--;
      }
    }
  }


// Question:
// Find the Leader
// A simple problem statement with no stories: Given an array of positive integer, find out all the elements that are greater than or equal to all the elements to it's right side.

// Input format
// The first line contains an integer 
// T
// , denoting the number of test cases.
// Then follows 
// T
//  test cases, and each test case consists of two lines.
// The first line contains 
// N
// .
// Second-line contains 
// N
//  space-separated integers.

// Output format
// For each test case on a new line, print the list of positive integers satisfying the above given condition. Print from end element to start element.

// Constraints
// 1
// <=
// T
// <=
// 5

// 1
// <=
// N
// <=
// 10
// 6

// 0
// <=
// A
// [
// i
// ]
// <=
// 10
// 6

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

// 4

// 1
 
// 4
 
// 3
 
// 2

// Output
// 5

// 2
 
// 3
 
// 4

// Sample test case explanation
// In the first test case
// only element 
// 5
//  satisfy the condition.

// In the second test case
// 4
 
// 3
//  and 
// 2
//  satisfy the condition and are printed from end to first.

