package com.company;

public class RemoveAllSpace {
    public static void main(String[] args) {
        String str = "India     Is My    Country";
        char[] strArray = str.toCharArray();
        StringBuffer ob = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                ob.append(strArray[i]);
            }
        }
        String noSpaceStr2 = ob.toString();
        System.out.println(noSpaceStr2);
    }
}