import javax.xml.namespace.QName;

public class Main {
    public static void main(String [] args) {
//        Car myChevy = new Car();
//        Car myBenz = new Car();
//        Car myBuick = new Car();
//        myChevy.setMake("Ram");
//        myChevy.setModel("1500");
//        myChevy.setYear(2018);
//        myBenz.setYear(2002);
//        myBenz.setMake("Mercedes");
//        myBenz.setModel("CL30");
//        System.out.println(myChevy.getCarType());
//        System.out.println(myBenz.getCarType());
//        Car.beepTheHorn();

        Song huntingSeason = new Song("Hunting Season", "its huntin szn out hiya", 180,
                "Don Miller", 2022, "Don Miller", true);

        Playlist summerTimeJams = new Playlist();

        summerTimeJams.addSong(huntingSeason);




    }

}
