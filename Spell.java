package model;

public class Spell extends Card{
    public Spell(int cardNumber, String cardName, String cardType, boolean cardIsHero, Ability cardAbility, String cardPosition) {
        super(cardNumber, cardName, cardType, cardIsHero, cardAbility, cardPosition);
    }
    @Override
    public void doAbility() {
        super.doAbility();
    }
}
