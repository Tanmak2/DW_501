package class501;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class main_method {

	
	public static Map<String, ban_active> map = new HashMap<>();
	public static void init() {
		//ResourceBundle rb = ResourceBundle.getBundle("ban");
		//resourcebundle 은 prop 파일 읽어들일때 주로 사용
		//웹에서 bundle의 사용자는 접속한 local(국가)에 따라 언어별 페이지 보여줄때 사용되기도함
		//collection을 순차적으로 접근하며 사용하기위한 인터페이스 iterator
		//prop은 컬렉션 이전에 나온 녀석이라서 iterator 사용불가
		//prop은 enumeration 사용
		//Enumeration key=rb.getKeys();
		Properties prop = new Properties();
		try(FileReader fr = new FileReader("C:\\java\\java_study4\\src\\class501\\ban.properties")){
			prop.load(fr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Iterator key = prop.keySet().iterator();
		while(key.hasNext()) {
			String cmd = (String)key.next();
			String val = prop.getProperty(cmd);
			
			try {
				Class<?> hclass = Class.forName(val);
				ban_active ban = (ban_active)hclass.newInstance();
				map.put(cmd, ban);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		init();
		System.out.println("이동할 페이지 입력 : ");
		System.out.print("computer   chair   desk   people   moniter ");
		String page = new Scanner(System.in).nextLine();
		page += ".html";
		
		ban_active pg = map.get(page);
		
		pg.action(page);

	}

}
// http://propedit.sourceforge.jp/eclipse/updates/