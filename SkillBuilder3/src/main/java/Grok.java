
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    private static final int DEFAULT_POWER_LEVEL = 50;
    private int powerLevel;

    public Grok(){
        powerLevel = DEFAULT_POWER_LEVEL;
    }

    public Grok(int power_level){
        this.powerLevel = power_level;
    }

    public int getPowerLevel()
    {
        return powerLevel;
    }

    public void setPowerLevel(int power)
    {
        this.powerLevel = power;
    }

    public void takePowerPill(PowerPill pill){
        powerLevel += pill.getPower();
    }

    public void tookHit() {
        this.powerLevel -= 5;
    }


    // implement this class per instructions in Required Activities.
}