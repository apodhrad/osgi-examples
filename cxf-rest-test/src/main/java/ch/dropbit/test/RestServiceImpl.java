package ch.dropbit.test;

import javax.ws.rs.core.SecurityContext;

public class RestServiceImpl implements RestService {

	public String handleGet(String name, SecurityContext context) {
		if(context.getUserPrincipal() != null) {
			name += "-" + context.getUserPrincipal();
		}
		return String.format("Hi %s, Karaf and CXF is cool.", name);
	}
}