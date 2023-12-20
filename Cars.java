public class Cars {

        private String cc;

        private String plate;

        private String brand;

        private String model;

        public Cars (String cc, String plate, String brand, String model){
            this.cc = cc;
            this.plate = plate;
            this.brand = brand;
            this.model = model;
        }
    public String getCC(){
        return cc;
    }
    public String getPlate(){
        return plate;
    }

    public String getBrand(){
           //String getBrand = brand;
            return brand;
    }
    public String getModel(){
        return model;
    }

    public void setBrand(String brand){
            this.brand=brand;
    }

}
