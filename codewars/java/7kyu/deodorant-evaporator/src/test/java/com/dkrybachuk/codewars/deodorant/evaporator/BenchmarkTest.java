/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.deodorant.evaporator;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 *
 * @author dk
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class BenchmarkTest {

    @Test
    public void launchBenchmark() throws Exception {
        Options opt = new OptionsBuilder()
                .include(this.getClass().getName() + ".*")
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public int evaporatorLoopBenchmark() {
        return Evaporator.evaporator(10, 10, 10);
    }

    @Benchmark
    public int evaporatorLnBenchmark() {
        return Evaporator.evaporatorLn(10, 10, 10);
    }
}
