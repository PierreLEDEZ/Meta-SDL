package com.metasdlproj.usingmodel;

import java.lang.System;
import java.io.*;
import org.eclipse.emf.ecore.EPackage;
import com.metasdlproj.model.metaSDLProj.*;
import com.metasdlproj.model.metaSDLProj.util.*;

public class UsingMetaSDLProj {

	public static void main(String[] args) {
		EPackage.Registry.INSTANCE.put(MetaSDLProjPackage.eNS_URI, MetaSDLProjPackage.eINSTANCE);
		MetaSDLProjFactory factory = MetaSDLProjFactory.eINSTANCE;
		
		com.metasdlproj.model.metaSDLProj.System sys = factory.createSystem();
		sys.setName("PingPong");
		
		Signal sig1 = factory.createSignal();
		sig1.setName("Sig1");
		
		sys.getSignals().add(sig1);
		
		System.out.println(sys.getName());
		System.out.println(sys.getSignals().size());
		

	}

}
