import java.util.List;

class TurAventura extends Tur {
      private double _price;
      private double _cost_km;
    TurAventura(String nume, String ghid, List<Participant> participanti,double price,double cost_km)
    {
        setName(nume);
        setGhid(ghid);
        setPrice(price);
        setCostKm(cost_km);

    }

     public double getPrice()
     {
         return _price;
     }
     public double getCostKm()
     {
         return _cost_km;
     }
     void setPrice(double price)
     {
         _price=price;

     }
     void setCostKm(double cost_km)
     {
         _cost_km=cost_km;
     }
}
