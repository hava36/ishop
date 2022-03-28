package net.devstudy.servlet.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public final class WebUtils {

    public static Cookie findCookie(HttpServletRequest req, String cookieName) {
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    return cookie;
                }
            }
        }
        return new Cookie(cookieName, "");
    }

}
