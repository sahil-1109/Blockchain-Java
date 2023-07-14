package org.example.Model;

import lombok.Data;
import org.example.Service.RegisterMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
public class Member {
    double membershipId;
    String name;
}
