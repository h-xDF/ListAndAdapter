package com.example.listandadapter.utils;

import com.example.listandadapter.model.Actor;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<Actor> generateActors() {
        List<Actor> actors = new ArrayList<>();
//        actors.add(new Actor("Alicia Vikander",
//                "https://upload.wikimedia.org/wikipedia/commons/9/97/Alicia_Vikander_2013.jpg",
//                true));
//        actors.add(new Actor("Amanda Seyfried",
//                "https://upload.wikimedia.org/wikipedia/commons/1/1b/Amanda_Seyfried_2019_by_Glenn_Francis.jpg",
//                false));
//        actors.add(new Actor("Anne Hathaway",
//                "https://upload.wikimedia.org/wikipedia/commons/b/bd/Anne_Hathaway_in_2017.png",
//                true));
//        actors.add(new Actor("Emma Stone",
//                "https://upload.wikimedia.org/wikipedia/commons/3/31/Emma_Stone_at_Maniac_UK_premiere_%28cropped%29.jpg",
//                true));

        actors.add(new Actor("Alicia Vikander", "https://image.ibb.co/nKNBrd/Alicia_Vikander.jpg", true));
        actors.add(new Actor("Amanda Seyfried", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg", false));
        actors.add(new Actor("Anne Hathaway", "https://image.ibb.co/euy6Py/Anne_Hathaway.jpg", true));
        actors.add(new Actor("Emma Stone", "https://image.ibb.co/dJY6Py/Emma_Stone.jpg", true));
        actors.add(new Actor("Keira Knightley", "https://image.ibb.co/cxX0jy/Keira_Knightley.jpg", false));
        actors.add(new Actor("George Clooney", "https://image.ibb.co/ce1t4y/George_Clooney.jpg", true));
        actors.add(new Actor("Lucy Liu", "https://image.ibb.co/dWurrd/Lucy_Liu.jpg", false));
        actors.add(new Actor("Matthew McConaughey", "https://image.ibb.co/e3JHWd/Matthew_Mc_Conaughey.jpg", true));
        actors.add(new Actor("Morgan Freeman", "https://image.ibb.co/h9GhxJ/Morgan_Freeman.jpg", true));
        actors.add(new Actor("Ryan Gosling", "https://image.ibb.co/buLLjy/Ryan_Gosling.jpg", false));
        actors.add(new Actor("Will Smith", "https://image.ibb.co/gxoUcJ/Will_Smith.jpg", false));
        actors.add(new Actor("Robert de Niro", "https://image.ibb.co/e6T6Py/Robert_de_Niro.jpg", true));
        actors.add(new Actor("Zoe Saldana", "https://image.ibb.co/i9WRPy/Zoe_Saldana.jpg", false));

        return actors;
    }
}
