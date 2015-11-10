/**
 * Created by alex7370 on 11/9/2015.
 */
abstract public class Skills {
    private String name;
    private int currentNRG;
    private int maxNRG;
    private int cooldown;
    private int costNRG;

    public Skills(String Name, int MaxNRG, int Cooldown, int CostPerAttach)
    {
        this.name = Name;
        this.maxNRG = MaxNRG;
        this.currentNRG = MaxNRG;
        this.cooldown = Cooldown;
        this.costNRG = CostPerAttach;

        // When writing subclasses, use the following format of constructor
        // class SubClass extends Skills
        // {
        //    public SubClass(String Name, int MaxNRG, int Cooldown, int CostPerAttach)
        //     {   super(String Name, int MaxNRG, int Cooldown, int CostPerAttach);   }
        // }
    }

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

    final public int adjustNRG()
    {
        //DO SOMETHING
        return this.currentNRG;
    }

}
