package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.ShowDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidShowException;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;
import hu.iit.uni.miskolc.nemeth.webdev.service.ShowService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.ShowNotExistsException;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private ShowDao showDao;

	public ShowServiceImpl() {
	}

	@Override
	public List<Show> listShowsByMovie(int movieId) {
		return this.showDao.listShowsByMovie(movieId);
	}

	@Override
	public Show getShowById(int showId) throws ShowNotExistsException {
		Show show = null;

		try {
			show = this.showDao.getShowById(showId);
		} catch (InvalidShowException e) {
			throw new ShowNotExistsException();
		}

		return show;
	}

}
