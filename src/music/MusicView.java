package music;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3Player mp3 = new MP3Player();
		String dir = "C:/Users/gjaischool/Desktop/Workspace/mp3/";
	    String path1 = dir + "아이브-LoveDive.mp3";
	    String path2 = dir + "뉴진스-HypeBoy.mp3";
	    String path3 = dir + "르세라핌-Antifragile.mp3";
	    String path4 = dir + "윤하-사건의지평선.mp3";
	    String path5 = dir + "카라-WhenIMove.mp3";
		
		
		
		
		
		//음악 담자!!
	      ArrayList<MusicVO> musicList = new ArrayList<>();
	      musicList.add(new MusicVO("LoveDive", "아이브", path1));
	      musicList.add(new MusicVO("HypeBoy", "뉴진스", path2));
	      musicList.add(new MusicVO("Antifragile", "르세라핌", path3));
	      musicList.add(new MusicVO("사건의지평선", "윤하", path4));
	      musicList.add(new MusicVO("WhenIMove", "카라", path5));
	      //
		
		System.out.println("===음악 플레이어===");
		int index =0;
		while(true) {
		System.out.println("[1]재생 [2]이전곡 [3]다음곡 [4]정지");
		System.out.print(" 메뉴를 선택하세요 ->> ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		if (menu ==1) {
			musicList.get(index).showInfo();
			System.out.println("재생");
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			
			mp3.play(musicList.get(index).getpath());
			
		}else if (menu ==2) {
			System.out.println("이전곡");
			index--;
			if (index ==-1) {
				index =musicList.size()-1;
			}
			musicList.get(index).showInfo();
			System.out.println("재생");
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			
			mp3.play(musicList.get(index).getpath());
			
		} else if (menu ==3) {
			System.out.println("다음곡");
			index++;
			if (index ==musicList.size()) {
				index =0;
			}
			musicList.get(index).showInfo();
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			
			mp3.play(musicList.get(index).getpath());
		}else if (menu ==4) {
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			System.out.println("정지");
			System.out.println("정지되었습니다!");
			break;
		}else {
			System.out.println("잘못입력했습니다 ");
		}
		
		}
		
		//정렬 컨트롤 쉬프트 s

	}

}
