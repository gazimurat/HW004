public class MegaBytesConverter {
    public static void main(String[] args) {

printMegaBytesAndKiloBytes(2500);
printMegaBytesAndKiloBytes(-1024);
printMegaBytesAndKiloBytes(5000);


    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
           int megaByte = (kiloBytes/1024);
           int remainingByte= (kiloBytes%1024);

           String result=kiloBytes + " KB = " + megaByte + " MB and " + remainingByte + " MB ";

                   System.out.println (result);








        }
    }
}
