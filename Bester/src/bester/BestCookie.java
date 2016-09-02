package bester;


public class BestCookie implements Best<Cookie> {

    @Override
    public Cookie findTheBest(Cookie... cookies) {
        if (cookies.length == 0)
            return null;
        Cookie cookieBest = cookies[0];
        for (Cookie cookieItem : cookies) {
            if (cookieItem.isBetterThan(cookieBest)) {
                cookieBest = cookieItem;
            }
        }
        return cookieBest;
    }
}
