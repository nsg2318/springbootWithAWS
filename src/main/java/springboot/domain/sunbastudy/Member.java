package springboot.domain.sunbastudy;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Member {
    private String name; //필수
    private int age;     //필수
    private String sex;  //필수
    private int weight;  //선택
    private int height;  //선택

    @Builder
    public Member(String name, int age, String sex, int weight, int height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }
    //    public Member(Builder builder) {
//        this.name = builder.name;
//        this.age = builder.age;
//        this.sex = builder.sex;
//        this.weight = builder.weight;
//        this.height = builder.height;
//    }
//
//    public static class Builder{
//        private String name;
//        private int age;
//        private String sex;
//
//        private int weight;
//        private int height;
//
//        public Builder(String name, int age, String sex) {
//            this.name = name;
//            this.age = age;
//            this.sex = sex;
//        }
//
//        public Builder setWeight(int weight) {
//            this.weight = weight;
//            return this;
//        }
//        public Builder setHeight(int height){
//            this.height = height;
//            return this;
//        }
//
//        public Member build(){
//            return new Member(this);
//        }

}
//    @Builder
//    public Member(String name, int age, String sex, int weight, int height) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.weight = weight;
//        this.height = height;
//    }

