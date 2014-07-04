package lathe.block;

import lathe.block.entity.TileEntityBlock;
import lathe.block.render.TileEntityLargeColumnRenderer;
import lathe.common.ClientProxy;
import lathe.common.KimptonCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class LargeColumnProperties extends BlockContainer{

	public LargeColumnProperties(Material material) {
		super(material);
		this.setCreativeTab(KimptonCore.latheTab);
	}
	
	public int getRenderType(){
		return -1;
	}
	public boolean isOpaqueCube(){
		return false;
	}	
	public boolean renderAsNormalBlock(){
		return false;
	}
	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new TileEntityBlock();
	}
	
	//"Destroy Particles Texture" (IDK why this is that xD) How does this. reference KimptonCore?
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(KimptonCore.modid + ":" + this.getUnlocalizedName().substring(5));
	}


}

