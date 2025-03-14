package io.BM;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatEvent implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){

        Player p = e.getPlayer();
        String format = Main.getInstance().getConfig().getString("globalFormat").replace("%message%", e.getMessage());


        String targetName = null;

        //for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
        //    if (message.contains(onlinePlayer.getName())) {
        //            targetName = onlinePlayer.getName();
        //            break;
        //        }
        //}

        for (String name : format.split(" ")){
           if (Bukkit.getPlayerExact(name) != null){
               targetName = name;
               break;
           }


        }
        if (targetName != null) {
            Player target = Bukkit.getPlayerExact(targetName);
            format = format.replace(targetName, ChatColor.translateAlternateColorCodes('&', "&e&n"+targetName+"&r"));
            target.playSound(target, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
        }
        //e.setFormat(ChatColor.DARK_PURPLE+"G | "+ChatColor.RESET+p.getDisplayName()+ChatColor.DARK_PURPLE+" :: ! "+ChatColor.RESET+message);
        try {
            e.setFormat(ChatColor.translateAlternateColorCodes('&', format.replace("%player%", p.getDisplayName())));
        }
        catch (Exception ex){
            ex.printStackTrace();
            e.setCancelled(true);
            p.sendMessage("Не удалось отправить сообщение!");
        }



    }



}
