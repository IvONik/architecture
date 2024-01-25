import java.util.List;

public class Camera {
    public List<Point3D> Location;
    public List<Angle3D> Angle;

    public Camera(List<Point3D> Location, List<Angle3D> Angle){
        this.Location = Location;
        this.Angle = Angle;        
    }

    public void Rotate(List<Angle3D> Angle){

    }
    public void Move(List<Point3D> Location){

    }
}
