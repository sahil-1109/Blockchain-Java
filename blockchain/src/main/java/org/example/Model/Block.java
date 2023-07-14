package org.example.Model;

import com.google.common.hash.Hashing;
import lombok.Data;
import org.example.Service.HashServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
public class Block<T extends Tx> {

    private long timestamp;
    private int index;
    private List<T> transactions = new ArrayList<T>();
    private String previousHash;
    private int nonce;
    private String hash ;
    public  Block(){
    }
    @Autowired
    public Block(String prevHash, List<T> transactions, long timestamp,HashServices hs){
        this.previousHash = prevHash;
        this.transactions = transactions;
        this.timestamp = timestamp;
        hash = hs.computeHash();
    }
}
