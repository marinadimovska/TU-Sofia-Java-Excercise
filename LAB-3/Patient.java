abstract public class Patient {
    private String name;
    private String address;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }
    abstract void cure(String cureName, int amount);
}


