package com.example.SpringWork.service;

import javax.rmi.CORBA.StubDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringWork.model.Card;
import com.example.SpringWork.model.Document;
import com.example.SpringWork.model.Page;
import com.example.SpringWork.model.Paragraph;
import com.example.SpringWork.model.Section;
import com.example.SpringWork.repository.DocumentRepository;



@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	DocumentRepository documentRepository;
	//@Autowired
	//CardRepository cardRepository;

	@Override
	public Document save(Document document) {
		// TODO Auto-generated method stub
		
		for(Card card:document.getCards()) {
			card.setDocument(document);
			
			for(Page page:card.getPages()) {
				page.setCard(card);
				
				for( Section section:page.getSections()) {
					section.setPage(page);
					
					for(Paragraph paragraph:section.getParagraphs()) {
						paragraph.setSection(section);
					}
				}
			}
		}
		
		System.out.println("hello from document");
		return documentRepository.save(document);
	}
	
//	@Override
//	public Card savec(Card card) {
//		// TODO Auto-generated method stub
//		
//		for (Page page:card.getPages()) {
//			page.setCard(card);
//		}
//		System.out.println("hello from card");
//		return cardRepository.save(card);
//	}

	@Override
	public Document fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document fetch(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card savec(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
