package ProjectCovid19;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SelfCheck extends JPanel{
	
	// 자가진단 결과 제출 버튼
	private JButton button = new JButton("제출");
	
	// 첫 번째 질문
	private JLabel text1 = new JLabel("1. 귀하의 몸에 열이 있나요?");
	private JRadioButton firstButton1 = new JRadioButton("37.5도 미만");
	private JRadioButton firstButton2 = new JRadioButton("37.5도 ~ 38도 또는 발열감");
	private JRadioButton firstButton3 = new JRadioButton("38도 이상");
	
	// 두 번째 질문
	private JLabel text2 = new JLabel("2. 공통적인 증상은 다음과 같습니다.   "
			+ "\n귀하에게 코로나19가 의심되는 증상이 있나요? (해당사항 모두 선택)");
	private JCheckBox firstcheck1 = new JCheckBox("아니오");
	private JCheckBox firstcheck2 = new JCheckBox("발열");
	private JCheckBox firstcheck3 = new JCheckBox("마른기침");
	private JCheckBox firstcheck4 = new JCheckBox("피로감");
	
	// 세 번째 질문 
	private JLabel text3 = new JLabel("3. 드물지만 다음과 같은 증상이 나타날 수도 있습니다.   "
			+ "귀하에게 코로나 19가 의심되는 증상이 있나요? (해당사항 모두 선택");
	private JCheckBox secondcheck1 = new JCheckBox("아니오");
	private JCheckBox secondcheck2 = new JCheckBox("몸살");
	private JCheckBox secondcheck3 = new JCheckBox("인후통");
	private JCheckBox secondcheck4 = new JCheckBox("설사");
	private JCheckBox secondcheck5 = new JCheckBox("결막염");
	private JCheckBox secondcheck6 = new JCheckBox("두통");
	private JCheckBox secondcheck7 = new JCheckBox("미각 또는 후각 상실");
	private JCheckBox secondcheck8 = new JCheckBox("피부 발진, 손가락 또는 발가락 변색");

	// 네 번째 질문
	private JLabel text4 = new JLabel("4. 심각한 증상은 다음과 같습니다.   "
			+ "귀하에게 코로나19가 의심되는 증상이 있나요?");
	private JCheckBox thirdcheck1 = new JCheckBox("아니오");
	private JCheckBox thirdcheck2 = new JCheckBox("호급 곤란 또는 숨 가쁨");
	private JCheckBox thirdcheck3 = new JCheckBox("가슴 통증 또는 압박감");
	private JCheckBox thirdcheck4 = new JCheckBox("언어 또는 운동 장애");
	
	// 다섯번째 질문
	private JLabel text5 = new JLabel("5. 귀하에게서는 최근 (14일 이내) 해외여행, 밀집시설/집합금지 명령을 받은"
			+ "위험 지역을 다녀 온 사실이 있나요?");
	private JRadioButton secondButton1 = new JRadioButton("아니오");
	private JRadioButton secondButton2 = new JRadioButton("예");
	
	// 여섯번째 질문
	private JLabel text6 = new JLabel("6. 동거가족(또는 동거인) 중 최근(14일 이내) 해외여행, "
			+ "밀집시설/집합금지 명령을 받은 위험 지역을 다녀 온 사실이 있나요?");
	private JRadioButton thirdButton1 = new JRadioButton("아니오");
	private JRadioButton thirdButton2 = new JRadioButton("예");
	
	// 일곱번째 질문
	private JLabel text7 = new JLabel("7. 동거가족(또는 동거인) 중 자가 격리된 가족이 있나요?");
	private JRadioButton fourthButton1 = new JRadioButton("아니오");
	private JRadioButton fourthButton2 = new JRadioButton("예");
	
	private JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));

	private JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));

	private JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));

	private JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));

	private JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));

	private JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_6 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));

	private JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panel_7 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 1));
	
	private JPanel panel8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	// 리스너
	Listener Listener = new Listener();

	public SelfCheck() {
		// 제목을 생성
		setLayout(new GridLayout(15,1));
        setBackground(Color.white);                  
        
        
		// 배경색 지정
		Color color = new Color(0xD5F7F8);

        panel1.setBackground(color);  
        panel_1.setBackground(Color.white);                  
       
        panel2.setBackground(color);   
        panel_2.setBackground(Color.white);                  

        panel3.setBackground(color);   
        panel_3.setBackground(Color.white);                  

        panel4.setBackground(color);    
        panel_4.setBackground(Color.white);                  

        panel5.setBackground(color);
        panel_5.setBackground(Color.white);                  

        panel6.setBackground(color);    
        panel_6.setBackground(Color.white);                  

        panel7.setBackground(color);     
        panel_7.setBackground(Color.white);                  

        panel8.setBackground(Color.white);
        button.setBackground(Color.WHITE);
        
		// 함께 동작할 라디오 버튼 그룹으로 묶기
		ButtonGroup group1 = new ButtonGroup();
		group1.add(firstButton1);
		group1.add(firstButton2);
		group1.add(firstButton3);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(secondButton1);
		group2.add(secondButton2);
		ButtonGroup group3 = new ButtonGroup();
		group3.add(thirdButton1);
		group3.add(thirdButton2);
		ButtonGroup group4 = new ButtonGroup();
		group4.add(fourthButton1);
		group4.add(fourthButton2);
		
		// 판넬에  첫 번째 질문 추가 
		panel1.add(text1);
		panel_1.add(firstButton1);
		panel_1.add(firstButton2);
		panel_1.add(firstButton3);
		firstButton1.setBackground(Color.white);                  
		firstButton2.setBackground(Color.white);                  
		firstButton3.setBackground(Color.white);                  

		// 판넬에 두 번째 질문 추가
		panel2.add(text2);
		panel_2.add(firstcheck1);
		panel_2.add(firstcheck2);
		panel_2.add(firstcheck3);
		panel_2.add(firstcheck4);
		firstcheck1.setBackground(Color.white);                  
		firstcheck2.setBackground(Color.white);                  
		firstcheck3.setBackground(Color.white);                  
		firstcheck4.setBackground(Color.white);                  

		// 판넬에 세 번째 질문 추가 
		panel3.add(text3);
		panel_3.add(secondcheck1);
		panel_3.add(secondcheck2);
		panel_3.add(secondcheck3);
		panel_3.add(secondcheck4);
		panel_3.add(secondcheck5);
		panel_3.add(secondcheck6);
		panel_3.add(secondcheck7);
		panel_3.add(secondcheck8);
		secondcheck1.setBackground(Color.white);                  
		secondcheck2.setBackground(Color.white);                  
		secondcheck3.setBackground(Color.white);                  
		secondcheck4.setBackground(Color.white);                  
		secondcheck5.setBackground(Color.white);                  
		secondcheck6.setBackground(Color.white);                  
		secondcheck7.setBackground(Color.white);                  
		secondcheck8.setBackground(Color.white);                  

		// 판넬에 네 번째 질문 추가 
		panel4.add(text4);
		panel_4.add(thirdcheck1);
		panel_4.add(thirdcheck2);
		panel_4.add(thirdcheck3);
		panel_4.add(thirdcheck4);
		thirdcheck1.setBackground(Color.white);                  
		thirdcheck2.setBackground(Color.white);                  
		thirdcheck3.setBackground(Color.white);                  
		thirdcheck4.setBackground(Color.white);                  

		// 판넬에  다섯번째 질문 추가 
		panel5.add(text5);
		panel_5.add(secondButton1);
		panel_5.add(secondButton2);
		secondButton1.setBackground(Color.white);                  
		secondButton2.setBackground(Color.white);                  

		// 판넬에  여섯번째 질문 추가 
		panel6.add(text6);
		panel_6.add(thirdButton1);
		panel_6.add(thirdButton2);
		thirdButton1.setBackground(Color.white);                  
		thirdButton2.setBackground(Color.white);                  

		// 판넬에  일곱번째 질문 추가 
		panel7.add(text7);
		panel_7.add(fourthButton1);
		panel_7.add(fourthButton2);
		fourthButton1.setBackground(Color.white);                  
		fourthButton2.setBackground(Color.white);                  

		panel8.add(button);
		
		// 판넬 추가
		add(panel1);
		add(panel_1);
		add(panel2);
		add(panel_2);
		add(panel3);
		add(panel_3);
		add(panel4);
		add(panel_4);
		add(panel5);
		add(panel_5);
		add(panel6);
		add(panel_6);
		add(panel7);
		add(panel_7);
		add(panel8);
		
		// 리스너 추가 
		button.addActionListener(Listener);
		
		// 보여주기
		setVisible(true);
	}
	// 제출 버튼 클릭시 결과를 보여주는 리스너 
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) { // 제출버튼 클릭시
				System.out.println("제출버튼 눌림");
				int score = 0;
				// 첫번째 질문 가중치 부여
				if(!firstButton1.isSelected()){
					score += 5;
				}
				
				// 두번째 질문 가중치 부여
				if(firstcheck2.isSelected()) {
					score +=10;
				}
				if(firstcheck3.isSelected()) {
					score +=10;
				}
				if(firstcheck4.isSelected()) {
					score +=10;
				}
				
				// 세번째 질문 가중치 부여 
				if(secondcheck2.isSelected()) {
					score += 1;
				}
				if(secondcheck3.isSelected()) {
					score += 1;
				}
				if(secondcheck4.isSelected()) {
					score += 1;
				}
				if(secondcheck5.isSelected()) {
					score += 1;
				}
				if(secondcheck6.isSelected()) {
					score += 1;
				}
				if(secondcheck7.isSelected()) {
					score += 1;
				}
				if(secondcheck8.isSelected()) {
					score += 1;
				}
				
				// 네번째 질문 가중치 부여 
				if(thirdcheck2.isSelected()) {
					score += 100;
				}
				if(thirdcheck3.isSelected()) {
					score += 100;
				}
				if(thirdcheck4.isSelected()) {
					score += 100;
				}
				
				if(secondButton2.isSelected()) {
					JOptionPane.showMessageDialog(null, "당신은 위험지역을 다녀온 적이 있군요 코로나 검사받으세요!!!");
				}
				
				if(thirdButton2.isSelected()) {
					JOptionPane.showMessageDialog(null, "동거가족 중 위험지역을 다녀온 자가 있군요 조심하세요!");
				}
				
				if(fourthButton2.isSelected()) {
					JOptionPane.showMessageDialog(null, "동거가족 중 자가격리된 가족이 있네요 당신도 검사를 받으세요!!");
				}
				if (score >= 340) 
					JOptionPane.showMessageDialog(null, "이 증상들이 진짜라면 이거 체크할 시간에 병원을 가보시길...");
				else if (score >= 100 && score < 340) 
					JOptionPane.showMessageDialog(null, "심각한 증상있네요 검사 받으세요!!");
				else if (score >= 20 && score < 100)
					JOptionPane.showMessageDialog(null, "공통적인 증상있네요 검사 받으세요!!");
				else if (score >= 5 && score < 20)
					JOptionPane.showMessageDialog(null, "몸 상태가 안좋네요 관리하세요 ㅎㅎ");
				else if (score == 0)
					JOptionPane.showMessageDialog(null, "잘하고 있어요 화이팅 ㅇㅅㅇ,,");
			}
		}
	}
}
