import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	     //N * N matris oluşturma.
        Scanner reader=new Scanner(System.in);
        System.out.print("Matris satir sayisi girin:");
        int satir=reader.nextInt();
        System.out.print("Matris sutun sayisi girin:");
        int sutun=reader.nextInt();

        int[][] Matris=new int[satir][sutun];

        System.out.println("Matrisin elemanlarını giriniz:");
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print("["+i+"]["+j+"]:");
                Matris[i][j]=reader.nextInt();
            }
        }
        System.out.println("OLUSAN MATRIS:");
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print("  "+Matris[i][j]);
            }
            System.out.println("");
        }
    }
}
