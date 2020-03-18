var sparkSessionType = Java.type("org.apache.spark.sql.SparkSession")

var sparkSession = sparkSessionType.builder().master("local[*]").appName("example").getOrCreate()

var data = sparkSession.read().format("csv").option("header","true").load("adult.csv")

data.show()

const http = require("http");

http.createServer(function (request, response) {
	    response.writeHead(200, {"Content-Type": "text/html"});
	        response.end(data.schema().prettyJson());
}).listen(8000, function() { console.log("Graal.js server running at http://127.0.0.1:8000/"); });
