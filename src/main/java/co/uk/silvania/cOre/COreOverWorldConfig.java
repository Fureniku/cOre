package co.uk.silvania.cOre;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class COreOverWorldConfig {
	
	public static final String CATEGORY_COPPER = "Copper Ore"; //
	public static final String CATEGORY_TIN = "Tin Ore"; //
	public static final String CATEGORY_ZINC = "Zinc Ore"; //
	public static final String CATEGORY_NICKEL = "Nickel Ore"; //
	public static final String CATEGORY_SILVER = "Silver Ore"; //
	public static final String CATEGORY_COBALT = "Cobalt Ore";
	public static final String CATEGORY_TITANIUM = "Titanium Ore"; //
	public static final String CATEGORY_CHROMIUM = "Chromium Ore";
	public static final String CATEGORY_MANGANESE = "Manganese Ore";
	public static final String CATEGORY_CADMIUM = "Cadmium Ore";
	public static final String CATEGORY_TUNGSTEN = "Tungsten Ore";
	public static final String CATEGORY_LEAD = "Lead Ore";
	public static final String CATEGORY_PLATINUM = "Platinum Ore";
	public static final String CATEGORY_LITHIUM = "Lithium Ore";
	public static final String CATEGORY_POTASSIUM = "Potassium Ore";
	public static final String CATEGORY_MAGNESIUM = "Magnesium Ore";
	
	public static final String CATEGORY_CALCIUM = "Calcium Ore";
	public static final String CATEGORY_LANTHANUM = "Lanthanum Ore";
	public static final String CATEGORY_CERIUM = "Cermium Ore";
	public static final String CATEGORY_PROMETHIUM = "Promethium Ore";
	public static final String CATEGORY_URANIUM = "Uranium Ore";
	public static final String CATEGORY_PLUTONIUM = "Plutonium Ore";
	public static final String CATEGORY_TECHNETIUM = "Technetium Ore";
	public static final String CATEGORY_TANTALUM = "Tantalum Ore";
	public static final String CATEGORY_SCANDIUM = "Scandium Ore";
	public static final String CATEGORY_ALUMINIUM = "Aluminium Ore";
	public static final String CATEGORY_GALLIUM = "Gallium Ore";
	public static final String CATEGORY_INDIUM = "Indium Ore";
	public static final String CATEGORY_THALLIUM = "Thallium Ore";
	public static final String CATEGORY_TECMONIUM = "Tecmonium Ore"; //
	public static final String CATEGORY_SILVANITE = "Silvanite Ore"; //
	public static final String CATEGORY_MERCILITE = "Mercilite Ore"; //
	
	//Ores textured.
	public static final String CATEGORY_DRAGITE = "Dragite Ore";
	public static final String CATEGORY_FLARITE = "Flarite Ore";
	public static final String CATEGORY_MYTHRIL = "Mythril Ore";
	public static final String CATEGORY_ADAMANTITE = "Adamantite Ore";
	public static final String CATEGORY_SULFUR = "Sulfur Ore"; //Dust
	public static final String CATEGORY_RUBY = "Ruby Ore"; //Gem
	public static final String CATEGORY_SAPPHIRE = "Sapphire Ore"; //Gem
	public static final String CATEGORY_AMETHYST = "Amethyst Ore"; //Gem
	public static final String CATEGORY_CRYSTAL = "Crystal Ore"; //Gem
	public static final String CATEGORY_MYTHIAN = "Mythian Ore"; //Nugget
	public static final String CATEGORY_BLACKSTONE = "Blackstone Ore"; //Dust
	public static final String CATEGORY_BLUESTONE = "Bluestone Ore"; //Dust
	public static final String CATEGORY_PURPLESTONE = "Purplestone Ore"; //Dust
	public static final String CATEGORY_IRIDIUM = "Iridium Ore"; //Item
	public static final String CATEGORY_ARDITE = "Ardite Ore";
	//public static final String CATEGORY_ = " Ore";
	
	public static final String CATEGORY_MERCURY = "Mercury Ore";
	public static final String CATEGORY_TAR = "Tar";
	public static final String CATEGORY_OIL = "Oil";
	public static final String CATEGORY_LIMESTONE = "Limestone";
	public static final String CATEGORY_CALCITE = "Calcite";
	public static final String CATEGORY_GRAPHITE = "Graphite";
	
		
	public static int copperMin; //Lower Base amount of ores to spawn. Counted as a single block.
	public static int copperMax; //Ore will spawn between min and max per vein.
	public static int copperRarity; //How likely is a vein to spawn in a chunk
	public static int copperMinY; //Minimum altitude to spawn
	public static int copperMaxY; //Maximum altitude to spawn
	
	public static int tinMin;
	public static int tinMax;
	public static int tinRarity;
	public static int tinMinY;
	public static int tinMaxY;
	
	public static int zincMin;
	public static int zincMax;
	public static int zincRarity;
	public static int zincMinY;
	public static int zincMaxY;
	
	public static int nickelMin;
	public static int nickelMax;
	public static int nickelRarity;
	public static int nickelMinY;
	public static int nickelMaxY;
	
	public static int silverMin;
	public static int silverMax;
	public static int silverRarity;
	public static int silverMinY;
	public static int silverMaxY;
	
	public static int cobaltMin;
	public static int cobaltMax;
	public static int cobaltRarity;
	public static int cobaltMinY;
	public static int cobaltMaxY;
	
	public static int titaniumMin;
	public static int titaniumMax;
	public static int titaniumRarity;
	public static int titaniumMinY;
	public static int titaniumMaxY;
	
	public static int chromiumMin;
	public static int chromiumMax;
	public static int chromiumRarity;
	public static int chromiumMinY;
	public static int chromiumMaxY;
	
	public static int manganeseMin;
	public static int manganeseMax;
	public static int manganeseRarity;
	public static int manganeseMinY;
	public static int manganeseMaxY;
	
	public static int cadmiumMin;
	public static int cadmiumMax;
	public static int cadmiumRarity;
	public static int cadmiumMinY;
	public static int cadmiumMaxY;
	
	public static int tungstenMin;
	public static int tungstenMax;
	public static int tungstenRarity;
	public static int tungstenMinY;
	public static int tungstenMaxY;
	
	public static int leadMin;
	public static int leadMax;
	public static int leadRarity;
	public static int leadMinY;
	public static int leadMaxY;
	
	public static int platinumMin;
	public static int platinumMax;
	public static int platinumRarity;
	public static int platinumMinY;
	public static int platinumMaxY;
	
	public static int lithiumMin;
	public static int lithiumMax;
	public static int lithiumRarity;
	public static int lithiumMinY;
	public static int lithiumMaxY;
	
	public static int potassiumMin;
	public static int potassiumMax;
	public static int potassiumRarity;
	public static int potassiumMinY;
	public static int potassiumMaxY;
	
	public static int magnesiumMin;
	public static int magnesiumMax;
	public static int magnesiumRarity;
	public static int magnesiumMinY;
	public static int magnesiumMaxY;
	
	
	public static int calciumMin;
	public static int calciumMax;
	public static int calciumRarity;
	public static int calciumMinY;
	public static int calciumMaxY;
	
	public static int lanthanumMin;
	public static int lanthanumMax;
	public static int lanthanumRarity;
	public static int lanthanumMinY;
	public static int lanthanumMaxY;
	
	public static int ceriumMin;
	public static int ceriumMax;
	public static int ceriumRarity;
	public static int ceriumMinY;
	public static int ceriumMaxY;
	
	public static int promethiumMin;
	public static int promethiumMax;
	public static int promethiumRarity;
	public static int promethiumMinY;
	public static int promethiumMaxY;
	
	public static int uraniumMin;
	public static int uraniumMax;
	public static int uraniumRarity;
	public static int uraniumMinY;
	public static int uraniumMaxY;
	
	public static int plutoniumMin;
	public static int plutoniumMax;
	public static int plutoniumRarity;
	public static int plutoniumMinY;
	public static int plutoniumMaxY;
	
	public static int technetiumMin;
	public static int technetiumMax;
	public static int technetiumRarity;
	public static int technetiumMinY;
	public static int technetiumMaxY;
	
	public static int tantalumMin;
	public static int tantalumMax;
	public static int tantalumRarity;
	public static int tantalumMinY;
	public static int tantalumMaxY;
	
	public static int scandiumMin;
	public static int scandiumMax;
	public static int scandiumRarity;
	public static int scandiumMinY;
	public static int scandiumMaxY;
	
	public static int aluminiumMin;
	public static int aluminiumMax;
	public static int aluminiumRarity;
	public static int aluminiumMinY;
	public static int aluminiumMaxY;
	
	public static int galliumMin;
	public static int galliumMax;
	public static int galliumRarity;
	public static int galliumMinY;
	public static int galliumMaxY;
	
	public static int indiumMin;
	public static int indiumMax;
	public static int indiumRarity;
	public static int indiumMinY;
	public static int indiumMaxY;
	
	public static int thalliumMin;
	public static int thalliumMax;
	public static int thalliumRarity;
	public static int thalliumMinY;
	public static int thalliumMaxY;
	
	public static int tecmoniumMin;
	public static int tecmoniumMax;
	public static int tecmoniumRarity;
	public static int tecmoniumMinY;
	public static int tecmoniumMaxY;
	
	public static int silvaniteMin;
	public static int silvaniteMax;
	public static int silvaniteRarity;
	public static int silvaniteMinY;
	public static int silvaniteMaxY;
	
	public static int merciliteMin;
	public static int merciliteMax;
	public static int merciliteRarity;
	public static int merciliteMinY;
	public static int merciliteMaxY;
	
	
	public static int dragiteMin;
	public static int dragiteMax;
	public static int dragiteRarity;
	public static int dragiteMinY;
	public static int dragiteMaxY;

	public static int flariteMin;
	public static int flariteMax;
	public static int flariteRarity;
	public static int flariteMinY;
	public static int flariteMaxY;
	
	public static int mythrilMin;
	public static int mythrilMax;
	public static int mythrilRarity;
	public static int mythrilMinY;
	public static int mythrilMaxY;
	
	public static int adamantiteMin;
	public static int adamantiteMax;
	public static int adamantiteRarity;
	public static int adamantiteMinY;
	public static int adamantiteMaxY;
	
	public static int sulfurMin;
	public static int sulfurMax;
	public static int sulfurRarity;
	public static int sulfurMinY;
	public static int sulfurMaxY;
	
	public static int rubyMin;
	public static int rubyMax;
	public static int rubyRarity;
	public static int rubyMinY;
	public static int rubyMaxY;
	
	public static int sapphireMin;
	public static int sapphireMax;
	public static int sapphireRarity;
	public static int sapphireMinY;
	public static int sapphireMaxY;
	
	public static int amethystMin;
	public static int amethystMax;
	public static int amethystRarity;
	public static int amethystMinY;
	public static int amethystMaxY;
	
	public static int crystalMin;
	public static int crystalMax;
	public static int crystalRarity;
	public static int crystalMinY;
	public static int crystalMaxY;
	
	public static int mythianMin;
	public static int mythianMax;
	public static int mythianRarity;
	public static int mythianMinY;
	public static int mythianMaxY;
	
	public static int blackstoneMin;
	public static int blackstoneMax;
	public static int blackstoneRarity;
	public static int blackstoneMinY;
	public static int blackstoneMaxY;
	
	public static int bluestoneMin;
	public static int bluestoneMax;
	public static int bluestoneRarity;
	public static int bluestoneMinY;
	public static int bluestoneMaxY;
	
	public static int purplestoneMin;
	public static int purplestoneMax;
	public static int purplestoneRarity;
	public static int purplestoneMinY;
	public static int purplestoneMaxY;
	
	public static int iridiumMin;
	public static int iridiumMax;
	public static int iridiumRarity;
	public static int iridiumMinY;
	public static int iridiumMaxY;
	
	public static int arditeMin;
	public static int arditeMax;
	public static int arditeRarity;
	public static int arditeMinY;
	public static int arditeMaxY;
	
	/*public static int Min;
	public static int Max;
	public static int Rarity;
	public static int MinY;
	public static int MaxY;*/
	
	
	public static int mercuryMin;
	public static int mercuryMax;
	public static int mercuryRarity;
	public static int mercuryMinY;
	public static int mercuryMaxY;
	
	public static int tarRarity;
	public static int tarMinY;
	public static int tarMaxY;
	
	public static int oilRarity;
	public static int oilMinY;
	public static int oilMaxY;
	
	public static int limestoneMin;
	public static int limestoneMax;
	public static int limestoneRarity;
	public static int limestoneMinY;
	public static int limestoneMaxY;
	
	public static int calciteMin;
	public static int calciteMax;
	public static int calciteRarity;
	public static int calciteMinY;
	public static int calciteMaxY;
	
	public static int graphiteMin;
	public static int graphiteMax;
	public static int graphiteRarity;
	public static int graphiteMinY;
	public static int graphiteMaxY;
	
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		copperMin = config.get(CATEGORY_COPPER, "Copper Min OPV", 2).getInt();
		copperMax = config.get(CATEGORY_COPPER, "Copper Max OPV", 6).getInt();
		copperRarity = config.get(CATEGORY_COPPER, "Copper Vein Spawnrate", 15).getInt();
		copperMinY = config.get(CATEGORY_COPPER, "Copper Min Height", 1).getInt();
		copperMaxY = config.get(CATEGORY_COPPER, "Copper Max Height", 70).getInt();
		
		tinMin = config.get(CATEGORY_TIN, "Tin Min OPV", 2).getInt();
		tinMax = config.get(CATEGORY_TIN, "Tin Max OPV", 6).getInt();
		tinRarity = config.get(CATEGORY_TIN, "Tin Vein Spawnrate", 14).getInt();
		tinMinY = config.get(CATEGORY_TIN, "Tin Min Height", 1).getInt();
		tinMaxY = config.get(CATEGORY_TIN, "Tin Max Height", 50).getInt();
		
		zincMin = config.get(CATEGORY_ZINC, "Zinc Min OPV", 2).getInt();
		zincMax = config.get(CATEGORY_ZINC, "Zinc Max OPV", 5).getInt();
		zincRarity = config.get(CATEGORY_ZINC, "Zinc Vein Spawnrate", 3).getInt();
		zincMinY = config.get(CATEGORY_ZINC, "Zinc Min Height", 1).getInt();
		zincMaxY = config.get(CATEGORY_ZINC, "Zinc Max Height", 32).getInt();
		
		nickelMin = config.get(CATEGORY_NICKEL, "Nickel Min OPV", 2).getInt();
		nickelMax = config.get(CATEGORY_NICKEL, "Nickel Max OPV", 5).getInt();
		nickelRarity = config.get(CATEGORY_NICKEL, "Nickel Vein Spawnrate", 4).getInt();
		nickelMinY = config.get(CATEGORY_NICKEL, "Nickel Min Height", 1).getInt();
		nickelMaxY = config.get(CATEGORY_NICKEL, "Nickel Max Height", 42).getInt();
		
		silverMin = config.get(CATEGORY_SILVER, "Silver Min OPV", 2).getInt();
		silverMax = config.get(CATEGORY_SILVER, "Silver Max OPV", 4).getInt();
		silverRarity = config.get(CATEGORY_SILVER, "Silver Vein Spawnrate", 4).getInt();
		silverMinY = config.get(CATEGORY_SILVER, "Silver Min Height", 1).getInt();
		silverMaxY = config.get(CATEGORY_SILVER, "Silver Max Height", 40).getInt();
		
		cobaltMin = config.get(CATEGORY_COBALT, "Cobalt Min OPV", 0).getInt();
		cobaltMax = config.get(CATEGORY_COBALT, "Cobalt Max OPV", 0).getInt();
		cobaltRarity = config.get(CATEGORY_COBALT, "Cobalt Vein Spawnrate", 0).getInt();
		cobaltMinY = config.get(CATEGORY_COBALT, "Cobalt Min Height", 0).getInt();
		cobaltMaxY = config.get(CATEGORY_COBALT, "Cobalt Max Height", 54).getInt();
		
		titaniumMin = config.get(CATEGORY_TITANIUM, "Titanium Min OPV", 2).getInt();
		titaniumMax = config.get(CATEGORY_TITANIUM, "Titanium Max OPV", 5).getInt();
		titaniumRarity = config.get(CATEGORY_TITANIUM, "Titanium Vein Spawnrate", 2).getInt();
		titaniumMinY = config.get(CATEGORY_TITANIUM, "Titanium Min Height", 1).getInt();
		titaniumMaxY = config.get(CATEGORY_TITANIUM, "Titanium Max Height", 20).getInt();
		
		chromiumMin = config.get(CATEGORY_CHROMIUM, "Chromium Min OPV", 2).getInt();
		chromiumMax = config.get(CATEGORY_CHROMIUM, "Chromium Max OPV", 5).getInt();
		chromiumRarity = config.get(CATEGORY_CHROMIUM, "Chromium Vein Spawnrate", 2).getInt();
		chromiumMinY = config.get(CATEGORY_CHROMIUM, "Chromium Min Height", 1).getInt();
		chromiumMaxY = config.get(CATEGORY_CHROMIUM, "Chromium Max Height", 16).getInt();
		
		manganeseMin = config.get(CATEGORY_MANGANESE, "Manganese Min OPV", 2).getInt();
		manganeseMax = config.get(CATEGORY_MANGANESE, "Manganese Max OPV", 5).getInt();
		manganeseRarity = config.get(CATEGORY_MANGANESE, "Manganese Vein Spawnrate", 1).getInt();
		manganeseMinY = config.get(CATEGORY_MANGANESE, "Manganese Min Height", 1).getInt();
		manganeseMaxY = config.get(CATEGORY_MANGANESE, "Manganese Max Height", 26).getInt();
		
		cadmiumMin = config.get(CATEGORY_CADMIUM, "Cadmium Min OPV", 2).getInt();
		cadmiumMax = config.get(CATEGORY_CADMIUM, "Cadmium Max OPV", 5).getInt();
		cadmiumRarity = config.get(CATEGORY_CADMIUM, "Cadmium Vein Spawnrate", 1).getInt();
		cadmiumMinY = config.get(CATEGORY_CADMIUM, "Cadmium Min Height", 1).getInt();
		cadmiumMaxY = config.get(CATEGORY_CADMIUM, "Cadmium Max Height", 20).getInt();
		
		tungstenMin = config.get(CATEGORY_TUNGSTEN, "Tungsten Min OPV", 2).getInt();
		tungstenMax = config.get(CATEGORY_TUNGSTEN, "Tungsten Max OPV", 5).getInt();
		tungstenRarity = config.get(CATEGORY_TUNGSTEN, "Tungsten Vein Spawnrate", 1).getInt();
		tungstenMinY = config.get(CATEGORY_TUNGSTEN, "Tungsten Min Height", 1).getInt();
		tungstenMaxY = config.get(CATEGORY_TUNGSTEN, "Tungsten Max Height", 22).getInt();
		
		leadMin = config.get(CATEGORY_LEAD, "Lead Min OPV", 2).getInt();
		leadMax = config.get(CATEGORY_LEAD, "Lead Max OPV", 5).getInt();
		leadRarity = config.get(CATEGORY_LEAD, "Lead Vein Spawnrate", 1).getInt();
		leadMinY = config.get(CATEGORY_LEAD, "Lead Min Height", 1).getInt();
		leadMaxY = config.get(CATEGORY_LEAD, "Lead Max Height", 24).getInt();
		
		platinumMin = config.get(CATEGORY_PLATINUM, "Platinum Min OPV", 2).getInt();
		platinumMax = config.get(CATEGORY_PLATINUM, "Platinum Max OPV", 3).getInt();
		platinumRarity = config.get(CATEGORY_PLATINUM, "Platinum Vein Spawnrate", 1).getInt();
		platinumMinY = config.get(CATEGORY_PLATINUM, "Platinum Min Height", 1).getInt();
		platinumMaxY = config.get(CATEGORY_PLATINUM, "Platinum Max Height", 22).getInt();
		
		lithiumMin = config.get(CATEGORY_LITHIUM, "Lithium Min OPV", 2).getInt();
		lithiumMax = config.get(CATEGORY_LITHIUM, "Lithium Max OPV", 5).getInt();
		lithiumRarity = config.get(CATEGORY_LITHIUM, "Lithium Vein Spawnrate", 2).getInt();
		lithiumMinY = config.get(CATEGORY_LITHIUM, "Lithium Min Height", 1).getInt();
		lithiumMaxY = config.get(CATEGORY_LITHIUM, "Lithium Max Height", 32).getInt();
		
		potassiumMin = config.get(CATEGORY_POTASSIUM, "Potassium Min OPV", 2).getInt();
		potassiumMax = config.get(CATEGORY_POTASSIUM, "Potassium Max OPV", 5).getInt();
		potassiumRarity = config.get(CATEGORY_POTASSIUM, "Potassium Vein Spawnrate", 2).getInt();
		potassiumMinY = config.get(CATEGORY_POTASSIUM, "Potassium Min Height", 1).getInt();
		potassiumMaxY = config.get(CATEGORY_POTASSIUM, "Potassium Max Height", 26).getInt();
		
		magnesiumMin = config.get(CATEGORY_MAGNESIUM, "Magnesium Min OPV", 2).getInt();
		magnesiumMax = config.get(CATEGORY_MAGNESIUM, "Magnesium Max OPV", 5).getInt();
		magnesiumRarity = config.get(CATEGORY_MAGNESIUM, "Magnesium Vein Spawnrate", 2).getInt();
		magnesiumMinY = config.get(CATEGORY_MAGNESIUM, "Magnesium Min Height", 1).getInt();
		magnesiumMaxY = config.get(CATEGORY_MAGNESIUM, "Magnesium Max Height", 16).getInt();

		//##########################################################################################################
		
		calciumMin = config.get(CATEGORY_CALCIUM, "Calcium Min OPV", 2).getInt();
		calciumMax = config.get(CATEGORY_CALCIUM, "Calcium Max OPV", 5).getInt();
		calciumRarity = config.get(CATEGORY_CALCIUM, "Calcium Vein Spawnrate", 6).getInt();
		calciumMinY = config.get(CATEGORY_CALCIUM, "Calcium Min Height", 20).getInt();
		calciumMaxY = config.get(CATEGORY_CALCIUM, "Calcium Max Height", 70).getInt();
		
		lanthanumMin = config.get(CATEGORY_LANTHANUM, "Lanthanum Min OPV", 2).getInt();
		lanthanumMax = config.get(CATEGORY_LANTHANUM, "Lanthanum Max OPV", 6).getInt();
		lanthanumRarity = config.get(CATEGORY_LANTHANUM, "Lanthanum Vein Spawnrate", 2).getInt();
		lanthanumMinY = config.get(CATEGORY_LANTHANUM, "Lanthanum Min Height", 1).getInt();
		lanthanumMaxY = config.get(CATEGORY_LANTHANUM, "Lanthanum Max Height", 10).getInt();
		
		ceriumMin = config.get(CATEGORY_CERIUM, "Cerium Min OPV", 2).getInt();
		ceriumMax = config.get(CATEGORY_CERIUM, "Cerium Max OPV", 5).getInt();
		ceriumRarity = config.get(CATEGORY_CERIUM, "Cerium Vein Spawnrate", 2).getInt();
		ceriumMinY = config.get(CATEGORY_CERIUM, "Cerium Min Height", 1).getInt();
		ceriumMaxY = config.get(CATEGORY_CERIUM, "Cerium Max Height", 6).getInt();
		
		promethiumMin = config.get(CATEGORY_PROMETHIUM, "Promethium Min OPV", 0).getInt();
		promethiumMax = config.get(CATEGORY_PROMETHIUM, "Promethium Max OPV", 1).getInt();
		promethiumRarity = config.get(CATEGORY_PROMETHIUM, "Promethium Vein Spawnrate", 1).getInt();
		promethiumMinY = config.get(CATEGORY_PROMETHIUM, "Promethium Min Height", 1).getInt();
		promethiumMaxY = config.get(CATEGORY_PROMETHIUM, "Promethium Max Height", 5).getInt();
		
		uraniumMin = config.get(CATEGORY_URANIUM, "Uranium Min OPV", 2).getInt();
		uraniumMax = config.get(CATEGORY_URANIUM, "Uranium Max OPV", 5).getInt();
		uraniumRarity = config.get(CATEGORY_URANIUM, "Uranium Vein Spawnrate", 1).getInt();
		uraniumMinY = config.get(CATEGORY_URANIUM, "Uranium Min Height", 1).getInt();
		uraniumMaxY = config.get(CATEGORY_URANIUM, "Uranium Max Height", 16).getInt();
		
		plutoniumMin = config.get(CATEGORY_PLUTONIUM, "Plutonium Min OPV", 2).getInt();
		plutoniumMax = config.get(CATEGORY_PLUTONIUM, "Plutonium Max OPV", 5).getInt();
		plutoniumRarity = config.get(CATEGORY_PLUTONIUM, "Plutonium Vein Spawnrate", 1).getInt();
		plutoniumMinY = config.get(CATEGORY_PLUTONIUM, "Plutonium Min Height", 1).getInt();
		plutoniumMaxY = config.get(CATEGORY_PLUTONIUM, "Plutonium Max Height", 32).getInt();
		
		technetiumMin = config.get(CATEGORY_TECHNETIUM, "Technetium Min OPV", 2).getInt();
		technetiumMax = config.get(CATEGORY_TECHNETIUM, "Technetium Max OPV", 6).getInt();
		technetiumRarity = config.get(CATEGORY_TECHNETIUM, "Technetium Vein Spawnrate", 1).getInt();
		technetiumMinY = config.get(CATEGORY_TECHNETIUM, "Technetium Min Height", 1).getInt();
		technetiumMaxY = config.get(CATEGORY_TECHNETIUM, "Technetium Max Height", 32).getInt();
		
		tantalumMin = config.get(CATEGORY_TANTALUM, "Tantalum Min OPV", 2).getInt();
		tantalumMax = config.get(CATEGORY_TANTALUM, "Tantalum Max OPV", 5).getInt();
		tantalumRarity = config.get(CATEGORY_TANTALUM, "Tantalum Vein Spawnrate", 2).getInt();
		tantalumMinY = config.get(CATEGORY_TANTALUM, "Tantalum Min Height", 1).getInt();
		tantalumMaxY = config.get(CATEGORY_TANTALUM, "Tantalum Max Height", 36).getInt();
		
		scandiumMin = config.get(CATEGORY_SCANDIUM, "Scandium Min OPV", 2).getInt();
		scandiumMax = config.get(CATEGORY_SCANDIUM, "Scandium Max OPV", 5).getInt();
		scandiumRarity = config.get(CATEGORY_SCANDIUM, "Scandium Vein Spawnrate", 2).getInt();
		scandiumMinY = config.get(CATEGORY_SCANDIUM, "Scandium Min Height", 1).getInt();
		scandiumMaxY = config.get(CATEGORY_SCANDIUM, "Scandium Max Height", 28).getInt();
		
		aluminiumMin = config.get(CATEGORY_ALUMINIUM, "Aluminium Min OPV", 3).getInt();
		aluminiumMax = config.get(CATEGORY_ALUMINIUM, "Aluminium Max OPV", 7).getInt();
		aluminiumRarity = config.get(CATEGORY_ALUMINIUM, "Aluminium Vein Spawnrate", 3).getInt();
		aluminiumMinY = config.get(CATEGORY_ALUMINIUM, "Aluminium Min Height", 1).getInt();
		aluminiumMaxY = config.get(CATEGORY_ALUMINIUM, "Aluminium Max Height", 48).getInt();
		
		galliumMin = config.get(CATEGORY_GALLIUM, "Gallium Min OPV", 2).getInt();
		galliumMax = config.get(CATEGORY_GALLIUM, "Gallium Max OPV", 5).getInt();
		galliumRarity = config.get(CATEGORY_GALLIUM, "Gallium Vein Spawnrate", 2).getInt();
		galliumMinY = config.get(CATEGORY_GALLIUM, "Gallium Min Height", 1).getInt();
		galliumMaxY = config.get(CATEGORY_GALLIUM, "Gallium Max Height", 32).getInt();
		
		indiumMin = config.get(CATEGORY_INDIUM, "Indium Min OPV", 2).getInt();
		indiumMax = config.get(CATEGORY_INDIUM, "Indium Max OPV", 5).getInt();
		indiumRarity = config.get(CATEGORY_INDIUM, "Indium Vein Spawnrate", 2).getInt();
		indiumMinY = config.get(CATEGORY_INDIUM, "Indium Min Height", 1).getInt();
		indiumMaxY = config.get(CATEGORY_INDIUM, "Indium Max Height", 28).getInt();
		
		thalliumMin = config.get(CATEGORY_THALLIUM, "Thallium Min OPV", 2).getInt();
		thalliumMax = config.get(CATEGORY_THALLIUM, "Thallium Max OPV", 5).getInt();
		thalliumRarity = config.get(CATEGORY_THALLIUM, "Thallium Vein Spawnrate", 1).getInt();
		thalliumMinY = config.get(CATEGORY_THALLIUM, "Thallium Min Height", 1).getInt();
		thalliumMaxY = config.get(CATEGORY_THALLIUM, "Thallium Max Height", 20).getInt();
		
		tecmoniumMin = config.get(CATEGORY_TECMONIUM, "Tecmonium Min OPV", 3).getInt();
		tecmoniumMax = config.get(CATEGORY_TECMONIUM, "Tecmonium Max OPV", 6).getInt();
		tecmoniumRarity = config.get(CATEGORY_TECMONIUM, "Tecmonium Vein Spawnrate", 5).getInt();
		tecmoniumMinY = config.get(CATEGORY_TECMONIUM, "Tecmonium Min Height", 1).getInt();
		tecmoniumMaxY = config.get(CATEGORY_TECMONIUM, "Tecmonium Max Height", 32).getInt();
		
		silvaniteMin = config.get(CATEGORY_SILVANITE, "Silvanite Min OPV", 2).getInt();
		silvaniteMax = config.get(CATEGORY_SILVANITE, "Silvanite Max OPV", 5).getInt();
		silvaniteRarity = config.get(CATEGORY_SILVANITE, "Silvanite Vein Spawnrate", 4).getInt();
		silvaniteMinY = config.get(CATEGORY_SILVANITE, "Silvanite Min Height", 1).getInt();
		silvaniteMaxY = config.get(CATEGORY_SILVANITE, "Silvanite Max Height", 24).getInt();
		
		merciliteMin = config.get(CATEGORY_MERCILITE, "Mercilite Min OPV", 2).getInt();
		merciliteMax = config.get(CATEGORY_MERCILITE, "Mercilite Max OPV", 4).getInt();
		merciliteRarity = config.get(CATEGORY_MERCILITE, "Mercilite Vein Spawnrate", 3).getInt();
		merciliteMinY = config.get(CATEGORY_MERCILITE, "Mercilite Min Height", 1).getInt();
		merciliteMaxY = config.get(CATEGORY_MERCILITE, "Mercilite Max Height", 16).getInt();
		
		//##########################################################################################################
		
		dragiteMin = config.get(CATEGORY_DRAGITE, "Dragite Min OPV", 2).getInt();
		dragiteMax = config.get(CATEGORY_DRAGITE, "Dragite Max OPV", 5).getInt();
		dragiteRarity = config.get(CATEGORY_DRAGITE, "Dragite Vein Spawnrate", 8).getInt();
		dragiteMinY = config.get(CATEGORY_DRAGITE, "Dragite Min Height", 12).getInt();
		dragiteMaxY = config.get(CATEGORY_DRAGITE, "Dragite Max Height", 48).getInt();
		
		flariteMin = config.get(CATEGORY_FLARITE, "Flarite Min OPV", 2).getInt();
		flariteMax = config.get(CATEGORY_FLARITE, "Flarite Max OPV", 5).getInt();
		flariteRarity = config.get(CATEGORY_FLARITE, "Flarite Vein Spawnrate", 8).getInt();
		flariteMinY = config.get(CATEGORY_FLARITE, "Flarite Min Height", 12).getInt();
		flariteMaxY = config.get(CATEGORY_FLARITE, "Flarite Max Height", 48).getInt();
		
		mythrilMin = config.get(CATEGORY_MYTHRIL, "Mythril Min OPV", 2).getInt();
		mythrilMax = config.get(CATEGORY_MYTHRIL, "Mythril Max OPV", 5).getInt();
		mythrilRarity = config.get(CATEGORY_MYTHRIL, "Mythril Vein Spawnrate", 3).getInt();
		mythrilMinY = config.get(CATEGORY_MYTHRIL, "Mythril Min Height", 1).getInt();
		mythrilMaxY = config.get(CATEGORY_MYTHRIL, "Mythril Max Height", 32).getInt();
		
		adamantiteMin = config.get(CATEGORY_ADAMANTITE, "Adamantite Min OPV", 2).getInt();
		adamantiteMax = config.get(CATEGORY_ADAMANTITE, "Adamantite Max OPV", 5).getInt();
		adamantiteRarity = config.get(CATEGORY_ADAMANTITE, "Adamantite Vein Spawnrate", 2).getInt();
		adamantiteMinY = config.get(CATEGORY_ADAMANTITE, "Adamantite Min Height", 1).getInt();
		adamantiteMaxY = config.get(CATEGORY_ADAMANTITE, "Adamantite Max Height", 16).getInt();
		
		sulfurMin = config.get(CATEGORY_SULFUR, "Sulfur Min OPV", 2).getInt();
		sulfurMax = config.get(CATEGORY_SULFUR, "Sulfur Max OPV", 5).getInt();
		sulfurRarity = config.get(CATEGORY_SULFUR, "Sulfur Vein Spawnrate", 4).getInt();
		sulfurMinY = config.get(CATEGORY_SULFUR, "Sulfur Min Height", 1).getInt();
		sulfurMaxY = config.get(CATEGORY_SULFUR, "Sulfur Max Height", 26).getInt();
		
		rubyMin = config.get(CATEGORY_RUBY, "Ruby Min OPV", 2).getInt();
		rubyMax = config.get(CATEGORY_RUBY, "Ruby Max OPV", 5).getInt();
		rubyRarity = config.get(CATEGORY_RUBY, "Ruby Vein Spawnrate", 4).getInt();
		rubyMinY = config.get(CATEGORY_RUBY, "Ruby Min Height", 1).getInt();
		rubyMaxY = config.get(CATEGORY_RUBY, "Ruby Max Height", 32).getInt();
		
		sapphireMin = config.get(CATEGORY_SAPPHIRE, "Sapphire Min OPV", 2).getInt();
		sapphireMax = config.get(CATEGORY_SAPPHIRE, "Sapphire Max OPV", 5).getInt();
		sapphireRarity = config.get(CATEGORY_SAPPHIRE, "Sapphire Vein Spawnrate", 5).getInt();
		sapphireMinY = config.get(CATEGORY_SAPPHIRE, "Sapphire Min Height", 1).getInt();
		sapphireMaxY = config.get(CATEGORY_SAPPHIRE, "Sapphire Max Height", 32).getInt();
		
		amethystMin = config.get(CATEGORY_AMETHYST, "Amethyst Min OPV", 2).getInt();
		amethystMax = config.get(CATEGORY_AMETHYST, "Amethyst Max OPV", 5).getInt();
		amethystRarity = config.get(CATEGORY_AMETHYST, "Amethyst Vein Spawnrate", 3).getInt();
		amethystMinY = config.get(CATEGORY_AMETHYST, "Amethyst Min Height", 1).getInt();
		amethystMaxY = config.get(CATEGORY_AMETHYST, "Amethyst Max Height", 32).getInt();
		
		crystalMin = config.get(CATEGORY_CRYSTAL, "Crystal Min OPV", 2).getInt();
		crystalMax = config.get(CATEGORY_CRYSTAL, "Crystal Max OPV", 5).getInt();
		crystalRarity = config.get(CATEGORY_CRYSTAL, "Crystal Vein Spawnrate", 3).getInt();
		crystalMinY = config.get(CATEGORY_CRYSTAL, "Crystal Min Height", 1).getInt();
		crystalMaxY = config.get(CATEGORY_CRYSTAL, "Crystal Max Height", 28).getInt();
		
		mythianMin = config.get(CATEGORY_MYTHIAN, "Mythian Min OPV", 1).getInt();
		mythianMax = config.get(CATEGORY_MYTHIAN, "Mythian Max OPV", 3).getInt();
		mythianRarity = config.get(CATEGORY_MYTHIAN, "Mythian Vein Spawnrate", 1).getInt();
		mythianMinY = config.get(CATEGORY_MYTHIAN, "Mythian Min Height", 1).getInt();
		mythianMaxY = config.get(CATEGORY_MYTHIAN, "Mythian Max Height", 8).getInt();
		
		blackstoneMin = config.get(CATEGORY_BLACKSTONE, "Blackstone Min OPV", 2).getInt();
		blackstoneMax = config.get(CATEGORY_BLACKSTONE, "Blackstone Max OPV", 7).getInt();
		blackstoneRarity = config.get(CATEGORY_BLACKSTONE, "Blackstone Vein Spawnrate", 7).getInt();
		blackstoneMinY = config.get(CATEGORY_BLACKSTONE, "Blackstone Min Height", 1).getInt();
		blackstoneMaxY = config.get(CATEGORY_BLACKSTONE, "Blackstone Max Height", 24).getInt();
		
		bluestoneMin = config.get(CATEGORY_BLUESTONE, "Bluestone Min OPV", 2).getInt();
		bluestoneMax = config.get(CATEGORY_BLUESTONE, "Bluestone Max OPV", 7).getInt();
		bluestoneRarity = config.get(CATEGORY_BLUESTONE, "Bluestone Vein Spawnrate", 5).getInt();
		bluestoneMinY = config.get(CATEGORY_BLUESTONE, "Bluestone Min Height", 1).getInt();
		bluestoneMaxY = config.get(CATEGORY_BLUESTONE, "Bluestone Max Height", 16).getInt();
		
		purplestoneMin = config.get(CATEGORY_PURPLESTONE, "Purplestone Min OPV", 2).getInt();
		purplestoneMax = config.get(CATEGORY_PURPLESTONE, "Purplestone Max OPV", 7).getInt();
		purplestoneRarity = config.get(CATEGORY_PURPLESTONE, "Purplestone Vein Spawnrate", 6).getInt();
		purplestoneMinY = config.get(CATEGORY_PURPLESTONE, "Purplestone Min Height", 1).getInt();
		purplestoneMaxY = config.get(CATEGORY_PURPLESTONE, "Purplestone Max Height", 32).getInt();
		
		iridiumMin = config.get(CATEGORY_IRIDIUM, "Iridium Min OPV", 0).getInt();
		iridiumMax = config.get(CATEGORY_IRIDIUM, "Iridium Max OPV", 1).getInt();
		iridiumRarity = config.get(CATEGORY_IRIDIUM, "Iridium Vein Spawnrate", 1).getInt();
		iridiumMinY = config.get(CATEGORY_IRIDIUM, "Iridium Min Height", 1).getInt();
		iridiumMaxY = config.get(CATEGORY_IRIDIUM, "Iridium Max Height", 255).getInt();
		
		arditeMin = config.get(CATEGORY_ARDITE, "Ardite Min OPV", 0).getInt();
		arditeMax = config.get(CATEGORY_ARDITE, "Ardite Max OPV", 0).getInt();
		arditeRarity = config.get(CATEGORY_ARDITE, "Ardite Vein Spawnrate", 0).getInt();
		arditeMinY = config.get(CATEGORY_ARDITE, "Ardite Min Height", 1).getInt();
		arditeMaxY = config.get(CATEGORY_ARDITE, "Ardite Max Height", 50).getInt();
		
		/*Min = config.get(CATEGORY_, " Min OPV", 2).getInt();
		Max = config.get(CATEGORY_, " Max OPV", 5).getInt();
		Rarity = config.get(CATEGORY_, " Vein Spawnrate", 14).getInt();
		MinY = config.get(CATEGORY_, " Min Height", 12).getInt();
		MaxY = config.get(CATEGORY_, " Max Height", 50).getInt();*/
		
		
		mercuryMin = config.get(CATEGORY_MERCURY, "Mercury Min OPV", 2).getInt();
		mercuryMax = config.get(CATEGORY_MERCURY, "Mercury Max OPV", 5).getInt();
		mercuryRarity = config.get(CATEGORY_MERCURY, "Mercury Vein Spawnrate", 2).getInt();
		mercuryMinY = config.get(CATEGORY_MERCURY, "Mercury Min Height", 1).getInt();
		mercuryMaxY = config.get(CATEGORY_MERCURY, "Mercury Max Height", 9).getInt();
		
		tarRarity = config.get(CATEGORY_TAR, "Tar Vein Spawnrate", 14).getInt();
		tarMinY = config.get(CATEGORY_TAR, "Tar Min Height", 12).getInt();
		tarMaxY = config.get(CATEGORY_TAR, "Tar Max Height", 50).getInt();
		
		oilRarity = config.get(CATEGORY_OIL, "Oil Vein Spawnrate", 14).getInt();
		oilMinY = config.get(CATEGORY_OIL, "Oil Min Height", 12).getInt();
		oilMaxY = config.get(CATEGORY_OIL, "Oil Max Height", 50).getInt();
		
		limestoneMin = config.get(CATEGORY_LIMESTONE, "Limestone Min OPV", 12).getInt();
		limestoneMax = config.get(CATEGORY_LIMESTONE, "Limestone Max OPV", 30).getInt();
		limestoneRarity = config.get(CATEGORY_LIMESTONE, "Limestone Vein Spawnrate", 1).getInt();
		limestoneMinY = config.get(CATEGORY_LIMESTONE, "Limestone Min Height", 50).getInt();
		limestoneMaxY = config.get(CATEGORY_LIMESTONE, "Limestone Max Height", 120).getInt();
		
		calciteMin = config.get(CATEGORY_CALCITE, "Calcite Min OPV", 10).getInt();
		calciteMax = config.get(CATEGORY_CALCITE, "Calcite Max OPV", 30).getInt();
		calciteRarity = config.get(CATEGORY_CALCITE, "Calcite Vein Spawnrate", 2).getInt();
		calciteMinY = config.get(CATEGORY_CALCITE, "Calcite Min Height", 50).getInt();
		calciteMaxY = config.get(CATEGORY_CALCITE, "Calcite Max Height", 120).getInt();
		
		graphiteMin = config.get(CATEGORY_GRAPHITE, "Graphite Min OPV", 10).getInt();
		graphiteMax = config.get(CATEGORY_GRAPHITE, "Graphite Max OPV", 30).getInt();
		graphiteRarity = config.get(CATEGORY_GRAPHITE, "Graphite Vein Spawnrate", 2).getInt();
		graphiteMinY = config.get(CATEGORY_GRAPHITE, "Graphite Min Height", 50).getInt();
		graphiteMaxY = config.get(CATEGORY_GRAPHITE, "Graphite Max Height", 120).getInt();
		config.save();
	}
}
