package com.company;

public class ClassA {


    private String name;
    private  int lives;
    private  int level;
    private  int score;



    public ClassA(String name, int lives, int level, int score) {
        this.name = name;
        this.lives = lives;
        this.level = level;
        this.score = score;
    }

//    public ClassA(){
//        Play();
//     this.level="kjl"
//    }
//




    @Override
    public String toString() {
        return "ClassA{" +
                "name='" + name + '\'' +
                ", lives=" + lives +
                ", level=" + level +
                ", score=" + score +
                '}';
    }

    public void Play() {
        name = "chaim";
        lives +=1;
        level += 1;
        score += 1;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }



    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}



