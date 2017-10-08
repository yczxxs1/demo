package org.apache.struts.helloworld.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private File picture; // 文件实体
	private String pictureContentType;// mime类型
	private String pictureFileName; // 文件实际名字

	

	public File getPicture() {
		return picture;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	
	public String getPictureContentType() {
		return pictureContentType;
	}

	public void setPictureContentType(String pictureContentType) {
		this.pictureContentType = pictureContentType;
	}

	public String getPictureFileName() {
		return pictureFileName;
	}

	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
	/*	String targetPath = "D:/";
		File fileToCreate = new File(targetPath, pictureFileName);*/
		        try
		        {
		                FileUtils.copyFile(this.picture, new File(pictureFileName));
		        }
		        catch (IOException e) 
		        {
		                addActionError(e.getMessage());
		        }
		return null;
	}

}
