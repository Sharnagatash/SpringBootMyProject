package com.project.Repository;
/*
 *task no 177 Designe web service to get the settelment detail   
 * @Author Hitesh.
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer>{

}
