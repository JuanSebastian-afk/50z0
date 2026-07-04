package com.examplez.demo.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class PlayerHuman extends Player{
    public PlayerHuman(List<Card> deckCards, int turn) {
        super(deckCards, turn);
    }
    boolean roundState;
    //Change rondState for roundState
    // add a method to set the roundState
    public boolean getRondState(){
    return roundState;
}
public void setRondState(boolean rondState){
        this.roundState=rondState;

    }
}
