public class mazerunner {
    public static String walk(int[][] maze, String[] directions) {
        int[] posiciones = PosEmpFin(maze);
        int[] pos_emp = new int[2], pos_fin = new int[2];
        pos_emp[0]=posiciones[0];
        pos_emp[1]=posiciones[1];
        pos_fin[0]=posiciones[2];
        pos_fin[1]=posiciones[3];

        int[] pos_act = {pos_emp[0], pos_emp[1]};
        for (int i=0; i<=directions.length-1; i++) {
            int[] mov = Mov(directions[i]);
            // se sale ?
            if ((pos_act[0]+mov[0]>maze.length-1 || pos_act[0]+mov[0]<0) || pos_act[1]+mov[1]>maze[0].length-1 || pos_act[1]+mov[1]<0) {
                return "Dead";
            }
            // nueva pos actual
            pos_act[0] += mov[0];
            pos_act[1] += mov[1];
            // ahora compruebo que no se choca con un obstáculo
            if (maze[pos_act[0]][pos_act[1]]==1) {
                return "Dead";
            } else if (maze[pos_act[0]][pos_act[1]]==3) {
                return "Finish";
            }

        }
        return "Lost";
    }

    public static int[] PosEmpFin(int[][] maze) {
        int[] r = new int[4]; // primeras 2 emp 2 finales final

        for (int i=0; i<=maze.length-1; i++) {
            for (int j=0; j<=maze[0].length-1; j++) {
                if (maze[i][j]==2) {
                    r[0]=i;
                    r[1]=j;
                    
                } else if (maze[i][j]==3) {
                    r[2]=i;
                    r[3]=j;
                }
            }
        }
        return r;
    }

    public static int[] Mov(String mov) {
        int[] arr_mov = {0, 0};
        switch (mov) {
            case "N":
                arr_mov[0]=-1;
                break;
            case "E":
                arr_mov[1]=1;
                break;
            case "S":
                arr_mov[0]=+1;
                break;
            case "W":
                arr_mov[1]=-1;
                break;
        }
        return arr_mov;
    }

    public static void main(String[] args) {
        int[][] maze = {
			{ 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 0, 3 },
			{ 1, 0, 1, 0, 1, 0, 1 },
			{ 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1 },
			{ 1, 2, 1, 0, 1, 0, 1 } };
        System.out.println(walk(maze, new String[] { "N", "N", "N", "W", "W" }));
    }
}
