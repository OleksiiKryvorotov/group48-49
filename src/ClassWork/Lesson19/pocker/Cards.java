package ClassWork.Lesson19.pocker;

public class Cards {
    Card[] deck = new Card[52];

    Card[] deckShuffle = new Card[52];



    void deckShuffle(Card[] deck) {
        deckShuffle = deck.clone();

        for (int i = deckShuffle.length-1; i > 1; i--) {

            int j = (int) (Math.random()*i);

            //System.out.println(i+" "  +j);
            Card tempPlace = deckShuffle[i];
            deckShuffle[i] = deckShuffle[j];
            deckShuffle[j] = tempPlace;
        }

    }

    void createDeck(){
        String[] cardValue = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cardSuit = {"♠️","♣️","♦️","♥️"};

        for (int i = 0; i < cardSuit.length; i++) {
            for (int j = 0; j < cardValue.length; j++) {
                deck[i* cardValue.length+j]=new Card(cardValue[j],cardSuit[i]);
            }
        }

    }

    void printDeck(Card[] deck, String message){
        System.out.println(message);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(deck[i*13+j].value+deck[i*13+j].suit +", ");
            }
            System.out.println();
        }
    }


}