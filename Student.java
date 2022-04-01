import org.jetbrains.annotations.NotNull;

public class Student {
    private String Name;
    private String Surrname;
    private String Index;
    private double Frek;
    private int Ocena;

    public Student(){}
    public Student(String Name,String Surrname,String Index,double Frek,int Ocena){
        this.Name=Name;
        this.Surrname=Surrname;
        this.Index=Index;
        this.Frek=Frek;
        this.Ocena=Ocena;
    }
    public String getName(){
        if (this.Name.length() ==0){
            this.Name="unknown";
        }
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getSurrname() {
        if (this.Surrname.length() ==0){
            this.Surrname="unknown";
        }
        return Surrname;
    }
    public void setSurrname(String surrname) {
        Surrname = surrname;
    }

    public String getIndex() {
        return Index;
    }
    public void setIndex(String index) {
        Index = index;
    }

    public double getFrek() {
        return Frek;
    }
    public void setFrek(double frek) {
        Frek = frek;
    }

    public void setOcena(int ocena) {
        Ocena = ocena;
    }
    public int getOcena() {
        if (Frek<=50){
            this.Ocena=2;
        }
        return Ocena;
    }
    public void Info(){
        System.out.println("Student:"+getName()+" "+getSurrname());
        System.out.println("Index:"+getIndex());
        System.out.println("Frekwencja:"+getFrek());
        System.out.println("Ocena:"+getOcena());
    }

    public static void main(String[] args) {
        Student s1=new Student("Jan","Kowalski","s00000",100,5);
        Student s2=new Student("","Małysz","s00001",50.5,2);
        Student s3=new Student("","","s00003",49,5);
        Student s4=new Student("","","s00004",0,2);

        s1.Info();
        System.out.println("\n \n");
        s2.Info();
        System.out.println("\n \n");
        s3.Info();
        System.out.println("\n \n");
        s4.Info();

    }
}
