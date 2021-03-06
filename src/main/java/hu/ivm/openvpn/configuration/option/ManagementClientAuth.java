package hu.ivm.openvpn.configuration.option;

import hu.ivm.openvpn.configuration.AsbtractConfigurationOption;
import hu.ivm.openvpn.configuration.builder.ConfigurationOptionBuilder;

public class ManagementClientAuth extends AsbtractConfigurationOption {
    @Override
    public void toString(ConfigurationOptionBuilder builder) {
        builder.appendOption("management-client-auth");
    }
}
