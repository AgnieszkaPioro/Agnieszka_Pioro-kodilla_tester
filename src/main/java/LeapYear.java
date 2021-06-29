public class LeapYear {
    public static void main(String[] args) {
        int firstYear = 2016;
        int secondYear = 2017;
        int thirdYear = 2018;

        if (firstYear % 4 > 0) {
            System.out.println("Rok 2016 nie był rokiem przestępnym!");
        }
        else{
            System.out.println("Rok 2016 był rokiem przestępnym!");
        }
        if (secondYear % 4 > 0) {
            System.out.println("Rok 2017 nie był rokiem przestępnym!");
        }
        else{
            System.out.println("Rok 2017 był rokiem przestępnym!");
        }
        if (thirdYear % 4 > 0) {
            System.out.println("Rok 2018 nie był rokiem przestępnym!");
        }
        else{
            System.out.println("Rok 2018 był rokiem przestępnym!");
        }
    }
}
