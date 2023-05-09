package org.gimonchik.ultimategimonchikplugin;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.Material;
import java.util.ArrayList;

public class MainListener implements Listener {
    Logger log;

    MainListener(Logger log){
        this.log = log;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location loc = player.getLocation();
        Location new_loc = new Location(loc.getWorld(), loc.getX(), loc.getY() - 1, loc.getZ());
        if (new_loc.getBlock().getType() != Material.BEDROCK){
            new_loc.getBlock().setType(Material.BEDROCK);
        }
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event){
        Player player = event.getPlayer();
        player.setHealthScale(100);
    }
}
