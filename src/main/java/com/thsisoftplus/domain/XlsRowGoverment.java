/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thsisoftplus.domain;

/**
 *
 * @author witta
 */
public class XlsRowGoverment extends XlsRow {

    private long goverTime;
    private long mentTime;
    private long itqxbmpTime;

    public long getGoverTime() {
        return goverTime;
    }

    public void setGoverTime(long goverTime) {
        this.goverTime = goverTime;
    }

    public long getMentTime() {
        return mentTime;
    }

    public void setMentTime(long mentTime) {
        this.mentTime = mentTime;
    }

    public long getItqxbmpTime() {
        return itqxbmpTime;
    }

    public void setItqxbmpTime(long itqxbmpTime) {
        this.itqxbmpTime = itqxbmpTime;
    }
}
