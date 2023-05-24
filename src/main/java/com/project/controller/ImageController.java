package com.project.controller;
/*
 *task no 177 Designe web service to get the settelment detail   
 * @Author Hitesh.
 */
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.model.Image;
import com.project.service.ImageService;
@RestController
public class ImageController 
{
	@Autowired
    private ImageService imageService;
	//design the rest API to upload the file into data base
	@PostMapping("/fileUpload")
	public Image uploadingImage(@RequestParam("mFile")MultipartFile mFile)throws IOException 
	{  
		Image image1 = imageService.uploadImage(mFile);
		return image1;
		
	}
	
	
}
