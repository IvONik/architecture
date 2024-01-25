
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObserver;

    public ModelStore(List<IModelChangedObserver> changedObserver) throws Exception {
        this.changedObserver = changedObserver;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();
        Models.add(new PoligonalModel(null));// аргументы?
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
        Flashes.add(new Flash(null, null, null, null));// аргументы?
        Cameras.add(new Camera(null, null));// аргументы?
    }

    public Scene GetScene(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }
}