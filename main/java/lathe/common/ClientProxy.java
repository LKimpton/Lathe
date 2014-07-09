package lathe.common;

import java.util.ArrayList;

import lathe.KimptonCore;
import lathe.block.LargeColumnProperties;
import lathe.block.entity.TileEntityBlock;
import lathe.block.render.HandEntityRenderer;
import lathe.block.render.TileEntityRendererLargeColumn;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void renderInfomation(){	
		/**
		//The Large Stone Column
		TileEntitySpecialRenderer largeColumnStone = new TileEntityLargeColumnRenderer(KimptonCore.largeColumnStone.getUnlocalizedName().substring(5));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock.class, largeColumnStone);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(KimptonCore.largeColumnStone), new HandEntityRenderer(largeColumnStone, new TileEntityBlock()));
		
		//The Large Brick Column
		TileEntitySpecialRenderer largeColumnBrick = new TileEntityLargeColumnRenderer(KimptonCore.largeColumnBrick.getUnlocalizedName().substring(5));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock.class, largeColumnBrick);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(KimptonCore.largeColumnBrick), new HandEntityRenderer(largeColumnBrick, new TileEntityBlock()));
		
		*/
		
		/* Tile Entity Renderer Columns :
		 * INDEX
		 * 1 = ModelLargeColumn
		 * 2 = ModelMediumColumn
		 * 3 = ModelSmallColumn
		*/			
						
		//All Large Columns
		TileEntitySpecialRenderer allLarge = new TileEntityRendererLargeColumn(KimptonCore.allLarge.getUnlocalizedName().substring(5), 1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock.class, allLarge);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(KimptonCore.allLarge), new HandEntityRenderer(allLarge, new TileEntityBlock()));
			
				
		
	}
	
	public void registerTileEntitySpecialRenderer(){	
		
		
	}

}
