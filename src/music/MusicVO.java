package music;
 //path은 그 노래가 어디에 있는지 경로 
public class MusicVO {
	private String title, singer, path;

	public MusicVO(String title, String singe, String path) {
		
		this.title = title;
		this.singer = singe;
		this.path = path;
	}
	public void showInfo() {
		//세븐틴  - 돈키호테
		System.out.printf("%s - %s%n", singer, title);
	}
	
	//클래스 내의 field 를 리턴해주는 메소드 
	//getter method
	
	public String getpath() {
		return path;
	}
	
	//filed를 수정하는 메소드 setter method
	

}
