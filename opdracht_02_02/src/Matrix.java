public class Matrix {

    private int[][] m_Array = new int[3][3];

    public void addNumb(int Row, int Collom, int numb){
        m_Array[Row][Collom] = numb;
    }

    public void printMatrix(){                   //prints the matrix
        for (int i = 0; i < 3 ; ++i){
            System.out.print("[ ");
            for (int j = 0; j < 3; ++j){
                System.out.print(m_Array[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }

    public int[][] getArray(){                      //getter
        return m_Array;
    }
    
    public Matrix addMatrix(Matrix secMatrix){          //add a matrix to the current one and return the result
        int[][] resultArray = new int[3][3];
        int[][] secArray = secMatrix.getArray();

        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                resultArray[i][j] = m_Array[i][j] + secArray[i][j];
            }
        }

        Matrix result = new Matrix(resultArray);
        return result;
    }

    public Matrix multiplyMatrix(Matrix secMatrix){
        int[][] resultArray = new int[3][3];
        int[][] secArray = secMatrix.getArray();
        int number = 0;
        for(int i = 0; i < 3 ; ++i){
            for(int j = 0; j < 3; ++j){
                for(int k = 0; k < 3; ++k){
                    number += m_Array[i][k] * secArray[k][j];
                }
                resultArray[i][j] = number;
                number = 0;
            }
        }
        Matrix resultMatrix = new Matrix(resultArray);
        return resultMatrix;
    }

    public void copyArray(int[][] Array){               //copy aray into matrix class
        
        if(Array.length == 3 && Array[0].length == 3){
            for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                m_Array[i][j] = Array[i][j];
            }
        } 
        } else {
            System.out.println("wrong matrix dimentions");
        }
    }

    public Matrix(int[][] init){                //constuctor
        copyArray(init);
    }

    public Matrix(Matrix init){                 //constructor
        copyArray(init.getArray());
    }
}
