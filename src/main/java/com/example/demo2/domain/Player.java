package com.example.demo2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("player")
@Data
public class Player {
    @Id
    @JsonIgnore
    String id;
    String playerID;

}
