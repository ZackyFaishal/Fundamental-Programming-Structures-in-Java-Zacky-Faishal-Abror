class PinATM{
    String Pin;

    public void setPin(String Pin) {
        this.Pin = Pin;
    }
}

class Atm{
    public void print(PinATM pinatm){
        pinatm.setPin("1234567");
        System.out.println("Pin Atm Bank A adalah : " +pinatm.Pin);
    }
}

public class dependenceMain {
    public static void main(String args[]){
        //menginisialisasi
        Atm info = new Atm();
        PinATM budi = new PinATM();
        
        //print pin bank dengan memanggil method dari objek Atm dengan parameter dari pinATM
        info.print(budi);
    }
}