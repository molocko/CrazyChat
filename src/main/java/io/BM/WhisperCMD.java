package io.BM;

import dev.EX.Funcs;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhisperCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        // /command [player] [message]
        Main.getInstance().getConfig().getString("whisperFormat");
        //String text = Funcs.colorize(String.join(" ", strings));
        String text = "";
        String playerName = commandSender.getName();
        String targetName = "";
        for (int i = 0; i < strings.length; i++) {
            if(i == 0){
                targetName = strings[i];
                continue;
            }
            text += strings[i]+" ";
        }

       if(Funcs.itIs(strings, 0, "console")){
           Main.getInstance().log.warning(commandSender.getName() + " -> "+text);
           return true;
       }

       Player target = Bukkit.getPlayerExact(targetName);
       if(target == null){
           Funcs.sendMsg(commandSender, "Игрок не был найден!");
           return true;
       }

       Funcs.sendMsg(target, playerName+" -> "+text);








        return true;
    }
}
