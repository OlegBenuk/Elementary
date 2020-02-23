package jav.Task_9;


class CheckArgs {
    private String[] args;
    private String exception;

    private double number;
    private int exponent;

    String getException() {
        return exception;
    }

    private boolean flag = true;
    CheckArgs(String[] args) {
        this.args = args;
        if (checkArgsNumber()) {
            checkInt();
        }

    }

    boolean isFlag() {
        return flag;
    }

    private boolean checkArgsNumber() {
        if(args.length!=2){
            flag = false;
            exception = "Illegal arguments Exception";
        }
        return flag;
    }

    private void checkInt() {
        try{
            number = Double.parseDouble(args[0]);
            exponent = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e){
            flag = false;
            exception = "Values must be int";
        }
    }



}

