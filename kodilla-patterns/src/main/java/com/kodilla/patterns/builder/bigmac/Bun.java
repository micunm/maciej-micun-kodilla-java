package com.kodilla.patterns.builder.bigmac;

public class Bun {
    public static final String PLAIN = "PLAIN";
    public static final String SEZAME = "SEZAME";
    final private String bunType;

    public Figure(String bunType) {
        if (bunType.equals(PLAIN) || bunType.equals(SEZAME)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("Bigmac bun can be PLAIN or SEZAME!");
        }
    }

    public String getBunType() {
        return bunType;
    }
}
