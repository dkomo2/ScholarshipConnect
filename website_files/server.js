var express = require('express');
var app = express();
var router = express.Router();

app.use(express.static('public'));

app.use(router);
app.listen(5000, "0.0.0.0");
console.log('Scholarship server running on port 5000...');
