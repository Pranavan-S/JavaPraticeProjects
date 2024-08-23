package MusicConsert;


//interface for backup
interface IBackup{
	void backup();
}


//super class Artist
abstract class Artist{
	private String name;
	Artist(String name){
		this.name = name; 
	}
	public String getName() {
		return this.name;
	}
}

//singer class inherits Artist superclass
abstract class Singer extends Artist{
	Singer(String name){
		super(name);
	}
	abstract void sing();
	
}
//subclass MainArtist inherits Singer class
class MainArtist extends Singer{
	MainArtist(String name){
		super(name);
	}
	
	// assuming that singing ability of main singer and background singer wouldn't be the same.
	public void sing() {
		System.out.println("This is the method [sing()] in the class [MainArtist].");
		//following line is just for clarification.
		System.out.println(this.getName()+" is singing now.\n");
	}
	public void interact() {
		System.out.println("This is the method [interact()] in the class [MainArtist].");
		//following line is just for clarification.
		System.out.println(this.getName()+" is interacting with audience.\n");
	}
}
//subclass BackupSinger inherits Singer Class
class BackupSinger extends Singer implements IBackup{
	BackupSinger(String name){
		super(name);
	}
	// assuming that singing ability of main singer and background singer wouldn't be the same.
	public void sing() {
		System.out.println("This is the method [sing()] in the class [BackupSinger].");
		//following line is just for clarification.
		System.out.println(this.getName()+" is singing at the background.\n");
	}
	//unique backup operation for backup singers.
	public void backup() {
		System.out.println("This is the method [backup()] in the class [BackupSinger].");
		//following line is just for clarification.
		System.out.println(this.getName()+" is backing up the main artist by singing.\n");
	}
	
}

//subclass BackupDancer inherits Artist super class and implements all methods of IBackup interface.
class BackupDancer extends Artist implements IBackup{
	BackupDancer(String name){
		super(name);
	}
	//unique backup operation for backup dancers.
	public void backup() {
		System.out.println("This is the method [backup()] in the class [BackupDancer].");
		//following line is just for clarification.
		System.out.println(this.getName()+" is dancing at the background.\n");
	}
	//dance method for Backup dancers.
	public void dance() {
		System.out.println("This is the method [dance()] in the class [BackupDancer].");
		//following line is just for clarification.
		System.out.println(this.getName()+" is backing up the main artist by dancing.\n");
	}
}

//Songs are instantiated in Track class.
class Track{
	private String name;
	private double duration;
	Track(String name, double duration){
		this.name = name;
		this.duration = duration;
	}
	//getting the name of the track.
	public String getName() {
		return this.name;
	}
	//duration of the tracks in minutes.
	public double getDuaration() {
		return this.duration;
	}
}

//Performance class covers all common aspects of different type of performances.
abstract class Performance{
	private String concertName;
	private MainArtist mainArtist;
	private int year;
	private String venue;
	private BackupSinger[] backupSingers; //array for storing backup singers.
	private BackupDancer[] backupDancers; //array for storing backup dancers.
	protected Track[] trackList; //array for storing tracks;
	Performance(String concertName,MainArtist mainArtist,int year,String venue){
		this.concertName=concertName;
		this.mainArtist = mainArtist;
		this.year = year;
		this.venue = venue;
		System.out.println("Welcome to the Performance "+this.concertName+" by "+this.mainArtist.getName()+" !\n");
	}
	public void setName(String name) {
		this.concertName = name;
	}
	public String getName() {
		return this.concertName;
	}
	public void setBackupSingers(BackupSinger... backupSingers) {
		this.backupSingers = backupSingers;
	}
	public void getBackupSingers() {
		for(BackupSinger backupSinger:this.backupSingers) {
			System.out.println(backupSinger.getName());
		}
	}
	public void setBackupDancers(BackupDancer... backupDancers) {
		this.backupDancers = backupDancers;
	}
	public void getBackupDancers() {
		for(BackupDancer backupDancer:this.backupDancers) {
			System.out.println(backupDancer.getName());
		}
	}
	public void setTracks(Track...tracks) {
		trackList = tracks;
	}
	public String getMainArtist() {
		return mainArtist.getName();
	}
	public int getYear() {
		return year;
	}
	public String getVenue() {
		return venue;
	}
	abstract void record();
}
class LivePerformance extends Performance{
	LivePerformance(String name,MainArtist mainArtist,int year,String venue){
		super(name,mainArtist,year,venue);
	}
	public void record() {
		System.out.println("This is the method [record()] in the class [LivePerformance].");
		//following line is just for clarification.
		System.out.println("Recording the live performance.\n");
	}
}
class StudioPerformance extends Performance{
	StudioPerformance(String name,MainArtist mainArtist, int year, String venue){
		super(name,mainArtist, year, venue);
	}
	public void record() {
		System.out.println("This is the method [record()] in the class [StudioPerformance].");
		//following line is just for clarification.
		System.out.println("Recording and processing audio in studio performance.\n");
	}
}


public class Main {
	public static void main(String args[]) {
		//initializing main singer object.
		MainArtist mainSinger = new MainArtist("Taylor Swift");
		
		//initializing backup singers.
		BackupSinger subSinger1 = new BackupSinger("Jeslyn");
		BackupSinger subSinger2 = new BackupSinger("Melanie");
		
		//initializing backup dancers
		BackupDancer subDancer1 = new BackupDancer("Stephanie");
		BackupDancer subDancer2 = new BackupDancer("Jake");
		
		//initializing tracks
		//duration values are dummy :)
		Track track1 = new Track("Lavender Haze",3.00);
		Track track2 = new Track("All Too Well",2.15);
		Track track3 = new Track("The Lakes",3.45);
		Track track4 = new Track("The Man",4.00);
		Track track5 = new Track("Love Story",3.45);
		
		//initializing and developing the performance object.
		LivePerformance livePerformance = new LivePerformance("Eras Tour", mainSinger, 2023, "Glendale");
		livePerformance.setBackupSingers(subSinger1,subSinger2); //inserting backup singers into the concert.
		livePerformance.setBackupDancers(subDancer1,subDancer2); //inserting backup dancers into the concert.
		livePerformance.setTracks(track1,track2,track3,track4,track5); //setting the tracks list for the concert.
		
		
		//Recording the live performance
		livePerformance.record();
		
		//main artist sings
		//assuming that singing ability of main singer and background singer wouldn't be the same.
		//therefore MainArtist has a unique method for singing
		mainSinger.sing();
		
		//background singers sing
		//assuming that singing ability of main singer and background singer wouldn't be the same.
		//therefore the backup singers have a unique method for singing.
		subSinger1.sing();
		subSinger2.sing();
		
		//background dancers dance
		subDancer1.dance();
		subDancer2.dance();
		
		//background singers backing up the main singer by singing.
		subSinger1.backup();
		subSinger2.backup();
		
		//background dancers backing up the main singer by dancing.
		subDancer1.backup();
		subDancer2.backup();
		
		//main singer interacts with audience.
		mainSinger.interact();
	}
}
