import java.util.List;

public class Scene {
    public Integer id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene (int id, List<PoligonalModel> Models, List<Flash> Flashes,  List<Camera> Cameras){
        this. id = id;
        this. Models =  Models;
        this. Flashes =  Flashes;
        this. Cameras =  Cameras;

        if (Models.size() < 1) {
            throw new IllegalArgumentException("Количество полигональных моделей в сцене должно быть не менее 1");
        }
        if (Cameras.size() < 1) {
            throw new IllegalArgumentException("Количество полигональных моделей в сцене должно быть не менее 1");
        }
    }

}
