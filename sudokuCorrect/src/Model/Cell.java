package Model;

public class Cell {

    public static void main(String[] args) {
        Cell test = new Cell();
        test.SetValue('e');
        System.out.println(test.getValue());
        test.ClearCell();

        System.out.println(test.isEmpty());
        System.out.println(test.SetValue('i'));
        System.out.println(test.getValue());
        test.Lock();
        System.out.println(test.isLock());
        System.out.println(test.isEmpty());
        test.ClearCell();
        System.out.println(test.isEmpty());

    }

    private char value = SudokuModel.EMPTY;

    private boolean lock = false;

    public char getValue(){
        return value;
    }

    public boolean SetValue (char value){
        if (lock == false){
            this.value = value;
            return true;
        }else{
            return false;
        }
    }

    public boolean ClearCell (){
        boolean modif = false;
        if(value != SudokuModel.EMPTY && lock == false){
            SetValue((char) SudokuModel.EMPTY);
            modif =true;
        }
        return modif;
    }

    public void Lock (){
        if(!isEmpty()){
            this.lock = true;
        }
    }

    public boolean isLock(){
        return lock;
    }

    public boolean isEmpty(){
        return value == SudokuModel.EMPTY;
    }
}
