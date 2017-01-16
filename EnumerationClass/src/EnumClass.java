

public class EnumClass {
	
	public static void main(String[] args) {
		
		OliveJar jar = new OliveJar();
		jar.addOlive(OliveNameEnum.INDIA, 0x000000);
		jar.addOlive(OliveNameEnum.LONDON, 0x000000);
		jar.addOlive(OliveNameEnum.DALLAS, 0x000000);
		jar.addOlive(OliveNameEnum.CANADA, 0x000000);
		jar.reportOlives();
		
		
		
	}

}
