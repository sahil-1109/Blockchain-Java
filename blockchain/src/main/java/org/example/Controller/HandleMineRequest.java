package org.example.Controller;

import org.example.Model.Member;
import org.example.Model.Tx;
import org.example.Service.RegisterMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleMineRequest {
    @Autowired
    RegisterMember registerMember;
    private Logger logger = LoggerFactory.getLogger(HandleMineRequest.class);
    @GetMapping("/new-user")
    public String simpleRequest() {
        logger.info("reached here");
        Member newMember = new Member();
        newMember.setMembershipId(registerMember.generateMembershipId());
        StringBuilder str = new StringBuilder();
        str.append("user created");
        str.append(": ");
        str.append(newMember.getMembershipId());
        return str.toString();
    }

    @GetMapping("/transaction-recording/{txNum}")
    public Tx recordTransactions(@PathVariable("txNum") int txNum){
        Tx transaction = new Tx();
        transaction.setTxId(txNum); 
        return transaction;
    }
}
