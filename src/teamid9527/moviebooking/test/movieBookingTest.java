package teamid9527.moviebooking.test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import teamid9527.moviebooking.dao.CinemaDao;
import teamid9527.moviebooking.dao.CityDao;
import teamid9527.moviebooking.dao.CustomerDao;
import teamid9527.moviebooking.dao.MovieDao;
import teamid9527.moviebooking.dao.MovieItemDao;
import teamid9527.moviebooking.dao.ProvinceDao;
import teamid9527.moviebooking.dao.ReservationDao;
import teamid9527.moviebooking.dao.TownDao;
import teamid9527.moviebooking.entities.Cinema;
import teamid9527.moviebooking.entities.City;
import teamid9527.moviebooking.entities.Customer;
import teamid9527.moviebooking.entities.Movie;
import teamid9527.moviebooking.entities.MovieItem;
import teamid9527.moviebooking.entities.Province;
import teamid9527.moviebooking.entities.Reservation;
import teamid9527.moviebooking.entities.Town;

public class movieBookingTest {

	private ApplicationContext ctx = null;
	private ProvinceDao provinceDao;
	private CityDao cityDao;
	private TownDao townDao;
	private CinemaDao cinemaDao;
	private MovieDao movieDao;
	private CustomerDao customerDao;
	private MovieItemDao movieItemDao;
	private ReservationDao reservationDao;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		provinceDao = ctx.getBean(ProvinceDao.class);
		cityDao = ctx.getBean(CityDao.class);
		townDao = ctx.getBean(TownDao.class);
		cinemaDao = ctx.getBean(CinemaDao.class);
		movieDao = ctx.getBean(MovieDao.class);
		customerDao = ctx.getBean(CustomerDao.class);
		movieItemDao = ctx.getBean(MovieItemDao.class);
		reservationDao = ctx.getBean(ReservationDao.class);
	}

	
	//@Test
	public void testfindReservationByCustomer() {
		Customer customer = customerDao.findCustomerById(1);
		Reservation reservation = reservationDao.findReservationByCustomer(customer);
		System.out.println(reservation);
	}
	
	//@Test
	public void testfindReservationByCustomId() {
		Reservation reservation = reservationDao.findReservationByCustomerId(2);
		System.out.println(reservation);
	}
	
	//@Test
	public void testfindReservationById() {
		Reservation reservation = reservationDao.findReservationById(2);
		System.out.println(reservation);
	}
	
	//@Test
	public void testfindMovieItemsByCinema() {
		Cinema cinema = cinemaDao.findCinemaById(2);
		List list = movieItemDao.findMovieItemsByCinema(cinema);
		System.out.println(list);
	}
	
	//@Test
	public void testfindMovieItemsByCinemaId() {
		List list = movieItemDao.findMovieItemsByCinemaId(1);
		System.out.println(list);
	}
	
	//@Test
	public void testfindMovieItemsByMovie() {
		Movie movie = movieDao.findMovieById(2);
		List list = movieItemDao.findMovieItemsByMovie(movie);
		System.out.println(list);
	}
	
	//@Test
	public void testfindMovieItemsByMovieId() {
		List list = movieItemDao.findMovieItemsByMovieId(1);
		System.out.println(list);
	}
 	
	@Test
	public void testfindMovieItemById() {
		MovieItem movieItem = movieItemDao.findMovieItemById(1);
		System.out.println(movieItem);
		System.out.println(movieItem.getReservations());
	}
	
	
	//@Test
	public void testfindCustomerByName() {
		Customer customer = customerDao.findCustomerByName("Bob");
		System.out.println(customer);
	}
	
	//@Test
	public void testfindCustomerById() {
		Customer customer = customerDao.findCustomerById(1);
		System.out.println(customer);
	}
	
	//@Test
	public void testfindMovieByName() {
		List list = movieDao.findMovieByName("金刚狼3");
		System.out.println(list);
	}
	
	//@Test
	public void testfindMovieById() {
		Movie movie = movieDao.findMovieById(1);
		System.out.println(movie);
	}
	
	//@Test
	public void testfindCinemasByTown() {
		Town town = townDao.findTownById(1);
		List cinemas = cinemaDao.findCinemasByTown(town);
		System.out.println(cinemas);
	}
	
	//@Test
	public void testfindCinemasByTownId() {
		List cinemas = cinemaDao.findCinemasByTownId(1);
		System.out.println(cinemas);
	}
	
	//@Test
	public void testfindCinemaByName() {
		Cinema cinema = cinemaDao.findCinemaByName("金逸珠江影城");
		System.out.println(cinema);
	}
	
	//@Test
	public void testfindCinemaById() {
		Cinema cinema = cinemaDao.findCinemaById(2);
		System.out.println(cinema);
	}
	
	//@Test
	public void testfindTownsByCity() {
		City city = cityDao.findCityById(1);
		System.out.println(townDao.findTownsByCity(city));
	}
		
	//@Test
	public void testfindTownsByCityId() {
		System.out.println(townDao.findTownsByCityId(1));
	}
		
	//@Test
	public void testfindTownById() {
		Town town = townDao.findTownById(1);
		System.out.println(town);
	}
		
	//@Test
	public void testfindTownByName(){
		Town town = townDao.findTownByName("番禺区");
		System.out.println(town);
	}
	
	//@Test
	public void testfindCitysByProvince() {
		Province province = provinceDao.findProvinceById(1);
		System.out.println(cityDao.findCitysByProvince(province));
	}
	
	//@Test
	public void testfindCitysByProvinceId() {
		System.out.println(cityDao.findCitysByProvinceId(1));
	}
	
	//@Test
	public void testfindCityById() {
		City city = cityDao.findCityById(2);
		System.err.println(city);
	}
	
	//@Test
	public void testfindCityByName(){
		City city = cityDao.findCityByName("广州市");
		System.out.println(city);
	}
	
	//@Test
	public void testqueryProvince() {
		Province province = provinceDao.findProvinceById(1);
		System.out.println(province);
	}
	
	//@Test
	public void testfindProvinceIdByName() {
		Integer id = provinceDao.findProvinceIdByName("广东省");
		System.out.println(id);
	}
	//@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	
	
	
}
