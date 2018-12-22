package com.medestin.urlify;

public class Urlifier {
    public String urlify(String string){
        return string.replaceAll(" ", "%20");
    }
}
