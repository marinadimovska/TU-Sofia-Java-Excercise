import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        House house1 = new House(10, 150.6, "Petar Vaskov 37", 3, "Nikolai");
        House house2 = new House(12, 180.7, "Goril Nikolov 45", 5, "Ivan");
        House house3 = new House(9, 150.6, "Ivan Ivanov 48", 2, "Petar");
        House house4 = new House(45, 150.6, "Stamboliiski 47", 11, "Bojidar");

        ArrayList<House> houses = new ArrayList<>();

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        int index = (int) avg_floor_height(houses)[1];
        double height =  avg_floor_height(houses)[0];

        System.out.format("The house with the biggest floors is at %s with average floor height of %.2f metres\n",houses.get(index).getAddress(),height);
        public static double[] avg_floor_height(ArrayList<House> houses){

            double max_height = 0;
            double max_index = 0;
            double height ;
            double index = 0;

            for (House element: houses) {

                height = (double) element.getHeight()/(double)element.getFloors();

                if(height > max_height){
                    max_index = index;
                    max_height = height;
                }

                index++;
            }

            return new double[]{max_height,max_index};
        }

    }
}
