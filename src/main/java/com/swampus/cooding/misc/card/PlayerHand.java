package com.swampus.cooding.misc.card;

import java.util.List;

public class PlayerHand {
    private String playerHandId;
    private List<PlayingCard> cards;

    public PlayerHand(String playerHandId, List<PlayingCard> cards) {
        this.playerHandId = playerHandId;
        this.cards = cards;
    }

    public String getPlayerHandId() {
        return playerHandId;
    }

    public void setPlayerHandId(String playerHandId) {
        this.playerHandId = playerHandId;
    }

    public List<PlayingCard> getCards() {
        return cards;
    }

    public void setCards(List<PlayingCard> cards) {
        this.cards = cards;
    }
}
