package org.example.Model;

import lombok.Data;

@Data
public class Tx {
    private int txId;
    private String data;
    private String senderAddressHash;
    private String receiverAddressHash;
    private float cash;
    private float feeCharged;
    private int blockNumber;

    //function to set blocknumber for all transactions to given block number.
    public void setBlockNumber(Tx[] transactions, int blockNumber){
        for(Tx transaction: transactions){
            transaction.setBlockNumber(blockNumber);
        }
    }

}
