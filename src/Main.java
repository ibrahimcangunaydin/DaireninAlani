import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r,angle;
        float pi =3.14f;
        double alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yaricapi: ");
        r = inp.nextInt();
        System.out.print("Merkez Aci Olcusu: ");
        angle=inp.nextInt();

        alan = (pi*(r*r)*angle)/360;

        System.out.println("Dairenin Alani: "+alan);

    }
}
