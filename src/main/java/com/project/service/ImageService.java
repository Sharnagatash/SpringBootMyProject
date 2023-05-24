package com.project.service;
/*
 *task no 177 Designe web service to get the settelment detail   
 * @Author Hitesh.
 */
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.project.model.Image;

public interface ImageService 
{
	public Image uploadImage(MultipartFile mfile) throws IOException;
}
