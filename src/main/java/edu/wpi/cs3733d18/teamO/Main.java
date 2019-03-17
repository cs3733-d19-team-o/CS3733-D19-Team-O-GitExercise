package edu.wpi.cs3733d18.teamO;




public final class Main {

  private Main() {

  }

  public static void main(String... args) {
      System.out.println("Austin");
      System.out.println("Ken");
      System.out.println("Hello, World");
      System.out.println("Dev Patel");
      System.out.println("Jyan");
      System.out.println("Amelia");
      System.out.println("Peter Prygocki");
      System.out.println("Jack Yang");
      System.out.println("Lynn Song");
      System.out.println("Alex");

      printBranchName();
      branchPeter();
  }

  public static void branchPeter() {
      System.out.println("Branch Peter");
  }

  private static void printBranchName() {
      System.out.println("Branch - ken");
  }

    public static void BranchJack(){
        System.out.println("Branch – Jack Yang");
    }
}
