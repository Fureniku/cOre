package com.silvaniastudios.core;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidCore extends Fluid {
	
	protected int col;

	public FluidCore(String fluidName, ResourceLocation still, ResourceLocation flowing, int col) {
		super(fluidName, still, flowing);
		this.col = col;
	}
	
	@Override
    public int getColor() {
        return col;
	}
}
