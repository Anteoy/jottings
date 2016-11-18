package com.anteoy.sample.ComparableComparator;

import java.util.Date;

/**
 * Created by zhoudazhuang
 * Date: 16-11-18
 * Time: 上午10:08
 * Description :
 */
public class ConsumInfoComparatorPOJO {
    public ConsumInfoComparatorPOJO() {
        // TODO Auto-generated constructor stub
    }

    private int uid;
    private String name;
    private double price;
    private Date datetime;

    public ConsumInfoComparatorPOJO(int uid,String name,double price,Date datetime){
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.datetime = datetime;

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "ConsumInfo [uid=" + uid + ", name=" + name + ", price=" + price
                + ", datetime=" + datetime + "]";
    }
}
