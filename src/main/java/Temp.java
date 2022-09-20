import java.util.Scanner;

public class Temp {
    public int setTemp() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanTemp = new Scanner(System.in);

            System.out.println("what do you think temperature feel is:"+ '\n'+ "high,low or humid");
            String temp = scanTemp.nextLine();
            if(temp.equalsIgnoreCase("high")) {
                System.out.println("sunblock maybe be needed");
            }else if (temp.equalsIgnoreCase("low")){
                System.out.println("a coat maybe needed");
            }else if(temp.equalsIgnoreCase("Humid")){
                System.out.println("it's muggy!");
            }

            }
        }

