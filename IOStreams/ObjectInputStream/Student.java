import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private int sno;
    private String sname;
    private String course;
    private double fee;
    transient private String username;
    transient private String password;

    public Student() {

    }
    public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();    //for saving non-transient fields values

		//encrypting transient fields which requires safety
        String encUsr = new StringBuilder(username).reverse().insert(2,"@").insert(3,'a').toString();
        String encPwd = new StringBuilder(password).reverse().insert(2,"#").insert(3,'x').toString();

		//saving transient fields after encryption
        oos.writeUTF(encUsr);
        oos.writeUTF(encPwd);

        System.out.println("private wO() is called");
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException , IOException {
		System.out.println("private rO() is called");
		ois.defaultReadObject();

		String encUsn = ois.readUTF();
		String encPwd = ois.readUTF();

		this.username = new StringBuilder(encUsn).deleteCharAt(3).deleteCharAt(2).reverse().toString();
		this.password = new StringBuilder(encPwd).deleteCharAt(3).deleteCharAt(2).reverse().toString();
    }

    @Override
	public String toString() {
		return sno + "," + sname + "," + course + "," + fee + "," + username + "," + password ;
	}
}