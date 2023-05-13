package aggregators;

import java.util.ArrayList;
import java.util.List;

public abstract class Aggregator {
	
	List<Double> numbers;
	
	public Aggregator(){
		numbers = new ArrayList<Double>();
	}
	
	public Aggregator(List<Double> numbers){
		numbers = new ArrayList<Double>(numbers);
	}
	
	/**
	 * add data to the given collection
	 * 
	 */
	public void add(double number) {
		numbers.add(number);
	}
	/**
	 * Any class that is a derivative of the abstract class
	 * Aggregator must implement the calculate method.
	 * @return double
	 */
	public abstract double calculate();
	
	public abstract List<Double> getValues();
	
}

//*************************************MaxAggregator class*************************************************

public class MaxAggregator extends Aggregator{
	
	public MaxAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>();
	}

	@Override
	public double calculate() {
		double max = numbers.get(0);
		for(Double number : numbers){
			if(number > max){
				max = number;
			}
		}
		return max;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
	
}

//*************************************MeanAggregator class*************************************************

public class MeanAggregator extends Aggregator{
	
	public double calculate() {
		double result = 0;
		if(!numbers.isEmpty()){
			double value = 0.00;
			for(Double number : numbers){
				value+=number;
			}
			result = value/numbers.size();
		}
		return result;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}

//****************************************MinAggregator***************************************
public class MinAggregator extends Aggregator{

	public MinAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>(numbers);
	}

	@Override
	public double calculate() {
		double min = numbers.get(0);
		for(Double number : numbers){
			if(number < min){
				min = number;
			}
		}
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}



