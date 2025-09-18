package com.hk_3;

import com.hk_3.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Тест
public class HK3 implements ModInitializer {
	public static final String MOD_ID = "hk3";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();

	}
}