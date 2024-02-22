
 class Urun extends UrunIslemi{
    private String name;
    private double price;

     @Override
     public void urun(String name, double price) {
         this.setName(name);
         this.setPrice(price);

     }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }
 }

