package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.CinemaDao;
import hu.iit.uni.miskolc.nemeth.webdev.model.Cinema;
import hu.iit.uni.miskolc.nemeth.webdev.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private CinemaDao cinemaDao;

	public CinemaServiceImpl() {
	}

	@Override
	public List<Cinema> getAllCinemas() {
		return this.cinemaDao.getAllCinemas();
	}

	
}
