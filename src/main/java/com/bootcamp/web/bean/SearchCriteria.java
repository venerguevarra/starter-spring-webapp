package com.bootcamp.web.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SearchCriteria {
    private String catalog;
    private Float minimumPrice;
    private Float maximumPrice;
    private int rating;
}
