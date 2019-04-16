package com.example.SpringWork.service;

import com.example.SpringWork.model.Card;
import com.example.SpringWork.model.Document;


public interface DocumentService {
	
Document save(Document document);
	
Document fetch();
	
Document fetch(Document document);

Card savec(Card card);

}
