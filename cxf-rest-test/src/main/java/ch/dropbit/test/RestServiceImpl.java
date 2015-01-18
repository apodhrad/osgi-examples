package ch.dropbit.test;

public class RestServiceImpl implements RestService {

	public String handleGet(String name) {
		return String.format("Hi %s, Karaf and CXF is cool.", name);
	}
}