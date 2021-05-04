/*Caitie DeShazo-Couchot
January 19, 2021
CSE 142
TA: Bella
Assignment #2

This program will create a house ascii art picture :)*/
public class AsciiArt {
   public static void main (String [] args){
      roof();
      line();
      window();
      multipleLines();
      window();
      multipleLines();
      door();
      System.out.println("====================================================");
   }
   public static void roof(){
      for (int r = 1; r <= 2; r++){
      System.out.println("|==================================================|");
      }
   }
   public static void window(){
      windowTrim();
      int i;
      for (i =1; i<=2; i++){
            windowPane();
            }
      System.out.println("|   |=========|                      |=========|   |");
      for (i=2; i<=3; i++){
            windowPane();
            }
      windowTrim();
   }
   public static void windowTrim(){
      System.out.println("|    _________                        _________    |");
   }
   public static void line(){
      System.out.println("|                                                  |");
   }
   public static void door(){
      System.out.println("|                      _______                     |");
      System.out.println("|                     /       \\                    |");
      int d;
      for (d = 1; d<=2;d++){
         doorFrame();
      }
      System.out.println("|                    |        *|                   |");
      for (d = 2; d<=3; d++) {
         doorFrame();
         }
   }
   public static void multipleLines() {
      for (int f = 0; f < 4; f++){
         line();
      }
   }
   public static void windowPane(){
      System.out.println("|   |    |    |                      |    |    |   |");
      }
   public static void doorFrame(){
      System.out.println("|                    |         |                   |");
      }
   }