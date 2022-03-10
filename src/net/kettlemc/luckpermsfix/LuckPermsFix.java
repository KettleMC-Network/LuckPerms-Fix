package net.kettlemc.luckpermsfix;

import net.kettlemc.luckpermsfix.config.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class LuckPermsFix extends JavaPlugin {

    private Configuration configuration;

    public void onEnable() {
        this.getLogger().info("Loading config...");
        this.configuration = new Configuration();
        deleteFiles();
    }

    private void deleteFiles() {
        for (String fileName : configuration.getFiles()) {
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
                this.getLogger().info("Deleted file '" + fileName + "'.");
            }
        }
    }

}