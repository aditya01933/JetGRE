package com.ad.jetgre.jetgre;

/**
 * Created by User on 25-03-2015.
 */
public class Word {

    //private variables
    int _id;
    String _word;
    String _meaning;

    // Empty constructor
    public Word(){

    }
    // constructor
    public Word(int id, String word, String meaning){
        this._id = id;
        this._word = word;
        this._meaning = meaning;
    }

    // constructor
    public Word (String word, String _meaning){
        this._word = word;
        this._meaning = _meaning;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting word
    public String getWord(){
        return this._word;
    }

    // setting word
    public void setWord(String word){
        this._word = word;
    }

    // getting phone number
    public String getPhoneNumber(){
        return this._meaning;
    }

    // setting phone number
    public void setPhoneNumber(String meaning){
        this._meaning = meaning;
    }
}