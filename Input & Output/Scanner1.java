/*
Develop a program to reading student object values from keyboard
You must read sno, sname, course, fee, email, mobile, gender, courseStatus.

Read those values from keyboard and store in Scanner1 instance
Read those values from student instance and print on console
*/
//Scanner1.java
class Scanner1 {
    private int sno;
    private String sname;
    private String course;
    private double fee;
    private String email;
    private long mobile;
    private char gender;
    private boolean courseStatus;
    
    public void setSno(int sno) {
      this.sno = sno;
    }
    
    public int getSno() {
    return sno;
    }
    
    public void setSname(String sname) {
      this.sname = sname;
    }
    
    public String getSname() {
    return sname;
    }
    
    public void setCourse(String course) {
      this.course = course;
    }
    
    public String getCourse() {
    return course;
    }
    
    public void setFee(double fee) {
      this.fee = fee;
    }
    
    public double getFee() {
    return fee;
    }
    
    public void setEmail(String email) {
      this.email = email;
    }
    
    public String getEmail() {
    return email;
    }
    
    public void setMobile(long mobile) {
      this.mobile = mobile;
    }
    
    public long getMobile() {
    return mobile;
    }
    
    public void setGender(char gender) {
      this.gender = gender;
    }
    
    public char getGender() {
    return gender;
    }
    
    public void setCourseStatus(boolean courseStatus) {
      this.courseStatus = courseStatus;
    }
    
    public boolean isCourseStatus() {
    return courseStatus;
    }
    
    @Override		
    public String toString() {
        return "Scanner1("+ sno + ", "+ sname + ", "+ course + ", "+ fee + ", "+ 
    		email + ", "+ mobile + ", "+ gender + ", "+ courseStatus +")";
        }
}
