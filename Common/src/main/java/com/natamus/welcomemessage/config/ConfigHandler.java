package com.natamus.welcomemessage.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.welcomemessage.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean onlyRunOnDedicatedServers = true;
	@Entry public static boolean sendEmptyLineBeforeFirstMessage = true;
	@Entry public static String messageOneText = "Welcome to the server!";
	@Entry(min = 0, max = 15) public static int messageOneColourIndex = 2;
	@Entry public static String messageOneOptionalURL = "";
	@Entry public static String messageTwoText = "Downloaded from CurseForge! This is a clickable link.";
	@Entry(min = 0, max = 15) public static int messageTwoColourIndex = 14;
	@Entry public static String messageTwoOptionalURL = "https://curseforge.com/members/serilum/projects";
	@Entry public static String messageThreeText = "You should probably edit this in the config :)";
	@Entry(min = 0, max = 15) public static int messageThreeColourIndex = 15;
	@Entry public static String messageThreeOptionalURL = "";
	@Entry public static String messageFourText = "You should probably edit this in the config as 4th line :)";
	@Entry(min = 0, max = 15) public static int messageFourColourIndex = 15;
	@Entry public static String messageFourOptionalURL = "";


	public static void initConfig() {
		configMetaData.put("onlyRunOnDedicatedServers", Arrays.asList(
			"If the mod should only run on dedicated servers. When enabled it's not sent when in a singleplayer world."
		));
		configMetaData.put("sendEmptyLineBeforeFirstMessage", Arrays.asList(
			"Whether an empty line should be send before to first message to separate the welcome from other chat messages that might be sent."
		));
		configMetaData.put("messageOneText", Arrays.asList(
			"The first message a player will receive when joining the world. Can be left empty."
		));
		configMetaData.put("messageOneColourIndex", Arrays.asList(
			"0: black, 1: dark_blue, 2: dark_green, 3: dark_aqua, 4: dark_red, 5: dark_purple, 6: gold, 7: gray, 8: dark_gray, 9: blue, 10: green, 11: aqua, 12: red, 13: light_purple, 14: yellow, 15: white"
		));
		configMetaData.put("messageOneOptionalURL", Arrays.asList(
			"If a link is entered here, the complete message will be clickable."
		));
		configMetaData.put("messageTwoText", Arrays.asList(
			"The second message a player will receive when joining the world. Can be left empty."
		));
		configMetaData.put("messageTwoColourIndex", Arrays.asList(
			"0: black, 1: dark_blue, 2: dark_green, 3: dark_aqua, 4: dark_red, 5: dark_purple, 6: gold, 7: gray, 8: dark_gray, 9: blue, 10: green, 11: aqua, 12: red, 13: light_purple, 14: yellow, 15: white"
		));
		configMetaData.put("messageTwoOptionalURL", Arrays.asList(
			"If a link is entered here, the complete message will be clickable."
		));
		configMetaData.put("messageThreeText", Arrays.asList(
			"The third message a player will receive when joining the world. Can be left empty."
		));
		configMetaData.put("messageThreeColourIndex", Arrays.asList(
			"0: black, 1: dark_blue, 2: dark_green, 3: dark_aqua, 4: dark_red, 5: dark_purple, 6: gold, 7: gray, 8: dark_gray, 9: blue, 10: green, 11: aqua, 12: red, 13: light_purple, 14: yellow, 15: white"
		));
		configMetaData.put("messageThreeOptionalURL", Arrays.asList(
			"If a link is entered here, the complete message will be clickable."
		));
		configMetaData.put("messageFourText", Arrays.asList(
			"The 4th message a player will receive when joining the world. Can be left empty."
		));
		configMetaData.put("messageFourColourIndex", Arrays.asList(
			"0: black, 1: dark_blue, 2: dark_green, 3: dark_aqua, 4: dark_red, 5: dark_purple, 6: gold, 7: gray, 8: dark_gray, 9: blue, 10: green, 11: aqua, 12: red, 13: light_purple, 14: yellow, 15: white"
		));
		configMetaData.put("messageFourOptionalURL", Arrays.asList(
			"If a link is entered here, the complete message will be clickable."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}