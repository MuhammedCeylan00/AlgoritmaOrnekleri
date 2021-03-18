import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //N * N boyutlu iki matrisin toplamı
        Scanner reader=new Scanner(System.in);

        System.out.print("toplanacak matrislerin boyutu kaç olsun :");
        int boyut=reader.nextInt();

        int[][] Matris1=new int[boyut][boyut];
        //Matris1 oluştu.
        System.out.println("Matris 1 ici degerleri girin");
        for(int i=0;i<boyut;i++){
            for(int j=0;j<boyut;j++){
                System.out.print("["+i+"]["+j+"]:");
                Matris1[i][j]=reader.nextInt();
            }
        }
        int[][] Matris2=new int[boyut][boyut];
        //Matris2 oluştu.
        System.out.println("Matris2 için degerleri girin");
        for(int i=0;i<boyut;i++){
            for(int j=0;j<boyut;j++){
                System.out.print("["+i+"]["+j+"]:");
                Matris2[i][j]=reader.nextInt();
            }
        }
        //Toplam matris oluştu ve matrisler toplanıp toplam matrise atıldı.
        int[][] Toplam=new int[boyut][boyut];
        int toplam;
        for(int i=0;i<boyut;i++){
            for(int j=0;j<boyut;j++){
                Toplam[i][j]=Matris1[i][j]+Matris2[i][j];
            }
        }
        //Matris1 i ekrana yazdıralım.
        System.out.println("*********************************");
        System.out.println("MATRIS1");
        for(int i=0;i<boyut;i++){
            for(int j=0;j<boyut;j++){
                System.out.print("["+Matris1[i][j]+"]- ");
            }
            System.out.println(" ");
        }

        //Matris2 i ekrana yazdıralım.
        System.out.println("*********************************");
        System.out.println("MATRIS2");
        for(int i=0;i<boyut;i++){
            for(int j=0;j<boyut;j++){
                System.out.print("["+Matris2[i][j]+"]- ");
            }
            System.out.println(" ");
        }

        System.out.println("*********************************");
        System.out.println("TOPLAM Matrıs");
        //Toplam diziyi ekrana yazdırıyorum
        for(int a=0;a<boyut;a++){
            for(int b=0;b<boyut;b++){
                System.out.print("["+Toplam[a][b]+"]- ");
            }
            System.out.println(" ");
        }

    }
}
