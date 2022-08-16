public class nearestXY {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int cx,cy;
         int distance=Integer.MAX_VALUE;
         int index=Integer.MAX_VALUE;
         for(int i=0;i<points.length;i++){
             cx=points[i][0];
             cy=points[i][1];
             if(cx==x || cy==y){
                 int dist = Math.abs(cx-x)+Math.abs(y-cy);
                 if(dist<distance){
                    index=i;
                 }
                distance= Math.min(dist,distance);
             }
         }
         if(index==Integer.MAX_VALUE){
             return -1;
         }
             return index;
         }

         public static void main(String[] args) {
            nearestXY nxy = new nearestXY();
            int[][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
            int value =nxy.nearestValidPoint(3, 4, points);
            System.out.println(value);
         }
    
}
