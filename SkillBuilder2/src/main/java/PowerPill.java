public class PowerPill {
    public static final int DEFAULT_POWER = 10;

    private int power;

    private String name;

    /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */
    public PowerPill(String name) {
        this.name = name;
        this.power = DEFAULT_POWER;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }


    /**
     * Gets the power level of this power pill.
     * @return the power level of this power pill.
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets the name of this power pill.
     * @return the name of this power pill.
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the power level of this power pill.
     * @param power the new power level of this power pill.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Sets the name of this power pill.
     * @param name the new name of this power pill.
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
}
