public class Main{
    public static void main(String[] args) throws PriceException, PowerException
        {
            Books books = new Books(20, "121221072", "J.K.Rowling","Harry Potter");
            Tv tv = new Tv(1000, "131331", "LG", "E69", 60);
            if(books.checkPromo()!=books.price-books.price*0.15){
                throw new PriceException();
            }
            else{
                System.out.println("The book price is "+books.checkPromo());
            }

            if(tv.checkPromo()!=tv.price-tv.price*0.09){
                throw new PriceException();
            }
            else{
                System.out.println("The TV price is "+tv.checkPromo());
            }

            if(tv.electricityCost()!=  tv.getPower()/60){
                throw new PowerException();
            }
            else{
                System.out.println("The TV power consumption is "+tv.electricityCost()+" watts per hour");
            }
        }
    }
