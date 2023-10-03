package com.denys.Items;
import com.denys.Item;
public class DVD extends Item {
    private final int duration;
    public DVD (String title, int duration)
    {
        super(title);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
}