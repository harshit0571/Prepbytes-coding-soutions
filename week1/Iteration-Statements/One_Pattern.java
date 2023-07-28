import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int n=inp.nextInt();
      for(int i=0;i<5;i++){
        for(int j=0;j<i+1;j++){
          System.out.print(n+" ");
        }
        System.out.println();
      }
      
    }
  }


// Question:
// One Pattern
// Print in the output the exact pattern provided below
// 1
// 1 1
// 1 1 1
// 1 1 1 1
// 1 1 1 1 1

// Input format
// A single integer 
// N

// Output format
// Print the same pattern provided in the problem statement.

// Constraints
// N
// =
// 1

// Input
// 1

// Output
// 1
// 1 1
// 1 1 1
// 1 1 1 1
// 1 1 1 1 1
