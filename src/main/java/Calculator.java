class Calculator {
    int firstNum;
    int secondNum;

    Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    double add() {
        return firstNum + secondNum;
    }

    double sub() {
        return firstNum - secondNum;
    }

    double mul() {
        return firstNum * secondNum;
    }

    double div() {
        return firstNum / secondNum;
    }

}