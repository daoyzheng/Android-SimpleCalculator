package com.example.simpleapp;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // Numbers
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;

    // Operators
    private ImageButton btnAdd;
    private ImageButton btnSub;
    private ImageButton btnMultiply;
    private ImageButton btnDivide;
    private ImageButton btnEqual;
    private Button btnDot;
    private ImageButton btnDelete;
    private ImageButton btnPlusMinus;

    // TextViews
    private TextView resultDisplay;
    private TextView operationDisplay;

    // Clears
    private Button btnClearAll;
    private Button btnClearCurr;

    // Operator checks
    private enum Operation  {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }

    private boolean newOperation = true;
    private boolean isDecimal = false;
    private boolean addition = false;
    private boolean subtraction = false;
    private boolean multiplication = false;
    private boolean division = false;

    private boolean insert = false;
    DecimalFormat decimalFormat = new DecimalFormat("#.###############");
    private double total = 0;
    private Operation lastOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup View
        setupView();

        // Click Events for each number and display in TextView
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                if (insert) {
                    resultDisplay.setText("0.");
                    insert = false;
                    isDecimal = true;
                } else {
                    if(!isDecimal) {
                        resultDisplay.setText(resultDisplay.getText() + ".");
                        isDecimal = true;
                    }
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("0");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if(isDecimal)
                            resultDisplay.setText(curStr + "0");
                        else
                            resultDisplay.setText("0");
                    } else
                        resultDisplay.setText(curStr + "0");
                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("1");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "1");
                        else
                            resultDisplay.setText("1");
                    } else
                        resultDisplay.setText(curStr + "1");
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("2");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "2");
                        else
                            resultDisplay.setText("2");
                    } else
                        resultDisplay.setText(curStr + "2");
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble((curStr));
                if (insert) {
                    resultDisplay.setText("3");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "3");
                        else
                            resultDisplay.setText("3");
                    } else
                        resultDisplay.setText(curStr + "3");
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("4");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "4");
                        else
                            resultDisplay.setText("4");
                    } else
                        resultDisplay.setText(curStr + "4");
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("5");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "5");
                        else
                            resultDisplay.setText("5");
                    } else
                        resultDisplay.setText(curStr + "5");
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("6");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "6");
                        else
                            resultDisplay.setText("6");
                    } else
                        resultDisplay.setText(curStr + "6");
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("7");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "7");
                        else
                            resultDisplay.setText("7");
                    } else
                        resultDisplay.setText(curStr + "7");
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("8");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "8");
                        else
                            resultDisplay.setText("8");
                    } else
                        resultDisplay.setText(curStr + "8");
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!newOperation && (addition || subtraction || multiplication || division))
                    newOperation = true;

                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (insert) {
                    resultDisplay.setText("9");
                    insert = false;
                } else {
                    if (curNum == 0) {
                        if (isDecimal)
                            resultDisplay.setText(curStr + "9");
                        else
                            resultDisplay.setText("9");
                    } else
                        resultDisplay.setText(curStr + "9");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newOperation) {
                    addition = true;
                    subtraction = false;
                    multiplication = false;
                    division = false;

                    String opStr = operationDisplay.getText().toString();

                    // If this is the first operation in the equation
                    if (opStr.length() == 0) {
                        lastOperation = Operation.ADDITION;
                    }

                    String curStr = resultDisplay.getText().toString();
                    double curNum = Double.parseDouble(curStr);
                    // Finish the last Operation and get the total
                    if (lastOperation != Operation.ADDITION) {
                        switch(lastOperation) {
                            case SUBTRACTION:
                                total = total - curNum;
                                break;
                            case MULTIPLICATION:
                                total = total * curNum;
                                break;
                            case DIVISION:
                                total = total / curNum;
                                break;
                        }
                        resultDisplay.setText(decimalFormat.format(total));
                        operationDisplay.setText(operationDisplay.getText() + decimalFormat.format(curNum) + " + ");
                        lastOperation = Operation.ADDITION;
                    } else {
                        total = total + curNum;

                        if (operationDisplay.getText().length() == 0)
                            operationDisplay.setText(decimalFormat.format(curNum) + " + ");
                        else
                            operationDisplay.setText(opStr + decimalFormat.format(curNum) + " + ");

                        // Display intermediate total
                        resultDisplay.setText(decimalFormat.format(total));
                        lastOperation = Operation.ADDITION;
                    }

                    // Prepare for new number
                    // Reset operation
                    newOperation = false;
                    // Reset decimal to false
                    isDecimal = false;
                    // Reset insert
                    insert = true;
                } else {
                    // If it's a change of operation, e.g. from addition to division
                    // Get the operationDisplay
                    String opStr = operationDisplay.getText().toString();
                    // remove the last operation and change it to "+"
                    int lastIndex = opStr.length() - 1;
                    String newStr = opStr.substring(0, lastIndex - 1);
                    newStr = newStr + "+ ";
                    operationDisplay.setText(newStr);
                    resultDisplay.setText(decimalFormat.format(total));
                    lastOperation = Operation.ADDITION;
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newOperation) {
                    addition = false;
                    subtraction = true;
                    multiplication = false;
                    division = false;

                    // If this is the first operation in the equation
                    String opStr = operationDisplay.getText().toString();
                    if (opStr.length() == 0) {
                        lastOperation = Operation.SUBTRACTION;
                    }

                    String curStr = resultDisplay.getText().toString();
                    double curNum = Double.parseDouble(curStr);
                    // Finish the last operation
                    if (lastOperation != Operation.SUBTRACTION) {
                        switch (lastOperation) {
                            case ADDITION:
                                total = total + curNum;
                                break;
                            case MULTIPLICATION:
                                total = total * curNum;
                                break;
                            case DIVISION:
                                total = total / curNum;
                                break;
                        }
                        resultDisplay.setText(decimalFormat.format(total));
                        operationDisplay.setText(operationDisplay.getText() + decimalFormat.format(curNum) + " - ");
                        lastOperation = Operation.SUBTRACTION;
                    } else {
                        if (operationDisplay.getText().length() == 0)
                            total = curNum;
                        else
                            total = total - curNum;

                        if (operationDisplay.getText().length() == 0)
                            operationDisplay.setText(decimalFormat.format(curNum) + " - ");
                        else
                            operationDisplay.setText(opStr + decimalFormat.format(curNum) + " - ");

                        // Display intermediate total
                        resultDisplay.setText(decimalFormat.format(total));
                        lastOperation = Operation.SUBTRACTION;
                    }

                    // Prepare for new number
                    // Reset operation
                    newOperation = false;
                    // Reset decimal to false
                    isDecimal = false;
                    // Reset insert
                    insert = true;
                } else {
                    // If it's a change of operation, e.g. from addition to division
                    // Get the operationDisplay
                    String opStr = operationDisplay.getText().toString();
                    // remove the last operation and change it to "-"
                    int lastIndex = opStr.length() - 1;
                    String newStr = opStr.substring(0, lastIndex - 1);
                    newStr = newStr + "- ";
                    operationDisplay.setText(newStr);
                    resultDisplay.setText(decimalFormat.format(total));
                    lastOperation = Operation.SUBTRACTION;
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newOperation) {
                    addition = false;
                    subtraction = false;
                    multiplication = true;
                    division = false;

                    // If this is the first operation in the equation
                    String opStr = operationDisplay.getText().toString();
                    if (opStr.length() == 0) {
                        lastOperation = Operation.MULTIPLICATION;
                    }

                    String curStr = resultDisplay.getText().toString();
                    double curNum = Double.parseDouble(curStr);
                    // Finish the last operation
                    if (lastOperation != Operation.MULTIPLICATION) {
                        switch (lastOperation) {
                            case ADDITION:
                                total = total + curNum;
                                break;
                            case SUBTRACTION:
                                total = total - curNum;
                                break;
                            case DIVISION:
                                total = total / curNum;
                                break;
                        }
                        resultDisplay.setText(decimalFormat.format(total));
                        operationDisplay.setText(operationDisplay.getText() + decimalFormat.format(curNum) + " x ");
                        lastOperation = Operation.MULTIPLICATION;
                    } else {
                        if (operationDisplay.getText().length() == 0)
                            total = curNum;
                        else
                            total = total * curNum;

                        if (operationDisplay.getText().length() == 0)
                            operationDisplay.setText(decimalFormat.format(curNum) + " x ");
                        else
                            operationDisplay.setText(opStr + decimalFormat.format(curNum) + " x ");

                        // Display intermediate total
                        resultDisplay.setText(decimalFormat.format(total));
                        lastOperation = Operation.MULTIPLICATION;
                    }

                    // Prepare for new number
                    // Reset operation
                    newOperation = false;
                    // Reset decimal to false
                    isDecimal = false;
                    // Reset insert
                    insert = true;
                } else {
                    // If it's a change of operation, e.g. from addition to division
                    // Get the operationDisplay
                    String opStr = operationDisplay.getText().toString();
                    // remove the last operation and change it to "x"
                    int lastIndex = opStr.length() - 1;
                    String newStr = opStr.substring(0, lastIndex - 1);
                    newStr = newStr + "x ";
                    operationDisplay.setText(newStr);
                    resultDisplay.setText(decimalFormat.format(total));
                    lastOperation = Operation.MULTIPLICATION;
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newOperation) {
                    addition = false;
                    subtraction = false;
                    multiplication = false;
                    division = true;

                    // If this is the first operation in the equation
                    String opStr = operationDisplay.getText().toString();
                    if (opStr.length() == 0) {
                        lastOperation = Operation.DIVISION;
                    }

                    String curStr = resultDisplay.getText().toString();
                    double curNum = Double.parseDouble(curStr);
                    // Finish the last operation
                    if (lastOperation != Operation.DIVISION) {
                        switch (lastOperation) {
                            case ADDITION:
                                total = total + curNum;
                                break;
                            case SUBTRACTION:
                                total = total - curNum;
                                break;
                            case MULTIPLICATION:
                                total = total * curNum;
                                break;
                        }
                        resultDisplay.setText(decimalFormat.format(total));
                        operationDisplay.setText(operationDisplay.getText() + decimalFormat.format(curNum) + " ÷ ");
                        lastOperation = Operation.DIVISION;
                    } else {
                        if (operationDisplay.getText().length() == 0)
                            total = curNum;
                        else
                            total = total / curNum;

                        if (operationDisplay.getText().length() == 0)
                            operationDisplay.setText(decimalFormat.format(curNum) + " ÷ ");
                        else
                            operationDisplay.setText(opStr + decimalFormat.format(curNum) + " ÷ ");

                        // Display intermediate total
                        resultDisplay.setText(decimalFormat.format(total));
                        lastOperation = Operation.DIVISION;

                    }

                    // Prepare for new number
                    // Reset operation
                    newOperation = false;
                    // Reset decimal to false
                    isDecimal = false;
                    // Reset insert
                    insert = true;
                } else {
                    // If it's a change of operation, e.g. from addition to division
                    // Get the operationDisplay
                    String opStr = operationDisplay.getText().toString();
                    // remove the last operation and change it to "÷"
                    int lastIndex = opStr.length() - 1;
                    String newStr = opStr.substring(0, lastIndex - 1);
                    newStr = newStr + "÷ ";
                    operationDisplay.setText(newStr);
                    resultDisplay.setText(decimalFormat.format(total));
                    lastOperation = Operation.DIVISION;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);

                switch (lastOperation) {
                    case ADDITION:
                        total = total + curNum;
                        break;
                    case SUBTRACTION:
                        total = total - curNum;
                        break;
                    case MULTIPLICATION:
                        total = total * curNum;
                        break;
                    case DIVISION:
                        total = total / curNum;
                        break;
                }

                resultDisplay.setText(decimalFormat.format(total));

                // Reset
                operationDisplay.setText("");
                isDecimal = false;
                insert = true;
                total = 0;
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get current ResultDisplay string
                String curStr = resultDisplay.getText().toString();

                // If there is only one char in string
                if (curStr.length() == 1) {
                    resultDisplay.setText(String.valueOf(0));
                } else {
                    // Remove the last char in string
                    int lastIndex = curStr.length() - 1;
                    String newStr = curStr.substring(0,lastIndex);

                    // Set the newStr to ResultDisplay
                    resultDisplay.setText(newStr);
                }
            }
        });

        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get current ResultDisplay string
                String curStr = resultDisplay.getText().toString();

                // Check if string already has a negative sign
                if (curStr.charAt(0) == '-') {
                    // if true, remove the negative sign
                    String newStr = curStr.substring(1);

                    // Set the newStr to ResultDisplay
                    resultDisplay.setText(newStr);
                } else {
                    // add a negative sign
                    curStr = '-' + curStr;

                    // Set the newStr to ResultDisplay
                    resultDisplay.setText(curStr);
                }
            }
        });

        btnClearCurr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the current ResultDisplay
                resultDisplay.setText(String.valueOf(0));
                isDecimal = false;
            }
        });

        btnClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    private void reset() {
        resultDisplay.setText("0");
        operationDisplay.setText("");
        isDecimal = false;
        total = 0;
    }

    private void setupView() {
        // Numbers
        btnZero = findViewById(R.id.btn0);
        btnOne = findViewById(R.id.btn1);
        btnTwo = findViewById(R.id.btn2);
        btnThree = findViewById(R.id.btn3);
        btnFour = findViewById(R.id.btn4);
        btnFive = findViewById(R.id.btn5);
        btnSix = findViewById(R.id.btn6);
        btnSeven = findViewById(R.id.btn7);
        btnEight = findViewById(R.id.btn8);
        btnNine = findViewById(R.id.btn9);

        // Operators
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);
        btnDelete = findViewById(R.id.btnDelete);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);

        // TextViews
        resultDisplay = findViewById(R.id.text_display);
        operationDisplay = findViewById(R.id.operation_display);

        // Clears
        btnClearAll = findViewById(R.id.btnClearAll);
        btnClearCurr = findViewById(R.id.btnClearCurr);
    }
}
