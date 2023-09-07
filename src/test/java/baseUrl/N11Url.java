package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.Authentication;

class N11Url extends Authentication {

protected RequestSpecification spec;

@Before
public void setup() {
   spec = new RequestSpecBuilder().setBaseUri("https://www.n11.com/").build();
}
}
