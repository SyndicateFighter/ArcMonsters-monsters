/**
 * Created by alex7370 on 11/5/2015.
 */
public class Employees {
    private int level;
    private long currentXP;
    private long nextXP;
    public enum TeamType {SDK, DESKTOP, SERVER, IMPLEMENTATION, GEODATA};
    private TeamType EmpType;
    private String name;

    Employees(String Name, long xp, TeamType TypeOfCharacter)
    {
        this.name = Name;
        this.EmpType = TypeOfCharacter;
        this.currentXP = 0;
        this.level = 1;
        this.nextXP = 222;
        this.adjustXP(xp);
    }

    Employees()
    {
        this("David", 25, TeamType.SDK);
    }

    Employees(String Name)
    {
        this(Name, 25, TeamType.DESKTOP);
    }

    Employees(String Name, long xp)
    {
        this(Name, xp, TeamType.DESKTOP);
    }

    Employees(String Name, TeamType TypeOfCharacter)
    {
        this(Name, 25, TypeOfCharacter);
    }

    public int getLevel()
    {
        return this.level;
    }

    public long getCurrentXP()
    {
        return this.currentXP;
    }

    public void adjustXP(long xp)
    {
        if ((this.currentXP + xp) > this.nextXP)
        {
            this.level++;
            this.nextXP += 222*this.level;
            this.currentXP = this.nextXP;
            xp -= this.nextXP;
            adjustXP(xp);
        }
        else {
            this.currentXP+=xp;
        }
    }

    public TeamType getType()
    {
        return this.EmpType;
    }
}
