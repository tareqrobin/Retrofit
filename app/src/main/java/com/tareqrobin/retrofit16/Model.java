package com.tareqrobin.retrofit16;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("myname")
    @Expose
    private String myname;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("img")
    @Expose
    private String img;
    private final static long serialVersionUID = -5878765003867120408L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}

