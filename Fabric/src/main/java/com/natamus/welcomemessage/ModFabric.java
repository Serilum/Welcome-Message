package com.natamus.welcomemessage;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.fabric.callbacks.CollectivePlayerEvents;
import com.natamus.welcomemessage.events.WorldJoinEvent;
import com.natamus.welcomemessage.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CollectivePlayerEvents.PLAYER_LOGGED_IN.register((Level world, Player player) -> {
			WorldJoinEvent.onSpawn(world, player);
		});
	}

	private static void setGlobalConstants() {

	}
}
