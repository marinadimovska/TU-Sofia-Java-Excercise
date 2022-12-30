public class Company { //клас - описвам свойствата на животното
    private String name;
    private String date;
    private String id;

    // конструктор
    public Company(String name, String date, String id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()==10) {
            this.id = id;
        }
        else{
            System.out.println("Error!");
        }
    }
    void Display(){
        System.out.println(name + " " + date + " " +  id);
    }

}
