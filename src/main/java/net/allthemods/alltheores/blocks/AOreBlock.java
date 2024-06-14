package net.allthemods.alltheores.blocks;



import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;


public class AOreBlock extends DropExperienceBlock {
private final static IntProvider xpRange = new IntProvider() {
		@Override
		public int getMaxValue() {
			return 7;
		}

		@Override
		public int getMinValue() {
			return 0;
		}

		@Override
		public IntProviderType<?> getType() {
			return IntProviderType.CONSTANT;
			
		}

		@Override
		public int sample(RandomSource arg0) {
			return arg0.nextIntBetweenInclusive(this.getMinValue(), this.getMaxValue());
		}
	};

	public AOreBlock(Properties properties) {
		super(xpRange, properties.requiresCorrectToolForDrops().strength(3.0F, 3.0F));

	}

	


}
