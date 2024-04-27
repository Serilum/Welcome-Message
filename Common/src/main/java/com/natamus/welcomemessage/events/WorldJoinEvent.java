package com.natamus.welcomemessage.events;

import com.natamus.collective.functions.MessageFunctions;
import com.natamus.welcomemessage.config.ConfigHandler;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class WorldJoinEvent {
	public static void onSpawn(Level world, Player player) {
		if (world.isClientSide) {
			return;
		}

		if (ConfigHandler.onlyRunOnDedicatedServers) {
			if (!world.getServer().isDedicatedServer()) {
				return;
			}
		}
		
		boolean emptyline = ConfigHandler.sendEmptyLineBeforeFirstMessage;
		
		if (!ConfigHandler.messageOneText.isEmpty()) {
			ChatFormatting oneColour = ChatFormatting.getById(ConfigHandler.messageOneColourIndex);
			if (oneColour == null) {
				System.out.println("[Welcome Message Error] Unable to find text formatting colour for message one with '" + ConfigHandler.messageOneColourIndex + "'.");
				return;
			}
			
			MessageFunctions.sendMessage(player, ConfigHandler.messageOneText, oneColour, emptyline, ConfigHandler.messageOneOptionalURL.trim());
			emptyline = false;
		}
		
		if (!ConfigHandler.messageTwoText.isEmpty()) {
			ChatFormatting twoColour = ChatFormatting.getById(ConfigHandler.messageTwoColourIndex);
			if (twoColour == null) {
				System.out.println("[Welcome Message Error] Unable to find text formatting colour for message two with '" + ConfigHandler.messageTwoColourIndex + "'.");
				return;
			}
			
			MessageFunctions.sendMessage(player, ConfigHandler.messageTwoText, twoColour, emptyline, ConfigHandler.messageTwoOptionalURL.trim());
			emptyline = false;
		}
		
		if (!ConfigHandler.messageThreeText.isEmpty()) {
			ChatFormatting threeColour = ChatFormatting.getById(ConfigHandler.messageThreeColourIndex);
			if (threeColour == null) {
				System.out.println("[Welcome Message Error] Unable to find text formatting colour for message three with '" + ConfigHandler.messageThreeColourIndex + "'.");
				return;
			}
			
			MessageFunctions.sendMessage(player, ConfigHandler.messageThreeText, threeColour, emptyline, ConfigHandler.messageThreeOptionalURL.trim());
		}
	}
}
