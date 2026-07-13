package gui;

import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;
import data.Ingredient;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class MenuScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private Vector<BreadType> displayedBreadType;
	private Vector<Ingredient> displayedIngredient;
	private JPanel panel; 
	private Vector<String> selectedTags = new Vector<String>();
	private JList breadTypeList;

	private JLabel lblBrdDietaryTags;

	private JLabel lblBrdPrpTime;

	private JLabel lblIngPrpTime;

	private JComponent lblIngDietaryTags;

	private JLabel lblBrdTstTime;

	private JLabel lblBrdPrice;

	private JLabel lblIngPrice;

	private JLabel lblBrdName;

	private JLabel lblIngName;
	private int selectedIndex;

	public MenuScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1040, 720); 
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
		add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1080, 1740)); 
		
		JLabel lblNewLabel_1_1 = new JLabel("Bread Types");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(240, 200, 320, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Dietary tags");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(240, 260, 320, 32);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxBrdHalal = new JCheckBox("Halal");
		chckbxBrdHalal.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxBrdHalal.isSelected()) {
		            selectedTags.add("Halal");
		        } else {
		            selectedTags.remove("Halal");
		        }
		        updateDisplayedBreadTypes();
		    }
		});
		chckbxBrdHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdHalal.setBounds(240, 300, 80, 32);
		panel.add(chckbxBrdHalal);
		
		JCheckBox chckbxBrdVegan = new JCheckBox("Vegan");
		chckbxBrdVegan.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxBrdVegan.isSelected()) {
		            selectedTags.add("Vegan");
		        } else {
		            selectedTags.remove("Vegan");
		        }
		        updateDisplayedBreadTypes();
		    }
		});
		chckbxBrdVegan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdVegan.setBounds(322, 300, 80, 32);
		panel.add(chckbxBrdVegan);
		
		JCheckBox chckbxBrdVegeterian = new JCheckBox("Vegeterian");
		chckbxBrdVegeterian.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxBrdVegeterian.isSelected()) {
		            selectedTags.add("Vegeterian");
		        } else {
		            selectedTags.remove("Vegeterian");
		        }
		        updateDisplayedBreadTypes();
		    }
		});
		chckbxBrdVegeterian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdVegeterian.setBounds(404, 300, 112, 32);
		panel.add(chckbxBrdVegeterian);
		
		JCheckBox chckbxBrdNutFree = new JCheckBox("Nut-free");
		chckbxBrdNutFree.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxBrdNutFree.isSelected()) {
		            selectedTags.add("Nut-free");
		        } else {
		            selectedTags.remove("Nut-free");
		        }
		        updateDisplayedBreadTypes();
		    }
		});
		chckbxBrdNutFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdNutFree.setBounds(518, 300, 96, 32);
		panel.add(chckbxBrdNutFree);
		
		JCheckBox chckbxBrdBeefFree = new JCheckBox("Beef-free");
		chckbxBrdBeefFree.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxBrdBeefFree.isSelected()) {
		            selectedTags.add("Beef-free");
		        } else {
		            selectedTags.remove("Beef-free");
		        }
		        updateDisplayedBreadTypes();
		    }
		});
		chckbxBrdBeefFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdBeefFree.setBounds(616, 300, 104, 32);
		panel.add(chckbxBrdBeefFree);
		
		JCheckBox chckbxBrdDairyfree = new JCheckBox("Dairy-free");
		chckbxBrdDairyfree.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxBrdDairyfree.isSelected()) {
		            selectedTags.add("Dairy-free");
		        } else {
		            selectedTags.remove("Dairy-free");
		        }
		        updateDisplayedBreadTypes();
		    }
		});
		chckbxBrdDairyfree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdDairyfree.setBounds(722, 300, 120, 32);
		panel.add(chckbxBrdDairyfree);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingredients");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(240, 972, 320, 40);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Dietary tags");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(240, 1032, 320, 32);
		panel.add(lblNewLabel_1);
		
		JCheckBox chckbxIngHalal = new JCheckBox("Halal");
		chckbxIngHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngHalal.setBounds(240, 1072, 80, 32);
		panel.add(chckbxIngHalal);
		
		JCheckBox chckbxIngVegan = new JCheckBox("Vegan");
		chckbxIngVegan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngVegan.setBounds(322, 1072, 80, 32);
		panel.add(chckbxIngVegan);
		
		JCheckBox chckbxIngVegeterian = new JCheckBox("Vegeterian");
		chckbxIngVegeterian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngVegeterian.setBounds(404, 1072, 112, 32);
		panel.add(chckbxIngVegeterian);
		
		JCheckBox chckbxIngNutFree = new JCheckBox("Nut-free");
		chckbxIngNutFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngNutFree.setBounds(518, 1072, 96, 32);
		panel.add(chckbxIngNutFree);
		
		JCheckBox chckbxIngBeefFree = new JCheckBox("Beef-free");
		chckbxIngBeefFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngBeefFree.setBounds(616, 1072, 104, 32);
		panel.add(chckbxIngBeefFree);
		
		JCheckBox chckbxIngDairyfree = new JCheckBox("Dairy-free");
		chckbxIngDairyfree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngDairyfree.setBounds(722, 1072, 120, 32);
		panel.add(chckbxIngDairyfree);
		
		lblBrdName = new JLabel("[Bread type name]");
		lblBrdName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBrdName.setBounds(240, 612, 400, 32);
		panel.add(lblBrdName);
		
		JLabel lblNewLabel_2 = new JLabel("Dietary tags:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(240, 660, 120, 32);
		panel.add(lblNewLabel_2);
		
		lblBrdDietaryTags = new JLabel("[Dietary tags]");
		lblBrdDietaryTags.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrdDietaryTags.setBounds(359, 660, 483, 32);
		panel.add(lblBrdDietaryTags);
		
		JLabel lblNewLabel_2_1 = new JLabel("Base preparation time (mins):");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(240, 700, 240, 32);
		panel.add(lblNewLabel_2_1);
		
		lblBrdPrpTime = new JLabel("[Estimate base preparation time]");
		lblBrdPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrdPrpTime.setBounds(480, 700, 362, 32);
		panel.add(lblBrdPrpTime);
		
		lblIngName = new JLabel("[Ingredient name]");
		lblIngName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngName.setBounds(240, 1384, 400, 32);
		panel.add(lblIngName);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dietary tags:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(240, 1432, 120, 32);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Base preparation time (mins):");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(240, 1474, 240, 32);
		panel.add(lblNewLabel_2_1_1);
		
		lblIngPrpTime = new JLabel("[Estimate base preparation time]");
		lblIngPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIngPrpTime.setBounds(480, 1474, 352, 32);
		panel.add(lblIngPrpTime);
		
		lblIngDietaryTags = new JLabel("[Dietary tags]");
		lblIngDietaryTags.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIngDietaryTags.setBounds(359, 1432, 483, 32);
		panel.add(lblIngDietaryTags);
		
		JButton btnBrdEdit = new JButton("Edit bread type");
		btnBrdEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedIndex == -1) {
					return;
				}
				main.showEditBreadType(selectedIndex, displayedBreadType.get(selectedIndex));
			}
		});
		btnBrdEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrdEdit.setBounds(240, 798, 288, 48);
		panel.add(btnBrdEdit);
		
		JButton btnBrdDelete = new JButton("Delete bread type");
		btnBrdDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.getBreadTypeController().deleteBreadType(selectedIndex);
				updateDisplayedBreadTypes();
			}
		});
		btnBrdDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrdDelete.setBounds(554, 798, 288, 48);
		panel.add(btnBrdDelete);
		
		JButton btnBrdAdd = new JButton("Add new bread type");
		btnBrdAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showAddBreadType();
			}
		});
		btnBrdAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBrdAdd.setBounds(240, 872, 600, 56);
		panel.add(btnBrdAdd);
		
		JButton btnIngEdit = new JButton("Edit ingredient"); 
		btnIngEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIngEdit.setBounds(240, 1534, 288, 48);
		panel.add(btnIngEdit);
		
		JButton btnIngAdd = new JButton("Add new ingredient"); 
		btnIngAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIngAdd.setBounds(240, 1608, 600, 56);
		panel.add(btnIngAdd);
		
		JButton btnIngDelete = new JButton("Delete ingredient"); 
		btnIngDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIngDelete.setBounds(554, 1534, 288, 48);
		panel.add(btnIngDelete);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblMenu.setBounds(380, 80, 320, 48);
		panel.add(lblMenu);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(240, 348, 600, 240);
		panel.add(scrollPane_1);
		
		breadTypeList = new JList();
		breadTypeList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					return;
				}
				selectedIndex = breadTypeList.getSelectedIndex();
				if (selectedIndex == -1) {
					clearBreadTypeDetails();
					return;
				}
				BreadType selectedBreadType = displayedBreadType.get(selectedIndex);
				displayBreadTypeDetails(selectedBreadType);
			}
		});
		breadTypeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(breadTypeList);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(240, 1120, 600, 240);
		panel.add(scrollPane_2);
		
		JList list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_2.setViewportView(list_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Time taken to toast (mins):");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_2.setBounds(240, 740, 224, 32);
		panel.add(lblNewLabel_2_1_2);
		
		lblBrdTstTime = new JLabel("[Estimate time taken to toast]");
		lblBrdTstTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrdTstTime.setBounds(464, 740, 378, 32);
		panel.add(lblBrdTstTime);
		
		lblBrdPrice = new JLabel("SGD$ [Price]");
		lblBrdPrice.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBrdPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBrdPrice.setBounds(682, 612, 160, 32);
		panel.add(lblBrdPrice);
		
		lblIngPrice = new JLabel("SGD$ [Price]");
		lblIngPrice.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIngPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngPrice.setBounds(682, 1384, 160, 32);
		panel.add(lblIngPrice);
		
		updateDisplayedBreadTypes();
		
		
	}
	
	private void updateDisplayedBreadTypes() {
	    displayedBreadType = main.getBreadTypeController().filterBreadTypes(selectedTags);
	    populateBreadTypeList();
	}
	public void populateBreadTypeList() {
		breadTypeList.clearSelection();
		DefaultListModel model = new DefaultListModel();
		for (int i = 0; i < displayedBreadType.size(); i++) {
			BreadType breadType = displayedBreadType.get(i);
			model.addElement(breadType.getName());
		}
		this.breadTypeList.setModel(model);
 	}
	private void clearBreadTypeDetails() {
	    lblBrdName.setText("[Bread type name]");
	    lblBrdPrice.setText("SGD$ [Price]");
	    lblBrdDietaryTags.setText("[Dietary tags]");
	    lblBrdPrpTime.setText("[Estimate base preparation time]");
	    lblBrdTstTime.setText("[Estimate time taken to toast]");
	}
	private void displayBreadTypeDetails(BreadType selectedBreadType) {
		lblBrdName.setText(selectedBreadType.getName());
		lblBrdPrice.setText("SGD$ " + String.format("%.2f", selectedBreadType.getPrice()));
		
		Vector<String> tags = selectedBreadType.getDietaryTags();
		if (tags.size() <= 0) {
			lblBrdDietaryTags.setText("None");
		}
		else {
			String tagText = "";
			for (int i = 0; i < tags.size(); i++) {
			    tagText += tags.get(i);
			    if (i < tags.size() - 1) {
			        tagText += ", ";
			    }
			}
			lblBrdDietaryTags.setText(tagText);
		}
		lblBrdPrpTime.setText(String.format("%.2f", selectedBreadType.getPreparationTimeMins()));
		lblBrdTstTime.setText(String.format("%.2f",selectedBreadType.getToastPreparationTime()));
	}
	
	public Vector<BreadType> getDisplayedBreadType() {
		return displayedBreadType;
	}

	public void setDisplayedBreadType(Vector<BreadType> displayedBreadType) {
		this.displayedBreadType = displayedBreadType;
	}

	public Vector<Ingredient> getDisplayedIngredient() {
		return displayedIngredient;
	}

	public void setDisplayedIngredient(Vector<Ingredient> displayedIngredient) {
		this.displayedIngredient = displayedIngredient;
	}

}