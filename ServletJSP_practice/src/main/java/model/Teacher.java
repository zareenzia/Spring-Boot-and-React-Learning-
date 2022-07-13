package model;

public class Teacher {
    private int t_id ;
    private String t_name ;
    private String t_address ;
    private int t_phoneNo ;
    private String t_course ;

    public Teacher(Integer t_id, String t_name, String t_address, Integer t_phoneNo, String t_course) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_address = t_address;
        this.t_phoneNo =t_phoneNo;
        this.t_course = t_course;
    }
    public Teacher(String t_name, String t_address, Integer t_phoneNo, String t_course) {
        this.t_name = t_name;
        this.t_address = t_address;
        this.t_phoneNo =t_phoneNo;
        this.t_course = t_course;
    }
    public Teacher(String t_name, String t_address, String t_course) {
        this.t_name = t_name;
        this.t_address = t_address;
        this.t_course = t_course;
    }

    // Setter Getter functions
    public int getT_id() {
        return t_id;
    }
    public void setT_id(int t_id) {
        this.t_id = t_id;
    }
    public String getT_name() {
        return t_name;
    }
    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
    public String getT_address() {
        return t_address;
    }
    public void setT_address(String t_address) {
        this.t_address = t_address;
    }
    public int getT_phoneNo() {
        return t_phoneNo;
    }
    public void setT_phoneNo(int t_phoneNo) {
        this.t_phoneNo = t_phoneNo;
    }
    public String getT_course() {
        return t_course;
    }
    public void setT_course(String t_course) {
        this.t_course = t_course;
    }
}
