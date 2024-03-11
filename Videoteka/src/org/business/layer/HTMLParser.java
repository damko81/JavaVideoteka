package org.business.layer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLParser {
	
	 public HTMLParser(){}
	
	 public String parseStars(String response){
				  
		    String stars = "";
	        int startIndex = 0;
	        int startIndexT = 0;
	        int endIndex = 0;
			 
	         Pattern pt = Pattern.compile("\"actor\":");
		     Matcher mt = pt.matcher(response);
			 while (mt.find()) {
				 
				  startIndexT = mt.end();   
				  break;
			 }
	        
			 Pattern p = Pattern.compile("\"name\"");
		     Matcher m = p.matcher(response);
			 while (m.find(startIndexT)) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	stars = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
			return stars.replace("\n", "");
			 	
		}
	 
	    public String parseImageSrc(String response){
			
		  
			String imageSrc = "";
	        int startIndex = 0;
	        int endIndex = 0;
			 
			 Pattern p = Pattern.compile("image_src");
		     Matcher m = p.matcher(response);
			 while (m.find()) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("href=\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	imageSrc = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
			return imageSrc.replace("\n", "");
			
		}
	    
	    public String parseDescription(String response){
			
			  
			String description = "";
	        int startIndex = 0;
	        int endIndex = 0;
			 
			 Pattern p = Pattern.compile("itemprop=\"description\"");
		     Matcher m = p.matcher(response);
			 while (m.find()) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile(">");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("<");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	description = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
			return description.replace("\n", "");
			
		}
	    
	    public String parseStoryline(String response){
			
			  
			String storyline = "";
	        int startIndex = 0;
	        int startIndexT = 0;
	        int endIndex = 0;
			 
	         Pattern pt = Pattern.compile("name=\"description\"");
		     Matcher mt = pt.matcher(response);
			 while (mt.find()) {
				 
				  startIndexT = mt.end();   
				  break;
			 }
	        
			 Pattern p = Pattern.compile("\"description\"");
		     Matcher m = p.matcher(response);
			 while (m.find(startIndexT)) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	storyline = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
			return storyline.replace("\n", "");
			
		}
	    
	    public String parseDirector(String response){
			
			  
			String director = "";
			int startIndex = 0;
			int startIndexT = 0;
		    int endIndex = 0;
		        
	         Pattern pt = Pattern.compile("\"director\"");
		     Matcher mt = pt.matcher(response);
			 while (mt.find()) {
				 
				  startIndexT = mt.end();   
				  break;
			 }
			 
			 Pattern p = Pattern.compile("\"name\"");
		     Matcher m = p.matcher(response);
			 while (m.find(startIndexT)) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end();
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	director = response.substring(endIndex,my.start());
		    	break;
		    	
		    }
		   
			return director.replace("\n", "");
			
		}
	    
	    
	    public String parseInfobar(String response){
			
			  
			String infobar = "";
	        int startIndex = 0;
	        int endIndex = 0;
			 
			 Pattern p = Pattern.compile("infobar");
		     Matcher m = p.matcher(response);
			 while (m.find()) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile(">");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("<");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	infobar = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
		    infobar = infobar.replace("\n", "");
		    infobar = infobar.replace("&nbsp;", "");
		    infobar = infobar.replace("-", "");
		    infobar = infobar.replace(" ", "");
			return infobar;
			
		}
	    
	    public  String parseReleaseDate(String response){
			
			  
			String releaseDate = "";
	        int startIndex = 0;
	        int endIndex = 0;
			 
			 Pattern p = Pattern.compile("\"datePublished\"");
		     Matcher m = p.matcher(response);
			 while (m.find()) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	releaseDate = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
			return releaseDate.replace("\n", "");
			
		}
	    
	    public String parseDuration(String response){
			
			  
			String duration = "";
	        int startIndex = 0;
	        int startIndexT = 0;
	        int endIndex = 0;
	        
	         Pattern pt = Pattern.compile("property=\"og:description\"");
		     Matcher mt = pt.matcher(response);
			 while (mt.find()) {
				 
				  startIndexT = mt.end();   
				  break;
			 }
			 
			 Pattern p = Pattern.compile("content");
		     Matcher m = p.matcher(response);
			 while (m.find(startIndexT)) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
		    	duration = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
		    duration = duration.replace("\n", "");
		    duration = duration.replace(" ", "");
			return duration;
			
		}
	    
	    public String parseGenre(String response){
			
			  
			String genre = "";
	        int startIndex = 0;
	        int endIndex = 0;
			 
			 Pattern p = Pattern.compile("\"genre\"");
		     Matcher m = p.matcher(response);
			 while (m.find()) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile("\"");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end() - 1;
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("\"");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
			    genre = response.substring(endIndex+1,my.start());
		    	break;
		    	
		    }
		   
			return genre.replace("\n", "");
			
		}
	    
	    public String parseRating(String response){
			
			  
			 String rating = "";
	         int startIndex = 0;
	         int startIndexT = 0;
	         int endIndex = 0;
			 
	         Pattern pt = Pattern.compile("\"aggregateRating\"");
		     Matcher mt = pt.matcher(response);
			 while (mt.find()) {
				 
				  startIndexT = mt.end();   
				  break;
			 }
	         
			 Pattern p = Pattern.compile("\"ratingValue\"");
		     Matcher m = p.matcher(response);
			 while (m.find(startIndexT)) {
				 
				  startIndex = m.end();   
				  break;
			 }
			 
			 Pattern px = Pattern.compile(":");
			 Matcher mx = px.matcher(response);
			 while(mx.find(startIndex)) {
				 
			      endIndex = mx.end();
			      break;
			    	
			 }
			    	    	   	    	
	        Pattern py = Pattern.compile("}");
		    Matcher my = py.matcher(response);
		    while(my.find(endIndex+1))
		    {
			    rating = response.substring(endIndex,my.start());
		    	break;
		    	
		    }
		    
			return rating.replace("\n", "");
			
		}


}
