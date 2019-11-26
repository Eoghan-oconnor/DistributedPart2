
package ie.gmit.ds;

import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheck.Result;

public class ExampleHealthCheck extends ExampleHealthCheck {

	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}
}