package com.sam.proj;

public class Sdetails {
Integer sid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    String sname;

    @Override
    public String toString() {
        return "Sdetails{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", saddress='" + saddress + '\'' +
                '}';
    }

    String saddress;

}
