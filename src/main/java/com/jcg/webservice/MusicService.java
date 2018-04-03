package com.jcg.webservice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MusicService {

	private static Map<Integer, MusicalInstrument> instruments = new HashMap<Integer, MusicalInstrument>();
	private static Integer max = 0;
	static {
		 MusicalInstrument violin = new MusicalInstrument(max++, "Violin", TypeInstrument.STRING);
		 MusicalInstrument drum = new MusicalInstrument(max++, "Drum", TypeInstrument.DRUM);
		 instruments.put(violin.getId(), violin);
		 instruments.put(drum.getId(), drum);
	}

	public MusicalInstrument create(MusicalInstrument instrument) {
		instrument.setId(max++);
		instruments.put(instrument.getId(), instrument);
		return instrument;
	}

	public Collection<MusicalInstrument> getAll() {
		return instruments.values();
	}
	
	public MusicalInstrument get(Integer id) {
		return instruments.get(id);
	}

	public void delate(Integer id) {
		instruments.remove(id);
	}

	public MusicalInstrument update(Integer id, MusicalInstrument instrument) {
		if (instruments.containsKey(id) && id.equals(instrument.getId()))
			instruments.put(id, instrument);
		return get(id);
	}

}
