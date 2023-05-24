package com.project.service;
/*
 *task no 177 Designe web service to get the settelment detail   
 * @Author Hitesh.
 */
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.Repository.ImageRepository;
import com.project.model.Image;
@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
public ImageRepository imageRepository; 
	@Override
	public Image uploadImage(MultipartFile mfile) throws IOException {
		String filename= mfile.getOriginalFilename();
		String contentType = mfile.getContentType();
		Image image = new Image(filename,contentType ,mfile.getBytes());
		Image image1 = imageRepository.save(image);
		return image1;
		
	}
 
	
	
}
