package main.HW1.ModelElements;

import java.util.ArrayList;

public class Scene {
    int id;
    ArrayList<PoligonalModel> models;
    ArrayList<Flash> flashes;

    public Scene(int id,ArrayList<PoligonalModel> models,ArrayList<Flash> flashes){
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public <T> T method1(T type){
        return type;
    }

    public <T> T method2(T type, T type2){
        return type;
    }
}
