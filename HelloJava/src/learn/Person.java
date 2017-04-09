package learn;

/**
 * Created by s on 17/3/31.
 */
public class Person {
    private  Name name;
    private Sex sex;
    public  Person(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
    public static void main(String[] args) {
        Name n = new Name("悟空","孙");
        Person p = new Person(n);
        Sex s = new Sex("man","woman");
        Person x = new Person(s);
        System.out.println(x.getSex().getSex1() + x.getSex().getSex2());
        System.out.println(p.getName().getLastname()+p.getName().getFirstname());
        System.out.println(p.getName().getLastname());

    }


    static class Name {
        private String firstname;
        private String lastname;

        public Name() {


        }
        public Name(String firstname,String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }
    }


    static class Sex {
        private String sex1;
        private String sex2;
        public Sex() {}
        public Sex(String sex1,String sex2) {
            this.sex1 = sex1;
            this.sex2 = sex2;
        }

        public void setSex1(String sex1) {
            this.sex1 = sex1;
        }

        public void setSex2(String sex2) {
            this.sex2 = sex2;
        }

        public String getSex1() {

            return sex1;
        }

        public String getSex2() {
            return sex2;
        }
    }
}