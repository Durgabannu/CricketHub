package com.CricketHub.demo.Service;


import java.util.List;

import com.CricketHub.demo.Model.Videos;
import com.CricketHub.demo.configuration.UpdateModel;


public interface VideoInterface {
	
	public Videos createPost(Videos videos);
	
	public Videos getVideosById(Integer id);
	
	public List<Videos> getAllVideos();
	
	public Videos updatePost(Videos videos , Integer id);
	
	public void deleteVideos(Integer id);
	
public UpdateModel updateModel(UpdateModel updateModel, int id);
}
