package com.metasdlproj.usingmodel;

import com.metasdlproj.model.metaSDLProj.*;
import com.metasdlproj.model.metaSDLProj.Process;
import com.metasdlproj.model.metaSDLProj.System;
import com.metasdlproj.model.metaSDLProj.util.*;

public class SDLModelPrinter extends MetaSDLProjSwitch<String> {

	public String caseSystem( System sys) {
		String result = "system " + sys.getName() + ";\n";
		
		for ( Signal signal: sys.getSignals()) {
			result = result + caseSignal(signal);
		}
		
		for ( Channel channel: sys.getChannels()) {
			result = result + caseChannel(channel);
		}
		
		for ( Process process: sys.getProcesses()) {
			result = result + caseProcess(process);
		}
		
		result = result + "endsystem " + sys.getName() + ";\n\n";
		
		for ( Process process: sys.getProcesses()) {
			result = result + caseProcessDetailed(process);
		}
		
		return result;
	}
	
	public String caseSignal(Signal sig) {
		String result = "\tsignal " + sig.getName() + ";\n";
		
		return result;
	}
	
	public String caseChannel(Channel chan) {
		String result = "\tchannel " + chan.getName() + " nodelay from " + chan.getFrom().getName() + " to " + chan.getTo().getName() + " with " + chan.getSignal().getName() + ";\n";
		result = result + "\tendchannel " + chan.getName() + ";\n";
		return result;
	}
	
	public String caseProcess(Process proc) {
		String result = "\tprocess " + proc.getName() + " referenced;\n";
		return result;
	}
	
	public String caseState(State state) {
		String result = "\tstate " + state.getName() + ";\n";
		result = result + "\t\tinput " + state.getInput().getName() + ";\n";
		result = result + "\t\toutput " + state.getOutput().getName() + ";\n";
		result = result + "\t\t\tnextstate " + state.getNextstate().getName() + ";\n";
		result = result + "\tendstate " + state.getName() + ";\n";
		
		return result;
	}
	
	public String caseProcessDetailed(Process proc) {
		String result = "process " + proc.getName() + ";\n";
		result = result + "\tstart;\n";
		result = result + "\tnextstate " + proc.getStates().get(0).getName() + ";\n";
		
		for (State state: proc.getStates()) {
			result = result + caseState(state);
		}
		
		result = result + "endprocess " + proc.getName() + ";\n";
		
		return result;
	}
	
}
