package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String textToModification, PoemDecorator textUpgrader) {
        String resultText=textUpgrader.decorate(textToModification);
        System.out.println(resultText);
    }
}
