package academy.learnprogramming;

public class PaintJob {

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketCount = (int) Math.ceil(area / areaPerBucket);

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <0) {
            return -1;
        }

        return getBucketCount(width * height, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        return getBucketCount(width, height, areaPerBucket, 0);
    }
}
