public class Car {
    public static String carManufactoror = "GM";
    private int year;
    private String make;
    private String model;
    public String getCarType(){
        return year + " " + make + " " + model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getMake(){
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }
    public static void beepTheHorn(){
        System.out.println("beeeeeep?");
    }
}
