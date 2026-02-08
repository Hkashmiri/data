public class Grok {
    private static final int DEFAULT_POWER_LEVEL = 50;
    private static final int MAX_POWER_LEVEL = 100;

    // instance variables
    private int powerLevel;
    private boolean isAlive;

    /*
     * Initializes a Grok object to the default power level of 50.
     */
    public Grok() {
        setIsAlive(true);
        setPowerLevel(DEFAULT_POWER_LEVEL);
    }

    /*
     * Initializes a Grok object to power powerLevel
     *
     * @param powerLevel power level of this Grok
     */
    public Grok(int powerLevel) {
        setIsAlive(true);
        setPowerLevel(powerLevel);
    }

    // accessor methods

    /*
     * Returns the power level of this Grok.
     * @return the power level of this Grok
     */
    public int getPowerLevel() {
        return powerLevel;
    }



    // mutator methods

    /*
     * Sets the power level of this Grok.
     * Ensures the power level does not exceed the maximum allowed.
     * If the power level drops to or below zero, sets the Grok as dead.
     * @param powerLevel the power value to set for this Grok.
     */
    public void setPowerLevel(int powerLevel) {
        if(isAlive){
            this.powerLevel = Math.min(powerLevel, MAX_POWER_LEVEL);
        }

        if (this.powerLevel <= 0) {
            setIsAlive(false);
            this.powerLevel = 0;
        }
    }

    /*
     * Sets whether this Grok is alive or not.
     * @param alive true if Grok is alive, false otherwise
     */
    private void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    /*
     * Set the power level of this Grok to the sum of its current
     * power level and the power of the pill.
     * @param pill The PowerPill that this Grok ingests.
     */
    public void takePowerPill(PowerPill pill) {
        if (isAlive) {
            setPowerLevel(powerLevel + pill.getPower());
        }
    }

    /*
     * Reduces the power level of this Grok by 5 when it takes a hit.
     */
    public void tookHit() {
        if (isAlive) {
            setPowerLevel(powerLevel - 5);
        }
    }

    /*
     * Checks if this Grok is dead.
     * @return true if Grok is dead (power level <= 0), false otherwise
     */
    public boolean isDead() {
        return powerLevel <= 0;
    }

    /*
     * Returns a string representation of this Grok.
     * @return a string representation of this Grok
     */

    //================== Do Not Touch Code Below this line =============================
    public String toString(){
        return "Grok:("+powerLevel+","+isAlive+")";
    }
}
