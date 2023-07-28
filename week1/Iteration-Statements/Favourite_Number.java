import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner inp=new Scanner(System.in);
      int t=inp.nextInt();
      
      while(t>0){
        int n=inp.nextInt();
        int count=0;
        while(n>0){
          int i=n%10;
          if(i==5) count++;
          n=n/10;
        }
        System.out.println(count);
        t--;
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

