package com.example.android.earthquakeretrofit;

public class FeaturesItem{
	private Geometry geometry;
	private String id;
	private String user;
	private String likes;
	private Properties properties;

	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}

	public Geometry getGeometry(){
		return geometry;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setlikes(String id){
		this.likes = likes;
	}

	public String getlikes(){
		return likes;
	}

	public void setuser(String type){
		this.user = type;
	}

	public String getuser(){
		return user;
	}

	public void setProperties(Properties properties){
		this.properties = properties;
	}

	public Properties getProperties(){
		return properties;
	}

	@Override
 	public String toString(){
		return 
			"FeaturesItem{" + 
			        "id = '" + id + '\'' +
					"id = '" + user + '\'' +
					"id = '" + likes + '\'' +
			"}";
		}
}
