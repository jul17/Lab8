package com.jcg.webservice;

public class MusicalInstrument {

	private Integer id;
    private String name;
    private TypeInstrument typeInstruments;
    
    public MusicalInstrument() {
    	
    }
    
    public MusicalInstrument(Integer id, String name, TypeInstrument typeInstruments ) {
        this.id = id;
    	this.name = name;
    	this.typeInstruments = typeInstruments;
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeInstrument getTypeInstruments() {
		return typeInstruments;
	}

	public void setTypeInstruments(TypeInstrument typeInstruments) {
		this.typeInstruments = typeInstruments;
	}


    @Override
    public String toString() {
        return "MusicalInstrument{" +
                 "ID=" + id +
                "name=" + name + '\'' + "TypeInstrument" + typeInstruments +
                '}';
    }

    
}
