package ru.geekbrains.lesson1.store3D.inmemory;

import ru.geekbrains.lesson1.store3D.models.Camera;
import ru.geekbrains.lesson1.store3D.models.Flash;
import ru.geekbrains.lesson1.store3D.models.PoligonalModel;
import ru.geekbrains.lesson1.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();


    public void add(List<PoligonalModel> model, List<Scene> scene, List<Flash> flashe, List<Camera> camera) {

        if (models == null || models.size() == 0) {
            throw new RuntimeException("Модель должна содержать минимум одну полигональную модель.");
        }
        if (flashes == null || flashes.size() == 0) {
            throw new RuntimeException("Модель должна содержать минимум идин свет.");
        }
        if (cameras == null || cameras.size() == 0) {
            throw new RuntimeException("Модель должна содержать минимум одну камеру.");
        }
        if (scenes == null || scenes.size() == 0) {
            throw new RuntimeException("Модель должна содержать минимум одну сцену.");
        }

        this.models = model;
        this.scenes = scene;
        this.flashes = flashe;
        this.cameras = camera;
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
