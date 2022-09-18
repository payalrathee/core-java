package beans;

public class AddBean {
    public String name;
    public int std;
    public String section;
    public String dob;
    public String mobile;
    public String address;

    public AddBean(String name, int std, String section, String dob, String mobile,String address)
    {
        this.name=name;
        this.std=std;
        this.section=section;
        this.dob=dob;
        this.mobile=mobile;
        this.address=address;
    }
}
