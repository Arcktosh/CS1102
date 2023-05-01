//Counting how many lower and uppercase.

public class CapitalizeAll {
  public static void main(String[] args) {
    /* 
     * To count the number of lowercase and uppercase
     *  and change to allcaps
     */

    String strx = "uNiveRSity oF thE PEoplE";
    int upperCase = 0;
    int lowerCase = 0;
    String strup = strx.toUpperCase();
    char[] ch = strx.toCharArray();

    //using for loop
    for (char chh: ch) {
      if (chh >= 'A' && chh <= 'Z') {
        upperCase++;
      } else if (chh >= 'a' && chh <= 'z') {
        lowerCase++;
      } else {
        continue;
      }
    }

    //using do while loop
    int i = 0;
    char chh = ch[i];
    do {
      if (chh >= 'A' && chh <= 'Z') {
        upperCase++;
      } else if (chh >= 'a' && chh <= 'z') {
        lowerCase++; //missed a semicolon here
      }
      i++;
    } while (i < ch.length);

    //while loop
    int j = 0;
    char wchh = ch[j]; //used the same variable name, updated to wchh
    while (j < ch.length) {
      if (wchh >= 'A' && wchh <= 'Z')
      {
        upperCase++;
        j++;
      } else if (wchh >= 'a' && wchh <= 'z')
      {
        lowerCase++;
        j++;
      }
    }

    System.out.println("Count of Uppercase letter:" + upperCase + " and of Lowercase letter: " + lowerCase);
    System.out.println("The new string is changed to:" + strup);
  }
}