package model;

public class Card {
    private int cardNumber;
    private String cardName;
    private String cardType;
    private boolean cardIsHero;
    private Ability cardAbility;
    private String cardPosition;
    public void doAbility(){}

    public Card(int cardNumber, String cardName, String cardType, boolean cardIsHero, Ability cardAbility, String cardPosition) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardIsHero = cardIsHero;
        this.cardAbility = cardAbility;
        this.cardPosition = cardPosition;
    }
}
