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

    @Override
    public String toString() {
        return ( name + " "+  surname +" "+ id);
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
    public void setName(String newName){
    this.name = newName;
    }
    public void setSurname(String newSurname){
        this.surname = newSurname;
    }
    public void setId(int newId){
        this.id = newId;
    }
}
