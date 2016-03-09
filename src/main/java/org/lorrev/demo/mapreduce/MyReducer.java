package org.lorrev.demo.mapreduce;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MyReducer extends Reducer<Text, LongWritable, Text, LongWritable> {
    Logger logger = LoggerFactory.getLogger(MyReducer.class);

  @Override
  protected void setup(Context context) {

  }

  @Override
  protected void reduce(Text word, Iterable<LongWritable> counts, Context context) throws IOException, InterruptedException {
    logger.debug("In reducer and processing {}", word);

      int i = 0;
      for (LongWritable count : counts) {
          i++;
      }

      LongWritable val = new LongWritable();
      val.set(i);
      context.write(word, val);
  }

}
