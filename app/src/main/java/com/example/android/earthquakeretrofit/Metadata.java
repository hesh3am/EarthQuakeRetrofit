package com.example.android.earthquakeretrofit;

public class Metadata{
	private long generated;
	private int count;
	private String api;
	private String title;
	private String url;
	private int status;

	public void setGenerated(long generated){
		this.generated = generated;
	}

	public long getGenerated(){
		return generated;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setApi(String api){
		this.api = api;
	}

	public String getApi(){
		return api;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Metadata{" + 
			"generated = '" + generated + '\'' + 
			",count = '" + count + '\'' + 
			",api = '" + api + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
