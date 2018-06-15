/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author witta
 */
public class XlsRowAlphabet17 extends XlsRow{
    private int charIndex;
    private String showAlphabet;
    private String inputAlphabet;
    private int keyCode;
    private int correctWord;
    private int correctAlphabet;
    private String keyPress;
    private String keyDown;
    private String keyUp;
    private String word;
    private BigDecimal opacity;
    private Date timestamp;

    public int getCharIndex() {
        return charIndex;
    }

    public void setCharIndex(int charIndex) {
        this.charIndex = charIndex;
    }

    public String getShowAlphabet() {
        return showAlphabet;
    }

    public void setShowAlphabet(String showAlphabet) {
        this.showAlphabet = showAlphabet;
    }

    public String getInputAlphabet() {
        return inputAlphabet;
    }

    public void setInputAlphabet(String inputAlphabet) {
        this.inputAlphabet = inputAlphabet;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public int getCorrectWord() {
        return correctWord;
    }

    public void setCorrectWord(int correctWord) {
        this.correctWord = correctWord;
    }

    public int getCorrectAlphabet() {
        return correctAlphabet;
    }

    public void setCorrectAlphabet(int correctAlphabet) {
        this.correctAlphabet = correctAlphabet;
    }

    public String getKeyPress() {
        return keyPress;
    }

    public void setKeyPress(String keyPress) {
        this.keyPress = keyPress;
    }

    public String getKeyDown() {
        return keyDown;
    }

    public void setKeyDown(String keyDown) {
        this.keyDown = keyDown;
    }

    public String getKeyUp() {
        return keyUp;
    }

    public void setKeyUp(String keyUp) {
        this.keyUp = keyUp;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public BigDecimal getOpacity() {
        return opacity;
    }

    public void setOpacity(BigDecimal opacity) {
        this.opacity = opacity;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
}
