package com.restful_services.sample_hateos_implementation.model;

import org.springframework.hateoas.RepresentationModel;

public class CourseWithLink extends RepresentationModel<CourseWithLink> {

    private int id;

    private String name;

    private double price;

    public CourseWithLink() {
        super();
    }

    public CourseWithLink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
