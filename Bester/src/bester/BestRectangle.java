package bester;


public class BestRectangle implements Best<Rectangle> {
    @Override
    public Rectangle findTheBest(Rectangle... rectangleList) {
        if (rectangleList.length == 0) {
            return null;
        }
        Rectangle rectangle = rectangleList[0];
        for (Rectangle rectangleItem : rectangleList) {
            if (rectangleItem.isBetterThan(rectangle)) {
                rectangle = rectangleItem;
            }
        }
        return rectangle;
    }
}
