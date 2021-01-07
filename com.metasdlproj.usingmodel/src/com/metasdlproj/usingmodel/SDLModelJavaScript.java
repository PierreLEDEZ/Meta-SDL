package com.metasdlproj.usingmodel;

import com.metasdlproj.model.metaSDLProj.Process;
import com.metasdlproj.model.metaSDLProj.Signal;
import com.metasdlproj.model.metaSDLProj.State;
import com.metasdlproj.model.metaSDLProj.System;
import com.metasdlproj.model.metaSDLProj.util.MetaSDLProjSwitch;

public class SDLModelJavaScript extends MetaSDLProjSwitch<String> {
	
	public String caseSystem( System sys) {
		String result = "";
		
		for (Process process: sys.getProcesses()) {
			result = result + caseProcess(process);
			
		}
		
		return result;
	}
	
	public String caseProcess( Process proc ) {
		String result = "";
		
		for ( State state: proc.getStates()) {
			result = result + "function input" + state.getName() + state.getInput().getName() + "() {\n";
			result = result + "if (document.getElementById('currentState" + proc.getName() + "').innerHTML == '" + state.getName() + "') {\n";
			result = result + "document.getElementById('currentState" + proc.getName() + "').innerHTML = '" + state.getNextstate().getName() + "';\n";
			result = result + "document.getElementById('" + state.getName() + "-" + state.getNextstate().getName() + "').classList.remove('active');\n";
			result = result + "document.getElementById('" + state.getNextstate().getName() + "-" + state.getNextstate().getNextstate().getName() + "').classList.add('active');\n";
			result = result + "document.getElementById('output-" + state.getName() + "-" + state.getNextstate().getName() + "').style['display'] = 'initial';\n";
			result = result + "setTimeout(function() {document.getElementById('output-" + state.getName() + "-" + state.getNextstate().getName() + "').style['display'] = 'none'}, 2000);\n}\n}\n\n";
		}
		
		return result;
	}
}
