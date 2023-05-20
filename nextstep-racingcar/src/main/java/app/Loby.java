package app;

import config.ConfigSetting;
import domain.BasicOption;

import java.io.IOException;

public class Loby {
	private static BasicOption basicOption;
	private static ConfigSetting configSetting;

	public static void main(String[] args) throws IOException {
		basicOption.startingRacingGame();
		String line = configSetting.inputConfigReadLine();
	}
}
