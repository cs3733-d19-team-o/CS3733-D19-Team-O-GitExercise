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
      System.out.println("Bailey");

      printBranchName();
      branchPeter();
      BranchJack();
      printDev();
  }

    public static void branchSam(){
        System.out.println("Branch Sam");
    }

  public static void printAustin() {
      System.out.println("Austin!!!!!!");
  }

    public static void branchPeter() {
        System.out.println("Branch Peter");
    }

    private static void printBranchName() {
        System.out.println("Branch - ken");
    }

    public static void BranchJack() {
        System.out.println("Branch – Jack Yang");
    }

    private static void printJack() {
        System.out.println("YANGYANG");
    }

    private static void printDev() {
        System.out.println("BranchDev");
    }

    public static void printLynn(){
        System.out.println("Lynn");
    }

    private static void printKenTutorial() {
        System.out.println("my name is ken");
    }

}