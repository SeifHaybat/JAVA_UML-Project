
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PyramidCSVDAO y = new PyramidCSVDAO();
        List<Pyramids> pyramids = y.readPyramidsFromCSV("D:\\ITI Course\\Java & UML\\Day 2\\pyramids.csv");
        int i=0;
        for(Pyramids p:pyramids){
            System.out.println("#"+(i++)+p);
    }
        System.out.println(y.wordCount(pyramids));

    }
}

 
    

