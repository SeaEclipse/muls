/**
 * 
License for MulS: BSD 3 Clause

Copyright (c) 1 mar 2020 SeaEclipse. All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its
   contributors may be used to endorse or promote products derived from
   this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 */
package me.seaeclipse.string;

import me.seaeclipse.string.frames.MainFrame;

/**
 * @author scarlet
 *
 */
public final class Main {

	public static final String Project_Name = "MulS";
	public static final String License_Used = "BSD 3 Clause";
	public static final String App_Version = "0.77-Alpha";
	/*
	 * You are not allowed to remove this string from your project
	 * You are not allowed to modify this string from the "public static final" condition
	 */
	public static final String Project_Developer = "SeaEclipse";
	
	/*
	 * Unless you want to remove the OS detection please do not remove this string
	 */
	
	static String system = System.getProperty("os.name");
	static String arch = System.getProperty("os.arch");
	static String version = System.getProperty("os.version");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		MainFrame malfram = new MainFrame();
		malfram.genFrame();
		System.out.println(system + " on " + arch + " | Kernel version " + version);
	}

}
