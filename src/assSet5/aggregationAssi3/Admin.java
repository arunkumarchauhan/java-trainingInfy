package assSet5.aggregationAssi3;

public class Admin {
	public void assignRoom(Room[] rooms, Member member) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].getCapacity() > 0) {
				rooms[i].setCapacity(rooms[i].getCapacity() - 1);
				member.setRoom(rooms[i]);
				break;
			}

		}
	}
}
