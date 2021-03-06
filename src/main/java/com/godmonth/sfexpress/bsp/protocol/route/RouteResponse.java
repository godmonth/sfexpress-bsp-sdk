package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.godmonth.sfexpress.bsp.protocol.ResponseError;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class RouteResponse extends Response {

	@XStreamAlias("Body")
	private RouteResponseBody body;

	public RouteResponse() {
	}

	public RouteResponse(String serviceName, String head, RouteResponseBody body) {
		setService(serviceName);
		setHead(head);
		this.body = body;
	}

	public RouteResponse(String serviceName, String head, ResponseError error) {
		super(serviceName, head, error);
	}

	public RouteResponseBody getBody() {
		return body;
	}

	public void setBody(RouteResponseBody body) {
		this.body = body;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("error", this.getError())
				.append("body", this.body).append("head", this.getHead()).append("service", this.getService())
				.toString();
	}

}
