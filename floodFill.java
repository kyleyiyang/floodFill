class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor=image[sr][sc];
        if (oldColor!=newColor){
        image[sr][sc]=newColor;
        reColoring(image,oldColor,newColor,sr, sc);
        }
        return image;
    }
    public static void reColoring(int[][] img, int oldColor, int newColor, int sr, int sc) {
        if (sr>=0 && sr<img.length) {
            if ((sc-1)>=0 && (sc-1)<img[0].length &&  img[sr][sc-1]==oldColor) {
                img[sr][sc-1]=newColor;
                reColoring(img,oldColor,newColor,sr,(sc-1));
            }
            if ((sc+1)<img[0].length && (sc+1)>=0 && img[sr][sc+1]==oldColor) {
                img[sr][sc+1]=newColor;                                     reColoring(img,oldColor,newColor,sr,(sc+1));
            }
        }
        if (sc>=0 && sc<img[0].length) {
            if ((sr-1)>=0 && (sr-1)<img.length && img[sr-1][sc]==oldColor) {
                img[sr-1][sc]=newColor;
                reColoring(img,oldColor,newColor,(sr-1),sc);
            }
            if ((sr+1)<img.length && (sr+1)>=0 && img[sr+1][sc]==oldColor) {
                img[sr+1][sc]=newColor;
                reColoring(img,oldColor,newColor,(sr+1),sc);
            }
        }
        /*if (sr>=0 && sr<img.length && sc>=0 && sc<img[0].length) {
            reColoring(img,oldColor,newColor,(sr-1),sc);
            reColoring(img,oldColor,newColor,(sr+1),sc);
            reColoring(img,oldColor,newColor,sr,(sc-1));
            reColoring(img,oldColor,newColor,sr,(sc+1));
        }*/
    }
}
