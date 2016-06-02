package drpwz;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HWApplication extends Application<HWConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HWApplication().run(args);
    }

    @Override
    public String getName() {
        return "HW";
    }

    @Override
    public void initialize(final Bootstrap<HWConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HWConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
