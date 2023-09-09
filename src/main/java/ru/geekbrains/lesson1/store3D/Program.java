package ru.geekbrains.lesson1.store3D;

import ru.geekbrains.lesson1.store3D.inmemory.ModelStore;
import ru.geekbrains.lesson1.store3D.inmemory.Observer1;
import ru.geekbrains.lesson1.store3D.models.*;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);

        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);


        Flash flash1 = new Flash(
                new Point3D(1, 2, 3),
                new Angle3D(22.3),
                new Color("red"),
                111);
        Camera camera1 = new Camera(
                new Point3D(2, 3, 4),
                new Angle3D(22.3));

        List<PoligonalModel> poligonalModels = new ArrayList<>();
        List<Camera> cameras = new ArrayList<>();
        List<Scene> scenes = new ArrayList<>();
        List<Flash> flashes = new ArrayList<>();

        Scene scene1 = new Scene(poligonalModels, cameras);

        poligonalModels.add(poligonalModel);
        cameras.add(camera1);
        scenes.add(scene1);
        flashes.add(flash1);


        store.add(poligonalModels, scenes, flashes, cameras);

    }

}
