/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
/**
 *
 * @author DELL
 */
public class PyramidCSVDAO implements PyramidsDAO {
    
            List<Pyramids> pyramids = new ArrayList<Pyramids>();
            

    @Override
    public List<Pyramids> readPyramidsFromCSV(String path) {
        List<Pyramids> pyramids = new ArrayList<Pyramids>();
        BufferedReader br=null;
        
        try {
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            do{
                line = br.readLine();
                
                if(line != null){
                    String[] attributes = line.split(",");
                    Pyramids x = createPyramid(attributes);
                    pyramids.add(x);
                }
                pyramids.sort(Comparator.comparing(Pyramids::getHeight));;
                //System.out.println(pyramids.stream().sorted().collect(Collectors.groupingBy(Pyramids::getSite)));
                
            }
            while(line != null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
                
            
        }
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pyramids;
    }

    @Override
    public Pyramids createPyramid(String[] metadata) {
       
       Pyramids seif;
       if(metadata[7].equals("")){
           metadata[7] = "0";
       }
       seif = new Pyramids(Double.parseDouble(metadata[7]), metadata[3], metadata[0], metadata[4]);
       
        return seif;
    }

    public Map<String, Integer> wordCount(List<Pyramids> pyramids) {
    Map<String, Integer> map = new HashMap<String, Integer> ();
    for (Pyramids s:pyramids) {
    String key = s.getSite();
    if (!map.containsKey(key)) {  // first time we've seen this string
      map.put(key, 1);
    }
    else {
      int count = map.get(key);
      map.put(key, count + 1);
    }
  }
  return map;
}

    
  
    
}

