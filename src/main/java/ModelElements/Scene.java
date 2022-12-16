package ModelElements;

import java.util.ArrayList;

public class Scene <Type>{
    public int Id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    // конструктор
    public Scene (PoligonalModel inputModels, Camera inputCamera){
        models.add(inputModels);
        cameras.add(inputCamera);
    }

    // заглушка
    public Type method1 (Type t){
        return t;
    }

    // заглушка
    public Type method2 (Type t1, Type t2){
        return t2;
    }

}
