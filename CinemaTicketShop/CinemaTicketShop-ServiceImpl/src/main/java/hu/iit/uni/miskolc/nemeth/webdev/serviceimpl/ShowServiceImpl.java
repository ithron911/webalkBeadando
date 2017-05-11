package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.ShowDao;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;
import hu.iit.uni.miskolc.nemeth.webdev.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private ShowDao showDao;

	public ShowServiceImpl() {
	}

	@Override
	public List<Show> listShowsByMovieAndCinemaId(int movieId, int cinemaId) {
		return this.showDao.listShowsByMovieAndCinemaId(movieId, cinemaId);
	}

}
