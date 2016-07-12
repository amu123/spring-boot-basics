package za.co.mipisolutions.service;

import org.springframework.stereotype.Service;

/**
 * Created by chrismipi on 2016/07/08.
 */
@Service
public class MainServiceImpl implements MainService {
	@Override
	public String compute(String first, String second) {
		int intF;
		try {
			 intF = Integer.parseInt(first);
		}
		catch (NumberFormatException e) {
			intF = 0;
		}

		int intS;
		try{
			intS = Integer.parseInt(second);
		}
		catch (NumberFormatException e) {
			intS = 0;
		}

		int answer = intF + intS;

		return String.valueOf(answer);
	}
}
