package io.BM;

import dev.EX.ZZPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathEvent implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        ZZPlayer p = new ZZPlayer(e.getEntity());
        p.sendMsg("Координаты &cсмерти &r"+e.getEntity().getLocation().getBlockX()+" "+e.getEntity().getLocation().getBlockY()+" "+e.getEntity().getLocation().getBlockZ()+" в мире &b&n"+e.getEntity().getWorld().getName());
//        e.getEntity().sendMessage(ChatColor.translateAlternateColorCodes('&', "Координаты &cсмерти &r"+e.getEntity().getLocation().getBlockX()+" "+e.getEntity().getLocation().getBlockY()+" "+e.getEntity().getLocation().getBlockZ()));
    }


}
