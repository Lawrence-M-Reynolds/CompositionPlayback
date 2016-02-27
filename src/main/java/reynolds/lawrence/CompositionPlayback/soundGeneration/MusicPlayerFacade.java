package reynolds.lawrence.CompositionPlayback.soundGeneration;

import composition.Composition;

public class MusicPlayerFacade {
	
	MusicPlayer musicPlayer = new MusicPlayer();
	
	public void playComposition(Composition composition){
		musicPlayer.open();
		musicPlayer.createSequence(composition);
		musicPlayer.playSequence();	
	}

	public void exportCompositionAsMidi(Composition composition){
		musicPlayer.open();
		musicPlayer.createSequence(composition);
		musicPlayer.exportMidi();
	}
}
