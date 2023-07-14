package org.example.Service;

import com.google.common.hash.Hashing;
import org.example.Model.Block;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
@Service
public class HashServices {
    Block block = new Block<>();
    public String computeHash(){
        String computeHashofBlock = block.getPreviousHash() + Long.toString(block.getTimestamp()) + Integer.toString(block.getNonce());
        String sha256hashResult = Hashing.sha256()
                .hashString(computeHashofBlock, StandardCharsets.UTF_8)
                .toString();
        return sha256hashResult;
    }
}
