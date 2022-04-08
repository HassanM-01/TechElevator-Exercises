public class Sports {

    double numberOfWins;
    double numberOfLosses;
    String teamName;



    public Sports(double numberOfWins, double numberOfLosses, String teamName) {
        this.numberOfWins = numberOfWins;
        this.numberOfLosses = numberOfLosses;
        this.teamName = teamName;
    }


    public double winLossRatio (double numberOfLosses, double numberOfWins){
        if (numberOfLosses == 0) {
            System.out.println(numberOfWins);
            return numberOfWins;
        }

        return numberOfWins / numberOfLosses;


    }


    public double getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public double getNumberOfLosses() {
        return numberOfLosses;
    }

    public void setNumberOfLosses(int numberOfLosses) {
        this.numberOfLosses = numberOfLosses;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
