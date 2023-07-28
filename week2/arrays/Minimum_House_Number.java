import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int t=inp.nextInt();
      while(t>0){
        int n=inp.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
          arr[i]=inp.nextInt();
          if(arr[i]<min){
            index=i;
            min=arr[i];
          }
        }      
        System.out.println(index);
        t--;
      }
      
    }
  }


// Question:
// Minimum house number
// PrepBuddy lives in a colony, where 
// N
//  houses are built in a single row numbered from 
// 0
//  to 
// N
// −
// 1
// . The first house has a house number 
// 0
// , the second house has a house number 
// 1
//  and so on, every house pays some rent at the end of the month.
// Help PrepBuddy in finding out the house number of the house paying the minimum rent.

// Note: All house rents are unique.

// Input format
// First line contains test case 
// T
// .
// T
//  test cases follow,
// First line contains 
// N
//  representing the number of houses.
// Second line contains the rent of the 
// N
//  houses.

// Output format
// For each test case on a new line, print house numbers(
// 0
// - based indexing) that satisfy the above-mentioned condition.

// Constraints
// 1
// <=
// T
// <=
// 5

// 2
// <=
// N
// <=
// 100

// 1
// <=
// A
// [
// i
// ]
// <=
// 1000

// Time limit
// 1
//  second

// Example
// Input
// 2

// 5

// 4
 
// 3
 
// 5
 
// 2
 
// 1

// 7

// 7
 
// 2
 
// 8
 
// 4
 
// 3
 
// 9
 
// 1

// Output
// 4

// 6

