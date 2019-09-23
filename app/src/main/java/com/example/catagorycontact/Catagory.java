package com.example.catagorycontact;

public class Catagory {
    String name,phoneNumber,date,note;
    Boolean isVideo,isMiscall;

    public Catagory(String name, String phoneNumber, String date, String note, Boolean isVideo, Boolean isMiscall) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.note = note;
        this.isVideo = isVideo;
        this.isMiscall = isMiscall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getVideo() {
        return isVideo;
    }

    public void setVideo(Boolean video) {
        isVideo = video;
    }

    public Boolean getMiscall() {
        return isMiscall;
    }

    public void setMiscall(Boolean miscall) {
        isMiscall = miscall;
    }
}
