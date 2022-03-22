package com.company;

public class Remote {
    TV tv = new TV();

    public void channel_up() {
        if (tv.channel >= 1 && tv.channel <= 20 && tv.on) {
            tv.channel += 1;
        } else
            System.out.println("error");
    }

    public void channel_down() {
        if (tv.channel >= 1 && tv.channel <= 20 && tv.on) {
            tv.channel -= 1;
        }
        else
            System.out.println("error");


    }
    public void volume_down() {
        if (tv.volume >= 1 && tv.volume <= 10 && tv.on) {
            tv.volume -= 1;
        }
        else
            System.out.println("error");


    }
    public void volume_up() {
        if (tv.volume >= 1 && tv.volume <= 10 && tv.on) {
            tv.volume += 1;
        }
        else
            System.out.println("error");


    }
    public boolean tv_on(){
        return tv.on = true;
    }
    public boolean tv_off(){
        return tv.on = false;

    }
}


