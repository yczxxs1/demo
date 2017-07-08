package ffmpeg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ffmpeg {

	public static void main(String[] args) {

		 processImg("C:\\Users\\yczxxs1\\Desktop\\_RNLdmXCpqXOyBvM.mp4","C:\\Users\\yczxxs1\\Downloads\\ffmpeg-20170321-db7a05d-win64-static\\bin\\ffmpeg");  
	}

	public static boolean processImg(String veido_path, String ffmpeg_path) {
		File file = new File(veido_path);
		if (!file.exists()) {
			System.err.println("·��[" + veido_path + "]��Ӧ����Ƶ�ļ�������!");
			return false;
		}
		List<String> commands = new ArrayList<String>();
		commands.add(ffmpeg_path);
		commands.add("-i");
		commands.add(veido_path);
		commands.add("-y");
		commands.add("-f");
		commands.add("image2");
		commands.add("-ss");
		commands.add("0.000");// ������������ý�ȡ��Ƶ������ʱ�Ļ���
		commands.add("-t");
		commands.add("0.001");
		commands.add("-s");
		commands.add("404x640");
		commands.add(veido_path.substring(0, veido_path.lastIndexOf(".")).replaceFirst("vedio", "file") + ".png");
		System.out.println(commands);
		try {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command(commands);
			builder.start();
			System.out.println("��ȡ�ɹ�");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
