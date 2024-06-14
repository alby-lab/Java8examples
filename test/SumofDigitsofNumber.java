package com.demo.test;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumofDigitsofNumber {

	public static void main(String[] args) {
		
		System.out.println(getSumOfDigits(79));
	}
	public static long getSumOfDigits(int number)
    {
		
		int resultant=(int) (( number%9+1)*Math.pow(10, (number/9)-1));
		System.out.println(resultant);
	Optional<String> result=	Stream.iterate(String.valueOf(number), n->String.valueOf(n.codePoints().map(Character::getNumericValue).sum())).findFirst();
		System.out.println(result.get());
        return Stream.of(String.valueOf(number).split(""))
                .collect(Collectors.summarizingInt(Integer::parseInt))
                .getSum();
    }
}
