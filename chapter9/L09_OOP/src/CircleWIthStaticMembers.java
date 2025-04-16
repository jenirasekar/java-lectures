public class CircleWIthStaticMembers {
    double radius;

    static int numberOfObjects = 0;

    CircleWIthStaticMembers () {
        numberOfObjects++;
        radius = 1;
    }

    CircleWIthStaticMembers (double newRadius) {
        numberOfObjects++;
        this.radius = newRadius;
    }

    static int getNumberOfObjects () {
        return numberOfObjects;
    }

    double getArea () {
        return radius * radius * Math.PI;
    }
}
