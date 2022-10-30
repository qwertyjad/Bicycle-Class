public class Bicycle
{
    private String ownerName;
    private String tagNo;
   
	
	public Bicycle()
{
	ownerName = "Unassigned.";
	tagNo = "Unknown";
}
	public Bicycle(String tagNo, String name){
		this.tagNo = tagNo;
		ownerName= name;
	}
    public String getOwnerName(){
	return ownerName;
    }
    public void setOwnerName(String name){
	ownerName = name;
    }
	public String getTagNo(){
		return tagNo;
	}
	public void setTagNo(String tag)
	{
		tagNo = tag;
	}
    
}
