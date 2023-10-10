package main.HW1.InMemoryModel;

import main.HW1.ModelElements.PoligonalModel;
import main.HW1.ModelElements.Scene;
import main.HW1.ModelElements.Flash;
import main.HW1.ModelElements.Camera;

import java.util.ArrayList;

public class ModelStore implements IModelChanger{
    public ArrayList<PoligonalModel> models;
    public ArrayList<Scene> scenes;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;
    private ArrayList<IModelChangedObserver> changedObservers;

    public ModelStore(ArrayList<PoligonalModel> models,ArrayList<Scene> scenes,
                      ArrayList<Flash> flashes,ArrayList<Camera> cameras,
                      ArrayList<IModelChangedObserver> changedObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changedObservers = changedObservers;
    }

    public void getScena(int num){
    }
    public void notifyChange(IModelChanger sender){
    }
}
