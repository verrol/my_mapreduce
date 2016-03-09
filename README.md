# my_mapreduce
Simple MapReduce job example with some Guava code.

## Checkout:
git clone http://github.mtv.cloudera.com/verrol/my_mapreduce

## Build:
mvn clean assembly:assembly

Run:
hadoop jar my-mapreduce-job.1.0.0.jar com.demo.mapreduce <input_file> <ouput_dir>
