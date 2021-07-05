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
public class Pyramids {
        private double Height;
        private String Modern_name;
        private String Pharaoh;
        private String Site;
        Pyramids(double Height, String Modern_name, String Pharaoh, String Site){
        this.Height = Height;
        this.Modern_name = Modern_name;
        this.Pharaoh = Pharaoh;
        this.Site = Site;
    }
        

    public double getHeight() {
        
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public String getModern_name() {
        return Modern_name;
    }

    public void setModern_name(String Modern_name) {
        this.Modern_name = Modern_name;
    }

    public String getPharaoh() {
        return Pharaoh;
    }

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    @Override
    public String toString() {
        return "Pyramids{" + "Height=" + Height + ", Modern_name=" + Modern_name + ", Pharaoh=" + Pharaoh + ", Site=" + Site + '}';
    }
    
}


    




