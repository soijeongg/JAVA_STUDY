package oop;

public class Movie {
	// 오펜하이머, 180, 8.5
	
	private String title;
	private int runningTime;
	private double rate;
	
	public  Movie (String title, int runningTime,double rate) {
		this.title = title;
		this.runningTime  = runningTime;
		this.rate = rate;
		
	}
	public void showname() {
		System.out.printf("%-11s : %3d분  평점: %.1f%n",title, runningTime, rate );
	}
		
			

};
	
