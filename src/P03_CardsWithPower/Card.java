package P03_CardsWithPower;

public class Card {
    private SuitPowers suit;
    private RankPowers rank;
    private int power;

    public Card(SuitPowers suit, RankPowers rank) {
        this.suit = suit;
        this.rank = rank;
        this.power = this.suit.getSuitPower() + this.rank.getPowerRank();
    }

    public SuitPowers getSuit() {
        return this.suit;
    }

    public void setSuit(SuitPowers suit) {
        this.suit = suit;
    }

    public RankPowers getRank() {
        return this.rank;
    }

    public void setRank(RankPowers rank) {
        this.rank = rank;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
