 import java.util.Scanner;


class Main {

  static void q1()
  {
    System.out.println("\nQ1\n");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int minute =0;
    int hour = 0;
    int second = n;
    //hour = n/60;
    
    if(second >=60)
    {
      minute = second/60;
     second = second%60;
      if(minute >= 60)
      {
        hour = minute/60;
        minute = minute%60;
      }
    }
    System.out.println(hour + ":" + minute + ":" + second);
  }

  static void q2()
  {
    System.out.println("\nQ2\n");
    Scanner in = new Scanner(System.in);
    int n =0;
    while(true)
    {
      n = in.nextInt();
      if(n>99999 || n < 10000)
          System.out.println("error");
      else
          break;
    }

    n = n/10;
    n = n/10;
    n = n%10;
    
    System.out.println(n);
      

  }

  static void q3()
  {
    System.out.println("\nQ3\n");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k =1;
    for(int i =1; i<=n; i++)
   {
        for(int j =1; j<=i; j++)
          {
            if(k > 9)
              k = 0;
            System.out.print(k);
            k++;
            
          }
        System.out.println();
    }

  }

  static void q4()
  {
    System.out.println("\nQ4\n");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
   // char check[] = s.tocharArray();
    int count =0;
    int k =0;
    char ss;
    
     while(true)
     {
       count = 0;
        for(int i = 0; i<s.length(); i++)
        {
          ss = s.charAt(i);
           k = (int)ss - '0';
            count = count + k;

        }
       if(count < 10)
          break;
       s = Integer.toString(count);
     }
    System.out.println(count);
  }

  static void q5()
  {
    System.out.println("\nQ5\n");
    Scanner in = new Scanner(System.in);
    int count[] = new int[10];
    int check[] = new int[10];
    // String ss = in.nextLine();
    // char[] pp = ss.tocharArray();
    int arr[] = {0,0,0,0,0,0,0,0,0,0};
    int checking = 0;
    
    for(int i =0; i<10; i++)
    {
      int n = in.nextInt();
      for(int j =0; j<10; j++)
      {
         if(arr[j] == n)
         {
          count[i] = count[i] + 1;
          checking = 1;
          break;
         } 
         //System.out.println("checking count : " + count[i]);
      }
     
      
    }
    for(int i =0; i<arr.length;i++)
    {
      System.out.printf("%d %d\n",arr[i], count[i]);    
    }
  }

  
  
  public static void main(String[] args) {

    q1();
    q2();
    q3();
    q4();
    q5();
  }
}
