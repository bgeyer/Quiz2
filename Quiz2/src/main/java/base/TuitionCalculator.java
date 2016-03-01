package base;
import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class TuitionCalculator {
	public void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double initTuition;
		double percentInc;
		double repayAPR;
		double pmt;
		double fullTuition;
		int term;
		
		System.out.println("What is your tuition payment per semester?");
		initTuition=input.nextDouble();
		System.out.println("By what percent does tuition increase per year?");
		percentInc=input.nextDouble();
		System.out.println("What is your repayment APR?");
		repayAPR=input.nextDouble();
		System.out.println("In how many years will you pay off your loan?");
		term=input.nextInt();
		fullTuition = initTuition;
		
		for(int i=1; i<9; i++) {
			fullTuition = fullTuition * percentInc;
		}
	
		pmt = FinanceLib.pmt(repayAPR, term, fullTuition, 0.0, false);
	}
}