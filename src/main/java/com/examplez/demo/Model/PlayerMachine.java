package com.examplez.demo.Model;
import java.util.List;
public class PlayerMachine extends Player{
    int maximumSumPoints=50;

    public PlayerMachine(List<Card> deckCards, int turn) {
        super(deckCards, turn);
                                                         }
    //change 50 with a parameter call maximumSumPoints
    //add a method called isAbleToPlay(int currentSum , int maximumSum )that iterate each card on the hand and return true if there is a card to play , and false if not
    //Change name playCardInt by cardPlayed

     public Card playCardInt(int SumaPuntos){
        if (SumaPuntos<maximumSumPoints){
            for (Card Card: handCard ){
                if(Card.getCardValue()+SumaPuntos<=maximumSumPoints){
                    return Card;
                }
            }
        }
     return null;}
    public boolean isAbleToPlay(int currentSum,int maximumSumn){
        for (Card Card: handCard){
            if (Card.getCardValue()+currentSum<=maximumSumn){
                return true;
            }

        }
   return false; }

}


