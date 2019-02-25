package latihan;
import java.util.ArrayList;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        ArrayList<String> kopi = new ArrayList<>();
        ArrayList<String> topping = new ArrayList<>();
        
        mesinkopi robusta = new mesinkopi();
        robusta.setJenisKopi("robusta");
        robusta.setJumlahStokKopi(10);
        kopi.add(robusta.getJenisKopi());
        
        mesinkopi arabica = new mesinkopi();
        arabica.setJenisKopi("arabica");
        arabica.setJumlahStokKopi(10);
        kopi.add(arabica.getJenisKopi());
        
        mesinkopi flores = new mesinkopi();
        flores.setJenisKopi("flores");
        flores.setJumlahStokKopi(10);
        kopi.add(flores.getJenisKopi());
        
        topping susu = new topping();
        susu.setJenisTopping("susu");
        susu.setJumlahStokTopping(10);
        topping.add(susu.getJenisTopping());
        
        topping gula = new topping();
        gula.setJenisTopping("gula");
        gula.setJumlahStokTopping(10);
        topping.add(gula.getJenisTopping());
        topping cream = new topping();
        cream.setJenisTopping("cream");
        cream.setJumlahStokTopping(10);
        topping.add(cream.getJenisTopping());
        
        System.out.println("menu kopi");
        for(int a=0; a<kopi.size(); a++){
            System.out.println((a+1)+". "+kopi.get(a));
        }
        
        System.out.println("\nmenu topping");
        for(int b=0; b<topping.size(); b++){
            System.out.println((b+1)+". "+topping.get(b));
        }
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("masukkan kopi yang dipilih : ");
        int pilihanKopi = keyboard.nextInt();
        
        if(pilihanKopi==1){
            System.out.print("masukkan topping yang anda inginkan :");
            int pilihtopping = keyboard.nextInt();
            if(pilihtopping==1){
                System.out.println("pesanan anda adalah kopi "+robusta.getJenisKopi()+" dengan topping "+susu.getJenisTopping());
            }
            else if(pilihtopping==2){
                System.out.println("pesanan anda adalah kopi "+robusta.getJenisKopi()+" dengan topping "+gula.getJenisTopping());
            }
            else if (pilihtopping==3){
                System.out.println("pesanan anda adalah kopi "+robusta.getJenisKopi()+" dengan topping "+cream.getJenisTopping());
            }
        }
        if(pilihanKopi==2){
            System.out.print("masukkan topping yang anda inginkan :");
            int pilihtopping = keyboard.nextInt();
            if(pilihtopping==1){
                System.out.println("pesanan anda adalah kopi "+arabica.getJenisKopi()+" dengan topping "+susu.getJenisTopping());
            }
            else if(pilihtopping==2){
                System.out.print("pesanan anda adalah kopi "+arabica.getJenisKopi()+" dengan topping "+gula.getJenisTopping());
            }
            else if (pilihtopping==3){
                System.out.println("pesanan anda adalah kopi "+arabica.getJenisKopi()+" dengan topping "+cream.getJenisTopping());
            }
        }
        if(pilihanKopi==3){
            System.out.print("masukkan topping yang anda inginkan :");
            int pilihtopping = keyboard.nextInt();
            if(pilihtopping==1){
                System.out.println("pesanan anda adalah kopi "+flores.getJenisKopi()+" dengan topping "+susu.getJenisTopping());
            }
            else if(pilihtopping==2){
                System.out.println("pesanan anda adalah kopi "+flores.getJenisKopi()+" dengan topping "+gula.getJenisTopping());
            }
            else if (pilihtopping==3){
                System.out.println("pesanan anda adalah kopi "+flores.getJenisKopi()+" dengan topping "+cream.getJenisTopping());
            }
        }
    }
}
