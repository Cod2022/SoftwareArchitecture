package main.HW1.ModelElements;

import java.util.ArrayList;

public class PoligonalModel {
    public ArrayList<Poligon> poligons;
    public  ArrayList<Texture> textures;

    public PoligonalModel(ArrayList<Poligon> poligons, ArrayList<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
}
