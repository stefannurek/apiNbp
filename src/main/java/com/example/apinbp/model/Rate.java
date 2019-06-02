package com.example.apinbp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {

    private Double bid;
    private LocalDate effectiveDate;
}
