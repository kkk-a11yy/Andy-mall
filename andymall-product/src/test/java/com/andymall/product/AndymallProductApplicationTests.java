package com.andymall.product;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
//import com.aliyun.oss.OSSClientBuilder;
//import com.aliyun.oss.OSSException;
//import com.aliyun.oss.common.auth.CredentialsProviderFactory;
//import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
//import com.aliyun.oss.common.auth.STSAssumeRoleSessionCredentialsProvider;
//import com.aliyun.oss.model.PutObjectRequest;
//import com.aliyun.oss.model.PutObjectResult;
import com.andymall.product.entity.BrandEntity;
import com.andymall.product.service.BrandService;
import com.andymall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest(classes = AndymallProductApplication.class)
@RunWith(SpringRunner.class)
class AndymallProductApplicationTests {
	//@Autowired
	@Resource
	BrandService brandService;

	@Autowired
	CategoryService categoryService;
	//@Autowired
	@Resource
	OSSClient ossClient;

	@Test
	public void testFindPath(){
		Long[] catelogPath = categoryService.findCatelogPath(225L);
		log.info("完整路径：{}", Arrays.asList(catelogPath));
	}
//	@Test
//	public void testUpload() throws com.aliyuncs.exceptions.ClientException {
//
//
//		// Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//		String endpoint = "oss-cn-shanghai.aliyuncs.com";
//		// 从环境变量中获取访问凭证。运行本代码示例之前，请确保已设置环境变量OSS_ACCESS_KEY_ID和OSS_ACCESS_KEY_SECRET。
//		EnvironmentVariableCredentialsProvider credentialsProvider = CredentialsProviderFactory.newEnvironmentVariableCredentialsProvider();
//		// 填写Bucket名称，例如examplebucket。
//		String bucketName = "andymall";
//		// 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//		String objectName = "23063001.jpg";
//		// 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//		// 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//		String filePath= "/Users/ksia/Downloads/23063001.jpg";
//
//
//		// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, credentialsProvider);
//
//		try {
//			InputStream inputStream = new FileInputStream(filePath);
//			// 创建PutObjectRequest对象。
//			PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, inputStream);
//			// 创建PutObject请求。
//			PutObjectResult result = ossClient.putObject(putObjectRequest);
//		} catch (OSSException oe) {
//			System.out.println("Caught an OSSException, which means your request made it to OSS, "
//					+ "but was rejected with an error response for some reason.");
//			System.out.println("Error Message:" + oe.getErrorMessage());
//			System.out.println("Error Code:" + oe.getErrorCode());
//			System.out.println("Request ID:" + oe.getRequestId());
//			System.out.println("Host ID:" + oe.getHostId());
//		} catch (ClientException | FileNotFoundException ce) {
//			System.out.println("Caught an ClientException, which means the client encountered "
//					+ "a serious internal problem while trying to communicate with OSS, "
//					+ "such as not being able to access the network.");
//			System.out.println("Error Message:" + ce.getMessage());
//		} finally {
//			if (ossClient != null) {
//				ossClient.shutdown();
//			}
//		}
//	}
//
//	@Test
//	public void testUpload02(){
//		// Endpoint以杭州为例，其它Region请按实际情况填写。
//		String endpoint = "oss-cn-shanghai.aliyuncs.com";
//// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
//		String accessKeyId = "LTAI5t9gccMMu846eTGFsUbv";
//		String accessKeySecret = "yULpS9PmN01K4CTGPKRzIwghA5tf58";
//		String bucketName = "andymall";
//
//		// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//		// 创建存储空间。
//		ossClient.createBucket(bucketName);
//
//		// 关闭OSSClient。
//		ossClient.shutdown();
//	}
//
//	@Test
//	public void testUpload03() throws com.aliyuncs.exceptions.ClientException {
//		// 授权STSAssumeRole访问的Region。以华东1（杭州）为例，其它Region请根据实际情况填写。
//		String region = "cn-shanghai";
//// 从环境变量中获取RAM用户的访问密钥（AccessKey ID和AccessKey Secret）。
//		String accessKeyId = System.getenv("LTAI5t9gccMMu846eTGFsUbv");
//		String accessKeySecret = System.getenv("yULpS9PmN01K4CTGPKRzIwghA5tf58");
//// 从环境变量中获取RAM角色的RamRoleArn。
//		String roleArn = System.getenv("acs:ram::1356741118237833:role/andymall");
//
//// 使用环境变量中获取的RAM用户的访问密钥和RAM角色的RamRoleArn配置访问凭证。
//		STSAssumeRoleSessionCredentialsProvider credentialsProvider = CredentialsProviderFactory
//				.newSTSAssumeRoleSessionCredentialsProvider(
//						region,
//						accessKeyId,
//						accessKeySecret,
//						roleArn
//				);
//	}

//	@Test
//	public void testUpload04() throws FileNotFoundException {
//
//		String endpoint = "oss-cn-shanghai.aliyuncs.com";
//		// 从环境变量中获取RAM用户的访问密钥（AccessKey ID和AccessKey Secret）。
//		String accessKeyId = "LTAI5t9gccMMu846eTGFsUbv";
//		String accessKeySecret = "yULpS9PmN01K4CTGPKRzIwghA5tf58";
//		OSS ossclient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
//		InputStream inputStream= new FileInputStream("/Users/ksia/Downloads/2135.jpg_wh300.jpg");
//		ossclient.putObject("andymall","2135.jpg_wh300.jpg",inputStream);
//		ossclient.shutdown();
//		System.out.printf("上传完成。。。");
//	}

	@Test
	public void testUpload05() throws FileNotFoundException {

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
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(1l);
//		brandEntity.setDescript("what do you mean?");
//		brandService.updateById(brandEntity);
//
//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		System.out.println("ok");

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1l"));
		list.forEach((item)->{
			System.out.println(item);
		});

	}

}
