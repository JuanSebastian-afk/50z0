package com.examplez.demo.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Player {
    //change id for turn  ,change DeckCard by HandCard intilizate it the Turn and the HandCard in the constructor use camelCase
    protected final List<Card> handCard=new ArrayList<>();
    int turn;
    public  Player(List<Card>handCard,int turn){
        this.handCard.addAll(handCard);
        this.turn = turn;
    }
    //Use camelCase
    public List<Card> getHandCard(){
        return Collections.unmodifiableList(handCard);

    }
    public void addCardToHand(Card card){
        handCard.add(card);

    }
    //change name of getId for getTurn
    public int getTurn(){
        return turn;
    }

}
