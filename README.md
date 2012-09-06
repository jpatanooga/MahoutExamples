MahoutExamples
==============

Examples of Mahout code based on CDH4's 0.6 version

- base example of 20 newsgroups for Mahout's SGD based on snippets of code from Mahout in Action, Ch. 14

Running SGD 20Newsgroups Example

- download the canonical dataset from: http://people.csail.mit.edu/jrennie/20Newsgroups/20news-bydate.tar.gz

- extract the dataset

- copy the location of the dataset to the unit test: com.cloudera.mahout.classification.sgd.TestTwentyNewsgroups

- run the unit test

- output should look roughly like:

11314 training files
         1     -2.996     -2.996       0.00 sci.space comp.graphics
         2     -3.163     -3.079       0.00 misc.forsale sci.space
         3     -3.119     -3.093       0.00 comp.sys.mac.hardware misc.forsale
         4     -3.202     -3.120       0.00 alt.atheism sci.space
         6     -3.465     -3.183       0.00 soc.religion.christian comp.graphics
         8     -3.329     -3.251       0.00 sci.med sci.electronics
        10     -3.803     -3.315       0.00 comp.windows.x sci.electronics
        12    -17.420     -5.224       0.00 soc.religion.christian comp.windows.x
        15     -3.985     -4.993       0.00 rec.motorcycles comp.windows.x
        20     -3.531     -5.892       0.00 sci.space soc.religion.christian
        25     -2.785     -6.474       0.00 comp.sys.mac.hardware sci.crypt
        30     -3.128     -6.196       3.33 rec.autos sci.space
        40     -3.755     -5.378      10.00 rec.sport.hockey comp.sys.mac.hardware
        50     -3.164     -4.982      12.00 talk.politics.misc comp.sys.mac.hardware
        60     -2.851     -4.564      15.00 rec.autos talk.politics.guns
        70     -2.780     -4.338      12.86 talk.politics.mideast sci.space
        80     -2.130     -4.176      12.50 comp.sys.mac.hardware talk.politics.misc
       100     -3.263     -3.916      13.00 comp.graphics sci.space
       120     -4.071     -3.629      17.50 sci.med talk.politics.misc
       140     -3.958     -3.487      19.29 talk.politics.misc rec.sport.baseball
       150     -2.085     -3.435      19.33 sci.crypt sci.crypt
       200     -2.701     -3.231      23.00 sci.space talk.politics.mideast
       250     -2.235     -3.049      25.49 comp.sys.mac.hardware comp.sys.mac.hardware
       300     -2.982     -2.872      29.03 comp.graphics comp.os.ms-windows.misc
       400     -1.783     -2.604      33.56 talk.politics.mideast talk.politics.guns
       500     -0.950     -2.312      40.97 comp.windows.x comp.windows.x
       600     -2.684     -2.310      46.75 sci.crypt comp.graphics
       700     -1.382     -2.231      43.70 rec.autos rec.autos
       800     -1.271     -2.098      46.67 rec.sport.hockey rec.sport.hockey
      1000     -1.594     -2.109      50.53 comp.sys.mac.hardware comp.sys.ibm.pc.hardware
      1200     -1.320     -1.871      58.82 misc.forsale misc.forsale
      1400     -1.947     -1.709      65.36 rec.sport.hockey rec.sport.baseball
      1500     -1.448     -1.634      68.65 sci.space sci.space
      2000     -1.147     -1.559      68.89 sci.electronics sci.electronics
      2500     -1.038     -1.522      72.72 rec.sport.baseball rec.sport.baseball
      3000     -0.369     -1.526      68.91 comp.os.ms-windows.misc comp.os.ms-windows.misc
      4000     -2.187     -1.286      76.56 sci.electronics rec.autos
      5000     -1.878     -1.321      76.82 talk.politics.misc talk.politics.misc
      6000     -2.372     -1.323      76.55 comp.graphics comp.graphics
      7000     -0.007     -1.371      76.98 rec.sport.hockey rec.sport.hockey
      8000     -1.032     -1.305      78.42 rec.motorcycles rec.motorcycles
     10000     -1.875     -1.213      79.16 sci.electronics sci.electronics

 
