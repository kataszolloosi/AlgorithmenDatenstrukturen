package ProbePrüfung.P3_SortCards;

public class Deck {
    private Card[] deck;
    private int cardCount;

    public Deck(int arraySize) {
        this.deck = new Card[arraySize];
        cardCount = 0;
    }

    public boolean addCard(Card.Color color, int number) {
        Card newCard = new Card(color, number);
        if (cardCount == deck.length)
            return false;
        else {
            deck[cardCount] = newCard;
            cardCount = cardCount + 1;
            return true;
        }
    }

    public Card[] getDeck() {
        return this.deck;
    }

    public void sortDeck() {
        // TODO: Implementierung hinzufuegen
    }
}
