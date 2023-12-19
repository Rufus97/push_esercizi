public class Students {
    //Proprietà
    private String name;
    public String surname;
    public int id;
//Costruttore
    public Students(String name, String surname,int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
//Getter-Setter
public String getName() {
    return name;
}
public String getSurname() {
    return surname;
    }
    public int getId() {
        return id;
    }
   // public void setName(String newName){
   //     this.name = newName;
   // }
}
