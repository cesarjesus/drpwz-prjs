package datasrv;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DSrvApplication extends Application<DSrvConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DSrvApplication().run(args);
    }

    @Override
    public String getName() {
        return "DSrv";
    }

    @Override
    public void initialize(final Bootstrap<DSrvConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DSrvConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
