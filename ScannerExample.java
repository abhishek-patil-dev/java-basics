import java.util.Scanner;
class ScannerExample{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your marks: ");
    int marks = sc.nextInt();
    if(marks >= 35){
      System.out.println("Result: pass");
    }
    else{
      System.out.println("Result: Fail");
    }
    sc.close();
  }
}
