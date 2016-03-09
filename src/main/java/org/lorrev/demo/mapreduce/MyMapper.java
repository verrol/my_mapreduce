package org.lorrev.demo.mapreduce;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MyMapper extends Mapper<Text, Text, Text, LongWritable> {

  Logger logger = LoggerFactory.getLogger(MyMapper.class);

  @Override
  protected void setup(Context context) {
  }
  
  @Override
  protected void map(Text word, Text count, Context context) throws IOException, InterruptedException {
    logger.debug("Processing text {} - {}", word, count);
    LongWritable val = new LongWritable();
    val.set(1);
    context.write(word, val);
  }

}
