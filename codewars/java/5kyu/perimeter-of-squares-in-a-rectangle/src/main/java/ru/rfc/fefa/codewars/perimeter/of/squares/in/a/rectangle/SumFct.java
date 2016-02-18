/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.perimeter.of.squares.in.a.rectangle;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @url elgnatcer-a-ni-serauqs-fo-retemirep/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class SumFct {

    public static BigInteger perimeter(BigInteger n) {

        Supplier<BigInteger> fib = new Supplier() {
            private BigInteger previous = BigInteger.valueOf(0);
            private BigInteger current = BigInteger.valueOf(1);

            @Override
            public BigInteger get() {
                BigInteger nextValue = this.previous.add(this.current);
                this.previous = this.current;
                this.current = nextValue;
                return this.previous;
            }
        };

        BigInteger fibSum = Stream.generate(fib)
                .limit(n.intValue() + 1)
                .reduce(BigInteger.ZERO, BigInteger::add);
        
        return BigInteger.valueOf(4).multiply(fibSum);
    }
}
