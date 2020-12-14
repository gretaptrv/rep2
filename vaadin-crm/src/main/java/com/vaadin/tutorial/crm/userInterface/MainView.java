package com.vaadin.tutorial.crm.userInterface;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.crm.backend.entity.Administrator;


@Route("")
public class MainView extends VerticalLayout {
    //TEST COMPONENT

    public MainView() {
        TextField tf = new TextField("Username:");
        TextField tf1 = new TextField("Password:");
        TextField tf2 = new TextField("Email:");
        Button button = new Button("build");
        HorizontalLayout layout = new HorizontalLayout(tf, tf1, tf2, button);
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);



        button.addClickListener(click -> {
            //TODO: validate input data
            //TODO: exception handling
            Administrator administrator = new Administrator(tf.getValue(), tf1.getValue(), tf2.getValue());
            add(new Paragraph(administrator.getStatus() + " \n" + administrator.getUsername()
             + " " + administrator.getPassword() + " " + administrator.getEmail()));
        });

//        button.addClickListener(click -> {
//            if (tf.getValue().length() > 5) {
//                add(new Paragraph(tf.getValue() + " was born " + date.getValue()));
//            } else {
//                add(new Paragraph(tf.getValue() + " is an invalid name"));
//            }
//        });


    }

}
