package org.launchcode.models.form;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

/**
 * Created by Rup on 4/12/2017.
 */
public class AddMenuItemForm {
    @NotNull
    private int menuId;
    @NotNull
    private int cheeseId;
    private Iterable<Cheese> cheeses;
    private Menu menu;

    public AddMenuItemForm(){}

    public int getMenuId() {
        return menuId;
    }
    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.cheeses=cheeses;
        this.menu=menu;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


}