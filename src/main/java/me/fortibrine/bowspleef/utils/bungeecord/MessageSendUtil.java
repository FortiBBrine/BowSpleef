package me.fortibrine.bowspleef.utils.bungeecord;

import me.fortibrine.bowspleef.main.Main;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class MessageSendUtil {

    private Main plugin;
    public MessageSendUtil(Main plugin) {
        this.plugin = plugin;
    }

    public void addWin(Player player) {

        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(b);
            out.writeUTF("win");
            player.sendPluginMessage(plugin, "bowspleef", b.toByteArray());
            b.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void connectPlayer(Player player, String serverName) {
        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(b);
            out.writeUTF("Connect");
            out.writeUTF(serverName);
            player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
            b.close();
            out.close();
        } catch (Exception ignored) {

        }
    }

}
