package com.webtechnologies.Cinema.Center;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="MOVIE_TBL")
public class Movie {
    @Id
    private int id;
    private String name;
    private String director;
    private int nr_tickets;
    private double price;

}
