package validation;

public class NameInputValidation {
	public static final String ERROR="[ERROR]";
	public static final String ERRORBYNAME=" 이름 조건이 부적합합니다";
	public boolean userName(String name_list){
		try {
			if(nameIsNull(name_list)) throw new IllegalStateException(ERROR+ERRORBYNAME);
			for (String name:name_list.split(",")){
				nameIsNull(name);
			}
		}catch (IllegalStateException e){
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	private boolean nameIsNull(String name){
		if (name.length()==0){
			return nameIsSpace(name);
		}
		return false;
	}

	private boolean nameIsSpace(String name){
		if (name.equals(" ")){
			return nameIsCorrectTemplate(name);
		}
		return false;
	}
	private boolean nameIsCorrectTemplate(String name){
		return name.charAt(0)==',';
	}
}
