package com.example.mes_cours.tools;

public class ItemBean {
    private int img;
    private String itemname;
    private String itemodesc;
    private String url;

    public int getImg() {
        return this.img;
    }

    public void setImg(int i) {
        this.img = i;
    }

    public String getItemname() {
        return this.itemname;
    }

    public void setItemname(String str) {
        this.itemname = str;
    }

    public String getItemdesc() {
        return this.itemodesc;
    }

    public void setItemdesc(String str) {
        this.itemodesc = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public ItemBean() {
    }

    public ItemBean(int i, String str, String str2, String str3) {
        this.img = i;
        this.itemname = str;
        this.itemodesc = str2;
        this.url = str3;
    }
}
