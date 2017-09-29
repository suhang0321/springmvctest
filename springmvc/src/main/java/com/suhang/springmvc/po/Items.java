package com.suhang.springmvc.po;

import java.util.Date;

import javax.xml.soap.Text;

/**
 * @author hang.su
 * @since 2017-09-27 11:56
 */
public class Items {
    public int id;
    public String name;
    public float price;
    public String  detail;
    public String pic;
    public Date creativetime;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setCreativetime(Date creativetime) {
        this.creativetime = creativetime;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDetail() {
        return detail;
    }

    public String getPic() {
        return pic;
    }

    public Date getCreativetime() {
        return creativetime;
    }
}
