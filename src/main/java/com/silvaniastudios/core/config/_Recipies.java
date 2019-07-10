package com.silvaniastudios.core.config;

import net.minecraftforge.common.config.Config;

public class _Recipies {
	@Config.Comment(_ConfigValues.oreCrushingEnabled)
	public boolean oreCrushingEnabled = true;
	@Config.Comment(_ConfigValues.oreCrusherEnergyUsage)
	public int oreCrusherEnergyUsage = 4000;
	@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
	public int oreCrusherPrimaryOutputAmount = 2;
	@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputAmount)
	public int oreCrusherSecondaryOutputAmount = 1;
	@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputChance)
	public int oreCrusherSecondaryOutputChance = 15;
	
	@Config.Comment(_ConfigValues.ingotCrusherEnergyUsage)
	public int ingotCrusherEnergyUsage = 2000;
	@Config.Comment(_ConfigValues.nuggetCrusherEnergyUsage)
	public int nuggetCrusherEnergyUsage = 250;
	@Config.Comment(_ConfigValues.oreSmeltingEnergyUsage)
	public int oreSmeltingEnergyUsage = 4000;
	@Config.Comment(_ConfigValues.dustSmeltingEnergyUsage)
	public int dustSmeltingEnergyUsage = 4000;
	@Config.Comment(_ConfigValues.dustImpureSmeltingEnergyUsage)
	public int dustImpureSmeltingEnergyUsage = 5000;
	@Config.Comment(_ConfigValues.dustTinySmeltingEnergyUsage)
	public int dustTinySmeltingEnergyUsage = 500;
	
	@Config.Comment(_ConfigValues.compressNuggetToIngot)
	public boolean compressNuggetToIngot = true;
	@Config.Comment(_ConfigValues.compressNuggetToIngotPowerUsage)
	public int compressNuggetToIngotPowerUsage = 3000;
}
