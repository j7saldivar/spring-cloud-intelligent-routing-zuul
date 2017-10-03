package com.jorgesaldivar.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AddRequestHeaderFilter extends ZuulFilter {

	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		context.addZuulRequestHeader("x-location", "location");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
