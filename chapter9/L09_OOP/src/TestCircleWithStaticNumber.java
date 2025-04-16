public class TestCircleWithStaticNumber {
    public static void main(String[] args) {
        System.out.println("the number of circle objects: "
        + CircleWIthStaticMembers.numberOfObjects);

        CircleWIthStaticMembers c1 = new CircleWIthStaticMembers();

        System.out.println("after create c1, the number of object is "
        + CircleWIthStaticMembers.numberOfObjects);

        CircleWIthStaticMembers c2 = new CircleWIthStaticMembers(10);

        System.out.println("after create c2, the number of object is "
        + CircleWIthStaticMembers.getNumberOfObjects());
    }
}
