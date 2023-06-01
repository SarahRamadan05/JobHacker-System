import java.util.Date;

public class GeometricObject {
    private String colorName;
    private boolean filled;
    private Date creationDate;

    public GeometricObject() {
        creationDate = new Date();
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String toString() {
        return "GeometricObject: colorName = " + colorName + ", filled = " + filled +
                ", creationDate = " + creationDate;
    }
}
