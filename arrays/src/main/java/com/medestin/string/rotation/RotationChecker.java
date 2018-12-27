package com.medestin.string.rotation;

public class RotationChecker {

    public boolean isRotated(String original, String rotated){
        if((original.length() == rotated.length()) && original.length() != 0){
            return isSubstring(rotated + rotated, original);
        } else {
            return false;
        }
    }

    private boolean isSubstring(String master, String sub){
        return master.contains(sub);
    }
}
