package net.kettlemc.luckpermsfix.config;

import de.cuuky.cfw.configuration.BasicConfigurationHandler;

import java.util.Arrays;
import java.util.List;

public class Configuration {

    private BasicConfigurationHandler configuration;

    private List<String> files;

    public Configuration() {
        this.configuration = new BasicConfigurationHandler("plugins/LuckPermsFix/config.yml");
        this.files = (List<String>) this.configuration.getValue("files", Arrays.asList(new String[] { "plugins/LuckPerms/libs/mysql-driver-8.0.22-remapped.jar" }));
    }

    public List<String> getFiles() {
        return this.files;
    }

}

