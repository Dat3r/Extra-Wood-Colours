package dat3r.extrawoodcolours;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import org.lwjgl.system.CallbackI;

public class ExtraWoodColours implements ModInitializer {
	public static Block RedPlank;
	public static Block YellowPlank;
	public static Block OrangePlank;
	public static Block GreenPlank;
	public static Block LimePlank;
	public static Block BluePlank;
	public static Block PurplePlank;
	public static Block PinkPlank;
	public static Block AquaPlank;
	public static ItemGroup ExtraWoodColours;
	@Override
	public void onInitialize() {
		ExtraWoodColours = FabricItemGroupBuilder.create(new Identifier("extrawoodcolours:group"))
				.icon(() -> new ItemStack(RedPlank))
				.build();

		FabricBlockSettings RedPlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		RedPlankSettings.breakByTool(FabricToolTags.AXES);
		RedPlank = new Block(RedPlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:redplank", RedPlank); // Register the block as a block to the game/

		Item.Settings RedPlankItemSettings = new Item.Settings();
		RedPlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:redplank", new BlockItem(RedPlank, RedPlankItemSettings)); // We are adding it as a item

		FabricBlockSettings YellowPlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		YellowPlankSettings.breakByTool(FabricToolTags.AXES);
		YellowPlank = new Block(YellowPlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:yellowplank", YellowPlank);

		Item.Settings YellowPlankItemSettings = new Item.Settings();
		YellowPlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:yellowplank", new BlockItem(YellowPlank, YellowPlankItemSettings));

		FabricBlockSettings OrangePlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		OrangePlankSettings.breakByTool(FabricToolTags.AXES);
		OrangePlank = new Block(OrangePlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:orangeplank", OrangePlank);

		Item.Settings OrangePlankItemSettings = new Item.Settings();
		OrangePlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:orangeplank", new BlockItem(OrangePlank, OrangePlankItemSettings));

		FabricBlockSettings GreenPlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		GreenPlankSettings.breakByTool(FabricToolTags.AXES);
		GreenPlank = new Block(GreenPlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:greenplank", GreenPlank);

		Item.Settings GreenPlankItemSettings = new Item.Settings();
		GreenPlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:greenplank", new BlockItem(GreenPlank, GreenPlankItemSettings));

		FabricBlockSettings BluePlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		BluePlankSettings.breakByTool(FabricToolTags.AXES);
		BluePlank = new Block(BluePlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:blueplank", BluePlank);

		Item.Settings BluePlankItemSettings = new Item.Settings();
		BluePlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:blueplank", new BlockItem(BluePlank, BluePlankItemSettings));

		FabricBlockSettings PurplePlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		PurplePlankSettings.breakByTool(FabricToolTags.AXES);
		PurplePlank = new Block(PurplePlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:purpleplank", PurplePlank);

		Item.Settings PurplePlankItemSettings = new Item.Settings();
		PurplePlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:purpleplank", new BlockItem(PurplePlank, PurplePlankItemSettings));

		FabricBlockSettings PinkPlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		PinkPlankSettings.breakByTool(FabricToolTags.AXES);
		PinkPlank = new Block(PinkPlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:pinkplank", PinkPlank);

		Item.Settings PinkPlankItemSettings = new Item.Settings();
		PinkPlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:pinkplank", new BlockItem(PinkPlank, PinkPlankItemSettings));

		FabricBlockSettings AquaPlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		AquaPlankSettings.breakByTool(FabricToolTags.AXES);
		AquaPlank = new Block(AquaPlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:aquaplank", AquaPlank);

		Item.Settings AquaPlankItemSettings = new Item.Settings();
		AquaPlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:aquaplank", new BlockItem(AquaPlank, AquaPlankItemSettings));

		FabricBlockSettings LimePlankSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
		LimePlankSettings.breakByTool(FabricToolTags.AXES);
		LimePlank = new Block(LimePlankSettings);
		Registry.register(Registry.BLOCK, "extrawoodcolours:limeplank", LimePlank);

		Item.Settings LimePlankItemSettings = new Item.Settings();
		LimePlankItemSettings.group(ExtraWoodColours);
		Registry.register(Registry.ITEM, "extrawoodcolours:limeplank", new BlockItem(LimePlank, LimePlankItemSettings));


	}
}
