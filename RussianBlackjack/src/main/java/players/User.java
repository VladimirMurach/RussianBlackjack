package players;

public class User extends Player {

    private int victories;
    private int defeats;
    private int money;

    public User(int victories, int defeats, int money) {
        super();
        this.victories = victories;
        this.defeats = defeats;
        this.money = money;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
