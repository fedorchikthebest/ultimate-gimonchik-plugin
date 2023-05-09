package org.gimonchik.ultimategimonchikplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.logging.Logger;

public final class UltimateGimonchikPlugin extends JavaPlugin {
    Logger log = getLogger();

    @Override
    public void onEnable() {
        log.info("Ya krut");
        Bukkit.getPluginManager().registerEvents(new MainListener(log), this);
    }

    @Override
    public void onDisable() {
        log.info("Do sih por krut");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args){
        if(cmd.getName().equalsIgnoreCase("clear_bridges")){
            log.info("eeeeeeeeeeeeeeeeee");
            return true;
        }
        return false;
    }
}
