import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public PoligonalModel(List<Texture> Textures) {
        this.Textures = Textures;
        this.Poligons = new ArrayList<>();
        Poligons.add(new Poligon());
        
        if (Poligons.size() <= 1) {
            throw new IllegalArgumentException("Количество полигонов должно быть больше 1");
        }
    }
}