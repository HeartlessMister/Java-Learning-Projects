import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Remote Controller: ");
        Scanner scanner = new Scanner(System.in);
        String temp;

        String operations = "Operations... \n"+
                "1. Show Channels\n"+
                "2. Add Channel\n"+
                "3. Remove Channel\n"+
                "4. Channel Number\n"+
                "5. Press q to quit\n";



        Control control = new Control();

        while(true){
            System.out.println(operations);
            System.out.println("Enter operation:");
            String operation = scanner.nextLine();

            if (operation.equals("q")){

                System.out.println("Controller is closing...");
                break;


            }else if(operation.equals("1")){
                showChannels(control);


            }else if(operation.equals("2")){
                System.out.println("Enter the channel name you want to add:");
                temp = scanner.nextLine();
                control.addChannel(temp);
                System.out.println(temp+" is successfully added.");

            }else if(operation.equals("3")){

                System.out.println("Enter the channel name you want to delete:");
                temp = scanner.nextLine();
                control.deleteChannel(temp);
                System.out.println(temp+" is successfully deleted.");
            }else if(operation.equals("4")){


            }else{
                System.out.println("Invalid Operation");
            }
        }
    }

    public static void showChannels(Control control){

    if (control.channelNumber() == 0){
        System.out.println("Currently, there is no channel in the list");}
    else{
        }
    for (String channel: control){
        System.out.println(channel);
        }

    }
    }




