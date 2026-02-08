public class rps {
    private final static int ROCK = 0;

    private final static int PAPER = 1;

    private final static int SCISSORS = 2;

    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfChallenges;

    private String name;

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public int getNumberOfChallenges() {
        return numberOfChallenges;
    }

    public java.lang.String getName() {
        return name;
    }

    public rps() {
        this.name = name;
        numberOfWins = 0;
        numberOfChallenges = 0;
        numberOfDraws = 0;

    }

    public void clear(){
        numberOfWins = 0;
        numberOfChallenges = 0;
        numberOfDraws = 0;
    }

    public rps challenge(rps rps){
        
    }
}
