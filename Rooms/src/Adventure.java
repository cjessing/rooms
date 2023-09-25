import java.util.ArrayList;

public class Adventure {
    private ArrayList<Room> rooms = new ArrayList<>();

    public void initialize() {
        Room room;
        for (int i = 0; i < 9; i++) {
            int roomNumber = i + 1;
            room = new Room(roomNumber, "Room " + roomNumber);
            rooms.add(room);
        }
    }

    public void setupConnections() {
        ArrayList<Room> adjacentRooms;

        // Room #1
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(0).setAdjacentRooms(adjacentRooms);

        // Room #2
        adjacentRooms = getRooms(new int[]{1, 3});
        rooms.get(1).setAdjacentRooms(adjacentRooms);

        // Room #3
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(2).setAdjacentRooms(adjacentRooms);

        // Room #4
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(3).setAdjacentRooms(adjacentRooms);

        // Room #5
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(4).setAdjacentRooms(adjacentRooms);

        // Room #6
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(5).setAdjacentRooms(adjacentRooms);

        // Room #7
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(6).setAdjacentRooms(adjacentRooms);

        // Room #8
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(7).setAdjacentRooms(adjacentRooms);

        // Room #9
        adjacentRooms = getRooms(new int[]{2, 4});
        rooms.get(8).setAdjacentRooms(adjacentRooms);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoomByRoomNumber(int roomNumber) {
        if (roomNumber < 1) return rooms.get(0);
        if (roomNumber > 9) return rooms.get(8);
        return rooms.get(roomNumber - 1);
    }

    private ArrayList<Room> getRooms(int[] roomNumbers) {
        ArrayList<Room> rooms = new ArrayList<>();
        for (int roomNumber : roomNumbers) {
            rooms.add(this.rooms.get(roomNumber - 1));
        }
        return rooms;
    }
}
