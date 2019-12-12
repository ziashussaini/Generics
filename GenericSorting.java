package project1;
/**
 *
 * @author Zia
 */
public class GenericSorting<T extends Comparable<T>>{
    //Variable
    private T[][] grid;
    
    //Constructor
    public GenericSorting(T[][] grid)
    {
        this.grid = grid;
        
    }
    //Getter
    public T[][] getGrid(){
        return grid;
    }
    
    //Setter
    public void setGrid(T[][] newGrid)
    {
        this.grid = newGrid;
    }
    
    public void sort()
    {
        int row, col = 0;
        for(row = 0; row < grid.length; row++)
                {
                    for(col = 0; col < grid[row].length; col++)
                    {
                        for(int v = 0; v < grid.length; v++)
                        {
                            
                                for(int u = 0; u < grid[row].length; u++)
                                { 
                                    if(grid[row][col].compareTo(grid[v][u]) < 0)
                                    {
                                        T temp = grid[row][col];
                                        grid[row][col] = grid[v][u];
                                        grid[v][u] = temp;
                                    }       
                                }
                        
                        }
                  
                    } 
                    
                }
                
                for(int r = 1; r < grid.length; r +=2)
                {
                    for(int c = 0; c < grid[r].length/2; c++)
                    {
                        T temp = grid[r][c];
                        grid[r][c] = grid[r][grid[r].length-1 - c];
                        grid[r][grid[r].length-1 - c] = temp;
                    }
                }
    }
    public void print2DArray()
    {   
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
    @Override
    public int compareTo(GenericSorting gs)
    {
        int result;
        T x = grid[row][col];
        
        if(grid[row][col] > grid[v][u])
        {
            result = 1;
        }
        return result;
    }*/
}
