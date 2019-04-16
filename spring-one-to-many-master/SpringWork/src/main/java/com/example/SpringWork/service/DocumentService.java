package com.example.SpringWork.service;

import java.util.List;

import com.example.SpringWork.exception.DocumentException;
import com.example.SpringWork.model.Card;
import com.example.SpringWork.model.Document;


public interface DocumentService {
	
Document save(Document document) throws DocumentException;
	
Document fetch();
	
Document fetch(Document document);

List<Document> featch();

Document fetch(Integer id);

}
