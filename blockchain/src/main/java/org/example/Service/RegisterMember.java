package org.example.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static com.google.common.math.IntMath.pow;

@Service
public class RegisterMember {
    Set<Double> allMemberId = new HashSet<>();
    public double generateMembershipId() {
        double id;
        Random r = new Random();
        id = (allMemberId.size()+1)*2*r.nextDouble()*pow(10,2+allMemberId.size());
        allMemberId.add(id);
        return Math.round(id);
    }
}