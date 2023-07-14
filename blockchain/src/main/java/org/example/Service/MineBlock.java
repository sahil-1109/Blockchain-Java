package org.example.Service;

import org.example.Model.Block;
import org.example.Model.Tx;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;

public interface MineBlock {
    //this interface is responsbile for processing and validating and mining a block by
    //calculating a hash and matching it to the required criteria.

    //Validation of transactions shall also take place
    public HashMap<Boolean,Block> Mine();
    public Boolean validateTransaction(List<Tx> transaction);
}
