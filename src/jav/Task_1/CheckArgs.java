package jav.Task_1;

class CheckArgs {
    private String[] args;
    private String exception;

    private int width;
    private int height;

    String getException() {
        return exception;
    }

    private boolean flag = true;
    CheckArgs(String[] args) {
        this.args = args;
         if (checkArgsNumber() && checkInt()) {
            checkMinus();
        }

    }

    boolean isFlag() {
        return flag;
    }

    private boolean checkArgsNumber() {
        if(args.length<2 ){
        flag = false;
        exception = "Illegal arguments Exception";
        }
        return flag;
    }

    private boolean checkInt() {
                try{

        width = Integer.parseInt(args[0]);
        height = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e){
        flag = false;
        exception = "First two values must be int";
                }
        return flag;
    }

    private void checkMinus() {
        if(width<0 || height<0){
            flag = false;
            exception = "First two values must be positive";
        }
    }


 /*   private void checkValidity() {
        if (width<0 || hight<0){
            System.out.println("You need to enter positive values");
            System.exit(0);
        }
    }*/
}
