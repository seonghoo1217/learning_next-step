package app;

import config.ConfigSetting;
import domain.BasicOption;
import validation.NameInputValidation;

import java.io.IOException;

public class Loby {
	private static BasicOption basicOption;
	private static ConfigSetting configSetting;
	private static NameInputValidation inputValidation;
	public static void main(String[] args) throws IOException {
		basicOption.startingRacingGame();
		String name_list = configSetting.inputConfigReadLine();
		if(!inputValidation.userName(name_list)){
			return;
		}

	}
}
