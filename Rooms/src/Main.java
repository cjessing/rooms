import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static Adventure adventure = new Adventure();
    static Room currentRoom;

    public static void main(String[] args) {
        adventure.initialize();
        adventure.setupConnections();
        currentRoom = adventure.getRoomByRoomNumber(1);
        startGame();
    }

    private static void startGame() {
        System.out.println("Welcome!");
        getCommand();
    }

    private static void getCommand() {
        System.out.println("Enter command: ");
        String command = keyboard.nextLine();
        processCommand(command);
    }

    private static void processCommand(String command) {
        switch (command.toLowerCase()) {
            case "go north":
                System.out.println("Going north");
                break;
            case "go east":
                System.out.println("Going east");
                break;
            case "go south":
                System.out.println("Going south");
                break;
            case "go west":
                System.out.println("Going west");
                break;
            default:
                System.out.println("I'm sorry but I don't understand :-( Please try again.");
                getCommand();
                break;

        }
    }
}