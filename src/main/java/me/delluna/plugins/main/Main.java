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

        Enum<ChatColor> color = ChatColor.GRAY;
        Enum<ChatColor> accColor = ChatColor.GREEN;
        logger.sendMessage(color + "///* *=====* ----- ****** ----- *=====* *///");
        logger.sendMessage(color + "[Delluna Town] 하루일지 보상 플러그인을 " + accColor + "활성화" + color + "합니다.");
        logger.sendMessage(color + "/*/* === * -- * -- * // * -- * -- * === */*/");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown console logging

        Enum<ChatColor> color = ChatColor.GRAY;
        Enum<ChatColor> accColor = ChatColor.RED;
        logger.sendMessage(color + "///* *=====* ----- ****** ----- *=====* *///");
        logger.sendMessage(color + "[Delluna Town] 하루일지 보상 플러그인을 " + accColor + "비활성화" + color + "합니다.");
        logger.sendMessage(color + "/*/* === * -- * -- * // * -- * -- * === */*/");
    }
}
