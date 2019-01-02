package cn.kingcai.util;

import java.io.File;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class UploadUtil {
	public static String upload(MultipartFile file, String localPath) {
		String filename;
		//生成uuid作为文件名称
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		//获得后缀
		String contentType = file.getContentType();
		String suffixName = contentType.substring(contentType.indexOf("/") + 1);
		//拼接获得文件名
		filename = uuid + "." + suffixName;
		//文件保存路径
		try {
			file.transferTo(new File(localPath + filename));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filename;
	}
}
