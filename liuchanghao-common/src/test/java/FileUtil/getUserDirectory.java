package FileUtil;

import java.io.File;
import java.io.IOException;

import com.liiuchanghao.common.utils.FileUtil;

public class getUserDirectory {
	
	public static void main(String[] args) {
		String src = "D:\\a.test";
		String des = "F:\\a.test";
		String fileName = "";
		try {
			FileUtil.getExtendName(fileName, src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("ÒÑÖ´ÐÐÍê±Ï£º--¡·ok");
		}
	}

}
