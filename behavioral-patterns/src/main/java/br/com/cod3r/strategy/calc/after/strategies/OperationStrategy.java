package br.com.cod3r.strategy.calc.after.strategies;

@FunctionalInterface
public interface OperationStrategy {

    int calculate(int num1, int num2);
}
