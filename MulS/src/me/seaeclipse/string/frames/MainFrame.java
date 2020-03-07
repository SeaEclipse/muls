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
package me.seaeclipse.string.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import me.seaeclipse.string.Main;
import me.seaeclipse.string.hash.strings.SHA1;
import me.seaeclipse.string.hash.strings.SHA256;
import me.seaeclipse.string.hash.strings.SHA512;

/**
 * @author SeaEclipse
 *
 */
@SuppressWarnings("serial")
public final class MainFrame extends JFrame{
	
	JFrame frame = new JFrame();
	JFrame hashS = new JFrame();
	
	/*
	 * Labels & text fields.
	 */
	
	public static JTextField stringToHash = new JTextField(20);
	
	public JTextField hashedString = new JTextField(20);
	
	public static String stringToHash1 = stringToHash.getText();
	
	/*
	 * Buttons
	 */
	JButton hashString = new JButton("Hash");
	
	JButton hashFile = new JButton("For Files");
	
	JButton SHA1 = new JButton("SHA-1");
	JButton SHA256 = new JButton("SHA-256");
	JButton SHA512 = new JButton("SHA-512");
		
	public void genFrame() {
		
		JPanel panel1 = new JPanel();
		frame.add(panel1);
		
		frame.setTitle(Main.Project_Name + " " + Main.App_Version);
		frame.setSize(500, 350);
		
		placeComponents(panel1);
		
		placeField(panel1);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
	}
	
	public void renderStringHashFrame() {
		
		JPanel panel1 = new JPanel();
		hashS.add(panel1);
		
		hashS.setSize(300, 65);
		hashS.setTitle("Hash Algorythms");
		
		placeLayout(panel1);
		
		//Remember to fix this, because it just hides, not removes!
		hashS.setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		hashS.setResizable(false);
		
		hashS.setVisible(true);
	}
	
	public void placeLayout(JPanel panel) {
		SHA1.setBounds(1, 1, 1, 1);
		panel.add(SHA1);
		SHA1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SHA1 sha = new SHA1();
				hashedString.setText(sha.mkSHA1(stringToHash.getText()));
			}
		});
		
		SHA256.setBounds(1, 1, 1, 1);
		panel.add(SHA256);
		SHA256.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SHA256 sha = new SHA256();
				hashedString.setText(sha.mkSHA256(stringToHash.getText()));
			}
		});
		
		SHA512.setBounds(1, 1, 1, 1);
		panel.add(SHA512);
		SHA512.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SHA512 sha = new SHA512();
				hashedString.setText(sha.mkSHA512(stringToHash.getText()));
			}
		});
	}
	
	public void placeField(JPanel panel) {
		stringToHash.setBounds(5, 50, 490, 25);
		panel.add(stringToHash);
		
		hashedString.setBounds(5, 115, 490, 25);
		panel.add(hashedString);
	}

	public void placeComponents(JPanel panel) {
		panel.setLayout(null);
		
		/*
		 * Labels
		 */
		
		JLabel string1 = new JLabel("String to hash");
		string1.setBounds(212, 15, 180, 35);
		panel.add(string1);
		
		JLabel hashed = new JLabel("Hashing Result");
		hashed.setBounds(207, 80, 180, 35);
		panel.add(hashed);
		
		/*
		 * Buttons
		 */
		
		hashString.setBounds(177, 165, 140, 25);
		panel.add(hashString);
		hashString.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				renderStringHashFrame();
		    }
		});
		
		/*
		 * Credits to the creators of the app
		 */
		
		JLabel credits = new JLabel("MulS by SeaEclipse");
		credits.setBounds(157, 300, 200, 15);
		panel.add(credits);
	}
	
}
