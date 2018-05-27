package com.cma.pojo;

public class StaffFileGetOneParam {
	private Long id;
	private String name;
	private String fileId;
	private String fileLocation;
	private String fileImage;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFileId() {             //为了实现功能2.4，将user_id转化为String类型的file_id
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	public void setFileImage(String fileImage) {
		this.fileImage = fileImage;
	}
	
}
