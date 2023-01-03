public class EventLog extends EventMethods{
    private String name;
    private String date;
    private int price;

    public EventLog(String name, String date, int price)throws DateException{
        if(!dateValidation(date)){
            throw new DateException();
        }
        this.name = name;
        this.date = date;
        this.price = price;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
