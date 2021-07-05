/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Better {
    public static void main(String[] args) {
    String longer = new String();
    String string1 = "seif";
    String string2 = "hossam";
    longer = StringUtils.Better(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(longer);
    }
  
   
}
