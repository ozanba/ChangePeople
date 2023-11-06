import javax.xml.namespace.QName;

public class People {
    protected String Name = " ";
    protected int Age = 20;
    String Gender = "";
    People(){
        Name = Gender = "";
    }
    //3 parametreli contructor- constructor wşth 3 parameters
    People(String Name, int Age, String Gender) {

        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;

    }
    //2 parametreli constructor
    People(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public void setAge(int Age){
        this.Age = Age;

    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender){
        this.Gender = Gender;

    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;

    }



    public String toString() {
        return "Name: "+Name+"\n"+"Age: " + Age+"\n"+"Gender: "+ Gender;
    }




}