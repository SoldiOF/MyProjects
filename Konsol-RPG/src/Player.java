public class Player {
    private int damageTaken = 5;
    private String name;
    private int currentHp;
    private int maxHp;
    private boolean isPlayerAlive;
    public Player(String nameParam, int maxHpParam, int currentHpParam, boolean isPlayerAliveParam){
        this.name = nameParam;
        this.maxHp = maxHpParam;
        this.currentHp = currentHpParam;
        this.isPlayerAlive = isPlayerAliveParam;

    }
    public  int getMaxHp(){
        return maxHp;
    }
    public int getCurrentHp(){
        return currentHp;
    }
    public boolean getIsPlayerAlive(){
        return isPlayerAlive;
    }
    public void takeDamage(){
        if ((currentHp - damageTaken) <= 0){
            currentHp = 0;
        }
        else {
            currentHp = currentHp - damageTaken;
        }

    }
    public int getDamageTaken(){
        return damageTaken;
    }

    public String getName() {
        return name;
    }
}
