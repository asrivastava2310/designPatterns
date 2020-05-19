package designpatterns.behavorial.strategy;

import java.util.Arrays;
import java.util.List;

public class DynamicStrategyDemo {

	public static void main(String[] args) {
		TextProcessorDynamicStrategy tp = new TextProcessorDynamicStrategy(OutputFormat.MARKDOWN);
		tp.appendList(Arrays.asList("Apple","Orange","Banana"));
		System.out.println(tp);
		
		tp.clear();
		
		tp = new TextProcessorDynamicStrategy(OutputFormat.HTML);
		tp.appendList(Arrays.asList("Apple","Orange","Banana"));
		System.out.println(tp);
	}

}

class TextProcessorDynamicStrategy {

	private ListStrategy listStrategy;
	private StringBuilder sb = new StringBuilder();

	public TextProcessorDynamicStrategy(OutputFormat format) {
		setListStrategy(format);
	}

	private void setListStrategy(OutputFormat format) {
		switch (format) {
		case MARKDOWN:
			listStrategy = new MarkDownListStrategy();
			break;
		case HTML:
			listStrategy = new HtmlListStrategy();
			break;
		}
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
