package vieropeenrij;

import vieropeenrij.VierOpEenRij.FILL;

class loserStrategy implements VorStrategy{
    public loserStrategy(){

    }

    public int doMove(VorMatrix vMatrix) {
        int column = 0;
       do{
            column = (int)(10 * Math.random()) % VierOpEenRij.COLS;
       }while(vMatrix.getFill(column,VierOpEenRij.ROWS-1) != FILL.EMPTY);
       return column;
    }

    private void getRow(VorMatrix vMatrix, int colomn){
        int row;
        int i = 1;
        while(vMatrix.getFill(colomn, VierOpEenRij.ROWS - i) != FILL.EMPTY){
            i += 1;
        }
        row = VierOpEenRij.ROWS - i;
    }

    private boolean checkVOR(int colomn, int row, VorMatrix vMatrix){
        
    }

    private boolean checkRows(int colomn, int row, VorMatrix vMatrix){
        
        if(vMatrix.getFill(colomn, row) == vMatrix.getFill(colomn, row) == vMatrix.getFill(colomn, row)){
            
        }
    } 
}