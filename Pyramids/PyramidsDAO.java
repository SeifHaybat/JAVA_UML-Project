/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.Map;
/**
 *
 * @author DELL
 */
public interface PyramidsDAO {
    public List<Pyramids> readPyramidsFromCSV(String path);
    public Pyramids createPyramid(String[] metadata);
    
}
