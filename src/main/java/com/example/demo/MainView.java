package com.example.demo;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Grid<String> grid = new Grid<>();
        grid.addColumn(v -> v ).setPartNameGenerator(v -> v.startsWith("A") ? "mycustompart": null);
        grid.setItems("AAAAAAAA", "BBBBBBBB", "CCCCCCCc", "Aaasdasda");
        add(grid);
    }
}
