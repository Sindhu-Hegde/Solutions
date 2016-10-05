
public interface IFace {
	void printCllgName();
}

interface IFace1 extends IFace{
	void setCllgName(String cllgName);
}

class EngCllg implements IFace1{
	private String collegeName;
	
	public void setCllgName(String cllgName){
		collegeName=cllgName;
	}

	@Override
	public void printCllgName() {
		System.out.println("College Name :"+collegeName);
		
	}
	
}
