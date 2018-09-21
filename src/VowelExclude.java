//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.Java;

public class VowelExclude {
    public static void main(String[] args) {
    }

    public String[] eleminateVowels(String[] places) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};

        for(int index = 0; index < places.length; ++index) {
            String[] var4 = vowels;
            int var5 = vowels.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                String vowel = var4[var6];
                if (places[index].contains(vowel)) {
                    places[index] = places[index].replace(vowel, "");
                }
            }
        }

        return places;
    }
}
