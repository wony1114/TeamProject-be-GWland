package com.tplus.gwland.cmm.domain;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tplus.gwland.pce.domain.PlaceDto;
import com.tplus.gwland.rev.domain.ReviewDto;

import lombok.RequiredArgsConstructor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// @Component @RequiredArgsConstructor
public class Crawler extends Proxy{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	// private final Vector<ReviewDto> artBag;
    public Vector<PlaceDto>  crawling(String url2){
    	String url = "https://tickets.interpark.com/goods/20009147";
    	logger.info(" URL : "+url);
    	ArrayList<PlaceDto> placeBag = new ArrayList<>();
        try{
            Document rawData = Jsoup.connect(url).timeout(10 * 1000).get();
            Elements titles = rawData.getElementsByClass("bbsTitle");
            Elements contentid = rawData.select("b[class=bbsText]");
            PlaceDto place = null;
            logger.info(" titles.size() " + titles.size());
            for(int i=0; i< titles.size(); i++){
            	logger.info(" for 내부 ");
            	place = new PlaceDto();
            	place.setTitle(titles.get(i).text());
            	place.setContentid(titles.get(i).text());
                logger.info("리뷰 번호"+ i+"번: " +place.toString());
                placeBag.add(place);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}