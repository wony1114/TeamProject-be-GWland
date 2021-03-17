package com.tplus.gwland.dtl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tplus.gwland.cmm.controller.AbstractController;
import com.tplus.gwland.dtl.domain.Detail;
import com.tplus.gwland.dtl.service.DetailServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/detail")
public class DetailController extends AbstractController<Detail> {
	private final DetailServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<Long> save(@RequestBody Detail t) {
		return ResponseEntity.ok(service.save(t));
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Long> delete(@RequestBody Detail t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Detail> getOne(@PathVariable long id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Detail>> findById(@PathVariable long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable long id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Detail>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@GetMapping("/contentid/{contentid}")
	public ResponseEntity<List<Detail>> findByContentid(String contentid) {
		return ResponseEntity.ok(service.findByContentid(contentid));
	}

}
