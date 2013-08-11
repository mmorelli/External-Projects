
public class MainClass 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new org.apache.commons.cli.ApplicationTest().run();
		new org.apache.commons.cli.ArgumentIsOptionTest().run();
		new org.apache.commons.cli.BasicParserTest().run();
		new org.apache.commons.cli.BugsTest().run();
		new org.apache.commons.cli.CommandLineTest().run();
		new org.apache.commons.cli.GnuParserTest().run();
		new org.apache.commons.cli.HelpFormatterTest().run();
		new org.apache.commons.cli.OptionBuilderTest().run();
		new org.apache.commons.cli.OptionGroupTest().run();
		new org.apache.commons.cli.OptionsTest().run();
		new org.apache.commons.cli.OptionTest().run();
		new org.apache.commons.cli.ParseRequiredTest().run();
//		new org.apache.commons.cli.ParserTestCase().run();
		new org.apache.commons.cli.PatternOptionBuilderTest().run();
		new org.apache.commons.cli.PosixParserTest().run();
		new org.apache.commons.cli.UtilTest().run();
		new org.apache.commons.cli.ValuesTest().run();
		new org.apache.commons.cli.ValueTest().run();
		
		new org.apache.commons.cli.bug.BugCLI133Test().run();
		new org.apache.commons.cli.bug.BugCLI13Test().run();
		new org.apache.commons.cli.bug.BugCLI148Test().run();
		new org.apache.commons.cli.bug.BugCLI162Test().run();
		new org.apache.commons.cli.bug.BugCLI18Test().run();
		new org.apache.commons.cli.bug.BugCLI71Test().run();
	}

}
