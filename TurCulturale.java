import java.util.List;

class TurCulturale extends Tur {

    private double _price;
    private double _cost_km;
    private double _discount;
    TurCulturale(String nume, String ghid, List<Participant> participanti, double price, double cost_km,double discount)
    {
        setName(nume);
        setGhid(ghid);
        setPrice(price);
        setCostKm(cost_km);
        setDiscount(discount);

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
    private double getTotal( )
    {

    }
    void setDiscount(double discount)
    {
        _discount=discount;
    }
    public double getDiscount()
    {
        return _discount;
    }
}
