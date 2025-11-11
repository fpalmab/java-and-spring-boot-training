package com.example.builderpatternexample;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Creature {
    String name;
    Integer HP;
    Integer MP;
}
