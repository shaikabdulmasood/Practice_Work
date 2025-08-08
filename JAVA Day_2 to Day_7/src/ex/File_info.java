package ex;

public class File_info {
	
	
	String file_name;
	double file_size;
	String UploadedBy;
	String file_type;
	
	 void upload(String name, double size, String user, String type) {
	        file_name = name;
	        file_size = size;
	        UploadedBy = user;
	        file_type = type;
	    }
	 
	 void download() {
	        System.out.println("Downloading file: " + file_name);
	    }
	 
	 void displayInfo() {
	        System.out.println("File Name: " + file_name);
	        System.out.println("File Size: " + file_size + " MB");
	        System.out.println("Uploaded By: " + UploadedBy);
	        System.out.println("File Type: " + file_type);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File_info file1 = new File_info();
        File_info file2 = new File_info();
        
        file1.upload("Resume.pdf", 1.5, "Masood", "PDF");
        file2.upload("Project.zip", 12.0, "Masood", "ZIP");
        
        file1.download();
        file2.download();
        
        file1.displayInfo();
        file2.displayInfo();

	}

}
