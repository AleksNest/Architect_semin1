package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;


public class ModelStore implements IModelChanger {

    public ArrayList<PoligonalModel> models = new ArrayList<PoligonalModel>();
    public ArrayList<Scene> scenes = new ArrayList<Scene>();
    public ArrayList<Flash> flashes = new ArrayList<Flash>();
    public ArrayList<Camera> cameras = new ArrayList<Camera>();
    private ArrayList<IModelChangeObserver> changeObservers = new ArrayList<IModelChangeObserver>();


    //�����������
    public ModelStore(Texture texture) {
        models.add(new PoligonalModel((texture)));
        flashes.add(new Flash());
        scenes.add(new Scene(models.get(0), cameras.get(0)));
        cameras.add(new Camera());

    }

    // ����� ����������
    @Override
    public void notifyChange(IModelChanger sender) {
    }

    // ����� ��������� ����� �� ������ ������������� �����
    public Scene getScene(int sceneNumber) {
        return scenes.get(sceneNumber);
    }

    // ����� �������� ������
    public void deleteScene(Scene scenes, int sceneNumber) {
        scenes.cameras.remove(sceneNumber);
    }

}
