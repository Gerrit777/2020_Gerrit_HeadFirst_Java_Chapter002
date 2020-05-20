public class Switch {
  public static void main(String[] args) {
             int waardeKnop = 1; // knop 1 is ingedrukt
            switch(waardeKnop) {
                  case 1:
                      System.out.println("Knop 1 werd ingedrukt.");
                      break;
                  case 2:
                      System.out.println("Knop 2 werd ingedrukt.");
                      break;
                  case 3:
                      System.out.println("Knop 3 werd ingedrukt.");
                      break;
                   default:
                       System.out.println("Fout: Een onbekende knop werd ingedrukt!");
                     }
           }
}