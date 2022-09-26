package net.nightpixel.cyberpunk.system.events.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinHandler implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.getPlayer().playSound(e.getPlayer().getLocation(), "Test", (float) 0.1, (float) 0.2);
    }

}
