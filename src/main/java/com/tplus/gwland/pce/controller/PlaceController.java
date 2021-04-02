package com.tplus.gwland.pce.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tplus.gwland.cmm.controller.AbstractController;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.pce.domain.PlaceDto;
import com.tplus.gwland.pce.service.PlaceServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins ="*", allowedHeaders = "*")
@RequestMapping("/place")
public class PlaceController extends AbstractController<Place> {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final PlaceServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<Long> save(@RequestBody Place t) {
		return ResponseEntity.ok(service.save(t));
	}
	
	@PostMapping("/saveAll")
	public ResponseEntity<Long> saveAll(@RequestBody List<Place> t) {
		return ResponseEntity.ok(service.saveAll(t));
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Long> delete(@RequestBody Place t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Place> getOne(@PathVariable long id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Place>> findById(@PathVariable long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable long id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Place>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@GetMapping("/cat/{contenttypeid}")
	public ResponseEntity<List<Place>> findByContenttypeid(@PathVariable String contenttypeid) {
		return ResponseEntity.ok(service.findByContenttypeid(contenttypeid));
	}
	@GetMapping("/dtl/{contentid}")
	public ResponseEntity<List<Place>> findByContentid(@PathVariable long contentid) {
		return ResponseEntity.ok(service.findByContentid(contentid));
	}
	@GetMapping("/list")
	public ResponseEntity<List<PlaceDto>> findByList(){
		return ResponseEntity.ok(service.findByList());
	}
	@PutMapping("/updateOverview")
    public ResponseEntity<Integer> updateOverview(@RequestBody PlaceDto p){
        service.updateOverview(p);
        return ResponseEntity.ok(1);
    }
}