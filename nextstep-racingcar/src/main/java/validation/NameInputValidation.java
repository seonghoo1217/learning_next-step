package validation;

public class NameInputValidation {
	public static final String ERROR="[ERROR]";
	public static final String ERRORBYNAME=" 이름 조건이 부적합합니다";
	public boolean userName(String name_list){
		try {
			for (String name:name_list.split(",")){
				if (nameIsCorrectTemplate(name)) throw new IllegalStateException(ERROR+ERRORBYNAME);
			}
		}catch (IllegalStateException e){
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	private boolean nameIsNull(String name){
		return name.length()==0;
	}

	private boolean nameIsSpace(String name){
		return name.equals(" ");
	}
	private boolean nameStartComma(String name){
		return name.charAt(0)==',';
	}

	private boolean nameIsCorrectTemplate(String name){
		return nameIsNull(name)||nameIsSpace(name)|| nameStartComma(name);
	}
}
