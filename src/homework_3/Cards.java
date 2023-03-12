package homework_3;

import java.util.Random;

public class Cards {
    public String[] deckOfCards(int numberOfCards, int[] rank, int[] suits) {

        String[] cards = new String[numberOfCards];
        int index = 0;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[index++] = rank[i] + " " + suits[j];
            }
        }
        return cards;
    }

    public String[] randomCard(String[] cards, int numberOfCards) {
        for (int i = 0; i < cards.length; i++) {
            String currentCard = cards[i];
            Random random = new Random();
            int randomIndex = random.nextInt(numberOfCards);
            String randomCard = cards[randomIndex];
            cards[i] = randomCard;
            cards[randomIndex] = currentCard;

        }
        return cards;
    }
}





