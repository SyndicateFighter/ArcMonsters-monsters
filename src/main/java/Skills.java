/**
 * Created by alex7370 on 11/9/2015.
 */
abstract public class Skills {
    private String name;
    private int currentNRG;
    private int maxNRG;
    private int cooldown;

    abstract public void Action(Worker attackingWorker, Worker defendingWorker);

    final public String getName()
    {
        return this.name;
    }

    final public int getCurrentNRG()
    {
        return this.currentNRG;
    }

    final public int getMaxNRG()
    {
        return this.maxNRG;
    }

    final public int getCooldown()
    {
        return this.cooldown;
    }
}
