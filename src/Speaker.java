import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Speaker{
//	public static void main(String[] args) {
//		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
//		
//		
//		Voice []voiceList = VoiceManager.getInstance().getVoices();
//		for(int i = 0; i < voiceList.length; i++) {
//			System.out.println("# Voice: " + voiceList[i].getName());
//		}
//		if(voice != null) {
//			voice.allocate();
//			System.out.println("Voice Rate: " + voice.getRate());
//			System.out.println("Voice Pitch: " + voice.getPitch());
//			System.out.println("Voice Volume: " + voice.getVolume());
//
//			boolean status = voice.speak("My name is steven hawking");
//			System.out.println("Status: " + status);
//			voice.deallocate();
//		}
//		else {
//			System.out.println("Error in getting voices.");
//		}
//		
//	}
	
	public static void speak(String str) {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		if(voice != null) {
			voice.allocate();

			voice.speak(str);
			voice.deallocate();
		}
		else {
			System.out.println("Nope");
		}
	}
	
	
}
