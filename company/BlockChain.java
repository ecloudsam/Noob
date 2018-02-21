package com.company;

public class BlockChain{
    public static void main(String[] args) {

        Block genesisBlock = new Block("0", "This is the first block");
        System.out.println("Current Hash for block 1 : " + genesisBlock.curHash);

        Block secondBlock = new Block(genesisBlock.curHash, "This is the second block");
        System.out.println("Current Hash for block 2 : " + secondBlock.curHash);

        Block thirdBlock = new Block(secondBlock.curHash, "This is the third block");
        System.out.println("Current Hash for block 3 : " + thirdBlock.curHash);

    }
}


