package com.example.android.earthquakeretrofit;

public class Properties{
	private Object dmin;
	private String code;
	private String sources;
	private int tz;
	private Object mmi;
	private String type;
	private String title;
	private String magType;
	private Object nst;
	private int sig;
	private int tsunami;
	private double mag;
	private Object alert;
	private Object gap;
	private double rms;
	private String place;
	private String net;
	private String types;
	private Object felt;
	private Object cdi;
	private String url;
	private String ids;
	private long time;
	private String detail;
	private long updated;
	private String status;

	public void setDmin(Object dmin){
		this.dmin = dmin;
	}

	public Object getDmin(){
		return dmin;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setSources(String sources){
		this.sources = sources;
	}

	public String getSources(){
		return sources;
	}

	public void setTz(int tz){
		this.tz = tz;
	}

	public int getTz(){
		return tz;
	}

	public void setMmi(Object mmi){
		this.mmi = mmi;
	}

	public Object getMmi(){
		return mmi;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setMagType(String magType){
		this.magType = magType;
	}

	public String getMagType(){
		return magType;
	}

	public void setNst(Object nst){
		this.nst = nst;
	}

	public Object getNst(){
		return nst;
	}

	public void setSig(int sig){
		this.sig = sig;
	}

	public int getSig(){
		return sig;
	}

	public void setTsunami(int tsunami){
		this.tsunami = tsunami;
	}

	public int getTsunami(){
		return tsunami;
	}

	public void setMag(double mag){
		this.mag = mag;
	}

	public double getMag(){
		return mag;
	}

	public void setAlert(Object alert){
		this.alert = alert;
	}

	public Object getAlert(){
		return alert;
	}

	public void setGap(Object gap){
		this.gap = gap;
	}

	public Object getGap(){
		return gap;
	}

	public void setRms(double rms){
		this.rms = rms;
	}

	public double getRms(){
		return rms;
	}

	public void setPlace(String place){
		this.place = place;
	}

	public String getPlace(){
		return place;
	}

	public void setNet(String net){
		this.net = net;
	}

	public String getNet(){
		return net;
	}

	public void setTypes(String types){
		this.types = types;
	}

	public String getTypes(){
		return types;
	}

	public void setFelt(Object felt){
		this.felt = felt;
	}

	public Object getFelt(){
		return felt;
	}

	public void setCdi(Object cdi){
		this.cdi = cdi;
	}

	public Object getCdi(){
		return cdi;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setIds(String ids){
		this.ids = ids;
	}

	public String getIds(){
		return ids;
	}

	public void setTime(long time){
		this.time = time;
	}

	public long getTime(){
		return time;
	}

	public void setDetail(String detail){
		this.detail = detail;
	}

	public String getDetail(){
		return detail;
	}

	public void setUpdated(long updated){
		this.updated = updated;
	}

	public long getUpdated(){
		return updated;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Properties{" + 
			"dmin = '" + dmin + '\'' + 
			",code = '" + code + '\'' + 
			",sources = '" + sources + '\'' + 
			",tz = '" + tz + '\'' + 
			",mmi = '" + mmi + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",magType = '" + magType + '\'' + 
			",nst = '" + nst + '\'' + 
			",sig = '" + sig + '\'' + 
			",tsunami = '" + tsunami + '\'' + 
			",mag = '" + mag + '\'' + 
			",alert = '" + alert + '\'' + 
			",gap = '" + gap + '\'' + 
			",rms = '" + rms + '\'' + 
			",place = '" + place + '\'' + 
			",net = '" + net + '\'' + 
			",types = '" + types + '\'' + 
			",felt = '" + felt + '\'' + 
			",cdi = '" + cdi + '\'' + 
			",url = '" + url + '\'' + 
			",ids = '" + ids + '\'' + 
			",time = '" + time + '\'' + 
			",detail = '" + detail + '\'' + 
			",updated = '" + updated + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
