/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class Read {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        FileWriter fw;
        fw = new FileWriter("‪x.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String name = "";
        String all_data="";
        while(!name.equals("stop")){
        System.out.println("Enter Your Name: ");
        name = br.readLine();
        System.out.println("data is: "+ name);
        all_data=all_data+","+name;
    }
        bw.write(all_data);
        br.close();
        r.close();
        bw.close();
        
}
}