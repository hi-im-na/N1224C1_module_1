package utils;

import java.util.Scanner;

public class InputCommon implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);
    
    public String checkInputString() {
        String result = "";
        while (true) {
            result = sc.nextLine();
            if (result == null || result.trim().isEmpty()) {
                System.err.print("Can not be blank. Please enter again: ");
            } else {
                return result;
            }
        }
    }

    /**
     * Check input integer
     *
     * @return an integer
     */
    public int checkInputInt() {
        while (true) {
            try {
                return Integer.parseInt(checkInputString());
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid integer: ");
            }
        }
    }

    /**
     * Check input integer limit
     *
     * @param max maximum value
     * @return an integer in range [0, max]
     */
    public int checkInputInt(int max) {
        while (true) {
            try {
                int result = Integer.parseInt(checkInputString());
                if (result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid integer (0-" + max + "): ");
            }
        }
    }

    /**
     * Check input integer limit
     *
     * @param min minimum value
     * @param max maximum value
     * @return an integer in range [min, max]
     */
    public int checkInputInt(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(checkInputString());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid integer (" + min + "-" + max + "): ");
            }
        }
    }

    /**
     * Check input double
     *
     * @return a double
     */
    public double checkInputDouble() {
        while (true) {
            try {
                return Double.parseDouble(checkInputString());
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid double: ");
            }
        }
    }

    /**
     * Check input double limit
     *
     * @param max maximum value
     * @return a double in range [0, max]
     */
    public double checkInputDouble(double max) {
        while (true) {
            try {
                double result = Double.parseDouble(checkInputString());
                if (result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid double (0-" + max + "): ");
            }
        }
    }

    /**
     * Check input double limit
     *
     * @param min minimum value
     * @param max maximum value
     * @return a double in range [min, max]
     */
    public double checkInputDouble(double min, double max) {
        while (true) {
            try {
                double result = Double.parseDouble(checkInputString());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid double (" + min + "-" + max + "): ");
            }
        }
    }

    @Override
    public void close() {
        try {
            sc.close();
        } catch (Exception e) {
            System.err.println("Error close InputValidate: " + e.getMessage());
        }
    }
}
