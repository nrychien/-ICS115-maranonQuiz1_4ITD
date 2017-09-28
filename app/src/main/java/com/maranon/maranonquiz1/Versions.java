package com.maranon.maranonquiz1;

public class Versions {
    private int logo;
    private String androidName;
    private String androidEst;

    public Versions (int logo, String androidName, String androidEst) {
        this.logo = logo;
        this.androidName = androidName;
        this.androidEst = androidEst;
    }


    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getAndroidName() {
        return androidName;
    }

    public void setAndroidName(String androidName) {
        this.androidName = androidName;
    }

    public String getAndroidEst() {
        return androidEst;
    }

    public void setAndroidEst(String androidEst) {
        this.androidEst = androidEst;
    }
}
