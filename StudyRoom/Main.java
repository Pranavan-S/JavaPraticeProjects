//
//  package StudyRoom;
//  
//  import java.util.ArrayList; import java.util.List; import
//  java.util.concurrent.locks.ReentrantLock;
//  
//  import java.util.concurrent.locks.Lock; import
//  java.util.concurrent.locks.ReentrantLock;
//  
//  class StudyRoom { private int roomNumber; private int capacity; private
//  boolean availability;
//  
//  public StudyRoom(int roomNumber, int capacity) { this.roomNumber =
//  roomNumber; this.capacity = capacity; this.availability = true; }
//  
//  public int getRoomNumber() { return roomNumber; }
//  
//  public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
//  
//  public int getCapacity() { return capacity; }
//  
//  public void setCapacity(int capacity) { this.capacity = capacity; }
//  
//  public boolean isAvailable() { return availability; }
//  
//  public synchronized boolean reserve() throws StudyRoomUnavailableException {
//  if (this.availability) { this.availability = false; return true; } else {
//  throw new StudyRoomUnavailableException("Study room " + this.roomNumber +
//  " is already reserved"); } }
//  
//  public synchronized void release() { this.availability = true; } }
//  
//  class StudyRoomReservationSystem { private StudyRoom[] studyRooms; private
//  Lock lock;
//  
//  public StudyRoomReservationSystem(int numRooms) { this.studyRooms = new
//  StudyRoom[numRooms]; for (int i = 0; i < numRooms; i++) { this.studyRooms[i]
//  = new StudyRoom(i+1, 4); } this.lock = new ReentrantLock(); }
//  
//  public void reserveStudyRoom(int roomNumber) { this.lock.lock(); try {
//  StudyRoom studyRoom = this.getStudyRoomByNumber(roomNumber); if
//  (studyRoom.reserve()) { System.out.println("Study room " + roomNumber +
//  " reserved"); } else { System.out.println("Unable to reserve study room " +
//  roomNumber); } } catch (StudyRoomUnavailableException e) {
//  System.out.println(e.getMessage()); } finally { this.lock.unlock(); } }
//  
//  public void releaseStudyRoom(int roomNumber) { this.lock.lock(); try {
//  StudyRoom studyRoom = this.getStudyRoomByNumber(roomNumber);
//  studyRoom.release(); System.out.println("Study room " + roomNumber +
//  " released"); } catch (IllegalArgumentException e) {
//  System.out.println(e.getMessage()); } finally { this.lock.unlock(); } }
//  
//  public void displayStudyRoomStatus() { this.lock.lock(); try { for (StudyRoom
//  studyRoom : this.studyRooms) { String availability = studyRoom.isAvailable()
//  ? "Available" : "Reserved"; System.out.println("Study room " +
//  studyRoom.getRoomNumber() + " (" + availability + "/" +
//  studyRoom.getCapacity() + ")"); } } finally { this.lock.unlock(); } }
//  
//  private StudyRoom getStudyRoomByNumber(int roomNumber) throws
//  IllegalArgumentException { for (StudyRoom studyRoom : this.studyRooms) { if
//  (studyRoom.getRoomNumber() == roomNumber) { return studyRoom; } } throw new
//  IllegalArgumentException("No study room found with number " + roomNumber); }
//  }
//  
//  class StudyRoomUnavailableException extends Exception { public
//  StudyRoomUnavailableException(String message) { super(message); } }
//  
//  public class Main { public static void main(String[] args) throws
//  InterruptedException { StudyRoomReservationSystem reservationSystem = new
//  StudyRoomReservationSystem(5); reservationSystem.displayStudyRoomStatus();
//  
//  Thread[] threads = new Thread[10]; for (int i = 0; i < 10; i++) { if (i % 2
//  == 0) { threads[i] = new Thread(() -> reservationSystem.reserveStudyRoom((i %
//  5) + 1)); } else { threads[i] = new Thread(() ->
//  reservationSystem.releaseStudyRoom((i % 5) + 1)); } threads[i].start(); }
//  
//  for (Thread thread : threads) { thread.join(); }
//  
//  reservationSystem.displayStudyRoomStatus(); } }
// 