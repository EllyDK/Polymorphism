package P01_ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return this.length;
    }

    private void setLength(double length) {
        if (length > 0){
            this.length = length;
        }else {
            throw new IllegalArgumentException
                    ("Length cannot be zero or negative.");
        }
    }

    public double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        if (width > 0){
            this.width = width;
        }else {
            throw new IllegalArgumentException
                    ("Width cannot be zero or negative.");
        }
    }

    public double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        if (height > 0){
            this.height = height;
        }else {
            throw new IllegalArgumentException
                    ("Height cannot be zero or negative.");
        }
    }
    public double calculateSurfaceArea (){
        return (2 * (getLength() * getWidth())) +
                (2 * (getLength() * getHeight())) +
                (2 * (getWidth() * getHeight()));
    }
    public double calculateLateralSurfaceArea (){
        return (2* (getLength() * getHeight())) +
                (2 * getWidth() * getHeight());
    }
    public double calculateVolume (){
        return getLength() * getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return String.format
                ("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume – %.2f",
                        calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }
}
