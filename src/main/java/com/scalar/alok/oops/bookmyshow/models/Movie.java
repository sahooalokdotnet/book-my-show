package com.scalar.alok.oops.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
public class Movie extends BaseModel{
    private String title;
    private String director;
    private String year;
    private double rating;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
