import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String Pname;
        String Field;
        int yearsOfExperience;
        String FavouriteLanguage;
        String OperatingSystem;
        String Distro;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        Pname = sc.nextLine();
        System.out.println("Enter your major field:");
        Field = sc.nextLine();
        System.out.println("Years of experience:");
        yearsOfExperience = sc.nextInt();
        System.out.println("Favourite language:");
        FavouriteLanguage = sc.nextLine();
        System.out.println("OPerating system you use:");
        OperatingSystem = sc.nextLine();
        System.out.println("Specify your Operating System Distro:");
        Distro = sc.nextLine();

        System.out.println("Programmers Name: "+Pname+"\n");
        System.out.println("Field of expertise: "+Field+"\n");
        System.out.println("Your Years of experience "+yearsOfExperience+"\n");
        System.out.println("Favourite Programming Language "+FavouriteLanguage+"\n");
        System.out.println("Operating system "+OperatingSystem+"\n");
        System.out.println("Specific Distro "+Distro+"\n");

    }
}