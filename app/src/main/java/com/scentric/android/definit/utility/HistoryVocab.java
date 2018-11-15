package com.scentric.android.definit.utility;

/**
 * Created by Steven on 8/22/2016.
 *
 * Object to store the user's search history
 */
public class HistoryVocab {
    public String word;
    public long date;

    public HistoryVocab(String word, long date) {
        this.word = word;
        this.date = date;
    }

    public HistoryVocab() {
        word = " ";
    }
}
