package lathe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import lathe.block.LargeColumnProperties;
import lathe.block.entity.TileEntityBlock;
import lathe.common.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

// This is my main file!

@Mod(modid = KimptonCore.modid, version = KimptonCore.VERSION)
public class KimptonCore
{
	
	public static final String modid = "lathe";
    public static final String VERSION = "1.0";  
    
    //Own Creative Tabs
    public static CreativeTabs latheTab;  
    
    //Defining Blocks
    public static Block allLarge;
    public static Block largeColumnStone;
    public static Block largeColumnBrick;
  
    
    //Proxy Settings
    @SidedProxy(clientSide = "lathe.common.ClientProxy", serverSide = "lathe.common.CommonProxy")
    public static CommonProxy kimptonProxy;
  
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){
    	//Registering Creative Tabs
    	latheTab = new CreativeTabs("kimpton"){
    		@SideOnly(Side.CLIENT)
    		public Item getTabIconItem(){
    			return Item.getItemFromBlock(KimptonCore.allLarge);
    		}
    	};  
    	
    	String[] vanillaBlocks = new String[]{
    			"Stone", "Brick"
    	};
    	
    	for(int i = 0; i < vanillaBlocks.length; i++){    		
    		allLarge = new LargeColumnProperties(Material.rock).setBlockName("ModelColumn" + vanillaBlocks[i]).setHardness(20.0F).setResistance(1.0F);
    		GameRegistry.registerBlock(allLarge, "ModelColumn" + vanillaBlocks[i]);
    		GameRegistry.registerTileEntity(TileEntityBlock.class, "ModelColumn" + vanillaBlocks[i]);
    	}
    
 //   	for(int i = 0; i < vanillaBlocks.size(); i++){
 //   		allLarge = new LargeColumnProperties(Material.rock).setBlockName("ModelColumn" + vanillaBlocks.get(i).substring(5).toString()).setHardness(20.0F).setResistance(1.0F);
 //   		GameRegistry.registerBlock(allLarge, "ModelColumn" + vanillaBlocks.get(i).substring(5).toString());
  //  		GameRegistry.registerTileEntity(TileEntityBlock.class, "ModelColumn" + vanillaBlocks.get(i).substring(5).toString());
 //   	}
        
        
    	/**
    	for(int i = 0; i < vanillaBlocks.size(); i++){    		
    		allLarge = new LargeColumnProperties(Material.rock).setBlockName("ModelColumn" + vanillaBlocks[i]).setHardness(20.0F).setResistance(1.0F);
    		GameRegistry.registerBlock(allLarge, "ModelColumn" + vanillaBlocks[i]);
    		GameRegistry.registerTileEntity(TileEntityBlock.class, "ModelColumn" + vanillaBlocks[i]);
    	}
    	
    	
    	//OLD CODE
    	//Define Block Properties
    	largeColumnStone = new LargeColumnProperties(Material.rock).setBlockName("ModelColumnStone").setHardness(20.0F).setResistance(1.0F);
    	largeColumnBrick = new LargeColumnProperties(Material.rock).setBlockName("ModelColumnBrick").setHardness(20.0F).setResistance(1.0F);    	
    	
    	//Registering Blocks
    	GameRegistry.registerBlock(largeColumnStone, "ModelCollumStone"); 
    	GameRegistry.registerBlock(largeColumnBrick, "ModelCollumBrick"); 
    	
    	//Registering Tile Entities
    	GameRegistry.registerTileEntity(TileEntityBlock.class, "ModelColumnStone");  
    	GameRegistry.registerTileEntity(TileEntityBlock.class, "ModelColumnBrick");
    	*/
    	
    	
    	//Rendering Blocks and Mobs
       	kimptonProxy.renderInfomation();
    	kimptonProxy.registerTileEntitySpecialRenderer();
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }    
    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){
    	
    }
    

}
