package com.example.SpringWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringWork.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
