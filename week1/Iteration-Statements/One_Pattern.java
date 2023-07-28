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
