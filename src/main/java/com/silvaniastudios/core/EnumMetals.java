package com.silvaniastudios.core;

import com.silvaniastudios.core.config.CopperConfig;

public enum EnumMetals {
	copper("copper", CopperConfig.worldgen.minVeinSize, CopperConfig.worldgen.maxVeinSize);
	
	private final String name;
	private final int minVein;
	private final int maxVein;
	
	private EnumMetals(String name, int minVein, int maxVein) {
		this.name = name;
		this.minVein = minVein;
		this.maxVein = maxVein;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int minVein() {
		return this.minVein;
	}
	
	public int maxVein() {
		return this.maxVein;
	}

}
