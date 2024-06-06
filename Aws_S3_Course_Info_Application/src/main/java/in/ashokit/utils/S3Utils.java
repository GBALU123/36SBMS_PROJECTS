package in.ashokit.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectResult;

@Service
public class S3Utils {

	@Value("${cloud.aws..bucket.name}")
	private String bucketName;

	@Autowired
	private AmazonS3 s3Client;

	
	public String putObject(MultipartFile file) {
		
		String originalFileName = file.getOriginalFilename();
		try {
			File file1 = convertMultipartToFile(file);
			PutObjectResult putObject = s3Client.putObject(bucketName, originalFileName, file1);
			URL url = s3Client.getUrl(bucketName, originalFileName);
			return url.toString();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	private File convertMultipartToFile(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;


	}
}
