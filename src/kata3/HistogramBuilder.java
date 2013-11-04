package kata3;

import java.util.List;

public class HistogramBuilder<T> {
    public Histogram<T> histogram;

    public HistogramBuilder() {
        this.histogram = new Histogram<>();
    }

    public Histogram<T> getHistogram() {
        return histogram;
    }
    
    public void ubicate (T[] data){
        for(T item : data){
            histogram.put(item, getCount(item) + 1);
        }
    }
    
    public void ubicate (List<T> data){
        for(T item : data){
            histogram.put(item, getCount(item) + 1);
        }
    }
    
    public int getCount(T item){
        if(histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }
}
