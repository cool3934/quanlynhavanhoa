package mapper;


import java.sql.ResultSet;
import model.Room;

public class RoomMapper implements RowMapper<Room>{

	@Override
	public Room mapRow(ResultSet rs) {
		try {
			Room room = new Room();
			room.setId(rs.getInt("id"));
			room.setFloor(rs.getInt("floor"));
			room.setNumber_floor(rs.getInt("number_floor"));
			room.setStatus(rs.getInt("status"));
			room.setPrice(rs.getLong("price"));
			room.setArea(rs.getInt("area"));
			return room;
		} catch (Exception e) {
			return null;
		}
	}
}
