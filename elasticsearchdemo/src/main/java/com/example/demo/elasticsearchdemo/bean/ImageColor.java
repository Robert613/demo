package com.example.demo.elasticsearchdemo.bean;

import java.util.List;

public class ImageColor {

    private  int id;

    private  String cuid;

    private  String color ;

    private List<String> cuids;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getCuids() {
        return cuids;
    }

    public void setCuids(List<String> cuids) {
        this.cuids = cuids;
    }

    public ImageColor() {
        super();
    }

    public ImageColor(int id, String cuid) {
        this.id = id;
        this.cuid = cuid;
    }

    @Override
    public String toString() {
        return "ImageColor{" +
                "id=" + id +
                ", cuid='" + cuid + '\'' +
                ", color='" + color + '\'' +
                ", cuids=" + cuids +
                '}';
    }
}
