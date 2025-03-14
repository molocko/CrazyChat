package io.BM;

import dev.EX.Funcs;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    static Main instance;

    Logger log = getLogger();

    @Override
    public void onEnable() {
        instance = this;

        Funcs.atEnable(this,"CrazyChat");

//        log.info("CrazyChat Enabled");
//        log.info("Developed by BM");

        getConfig().options().copyDefaults();
        saveDefaultConfig();


        Funcs.regCommands(this,"cc",new ccCMD());
        Funcs.regCommands(this,"hi",new hiCMD());
//        getCommand("cc").setExecutor(new ccCMD());
//        getCommand("hi").setExecutor(new hiCMD());
        //Funcs.regCommands(this, new ccCMD());
//        getCommand("msg").setExecutor(new WhisperCMD());
//        getCommand("tell").setExecutor(new WhisperCMD());
//        getCommand("m").setExecutor(new WhisperCMD());
//        getCommand("w").setExecutor(new WhisperCMD());
        getServer().getPluginManager().registerEvents(new chatEvent(), this);
        getServer().getPluginManager().registerEvents(new JLEvent(), this);
        getServer().getPluginManager().registerEvents(new deathEvent(), this);

        Funcs.regEvent(this, new CommandEvent());


    }

    public static Main getInstance(){
        return instance;
    }






}