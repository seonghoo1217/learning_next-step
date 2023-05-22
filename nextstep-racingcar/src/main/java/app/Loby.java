package app;

import config.ConfigSetting;
import domain.BasicOption;
import validation.NameInputValidation;

import java.io.IOException;

public class Loby {
	private static final BasicOption basicOption = new BasicOption();
	private static final ConfigSetting configSetting=new ConfigSetting();
	private static final NameInputValidation inputValidation=new NameInputValidation();
	public static void main(String[] args) throws IOException {
		basicOption.startingRacingGame();
		String name_list = configSetting.inputConfigReadLine();
		if(!inputValidation.userName(name_list)){
			return;
		}
	}
}
