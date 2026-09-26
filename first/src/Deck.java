import java.util.*;

public class Deck {
    private Arraylist <Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hjerter", "Ruder", "Spar", "Klør"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Knægt","Dame","Konge","Es"};
        int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};

        for (String suit : suits){
            for (int i = 0; i < ranks.length; i++){
                cards.add(new Card(suit, rank[i], values[i]));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}
