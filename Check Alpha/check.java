/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class check {
    public static boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }
 
    public static void main(String[] args)
    {
        String s = "Seif1";
        System.out.println("IsAlpha: " + isAlpha(s));
    }
}
        