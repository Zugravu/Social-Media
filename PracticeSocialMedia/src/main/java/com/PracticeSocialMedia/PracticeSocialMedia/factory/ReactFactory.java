package com.PracticeSocialMedia.PracticeSocialMedia.factory;

import com.PracticeSocialMedia.PracticeSocialMedia.model.*;

public class ReactFactory {

    public static React createReact(String name){
        switch(name){
            case "Like": return new LikeReact();
            case "Love": return new LoveReact();
            case "Laugh": return new LaughReact();
            case "Sad": return new SadReact();
            default: return null;
        }
    }
}
