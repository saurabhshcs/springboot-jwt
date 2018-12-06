/**
 * 
 */
package com.tsz.spingboot.jwt.security;

import org.springframework.stereotype.Component;

import com.tsz.spingboot.jwt.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * @author saurabhshcs
 *
 */
@Component
public class JwtVal {

	private String secret = "fenerbahce";

	public User validate(String token) {

		User jwtUser = null;
		try {
			Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();

			jwtUser = new User();

			jwtUser.setUserName(body.getSubject());
			jwtUser.setId(Long.parseLong((String) body.get("userId")));
			jwtUser.setRole((String) body.get("role"));
		} catch (Exception e) {
			System.out.println(e);
		}

		return jwtUser;
	}
}
