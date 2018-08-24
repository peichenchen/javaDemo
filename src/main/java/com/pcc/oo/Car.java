package com.pcc.oo;

/**
 * @author peichenchen
 * @date 2018/05/23
 */
public class Car {
    private Long   id;
    private String name;

    public Car(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
