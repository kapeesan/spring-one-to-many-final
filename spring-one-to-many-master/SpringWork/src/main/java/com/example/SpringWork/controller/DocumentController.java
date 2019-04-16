package com.example.SpringWork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringWork.exception.DocumentException;
import com.example.SpringWork.model.Document;
//import com.example.SpringWork.service.CardService;
import com.example.SpringWork.service.DocumentService;

@RestController
@RequestMapping(value = "/book")
public class DocumentController {
	
	@Autowired
	DocumentService  documentService;
	
	@RequestMapping(value = "/document",method = RequestMethod.POST)
	public ResponseEntity<Document> save(@RequestBody Document document) {
		//System.out.println("doc controller");
		
		
		try {
			Document document2=documentService.save(document);
			return ResponseEntity.ok(document2);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.badRequest().build();
		}
	}
	
	@RequestMapping(value = "/document",method = RequestMethod.GET)
	public List<Document>featch(){
		return documentService.featch();
	}
	
	@RequestMapping(value ="/document/{id}",method = RequestMethod.GET)
	public ResponseEntity<Document> fetch(@PathVariable Integer id){
		if(id<=0) {
			return ResponseEntity.badRequest().build();
		}
		else {
			Document document=documentService.fetch(id);
			if(document==null) {
				return ResponseEntity.notFound().build();
			}
			
			else {
				return ResponseEntity.ok(document);
			}
		}
		
	}

}
