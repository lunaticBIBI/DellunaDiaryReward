package me.delluna.plugins.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author lunaticBIBI
 * @desc console logging on plugin enable/disable
 * @questions summon.bibi@gmail.com
 */
public final class Main extends JavaPlugin implements Listener {
    ConsoleCommandSender logger = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        // plugin startup console logging

        Enum<ChatColor> gray        = ChatColor.GRAY;
        Enum<ChatColor> green       = ChatColor.GREEN;
        Enum<ChatColor> yellow      = ChatColor.YELLOW;

        StringBuffer mark        = new StringBuffer();
        mark.append(gray + "[" + yellow + "Delluna" + green + "Town" + gray + "]");
        mark.append(gray + " Diary Reward Plugin ");
        mark.append(green + "Enabling");

        logger.sendMessage(gray + "///* *=====* ----- ****** ----- *=====* *///");
        logger.sendMessage(mark.toString());
        logger.sendMessage(gray + "/*/* === * -- * -- * // * -- * -- * === */*/");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown console logging

        Enum<ChatColor> gray        = ChatColor.GRAY;
        Enum<ChatColor> red         = ChatColor.RED;
        Enum<ChatColor> yellow      = ChatColor.YELLOW;

        StringBuffer mark        = new StringBuffer();
        mark.append(gray + "[" + yellow + "Delluna" + red + "Town" + gray + "]");
        mark.append(gray + " Diary Reward Plugin ");
        mark.append(red + "Disabling");

        logger.sendMessage(gray + "///* *=====* ----- ****** ----- *=====* *///");
        logger.sendMessage(mark.toString());
        logger.sendMessage(gray + "/*/* === * -- * -- * // * -- * -- * === */*/");
    }
}
