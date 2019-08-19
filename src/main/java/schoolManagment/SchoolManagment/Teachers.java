package schoolManagment.SchoolManagment;

public enum Teachers   {
	
	 TEACHER_JAVA("Erik_Svensson_java-course")
	 {
	 @Override
		public void printteacher() {
		System.out.println(TEACHER_JAVA.getVal());
     }
	 
  },	
		
	 TEACHER_C_PLUS("Ulif_C_plus-course")
	 {	  
	@Override
	public void printteacher() {
		System.out.println(TEACHER_C_PLUS.getVal());
				
	}
};
	public String val;
	
	private Teachers(String val)
	{
	this.val=val;
	}
	
	public String getVal()
	{
	return val;
    }



	public void setVal(String val) 
	{
	this.val = val;
    }

	public abstract void printteacher();
}
