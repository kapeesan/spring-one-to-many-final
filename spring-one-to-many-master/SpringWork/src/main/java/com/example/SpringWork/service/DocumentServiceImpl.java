package com.example.SpringWork.service;

import java.util.List;
import java.util.Optional;

import javax.rmi.CORBA.StubDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringWork.exception.DocumentException;
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
	public Document save(Document document) throws DocumentException {
		// TODO Auto-generated method stub
		//try {
			validateDocumentID(document.getId());
		//} catch (DocumentException is) {
			// TODO: handle exception
			//throw new RuntimeException("document exception",is);
		//}
		/*for(Card card:document.getCards()) {
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
		
		System.out.println("hello from document");*/
		return documentRepository.save(document);
	}

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
	public List<Document> featch() {
		// TODO Auto-generated method stub
		return documentRepository.findAll();
	}

	@Override
	public Document fetch(Integer id) {
		// TODO Auto-generated method stub
		Optional<Document> document=documentRepository.findById(id);
		if(document.isPresent())
		{
			return document.get();
		}
		else
			return null;
	}
	
	public boolean validateDocumentID(Integer id) throws DocumentException{
		if(fetch(id)!=null) {
			throw new DocumentException("Document alredy exit with same id");
		}
		else {
			return true;
		}
	}

	
	
	

}
