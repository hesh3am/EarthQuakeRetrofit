package com.example.android.earthquakeretrofit;

import java.util.List;

public class Root{
    private List<FeaturesItem> hits;
    private Metadata metadata;
    private List<Double> bbox;
    private String type;

    public void setFeatures(List<FeaturesItem> features){
        this.hits = features;
    }

    public List<FeaturesItem> getFeatures(){
        return hits;
    }

    public void setMetadata(Metadata metadata){
        this.metadata = metadata;
    }

    public Metadata getMetadata(){
        return metadata;
    }

    public void setBbox(List<Double> bbox){
        this.bbox = bbox;
    }

    public List<Double> getBbox(){
        return bbox;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return
                "Response{" +
                        "features = '" + hits + '\'' +
                        "}";
    }
}