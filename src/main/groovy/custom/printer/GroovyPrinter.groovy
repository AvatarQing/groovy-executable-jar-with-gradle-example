package custom.printer

def cli = new CliBuilder()
cli.h( longOpt: 'help', required: false, 'Show usage information' )
cli.p( longOpt: 'print', argName: 'content', required: true, args: 1, 'The content text that you want to print' )

def opt = cli.parse(args)
if (!opt) {
	return
}
if (opt.h) {
	cli.usage()
	return
}

if(opt.p) {
	println 'you use option -p, value:' + opt.p
}