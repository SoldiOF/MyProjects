import java.util.Scanner;

public class GameEngine {
    private boolean isGameRunning = true;
    private Player mainCharacter;
    private Rooms currentRooms;
    public GameEngine(){

    }

    public void start()
    {

        String name = gameBeginning();
        mainCharacter = new Player(name, 100, 100, true);
        createWorld();
        playerTurn();
        howToPlay();
        Scanner userInput = new Scanner(System.in);
        while(isGameRunning)
        {
            String input = userInput.nextLine();
            if (input.contains("exit") || input.contains("quit"))
            {
                isGameRunning = false;
            }
            else if (input.equalsIgnoreCase("Current Room")){
                getCurrentRoom();
                playerTurn();
            }

            else if (input.equalsIgnoreCase("Status")){
                playerStatus();
                playerTurn();
            }
            else if (input.equalsIgnoreCase("damage")){
                mainCharacter.takeDamage();
                System.out.println("You take " + mainCharacter.getDamageTaken() + " points of damage");
                System.out.println("You have " + mainCharacter.getCurrentHp() + " HP left");
                playerTurn();
            }
            else if (input.equalsIgnoreCase("Move")){
                System.out.println("what direction?");
                System.out.println("1 = North");
                System.out.println("2 = South");
                System.out.println("3 = West");
                System.out.println("4 = East");
                String direction = userInput.nextLine();
                move(direction);
                System.out.println("You enter: " + currentRooms.getRoom());
                playerTurn();
            }
            else
            {
                System.out.println("You attempt to: " + input);
                playerTurn();
            }
        }
    }
    public void playerTurn()
    {
        System.out.println("What will you do? ");
    }
    public String gameBeginning(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What shall we call you?");
        String newName = userInput.nextLine();
        System.out.println("Nice to meet you " + newName);
        return newName;
    }

    public void playerStatus(){
        System.out.println("Name: " + mainCharacter.getName());
        System.out.println("MaxHP: " + mainCharacter.getMaxHp());
        System.out.println("Current HP: " + mainCharacter.getCurrentHp());
    }

    public void createWorld(){
        Rooms entrance = new Rooms("Entrance");
        Rooms armoury = new Rooms("Armoury");
        Rooms graveyard = new Rooms("Graveyard");
        entrance.setExits(armoury,null,null,null);
        armoury.setExits(null,entrance,graveyard,null);
        graveyard.setExits(null,null,null,armoury);
        currentRooms = entrance;
        getCurrentRoom();
    }
    public void move(String directionParam){
        if (currentRooms.getNorthExit() != null && directionParam.equalsIgnoreCase("1")){
            currentRooms = currentRooms.getNorthExit();
        }
        else if (currentRooms.getSouthExit() != null && directionParam.equalsIgnoreCase("2")){
            currentRooms = currentRooms.getSouthExit();
        }
        else if (currentRooms.getWestExit() != null && directionParam.equalsIgnoreCase("3")){
            currentRooms = currentRooms.getWestExit();
        }
        else if (currentRooms.getEastExit() != null && directionParam.equalsIgnoreCase("4")){
            currentRooms = currentRooms.getEastExit();
        }
    }
    public void howToPlay(){
        System.out.println("To move type 'Move'");
        System.out.println("To see current room type 'Current Room'");
        System.out.println("To see current status type 'Status'");
        System.out.println("To end game type 'exit' or 'quit'");
    }
    public void getCurrentRoom(){
        System.out.println("Current Room: " + currentRooms.getRoom());
    }
}


