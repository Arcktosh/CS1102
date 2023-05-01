public class ReverseStr {  //to reverse the word given.

public static void main (String[] agrs)  {

      

      String myStr="universityofthepeople";

      String updatedstr="";

      char chr;

      System.out.print("My original line is:");

      System.out.println(myStr); 


 //using for loop to reverse the string

      for(int i=0; i<myStr.length(); i++) 

      {

          chr=myStr.charAt(i);

          updatedstr= chr+updatedstr;

      }

      System.out.println("The reversed word is:"+updatedstr);

     

  //using While loop to reverse the string

      int i = 0;

      while (i < myStr.length())

            {      

                 chr=myStr.charAt(i);

                 updatedstr= chr+updatedstr;

                 i++;

              }

      System.out.println("The reversed word is:"+updatedstr);

     

  //using do...while loop

     

      int j = 0;

   

      do {      

           chr=myStr.charAt(j);

           updatedstr= chr+updatedstr;

           j++;

          

        } while ( j<myStr.length());

   System.out.println("The reversed word is:" +updatedstr);

     

  }

}





