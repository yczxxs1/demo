package org.apache.struts.helloworld.action;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadMultipleFilesAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File[] fileUpload;
	private String[] fileUploadContentType;
	private String[] fileUploadFileName;
	private String username;

	public File[] getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File[] fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String[] getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String[] fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String[] getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String[] fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < fileUpload.length; i++) {
			File uploadedFile = fileUpload[i];
			String fileName = fileUploadFileName[i];
			File destFile = new File("D:/", fileName);
			try {
				FileUtils.copyFile(uploadedFile, destFile);
			} catch (IOException ex) {
				System.out.println("Could not copy file " + fileName);
				ex.printStackTrace();
			}
		}
		String s=getUsername();
		System.out.println(s);
		return null;
	}

}
