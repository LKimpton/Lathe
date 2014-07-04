package lathe.common;

import lathe.block.LargeColumnProperties;
import lathe.block.entity.TileEntityBlock;
import lathe.block.render.HandEntityRenderer;
import lathe.block.render.TileEntityLargeColumnRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void renderInfomation(){	
		
		//The Large Stone Column
		TileEntitySpecialRenderer largeColumnStone = new TileEntityLargeColumnRenderer(KimptonCore.largeColumnStone.getUnlocalizedName().substring(5));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock.class, largeColumnStone);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(KimptonCore.largeColumnStone), new HandEntityRenderer(largeColumnStone, new TileEntityBlock()));
		
		//The Large Brick Column
		TileEntitySpecialRenderer largeColumnBrick = new TileEntityLargeColumnRenderer(KimptonCore.largeColumnBrick.getUnlocalizedName().substring(5));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock.class, largeColumnBrick);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(KimptonCore.largeColumnBrick), new HandEntityRenderer(largeColumnBrick, new TileEntityBlock()));
	}
	
	public void registerTileEntitySpecialRenderer(){	
		
		
	}

}
