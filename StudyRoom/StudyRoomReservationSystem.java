package StudyRoom;

import java.util.ArrayList;



class StudyRoom{
	private int roomNumber;
	private int capacity;
	private boolean availability;
	
	public StudyRoom(int roomNumber, int capacity) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.availability = true;
	}
	public boolean isAvailable() {
		return availability;
	}
	public void setAvailable() {
		this.availability = true;
	}
	public void setUnavailable() {
		this.availability = false;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public int getCapacity() {
		return capacity;
	}	
}



class StudyRoomUnavailableException extends RuntimeException{
	StudyRoomUnavailableException(String message){
		super(message);
	}
}

public class StudyRoomReservationSystem {
	static ArrayList<StudyRoom> studyRooms = new ArrayList<>();
	
	public static void reserveStudyRoom(int roomNumber) throws StudyRoomUnavailableException{
		for (StudyRoom studyRoom: studyRooms) {
			//Fetching the required room using room numbers.
			if (studyRoom.getRoomNumber() == roomNumber) {
				//locking particular StudyRoom object for a thread.
				synchronized(studyRoom) {
					if (studyRoom.isAvailable()) {
						//After the room is reserved; set it as unavailable.
						studyRoom.setUnavailable();
						System.out.println("Study room "+studyRoom.getRoomNumber() +" is reserved.");
					}else {
						StudyRoomUnavailableException exception =new StudyRoomUnavailableException("Study Room "+studyRoom.getRoomNumber()+" is not available.");
						throw exception;
					}
				}
				return;
			}
		}
	}
	public static void releaseStudyRoom(int roomNumber) {
		for (StudyRoom studyRoom: studyRooms) {
			//Fetching the required room using room numbers.
			if (studyRoom.getRoomNumber() == roomNumber) {
				//locking particular StudyRoom object for a thread.
				synchronized(studyRoom) {
					if (!studyRoom.isAvailable()) {
						//After the room is released; set it as available.
						studyRoom.setAvailable();
						System.out.println("Study room"+studyRoom.getRoomNumber() +" is released.");
					}
				}
				return;
				
			}
		}
	}
	public static void displayStudyRoomStatus() {
		System.out.println("Study Room Status:");
		for (StudyRoom studyRoom: studyRooms) {
			String availability = (studyRoom.isAvailable())? "Available":"Occupied";
			System.out.println("Room Number: "+studyRoom.getRoomNumber()+", Capacity: "+studyRoom.getCapacity()+", Availability: "+ availability);
		}
	}
	
	public static void main(String args[]) {
		
		//creating and adding study room objects into the ArrayList.
		StudyRoomReservationSystem.studyRooms.add(new StudyRoom(100,10));
		StudyRoomReservationSystem.studyRooms.add(new StudyRoom(101,7));
		StudyRoomReservationSystem.studyRooms.add(new StudyRoom(102,12));
	
		StudyRoomReservationSystem.displayStudyRoomStatus();
		
		//Creating threads for each students.
		Thread student1 = new Thread(()->{
			try {
				StudyRoomReservationSystem.reserveStudyRoom(101);
			}
			catch(StudyRoomUnavailableException ex) {
				System.out.println(ex.getMessage());
			}
		});
		Thread student2 = new Thread(()->{
			try {
				StudyRoomReservationSystem.reserveStudyRoom(101);
			}
			catch(StudyRoomUnavailableException ex) {
				System.out.println(ex.getMessage());
			}
		});
		Thread student3 = new Thread(()->{
			StudyRoomReservationSystem.reserveStudyRoom(103);
		});
		
		//Starting Threads
		student1.start();
		student2.start();
		student3.start();
		
		//Execute main thread after all other threads are executed.
		try {
			student1.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
		try {
			student2.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		try {
			student3.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
		//Display the Study Room Status.
		StudyRoomReservationSystem.displayStudyRoomStatus();
		
	}
}
