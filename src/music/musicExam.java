package music;

import javazoom.jl.player.MP3Player;

public class musicExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3Player mp3 = new MP3Player();
		String dir = "C:/Users/gjaischool/Desktop/Workspace/mp3/";
		String path = dir + "아이브-LoveDive.mp3";
		mp3.play(path);
			

	}

}
