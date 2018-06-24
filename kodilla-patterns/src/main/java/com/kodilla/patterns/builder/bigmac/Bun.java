package com.kodilla.patterns.builder.bigmac;

public class Bun {
    public static final String PLAIN = "PLAIN";
    public static final String SEZAME = "SEZAME";
    final private String bunType;

    public Bun(String bunType) {
        if (bunType.equals(PLAIN) || bunType.equals(SEZAME)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("Bigmac bun can be only PLAIN or SEZAME!");
        }
    }

    public String getBunType() {
        return bunType;
    }

    @Override
    public String toString() {
        return "Bun{" +
                "bunType='" + bunType + '\'' +
                '}';
    }
}
