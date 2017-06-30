package hello;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import localhost._8080.somaws.GetSomaRequest;
import localhost._8080.somaws.GetSomaResponse;


@Endpoint
public class SomaEndpoint {
	private static final String NAMESPACE_URI = "http://localhost:8080/SomaWS";


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSomaRequest")
	@ResponsePayload
	public GetSomaResponse getSoma(@RequestPayload GetSomaRequest request) {
		GetSomaResponse response = new GetSomaResponse();
		response.setResultado(request.getOp1() + request.getOp2());

		return response;
	}
}
