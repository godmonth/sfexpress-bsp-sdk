package com.godmonth.sfexpress.bsp;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.route.RouteRequest;
import com.godmonth.sfexpress.bsp.protocol.route.RouteRequestBody;
import com.godmonth.sfexpress.bsp.protocol.route.RouteRequestContent;
import com.godmonth.sfexpress.bsp.protocol.route.RouteResponse;
import com.godmonth.sfexpress.bsp.protocol.route.TrackingType;

public class RouteTest extends SfExpressClientTest {

	private static final Logger logger = LoggerFactory.getLogger(RouteTest.class);

	@Test
	public void route() throws IOException {
		RouteResponse routeResponse = sfExpressClient.post(createRouteRequest(), RouteResponse.class);
		System.out.println(routeResponse);
	}

	private RouteRequest createRouteRequest() throws IOException {
//		String orderid = FileUtils.readFileToString(new File("target/orderid.txt"));
//		orderid = "9b3aaad9-977e-401b-aa14-9";
		RouteRequestContent route = new RouteRequestContent();
		route.setTrackingType(TrackingType.MAILNO);
//		route.setTrackingNumber(orderid);
		route.setTrackingNumber("444501317445");
		route.setMethodType(1);
		return new RouteRequest(new RouteRequestBody(route));
	}
}
