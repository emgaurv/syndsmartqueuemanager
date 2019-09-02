/* ॐ गंगणपतये नमो नम:  */
var express = require('express');
var qr = require('qr-image'); 
var fs = require('fs');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get('/dashboard', function(req, res, next) {
  res.render('dashboard', { title: 'Express' });
});

router.post('/login',function(req, res, next){
//Basic Authentication For Prototype, Will replaced Authentication
// Methods as explained in Presentation
var counterno = req.body.counter;
var password = req.body.password;

if(counterno == "02"){
	 res.redirect('/dashboard');
}else{
	 res.redirect('/');
}	
});


router.get('/managequeue', function(req, res, next) {
  res.render('managequeue', { title: 'Express' });
});


//CMS System
router.get('/cms', function(req, res, next) {
  res.render('cms', { title: 'Express' });
});


router.get('/cmsdashboard', function(req, res, next) {
  res.render('dashboardcms', { title: 'Express' });
});

router.get('/qrscan', function(req, res) {  
var qr_svg = qr.image('', { type: 'png' });
qr_svg.pipe(require('fs').createWriteStream('public/images/qr/qrcode.png'));
  res.render('qrscan');
});

module.exports = router;
