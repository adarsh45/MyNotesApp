package com.example.mynotes.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utility {
    private Utility(){}

    public static final int NEW_NOTE = 1;
    public static final int EDIT_NOTE = 2;
    public static final String ORIGIN = "origin";


    public static String cutTheString(String text, int n){
        String trimText, removeNewLines;
        removeNewLines = text.replaceAll("\n", " ");
        trimText = removeNewLines.substring( 0, Math.min(text.length(), n));
        return trimText;
    }

    public static String getCurrentDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault());
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
