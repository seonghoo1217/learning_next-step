package config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConfigSetting {
	private BufferedReader br;
	public String inputConfigReadLine() throws IOException {
		br=new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
}
