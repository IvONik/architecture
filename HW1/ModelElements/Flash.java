import java.util.List;


public class Flash {
    public List<Point3D> Location;
    public List<Angle3D> Angle;
    public List<Color> Color;
    public List<Float> Power;

    public Flash(List<Point3D> Location, List<Angle3D> Angle, List<Color> Color, List<Float> Power){
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(List<Angle3D> Angle){

    }
    public void Move(List<Point3D> Location){

    }
}
