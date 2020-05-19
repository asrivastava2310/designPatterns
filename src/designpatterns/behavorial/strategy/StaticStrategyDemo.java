package designpatterns.behavorial.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StaticStrategyDemo {

	public static void main(String[] args) {
		TextProcessorStaticStrategy<MarkDownListStrategy> tp = new TextProcessorStaticStrategy<>(MarkDownListStrategy::new);
		tp.appendList(Arrays.asList("Alpha","Beta","Gamma"));
		System.out.println(tp);
		
		TextProcessorStaticStrategy<HtmlListStrategy> tp2 = new TextProcessorStaticStrategy<>(HtmlListStrategy::new);
		tp2.appendList(Arrays.asList("Alpha","Beta","Gamma"));
		System.out.println(tp2);
	}

}

class TextProcessorStaticStrategy<LS extends ListStrategy> {

	private LS listStrategy;
	private StringBuilder sb = new StringBuilder();

	public TextProcessorStaticStrategy(Supplier<? extends LS> ctor) {
		this.listStrategy = ctor.get();
	}

	public void appendList(List<String> items) {
		listStrategy.start(sb);
		for (String item : items) {
			listStrategy.addListItem(sb, item);
		}
		listStrategy.end(sb);
	}

	public void clear() {
		sb.setLength(0);
	}

	@Override
	public String toString() {
		return sb.toString();
	}

}