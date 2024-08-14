package com.andymall.thirdparty;

import com.aliyun.oss.OSSClient;
import lombok.EqualsAndHashCode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
class AndymallThirdPartyApplicationTests {
	//@Autowired
	@Resource
	OSSClient ossClient;

	@Test
	public void testUpload01() throws FileNotFoundException {

//		String endpoint = "oss-cn-shanghai.aliyuncs.com";
//		// 从环境变量中获取RAM用户的访问密钥（AccessKey ID和AccessKey Secret）。
//		String accessKeyId = "LTAI5t9gccMMu846eTGFsUbv";
//		String accessKeySecret = "yULpS9PmN01K4CTGPKRzIwghA5tf58";
//		OSS ossclient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
		InputStream inputStream= new FileInputStream("/Users/ksia/Downloads/images.jpeg");
		ossClient.putObject("andymall","images.jpeg",inputStream);
		ossClient.shutdown();
		System.out.printf("上传完成。。。");
	}
	@Test
	void contextLoads() {
	}


}
