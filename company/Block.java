package com.company;

import java.util.Date;

public class Block {

    public String curHash;
    public String preHash;
    public String data;
    public long time;

    public Block(String preHash, String data) {
        this.data = data;
        this.time = new Date().getTime();
        this.curHash = calHash();
    }

    public String calHash() {
        String calhash = StringHash.sha256(preHash + data + Long.toString(time));
        return calhash;
    }
}
