package lathe.block.render;

import lathe.KimptonCore;
import lathe.block.LargeColumnProperties;
import lathe.block.entity.TileEntityBlock;
import lathe.block.model.ModelLargeColumn;
import lathe.common.ClientProxy;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.RegistryNamespaced;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class TileEntityLargeColumnRenderer extends TileEntitySpecialRenderer{
	
	private ModelLargeColumn model;	
	private ResourceLocation texture;
			
	public TileEntityLargeColumnRenderer(String name){
		this.model = new ModelLargeColumn();
		this.texture = new ResourceLocation(KimptonCore.modid + ":" + "/textures/blocks/" + name + ".png");
	}


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f){
		
		//Open GL open with PUSH and close with POP
		GL11.glPushMatrix();		
			GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);			
			this.bindTexture(texture);			
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F);
			GL11.glPopMatrix();			
		GL11.glPopMatrix();		
	}


	

}
