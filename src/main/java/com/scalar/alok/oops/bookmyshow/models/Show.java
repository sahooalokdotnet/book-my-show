package com.scalar.alok.oops.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "tbl_show")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date showStartTime;
    private Date showEndTime;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
