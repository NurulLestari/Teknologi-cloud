import java.util.Scanner;
public class Latihan1 {
public static void main (String[] args){
	Scanner in=new Scanner (System.in);
	int angka, tinggi, i=1;
	System.out.println("masukan angka");
	angka=in.nextInt();
	System.out.println("masukan tinggi");
	tinggi=in.nextInt();
	while(i<=tinggi){
	int j=i;
	while (j<=tinggi-1){
	System.out.print(" ");
	j++;
	}
	int k=0;
	while(k<=(i*2)-2){
	System.out.print(angka);
	k++;
	}
	System.out.println("");
	i++;
	}
}
}