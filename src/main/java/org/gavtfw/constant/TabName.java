package org.gavtfw.constant;

public enum TabName {

    BOOK("Books");

    private String title;


    public String getTitle(){
        return title;
    }

    TabName(String title){
        this.title=title;
    }
}
