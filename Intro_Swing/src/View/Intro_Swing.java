package View;

/**
 *
 * @author abish
 */

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class Intro_Swing {

    public static void main(String[] args) {
        
        //Se crea el frame
        JFrame ventana = new JFrame("Nueva ventana");
        ventana.setVisible(true);
        ventana.setBounds(400,10,800,800);
        ventana.setDefaultCloseOperation(3);
        ventana.setVisible(true);
        
        //Se crea el panel principal que va a contener los demás panels
        Panel panel_principal = new Panel();
        //Se crea el GridLayout del cual se van a organizar los diferentes partes del panel.
        panel_principal.setLayout(new GridLayout(3,3,10,10));
        panel_principal.setBackground(Color.black);
        ventana.add(panel_principal);
        
        
        //Panel 1 que va a tener un layout de BorderLayout
        Panel panel1 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco1 = new Panel();
                                                                    panel_blanco1.setBackground(Color.white);
                                                                    panel_blanco1.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_azul1 = new Panel();
                                                                    panel_azul1.setBackground(Color.blue);
                                                                    panel_azul1.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_amarillo1 = new Panel();
                                                                    panel_amarillo1.setBackground(Color.yellow);
                                                                    panel_amarillo1.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_rojo1 = new Panel();
                                                                    panel_rojo1.setBackground(Color.RED);
                                                                    panel_rojo1.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_verde1 = new Panel();
                                                                    panel_verde1.setBackground(Color.GREEN);
                                                                    panel_verde1.setPreferredSize(new Dimension(50, 50));
        panel1.setLayout(new BorderLayout(0,0));
        //Se agregan los componentes
        panel1.add(panel_rojo1,BorderLayout.PAGE_START);
        panel1.add(panel_azul1,BorderLayout.PAGE_END);
        panel1.add(panel_blanco1,BorderLayout.CENTER);
        panel1.add(panel_verde1,BorderLayout.LINE_START);
        panel1.add(panel_amarillo1,BorderLayout.LINE_END);
        //Se agrega el panel al panel principal
        panel_principal.add(panel1);
        
        
        //Panel 2 que va a tener un layout de BoxLayout
        Panel panel2 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco2 = new Panel();
                                                                    panel_blanco2.setBackground(Color.white);
                                                                    panel_blanco2.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_azul2 = new Panel();
                                                                    panel_azul2.setBackground(Color.blue);
                                                                    panel_azul2.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_amarillo2 = new Panel();
                                                                    panel_amarillo2.setBackground(Color.yellow);
                                                                    panel_amarillo2.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_rojo2 = new Panel();
                                                                    panel_rojo2.setBackground(Color.RED);
                                                                    panel_rojo2.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_verde2 = new Panel();
                                                                    panel_verde2.setBackground(Color.GREEN);
                                                                    panel_verde2.setPreferredSize(new Dimension(50, 50));
        //Se le implemente el BoxLayout
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
        //Glue permite que hayan espacios fantasmas entre dos elementos de corrido
        panel2.add(panel_rojo2);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(panel_blanco2);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(panel_azul2);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(panel_verde2);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(panel_amarillo2);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(panel_blanco2);
        panel_principal.add(panel2);
        
        
        //Panel 3 que va a tener un layout de CardLayout
        Panel panel3 = new Panel();
        panel3.setLayout(new BorderLayout());
        Panel cardPanel = new Panel();
        Panel controlPanel = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco3 = new Panel();
                                                                    panel_blanco3.setBackground(Color.white);
                                                                    panel_blanco3.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_azul3 = new Panel();
                                                                    panel_azul3.setBackground(Color.blue);
                                                                    panel_azul3.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_amarillo3 = new Panel();
                                                                    panel_amarillo3.setBackground(Color.yellow);
                                                                    panel_amarillo3.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_rojo3 = new Panel();
                                                                    panel_rojo3.setBackground(Color.RED);
                                                                    panel_rojo3.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_verde3 = new Panel();
                                                                    panel_verde3.setBackground(Color.GREEN);
                                                                    panel_verde3.setPreferredSize(new Dimension(50, 50));
        //Se crea un panel secundario el cual va a contener las cartas
        CardLayout cardLayout= new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(panel_rojo3);
        cardPanel.add(panel_azul3);
        cardPanel.add(panel_blanco3);
        cardPanel.add(panel_amarillo3);
        cardPanel.add(panel_verde3);
        // Los botones de navegación
        JButton prevButton = new JButton("Anterior");
        JButton nextButton = new JButton("Siguiente");
        // Agregar action listeners para los botones
        prevButton.addActionListener((ActionEvent e) -> {
            cardLayout.previous(cardPanel);
        });
        nextButton.addActionListener((ActionEvent e) -> {
            cardLayout.next(cardPanel);
        });
        controlPanel.add(prevButton);
        controlPanel.add(nextButton);
        panel3.add(cardPanel, BorderLayout.CENTER);
        panel3.add(controlPanel, BorderLayout.SOUTH);
        panel_principal.add(panel3);
       
        
        //Panel 4 que va a tener un layout de FlowLayout
        Panel panel4 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco4 = new Panel();
                                                                    panel_blanco4.setBackground(Color.white);
                                                                    panel_blanco4.setPreferredSize(new Dimension(100, 100));
                                                                    Panel panel_azul4 = new Panel();
                                                                    panel_azul4.setBackground(Color.blue);
                                                                    panel_azul4.setPreferredSize(new Dimension(100, 100));
                                                                    Panel panel_amarillo4 = new Panel();
                                                                    panel_amarillo4.setBackground(Color.yellow);
                                                                    panel_amarillo4.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_rojo4 = new Panel();
                                                                    panel_rojo4.setBackground(Color.RED);
                                                                    panel_rojo4.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_verde4 = new Panel();
                                                                    panel_verde4.setBackground(Color.GREEN);
                                                                    panel_verde4.setPreferredSize(new Dimension(50, 50));
        //Se le agrega el Layout de Flow Layout al panel
        panel4.setLayout(new FlowLayout());
        panel4.add(panel_verde4);
        panel4.add(panel_amarillo4);
        panel4.add(panel_blanco4);
        panel4.add(panel_azul4);
        panel4.add(panel_rojo4);
        panel_principal.add(panel4);
        
        
        //Panel 7 que va a tener Layout Nulo, que pordefecto es el FlowLayout
        Panel panel7 = new Panel();
        panel7.setLayout(null);
        panel_principal.add(panel7); 
       
        
        //Panel 6 que va a tener un layout de GroupLayout
        Panel panel6 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco6 = new Panel();
                                                                    panel_blanco6.setBackground(Color.white);
                                                                    panel_blanco6.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_azul6 = new Panel();
                                                                    panel_azul6.setBackground(Color.blue);
                                                                    panel_azul6.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_amarillo6 = new Panel();
                                                                    panel_amarillo6.setBackground(Color.yellow);
                                                                    panel_amarillo6.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_rojo6 = new Panel();
                                                                    panel_rojo6.setBackground(Color.RED);
                                                                    panel_rojo6.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_verde6 = new Panel();
                                                                    panel_verde6.setBackground(Color.GREEN);
                                                                    panel_verde6.setPreferredSize(new Dimension(50, 50));
        //Se implmenta el layout
        GroupLayout grupoLayout = new GroupLayout(panel6);
        panel6.setLayout(grupoLayout);
        grupoLayout.setAutoCreateGaps(true);
        grupoLayout.setAutoCreateContainerGaps(true);
        //Se crea el grupo horizontal
        grupoLayout.setHorizontalGroup(
   grupoLayout.createSequentialGroup()
        .addComponent(panel_verde6)
        .addComponent(panel_blanco6)
           //grupo paralelo al anterior
        .addGroup(grupoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addComponent(panel_amarillo6)
           .addComponent(panel_azul6)
        .addComponent(panel_rojo6))
        );
        //Se crea grupo vertical
        grupoLayout.setVerticalGroup(
   grupoLayout.createSequentialGroup()
      .addGroup(grupoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(panel_verde6)
           .addComponent(panel_blanco6)
           .addComponent(panel_amarillo6))
           .addComponent(panel_azul6)
           .addComponent(panel_rojo6)
);
        panel_principal.add(panel6);
        

        //Panel 5 que va a tener un GridBagLayout
        Panel panel5 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco5 = new Panel();
                                                                    panel_blanco5.setBackground(Color.white);
                                                                    panel_blanco5.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_azul5 = new Panel();
                                                                    panel_azul5.setBackground(Color.blue);
                                                                    panel_azul5.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_amarillo5 = new Panel();
                                                                    panel_amarillo5.setBackground(Color.yellow);
                                                                    panel_amarillo5.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_rojo5 = new Panel();
                                                                    panel_rojo5.setBackground(Color.RED);
                                                                    panel_rojo5.setPreferredSize(new Dimension(50, 50));
                                                                    Panel panel_verde5 = new Panel();
                                                                    panel_verde5.setBackground(Color.GREEN);
                                                                    panel_verde5.setPreferredSize(new Dimension(50, 50));
        //Se le implementa al panel el GridBagLayout
        panel5.setLayout(new GridBagLayout());
        //Se crea una instancia c la cual es la que a va a tener todos los parametros de los diferentes componentes
        GridBagConstraints c = new GridBagConstraints();
        //Hace que el componente llene de manera horizontal el espacio que haya
        c.fill = GridBagConstraints.HORIZONTAL;
        //Especifica laimportancia del espacio de dicho componente, entremas grand mas prioridad tiene
        c.weightx = 0.5;
        //Elemento 1
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel5.add(panel_rojo5, c);
        //Elemento 2
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        panel5.add(panel_azul5, c);
        //Elemento 3
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        panel5.add(panel_verde5, c);
        //Elemento 4
        c.fill = GridBagConstraints.HORIZONTAL;
        // Es el padding del elemento
        c.ipady = 40;      
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        panel5.add(panel_blanco5, c);
        //Elemento 5
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       
        c.weighty = 1.0;   
        c.anchor = GridBagConstraints.PAGE_END; 
        //El padding externo al componente
        c.insets = new Insets(5,0,0,0);  
        c.gridx = 1;       
        c.gridwidth = 2;   
        c.gridy = 2;       
        panel5.add(panel_amarillo5, c);
        panel_principal.add(panel5);
        
        
        //Panel 8 que va a tener un layout de SpringLayout
        Panel panel8 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco8 = new Panel();
                                                                    panel_blanco8.setBackground(Color.white);
                                                                    panel_blanco8.setMaximumSize(new Dimension(200, 200));
                                                                    Panel panel_azul8 = new Panel();
                                                                    panel_azul8.setBackground(Color.blue);
                                                                    panel_azul8.setMaximumSize(new Dimension(200, 200));
                                                                    Panel panel_amarillo8 = new Panel();
                                                                    panel_amarillo8.setBackground(Color.yellow);
                                                                    panel_amarillo8.setMaximumSize(new Dimension(200, 200));
                                                                    Panel panel_rojo8 = new Panel();
                                                                    panel_rojo8.setBackground(Color.RED);
                                                                    panel_rojo8.setMaximumSize(new Dimension(200, 200));
                                                                    Panel panel_verde8 = new Panel();
                                                                    panel_verde8.setBackground(Color.GREEN);
                                                                    panel_verde8.setMaximumSize(new Dimension(200, 200));
       //Se le implementa el layout
       SpringLayout springLayout = new SpringLayout();
       panel8.setLayout(springLayout);
       panel8.add(panel_amarillo8);
       panel8.add(panel_rojo8);
       panel8.add(panel_blanco8);
       panel8.add(panel_azul8);
       panel8.add(panel_verde8);
       //A cada elemento se le implementan los limites usando el springLayout
       springLayout.putConstraint(SpringLayout.WEST, panel_amarillo8, 105, SpringLayout.WEST,panel8);              
       springLayout.putConstraint(SpringLayout.NORTH, panel_amarillo8,100, SpringLayout.NORTH, panel8); 
       
       springLayout.putConstraint(SpringLayout.WEST, panel_rojo8,50, SpringLayout.WEST, panel8); 
       springLayout.putConstraint(SpringLayout.WEST, panel_rojo8,50, SpringLayout.WEST, panel_amarillo8);
                   
       springLayout.putConstraint(SpringLayout.WEST, panel_blanco8,75, SpringLayout.WEST, panel8);               
       springLayout.putConstraint(SpringLayout.NORTH, panel_blanco8,10, SpringLayout.SOUTH, panel_rojo8); 
  
       springLayout.putConstraint(SpringLayout.WEST, panel_azul8,15, SpringLayout.EAST, panel_amarillo8);                          
       springLayout.putConstraint(SpringLayout.NORTH, panel_azul8,10, SpringLayout.NORTH, panel8);
       
       panel_principal.add(panel8);
        
        
        //Panel 9 que va a tener un layout de OverLayLayout
        Panel panel9 = new Panel();
                                                                    //Se crean los componenetes que van a estar dentro de los diferentes paneles
                                                                    Panel panel_blanco9 = new Panel();
                                                                    panel_blanco9.setBackground(Color.WHITE);
                                                                    panel_blanco9.setMaximumSize(new Dimension(100,100));
                                                                    Panel panel_azul9 = new Panel();
                                                                    panel_azul9.setBackground(Color.BLUE);
                                                                    panel_azul9.setMaximumSize(new Dimension(120,120));
                                                                    Panel panel_amarillo9 = new Panel();
                                                                    panel_amarillo9.setBackground(Color.YELLOW);
                                                                    panel_amarillo9.setMaximumSize(new Dimension(140,140));
                                                                    Panel panel_rojo9 = new Panel();
                                                                    panel_rojo9.setBackground(Color.RED);
                                                                    panel_rojo9.setMaximumSize(new Dimension(160,160));
                                                                    Panel panel_verde9 = new Panel();
                                                                    panel_verde9.setBackground(Color.GREEN);
                                                                    panel_verde9.setMaximumSize(new Dimension(180,180));
        //Se le agrega el layout deseado
        panel9.setLayout(new OverlayLayout(panel9));
        //El primer elemento de todos el es que se muestro de primeras
        panel9.add(panel_blanco9);
        panel9.add(panel_azul9);
        panel9.add(panel_amarillo9);
        panel9.add(panel_rojo9);
        panel9.add(panel_verde9); 
        panel_principal.add(panel9);
    }
    
}
