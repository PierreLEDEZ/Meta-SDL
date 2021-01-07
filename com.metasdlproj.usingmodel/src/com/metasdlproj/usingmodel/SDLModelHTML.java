package com.metasdlproj.usingmodel;

import com.metasdlproj.model.metaSDLProj.Channel;
import com.metasdlproj.model.metaSDLProj.Process;
import com.metasdlproj.model.metaSDLProj.Signal;
import com.metasdlproj.model.metaSDLProj.State;
import com.metasdlproj.model.metaSDLProj.System;
import com.metasdlproj.model.metaSDLProj.util.MetaSDLProjSwitch;

public class SDLModelHTML extends MetaSDLProjSwitch<String> {
	
	public int currentState = 0;
	
	public String caseSystem( System sys) {
		String result = "<html>\n<title>" + sys.getName() + "</title>\n<head>\n<link href='./styles.css' rel='stylesheet'>\n</head>\n<body>\n";
		result = result + "<h1>System: " + sys.getName() + "</h1>\n";
		
		result = result + "<h2>Processes</h2>\n";
		result = result + "<div class='processes'>\n";
		for ( Process process: sys.getProcesses()) {
			result = result + caseProcess(process);
		}
		result = result + "</div>\n";
		
		result = result + "<script src='"+ sys.getName() + ".js'></script>\n</body>\n</html>";
		return result;
	}
	
	public String caseProcess( Process proc ) {
		String result = "<div class='process'>\n<h2>" + proc.getName() + "</h2>\n";
		result = result + "<h3>Current state: <span class='active' id='currentState" + proc.getName() + "'>" + proc.getStates().get(0).getName() + "</h3>\n";
		
		result = result + "<h3>States</h3>";
		result = result + "<div class='states'>\n";
		for (State state: proc.getStates()) {
			result = result + caseState(state);
			currentState += 1;
		}
		currentState = 0;
		result = result + "</div>\n";
		
		result = result + "</div>\n";
		
		return result;
	}
	
	public String caseState( State state ) {
		String result;
		if (currentState == 0) {
			result = "<div class='state'>\n<div class='state-header'>\n<p class='state-title active' id='" + state.getName().toLowerCase() + "-" + state.getNextstate().getName().toLowerCase() + "'>State: " + state.getName() + "</p><p class='state-description' id='description-" + state.getName().toLowerCase() + "-" + state.getNextstate().getName().toLowerCase() + "'>(" + state.getDescription() + ")</p></div>\n";
		}
		else {
			result = "<div class='state'>\n<div class='state-header'>\n<p class='state-title' id='" + state.getName().toLowerCase() + "-" + state.getNextstate().getName().toLowerCase() + "'>State: "+state.getName() + "<p class='state-description' id='description-" + state.getName().toLowerCase() + "-" + state.getNextstate().getName().toLowerCase() + "'>(" + state.getDescription() + ")</p></div>\n";
		}
		result = result + "<button class='state-input' onclick='input" + state.getName() + state.getInput().getName() + "()'>\nInput signal: " + state.getInput().getName() + "\n</button>\n";
		result = result + "<p id='output-" + state.getName().toLowerCase() + "-" + state.getNextstate().getName().toLowerCase() + "' class='state-output'>Output signal: " + state.getOutput().getName() + "</p>\n";
		result = result + "</div>\n";
		
		return result;
	}
}
