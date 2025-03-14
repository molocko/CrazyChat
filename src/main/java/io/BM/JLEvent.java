package io.BM;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JLEvent implements Listener {

    @EventHandler
    public void onPJoin(PlayerJoinEvent e){
        String join = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("joinMSGFormat").replace("%player%", e.getPlayer().getName()));
        e.setJoinMessage(join);
        hiCMD.name = e.getPlayer().getName();
        //Main.getInstance().log.info(join);
    }

    @EventHandler
    public void onPLeave(PlayerQuitEvent e){
        String leave = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("leaveMSGFormat").replace("%player%", e.getPlayer().getName()));
        e.setQuitMessage(leave);
        //Main.getInstance().log.info(leave);
    }


}
