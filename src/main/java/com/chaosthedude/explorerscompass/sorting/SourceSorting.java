package com.chaosthedude.explorerscompass.sorting;

import com.chaosthedude.explorerscompass.util.StructureUtils;

import net.minecraft.client.resources.I18n;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SourceSorting implements ISorting {
	
	@Override
	public int compare(Structure<?> structure1, Structure<?> structure2) {
		return StructureUtils.getStructureSource(structure1).compareTo(StructureUtils.getStructureSource(structure2));
	}

	@Override
	public Object getValue(Structure<?> structure) {
		return StructureUtils.getStructureSource(structure);
	}

	@Override
	public ISorting next() {
		return new DimensionSorting();
	}

	@Override
	public String getLocalizedName() {
		return I18n.format("string.explorerscompass.source");
	}

}
