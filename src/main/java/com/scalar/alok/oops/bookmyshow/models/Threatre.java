package com.scalar.alok.oops.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Threatre extends BaseModel{
    private String name;
    @OneToMany
    private List<Screen> screens = new ArrayList<>();
    @ManyToOne
    private Region region;
}
