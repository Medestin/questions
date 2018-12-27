package com.medestin.string.compression;

public class StringCompressor {

    public String compress(String string){
        StringBuilder compressed = new StringBuilder();

        char placeholder = string.charAt(0);
        int charCounter = 1;

        for(int i = 1; i < string.length(); ++i){
            if(placeholder == string.charAt(i)){
                ++charCounter;
            } else {
                compressed.append(placeholder).append(charCounter);
                placeholder = string.charAt(i);
                charCounter = 1;
            }
        }
        compressed.append(placeholder).append(charCounter);
        return string.length() <= compressed.toString().length() ? string : compressed.toString();
    }
}
