package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Scene {

    private static int counter = 100;
    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;
    private List<Camera> cameras;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(List<PoligonalModel> models, List<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    public Object merhod1(Object obj) {
        return new Object();
    }

    public Object merhod2(Object obj1, Object obj2) {
        return new Object();
    }
}