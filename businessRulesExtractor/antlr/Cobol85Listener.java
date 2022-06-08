// Generated from .\Cobol85.g4 by ANTLR 4.9.2

   package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cobol85Parser}.
 */
public interface Cobol85Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(Cobol85Parser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(Cobol85Parser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Cobol85Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Cobol85Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programUnit}.
	 * @param ctx the parse tree
	 */
	void enterProgramUnit(Cobol85Parser.ProgramUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programUnit}.
	 * @param ctx the parse tree
	 */
	void exitProgramUnit(Cobol85Parser.ProgramUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndProgramStatement(Cobol85Parser.EndProgramStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndProgramStatement(Cobol85Parser.EndProgramStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDivision(Cobol85Parser.IdentificationDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDivision(Cobol85Parser.IdentificationDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDivisionBody(Cobol85Parser.IdentificationDivisionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDivisionBody(Cobol85Parser.IdentificationDivisionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 */
	void enterProgramIdParagraph(Cobol85Parser.ProgramIdParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 */
	void exitProgramIdParagraph(Cobol85Parser.ProgramIdParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#authorParagraph}.
	 * @param ctx the parse tree
	 */
	void enterAuthorParagraph(Cobol85Parser.AuthorParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#authorParagraph}.
	 * @param ctx the parse tree
	 */
	void exitAuthorParagraph(Cobol85Parser.AuthorParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#installationParagraph}.
	 * @param ctx the parse tree
	 */
	void enterInstallationParagraph(Cobol85Parser.InstallationParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#installationParagraph}.
	 * @param ctx the parse tree
	 */
	void exitInstallationParagraph(Cobol85Parser.InstallationParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 */
	void enterDateWrittenParagraph(Cobol85Parser.DateWrittenParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 */
	void exitDateWrittenParagraph(Cobol85Parser.DateWrittenParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 */
	void enterDateCompiledParagraph(Cobol85Parser.DateCompiledParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 */
	void exitDateCompiledParagraph(Cobol85Parser.DateCompiledParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#securityParagraph}.
	 * @param ctx the parse tree
	 */
	void enterSecurityParagraph(Cobol85Parser.SecurityParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#securityParagraph}.
	 * @param ctx the parse tree
	 */
	void exitSecurityParagraph(Cobol85Parser.SecurityParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 */
	void enterRemarksParagraph(Cobol85Parser.RemarksParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 */
	void exitRemarksParagraph(Cobol85Parser.RemarksParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentDivision}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDivision(Cobol85Parser.EnvironmentDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentDivision}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDivision(Cobol85Parser.EnvironmentDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDivisionBody(Cobol85Parser.EnvironmentDivisionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDivisionBody(Cobol85Parser.EnvironmentDivisionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#configurationSection}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationSection(Cobol85Parser.ConfigurationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#configurationSection}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationSection(Cobol85Parser.ConfigurationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationSectionParagraph(Cobol85Parser.ConfigurationSectionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationSectionParagraph(Cobol85Parser.ConfigurationSectionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 */
	void enterSourceComputerParagraph(Cobol85Parser.SourceComputerParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 */
	void exitSourceComputerParagraph(Cobol85Parser.SourceComputerParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 */
	void enterObjectComputerParagraph(Cobol85Parser.ObjectComputerParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 */
	void exitObjectComputerParagraph(Cobol85Parser.ObjectComputerParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 */
	void enterObjectComputerClause(Cobol85Parser.ObjectComputerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 */
	void exitObjectComputerClause(Cobol85Parser.ObjectComputerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 */
	void enterMemorySizeClause(Cobol85Parser.MemorySizeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 */
	void exitMemorySizeClause(Cobol85Parser.MemorySizeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 */
	void enterDiskSizeClause(Cobol85Parser.DiskSizeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 */
	void exitDiskSizeClause(Cobol85Parser.DiskSizeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 */
	void enterCollatingSequenceClause(Cobol85Parser.CollatingSequenceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 */
	void exitCollatingSequenceClause(Cobol85Parser.CollatingSequenceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterCollatingSequenceClauseAlphanumeric(Cobol85Parser.CollatingSequenceClauseAlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitCollatingSequenceClauseAlphanumeric(Cobol85Parser.CollatingSequenceClauseAlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 */
	void enterCollatingSequenceClauseNational(Cobol85Parser.CollatingSequenceClauseNationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 */
	void exitCollatingSequenceClauseNational(Cobol85Parser.CollatingSequenceClauseNationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 */
	void enterSegmentLimitClause(Cobol85Parser.SegmentLimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 */
	void exitSegmentLimitClause(Cobol85Parser.SegmentLimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#characterSetClause}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetClause(Cobol85Parser.CharacterSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#characterSetClause}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetClause(Cobol85Parser.CharacterSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 */
	void enterSpecialNamesParagraph(Cobol85Parser.SpecialNamesParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 */
	void exitSpecialNamesParagraph(Cobol85Parser.SpecialNamesParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#specialNameClause}.
	 * @param ctx the parse tree
	 */
	void enterSpecialNameClause(Cobol85Parser.SpecialNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#specialNameClause}.
	 * @param ctx the parse tree
	 */
	void exitSpecialNameClause(Cobol85Parser.SpecialNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetClause}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetClause(Cobol85Parser.AlphabetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetClause}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetClause(Cobol85Parser.AlphabetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetClauseFormat1(Cobol85Parser.AlphabetClauseFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetClauseFormat1(Cobol85Parser.AlphabetClauseFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetLiterals(Cobol85Parser.AlphabetLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetLiterals(Cobol85Parser.AlphabetLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetThrough(Cobol85Parser.AlphabetThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetThrough(Cobol85Parser.AlphabetThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetAlso(Cobol85Parser.AlphabetAlsoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetAlso(Cobol85Parser.AlphabetAlsoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetClauseFormat2(Cobol85Parser.AlphabetClauseFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetClauseFormat2(Cobol85Parser.AlphabetClauseFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#channelClause}.
	 * @param ctx the parse tree
	 */
	void enterChannelClause(Cobol85Parser.ChannelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#channelClause}.
	 * @param ctx the parse tree
	 */
	void exitChannelClause(Cobol85Parser.ChannelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClause}.
	 * @param ctx the parse tree
	 */
	void enterClassClause(Cobol85Parser.ClassClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClause}.
	 * @param ctx the parse tree
	 */
	void exitClassClause(Cobol85Parser.ClassClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 */
	void enterClassClauseThrough(Cobol85Parser.ClassClauseThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 */
	void exitClassClauseThrough(Cobol85Parser.ClassClauseThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 */
	void enterClassClauseFrom(Cobol85Parser.ClassClauseFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 */
	void exitClassClauseFrom(Cobol85Parser.ClassClauseFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classClauseTo}.
	 * @param ctx the parse tree
	 */
	void enterClassClauseTo(Cobol85Parser.ClassClauseToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classClauseTo}.
	 * @param ctx the parse tree
	 */
	void exitClassClauseTo(Cobol85Parser.ClassClauseToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#currencySignClause}.
	 * @param ctx the parse tree
	 */
	void enterCurrencySignClause(Cobol85Parser.CurrencySignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#currencySignClause}.
	 * @param ctx the parse tree
	 */
	void exitCurrencySignClause(Cobol85Parser.CurrencySignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPointClause(Cobol85Parser.DecimalPointClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPointClause(Cobol85Parser.DecimalPointClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultComputationalSignClause(Cobol85Parser.DefaultComputationalSignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultComputationalSignClause(Cobol85Parser.DefaultComputationalSignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultDisplaySignClause(Cobol85Parser.DefaultDisplaySignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultDisplaySignClause(Cobol85Parser.DefaultDisplaySignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentSwitchNameClause(Cobol85Parser.EnvironmentSwitchNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentSwitchNameClause(Cobol85Parser.EnvironmentSwitchNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentSwitchNameSpecialNamesStatusPhrase(Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentSwitchNameSpecialNamesStatusPhrase(Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#odtClause}.
	 * @param ctx the parse tree
	 */
	void enterOdtClause(Cobol85Parser.OdtClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#odtClause}.
	 * @param ctx the parse tree
	 */
	void exitOdtClause(Cobol85Parser.OdtClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 */
	void enterReserveNetworkClause(Cobol85Parser.ReserveNetworkClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 */
	void exitReserveNetworkClause(Cobol85Parser.ReserveNetworkClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicCharactersClause(Cobol85Parser.SymbolicCharactersClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicCharactersClause(Cobol85Parser.SymbolicCharactersClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicCharacters(Cobol85Parser.SymbolicCharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicCharacters(Cobol85Parser.SymbolicCharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 */
	void enterInputOutputSection(Cobol85Parser.InputOutputSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 */
	void exitInputOutputSection(Cobol85Parser.InputOutputSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 */
	void enterInputOutputSectionParagraph(Cobol85Parser.InputOutputSectionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 */
	void exitInputOutputSectionParagraph(Cobol85Parser.InputOutputSectionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 */
	void enterFileControlParagraph(Cobol85Parser.FileControlParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 */
	void exitFileControlParagraph(Cobol85Parser.FileControlParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 */
	void enterFileControlEntry(Cobol85Parser.FileControlEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 */
	void exitFileControlEntry(Cobol85Parser.FileControlEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(Cobol85Parser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(Cobol85Parser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileControlClause}.
	 * @param ctx the parse tree
	 */
	void enterFileControlClause(Cobol85Parser.FileControlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileControlClause}.
	 * @param ctx the parse tree
	 */
	void exitFileControlClause(Cobol85Parser.FileControlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#assignClause}.
	 * @param ctx the parse tree
	 */
	void enterAssignClause(Cobol85Parser.AssignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#assignClause}.
	 * @param ctx the parse tree
	 */
	void exitAssignClause(Cobol85Parser.AssignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reserveClause}.
	 * @param ctx the parse tree
	 */
	void enterReserveClause(Cobol85Parser.ReserveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reserveClause}.
	 * @param ctx the parse tree
	 */
	void exitReserveClause(Cobol85Parser.ReserveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#organizationClause}.
	 * @param ctx the parse tree
	 */
	void enterOrganizationClause(Cobol85Parser.OrganizationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#organizationClause}.
	 * @param ctx the parse tree
	 */
	void exitOrganizationClause(Cobol85Parser.OrganizationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 */
	void enterPaddingCharacterClause(Cobol85Parser.PaddingCharacterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 */
	void exitPaddingCharacterClause(Cobol85Parser.PaddingCharacterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 */
	void enterRecordDelimiterClause(Cobol85Parser.RecordDelimiterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 */
	void exitRecordDelimiterClause(Cobol85Parser.RecordDelimiterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#accessModeClause}.
	 * @param ctx the parse tree
	 */
	void enterAccessModeClause(Cobol85Parser.AccessModeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#accessModeClause}.
	 * @param ctx the parse tree
	 */
	void exitAccessModeClause(Cobol85Parser.AccessModeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterRecordKeyClause(Cobol85Parser.RecordKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitRecordKeyClause(Cobol85Parser.RecordKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterAlternateRecordKeyClause(Cobol85Parser.AlternateRecordKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitAlternateRecordKeyClause(Cobol85Parser.AlternateRecordKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#passwordClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordClause(Cobol85Parser.PasswordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#passwordClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordClause(Cobol85Parser.PasswordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 */
	void enterFileStatusClause(Cobol85Parser.FileStatusClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 */
	void exitFileStatusClause(Cobol85Parser.FileStatusClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterRelativeKeyClause(Cobol85Parser.RelativeKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitRelativeKeyClause(Cobol85Parser.RelativeKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 */
	void enterIoControlParagraph(Cobol85Parser.IoControlParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 */
	void exitIoControlParagraph(Cobol85Parser.IoControlParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ioControlClause}.
	 * @param ctx the parse tree
	 */
	void enterIoControlClause(Cobol85Parser.IoControlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ioControlClause}.
	 * @param ctx the parse tree
	 */
	void exitIoControlClause(Cobol85Parser.IoControlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunClause}.
	 * @param ctx the parse tree
	 */
	void enterRerunClause(Cobol85Parser.RerunClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunClause}.
	 * @param ctx the parse tree
	 */
	void exitRerunClause(Cobol85Parser.RerunClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 */
	void enterRerunEveryRecords(Cobol85Parser.RerunEveryRecordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 */
	void exitRerunEveryRecords(Cobol85Parser.RerunEveryRecordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 */
	void enterRerunEveryOf(Cobol85Parser.RerunEveryOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 */
	void exitRerunEveryOf(Cobol85Parser.RerunEveryOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 */
	void enterRerunEveryClock(Cobol85Parser.RerunEveryClockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 */
	void exitRerunEveryClock(Cobol85Parser.RerunEveryClockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sameClause}.
	 * @param ctx the parse tree
	 */
	void enterSameClause(Cobol85Parser.SameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sameClause}.
	 * @param ctx the parse tree
	 */
	void exitSameClause(Cobol85Parser.SameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleFileClause(Cobol85Parser.MultipleFileClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleFileClause(Cobol85Parser.MultipleFileClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 */
	void enterMultipleFilePosition(Cobol85Parser.MultipleFilePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 */
	void exitMultipleFilePosition(Cobol85Parser.MultipleFilePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 */
	void enterCommitmentControlClause(Cobol85Parser.CommitmentControlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 */
	void exitCommitmentControlClause(Cobol85Parser.CommitmentControlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDivision}.
	 * @param ctx the parse tree
	 */
	void enterDataDivision(Cobol85Parser.DataDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDivision}.
	 * @param ctx the parse tree
	 */
	void exitDataDivision(Cobol85Parser.DataDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 */
	void enterDataDivisionSection(Cobol85Parser.DataDivisionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 */
	void exitDataDivisionSection(Cobol85Parser.DataDivisionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileSection}.
	 * @param ctx the parse tree
	 */
	void enterFileSection(Cobol85Parser.FileSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileSection}.
	 * @param ctx the parse tree
	 */
	void exitFileSection(Cobol85Parser.FileSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterFileDescriptionEntry(Cobol85Parser.FileDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitFileDescriptionEntry(Cobol85Parser.FileDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 */
	void enterFileDescriptionEntryClause(Cobol85Parser.FileDescriptionEntryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 */
	void exitFileDescriptionEntryClause(Cobol85Parser.FileDescriptionEntryClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#externalClause}.
	 * @param ctx the parse tree
	 */
	void enterExternalClause(Cobol85Parser.ExternalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#externalClause}.
	 * @param ctx the parse tree
	 */
	void exitExternalClause(Cobol85Parser.ExternalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#globalClause}.
	 * @param ctx the parse tree
	 */
	void enterGlobalClause(Cobol85Parser.GlobalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#globalClause}.
	 * @param ctx the parse tree
	 */
	void exitGlobalClause(Cobol85Parser.GlobalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 */
	void enterBlockContainsClause(Cobol85Parser.BlockContainsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 */
	void exitBlockContainsClause(Cobol85Parser.BlockContainsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 */
	void enterBlockContainsTo(Cobol85Parser.BlockContainsToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 */
	void exitBlockContainsTo(Cobol85Parser.BlockContainsToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 */
	void enterRecordContainsClause(Cobol85Parser.RecordContainsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 */
	void exitRecordContainsClause(Cobol85Parser.RecordContainsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void enterRecordContainsClauseFormat1(Cobol85Parser.RecordContainsClauseFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void exitRecordContainsClauseFormat1(Cobol85Parser.RecordContainsClauseFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void enterRecordContainsClauseFormat2(Cobol85Parser.RecordContainsClauseFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void exitRecordContainsClauseFormat2(Cobol85Parser.RecordContainsClauseFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 */
	void enterRecordContainsClauseFormat3(Cobol85Parser.RecordContainsClauseFormat3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 */
	void exitRecordContainsClauseFormat3(Cobol85Parser.RecordContainsClauseFormat3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 */
	void enterRecordContainsTo(Cobol85Parser.RecordContainsToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 */
	void exitRecordContainsTo(Cobol85Parser.RecordContainsToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 */
	void enterLabelRecordsClause(Cobol85Parser.LabelRecordsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 */
	void exitLabelRecordsClause(Cobol85Parser.LabelRecordsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#valueOfClause}.
	 * @param ctx the parse tree
	 */
	void enterValueOfClause(Cobol85Parser.ValueOfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#valueOfClause}.
	 * @param ctx the parse tree
	 */
	void exitValueOfClause(Cobol85Parser.ValueOfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#valuePair}.
	 * @param ctx the parse tree
	 */
	void enterValuePair(Cobol85Parser.ValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#valuePair}.
	 * @param ctx the parse tree
	 */
	void exitValuePair(Cobol85Parser.ValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRecordsClause(Cobol85Parser.DataRecordsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRecordsClause(Cobol85Parser.DataRecordsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageClause}.
	 * @param ctx the parse tree
	 */
	void enterLinageClause(Cobol85Parser.LinageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageClause}.
	 * @param ctx the parse tree
	 */
	void exitLinageClause(Cobol85Parser.LinageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageAt}.
	 * @param ctx the parse tree
	 */
	void enterLinageAt(Cobol85Parser.LinageAtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageAt}.
	 * @param ctx the parse tree
	 */
	void exitLinageAt(Cobol85Parser.LinageAtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 */
	void enterLinageFootingAt(Cobol85Parser.LinageFootingAtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 */
	void exitLinageFootingAt(Cobol85Parser.LinageFootingAtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 */
	void enterLinageLinesAtTop(Cobol85Parser.LinageLinesAtTopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 */
	void exitLinageLinesAtTop(Cobol85Parser.LinageLinesAtTopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 */
	void enterLinageLinesAtBottom(Cobol85Parser.LinageLinesAtBottomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 */
	void exitLinageLinesAtBottom(Cobol85Parser.LinageLinesAtBottomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 */
	void enterRecordingModeClause(Cobol85Parser.RecordingModeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 */
	void exitRecordingModeClause(Cobol85Parser.RecordingModeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#modeStatement}.
	 * @param ctx the parse tree
	 */
	void enterModeStatement(Cobol85Parser.ModeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#modeStatement}.
	 * @param ctx the parse tree
	 */
	void exitModeStatement(Cobol85Parser.ModeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#codeSetClause}.
	 * @param ctx the parse tree
	 */
	void enterCodeSetClause(Cobol85Parser.CodeSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#codeSetClause}.
	 * @param ctx the parse tree
	 */
	void exitCodeSetClause(Cobol85Parser.CodeSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportClause}.
	 * @param ctx the parse tree
	 */
	void enterReportClause(Cobol85Parser.ReportClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportClause}.
	 * @param ctx the parse tree
	 */
	void exitReportClause(Cobol85Parser.ReportClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 */
	void enterDataBaseSection(Cobol85Parser.DataBaseSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 */
	void exitDataBaseSection(Cobol85Parser.DataBaseSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 */
	void enterDataBaseSectionEntry(Cobol85Parser.DataBaseSectionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 */
	void exitDataBaseSectionEntry(Cobol85Parser.DataBaseSectionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 */
	void enterWorkingStorageSection(Cobol85Parser.WorkingStorageSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 */
	void exitWorkingStorageSection(Cobol85Parser.WorkingStorageSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#linkageSection}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSection(Cobol85Parser.LinkageSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#linkageSection}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSection(Cobol85Parser.LinkageSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationSection}.
	 * @param ctx the parse tree
	 */
	void enterCommunicationSection(Cobol85Parser.CommunicationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationSection}.
	 * @param ctx the parse tree
	 */
	void exitCommunicationSection(Cobol85Parser.CommunicationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterCommunicationDescriptionEntry(Cobol85Parser.CommunicationDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitCommunicationDescriptionEntry(Cobol85Parser.CommunicationDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void enterCommunicationDescriptionEntryFormat1(Cobol85Parser.CommunicationDescriptionEntryFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void exitCommunicationDescriptionEntryFormat1(Cobol85Parser.CommunicationDescriptionEntryFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void enterCommunicationDescriptionEntryFormat2(Cobol85Parser.CommunicationDescriptionEntryFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void exitCommunicationDescriptionEntryFormat2(Cobol85Parser.CommunicationDescriptionEntryFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void enterCommunicationDescriptionEntryFormat3(Cobol85Parser.CommunicationDescriptionEntryFormat3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void exitCommunicationDescriptionEntryFormat3(Cobol85Parser.CommunicationDescriptionEntryFormat3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 */
	void enterDestinationCountClause(Cobol85Parser.DestinationCountClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 */
	void exitDestinationCountClause(Cobol85Parser.DestinationCountClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 */
	void enterDestinationTableClause(Cobol85Parser.DestinationTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 */
	void exitDestinationTableClause(Cobol85Parser.DestinationTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#endKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterEndKeyClause(Cobol85Parser.EndKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#endKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitEndKeyClause(Cobol85Parser.EndKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterErrorKeyClause(Cobol85Parser.ErrorKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitErrorKeyClause(Cobol85Parser.ErrorKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#messageCountClause}.
	 * @param ctx the parse tree
	 */
	void enterMessageCountClause(Cobol85Parser.MessageCountClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#messageCountClause}.
	 * @param ctx the parse tree
	 */
	void exitMessageCountClause(Cobol85Parser.MessageCountClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#messageDateClause}.
	 * @param ctx the parse tree
	 */
	void enterMessageDateClause(Cobol85Parser.MessageDateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#messageDateClause}.
	 * @param ctx the parse tree
	 */
	void exitMessageDateClause(Cobol85Parser.MessageDateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 */
	void enterMessageTimeClause(Cobol85Parser.MessageTimeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 */
	void exitMessageTimeClause(Cobol85Parser.MessageTimeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterStatusKeyClause(Cobol85Parser.StatusKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitStatusKeyClause(Cobol85Parser.StatusKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicDestinationClause(Cobol85Parser.SymbolicDestinationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicDestinationClause(Cobol85Parser.SymbolicDestinationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicQueueClause(Cobol85Parser.SymbolicQueueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicQueueClause(Cobol85Parser.SymbolicQueueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicSourceClause(Cobol85Parser.SymbolicSourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicSourceClause(Cobol85Parser.SymbolicSourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicTerminalClause(Cobol85Parser.SymbolicTerminalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicTerminalClause(Cobol85Parser.SymbolicTerminalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicSubQueueClause(Cobol85Parser.SymbolicSubQueueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicSubQueueClause(Cobol85Parser.SymbolicSubQueueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#textLengthClause}.
	 * @param ctx the parse tree
	 */
	void enterTextLengthClause(Cobol85Parser.TextLengthClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#textLengthClause}.
	 * @param ctx the parse tree
	 */
	void exitTextLengthClause(Cobol85Parser.TextLengthClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#localStorageSection}.
	 * @param ctx the parse tree
	 */
	void enterLocalStorageSection(Cobol85Parser.LocalStorageSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#localStorageSection}.
	 * @param ctx the parse tree
	 */
	void exitLocalStorageSection(Cobol85Parser.LocalStorageSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenSection}.
	 * @param ctx the parse tree
	 */
	void enterScreenSection(Cobol85Parser.ScreenSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenSection}.
	 * @param ctx the parse tree
	 */
	void exitScreenSection(Cobol85Parser.ScreenSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionEntry(Cobol85Parser.ScreenDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionEntry(Cobol85Parser.ScreenDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionBlankClause(Cobol85Parser.ScreenDescriptionBlankClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionBlankClause(Cobol85Parser.ScreenDescriptionBlankClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionBellClause(Cobol85Parser.ScreenDescriptionBellClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionBellClause(Cobol85Parser.ScreenDescriptionBellClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionBlinkClause(Cobol85Parser.ScreenDescriptionBlinkClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionBlinkClause(Cobol85Parser.ScreenDescriptionBlinkClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionEraseClause(Cobol85Parser.ScreenDescriptionEraseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionEraseClause(Cobol85Parser.ScreenDescriptionEraseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionLightClause(Cobol85Parser.ScreenDescriptionLightClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionLightClause(Cobol85Parser.ScreenDescriptionLightClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionGridClause(Cobol85Parser.ScreenDescriptionGridClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionGridClause(Cobol85Parser.ScreenDescriptionGridClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionReverseVideoClause(Cobol85Parser.ScreenDescriptionReverseVideoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionReverseVideoClause(Cobol85Parser.ScreenDescriptionReverseVideoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionUnderlineClause(Cobol85Parser.ScreenDescriptionUnderlineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionUnderlineClause(Cobol85Parser.ScreenDescriptionUnderlineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionSizeClause(Cobol85Parser.ScreenDescriptionSizeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionSizeClause(Cobol85Parser.ScreenDescriptionSizeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionLineClause(Cobol85Parser.ScreenDescriptionLineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionLineClause(Cobol85Parser.ScreenDescriptionLineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionColumnClause(Cobol85Parser.ScreenDescriptionColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionColumnClause(Cobol85Parser.ScreenDescriptionColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionForegroundColorClause(Cobol85Parser.ScreenDescriptionForegroundColorClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionForegroundColorClause(Cobol85Parser.ScreenDescriptionForegroundColorClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionBackgroundColorClause(Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionBackgroundColorClause(Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionControlClause(Cobol85Parser.ScreenDescriptionControlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionControlClause(Cobol85Parser.ScreenDescriptionControlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionValueClause(Cobol85Parser.ScreenDescriptionValueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionValueClause(Cobol85Parser.ScreenDescriptionValueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionPictureClause(Cobol85Parser.ScreenDescriptionPictureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionPictureClause(Cobol85Parser.ScreenDescriptionPictureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionFromClause(Cobol85Parser.ScreenDescriptionFromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionFromClause(Cobol85Parser.ScreenDescriptionFromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionToClause(Cobol85Parser.ScreenDescriptionToClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionToClause(Cobol85Parser.ScreenDescriptionToClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionUsingClause(Cobol85Parser.ScreenDescriptionUsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionUsingClause(Cobol85Parser.ScreenDescriptionUsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionUsageClause(Cobol85Parser.ScreenDescriptionUsageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionUsageClause(Cobol85Parser.ScreenDescriptionUsageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionBlankWhenZeroClause(Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionBlankWhenZeroClause(Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionJustifiedClause(Cobol85Parser.ScreenDescriptionJustifiedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionJustifiedClause(Cobol85Parser.ScreenDescriptionJustifiedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionSignClause(Cobol85Parser.ScreenDescriptionSignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionSignClause(Cobol85Parser.ScreenDescriptionSignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionAutoClause(Cobol85Parser.ScreenDescriptionAutoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionAutoClause(Cobol85Parser.ScreenDescriptionAutoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionSecureClause(Cobol85Parser.ScreenDescriptionSecureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionSecureClause(Cobol85Parser.ScreenDescriptionSecureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionRequiredClause(Cobol85Parser.ScreenDescriptionRequiredClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionRequiredClause(Cobol85Parser.ScreenDescriptionRequiredClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionPromptClause(Cobol85Parser.ScreenDescriptionPromptClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionPromptClause(Cobol85Parser.ScreenDescriptionPromptClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionPromptOccursClause(Cobol85Parser.ScreenDescriptionPromptOccursClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionPromptOccursClause(Cobol85Parser.ScreenDescriptionPromptOccursClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionFullClause(Cobol85Parser.ScreenDescriptionFullClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionFullClause(Cobol85Parser.ScreenDescriptionFullClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 */
	void enterScreenDescriptionZeroFillClause(Cobol85Parser.ScreenDescriptionZeroFillClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 */
	void exitScreenDescriptionZeroFillClause(Cobol85Parser.ScreenDescriptionZeroFillClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportSection}.
	 * @param ctx the parse tree
	 */
	void enterReportSection(Cobol85Parser.ReportSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportSection}.
	 * @param ctx the parse tree
	 */
	void exitReportSection(Cobol85Parser.ReportSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescription}.
	 * @param ctx the parse tree
	 */
	void enterReportDescription(Cobol85Parser.ReportDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescription}.
	 * @param ctx the parse tree
	 */
	void exitReportDescription(Cobol85Parser.ReportDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionEntry(Cobol85Parser.ReportDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionEntry(Cobol85Parser.ReportDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionGlobalClause(Cobol85Parser.ReportDescriptionGlobalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionGlobalClause(Cobol85Parser.ReportDescriptionGlobalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionPageLimitClause(Cobol85Parser.ReportDescriptionPageLimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionPageLimitClause(Cobol85Parser.ReportDescriptionPageLimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionHeadingClause(Cobol85Parser.ReportDescriptionHeadingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionHeadingClause(Cobol85Parser.ReportDescriptionHeadingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionFirstDetailClause(Cobol85Parser.ReportDescriptionFirstDetailClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionFirstDetailClause(Cobol85Parser.ReportDescriptionFirstDetailClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionLastDetailClause(Cobol85Parser.ReportDescriptionLastDetailClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionLastDetailClause(Cobol85Parser.ReportDescriptionLastDetailClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 */
	void enterReportDescriptionFootingClause(Cobol85Parser.ReportDescriptionFootingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 */
	void exitReportDescriptionFootingClause(Cobol85Parser.ReportDescriptionFootingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupDescriptionEntry(Cobol85Parser.ReportGroupDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupDescriptionEntry(Cobol85Parser.ReportGroupDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupDescriptionEntryFormat1(Cobol85Parser.ReportGroupDescriptionEntryFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupDescriptionEntryFormat1(Cobol85Parser.ReportGroupDescriptionEntryFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupDescriptionEntryFormat2(Cobol85Parser.ReportGroupDescriptionEntryFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupDescriptionEntryFormat2(Cobol85Parser.ReportGroupDescriptionEntryFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupDescriptionEntryFormat3(Cobol85Parser.ReportGroupDescriptionEntryFormat3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupDescriptionEntryFormat3(Cobol85Parser.ReportGroupDescriptionEntryFormat3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupBlankWhenZeroClause(Cobol85Parser.ReportGroupBlankWhenZeroClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupBlankWhenZeroClause(Cobol85Parser.ReportGroupBlankWhenZeroClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupColumnNumberClause(Cobol85Parser.ReportGroupColumnNumberClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupColumnNumberClause(Cobol85Parser.ReportGroupColumnNumberClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupIndicateClause(Cobol85Parser.ReportGroupIndicateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupIndicateClause(Cobol85Parser.ReportGroupIndicateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupJustifiedClause(Cobol85Parser.ReportGroupJustifiedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupJustifiedClause(Cobol85Parser.ReportGroupJustifiedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupLineNumberClause(Cobol85Parser.ReportGroupLineNumberClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupLineNumberClause(Cobol85Parser.ReportGroupLineNumberClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupLineNumberNextPage(Cobol85Parser.ReportGroupLineNumberNextPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupLineNumberNextPage(Cobol85Parser.ReportGroupLineNumberNextPageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupLineNumberPlus(Cobol85Parser.ReportGroupLineNumberPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupLineNumberPlus(Cobol85Parser.ReportGroupLineNumberPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupNextGroupClause(Cobol85Parser.ReportGroupNextGroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupNextGroupClause(Cobol85Parser.ReportGroupNextGroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupNextGroupPlus(Cobol85Parser.ReportGroupNextGroupPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupNextGroupPlus(Cobol85Parser.ReportGroupNextGroupPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupNextGroupNextPage(Cobol85Parser.ReportGroupNextGroupNextPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupNextGroupNextPage(Cobol85Parser.ReportGroupNextGroupNextPageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupPictureClause(Cobol85Parser.ReportGroupPictureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupPictureClause(Cobol85Parser.ReportGroupPictureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupResetClause(Cobol85Parser.ReportGroupResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupResetClause(Cobol85Parser.ReportGroupResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupSignClause(Cobol85Parser.ReportGroupSignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupSignClause(Cobol85Parser.ReportGroupSignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupSourceClause(Cobol85Parser.ReportGroupSourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupSourceClause(Cobol85Parser.ReportGroupSourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupSumClause(Cobol85Parser.ReportGroupSumClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupSumClause(Cobol85Parser.ReportGroupSumClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypeClause(Cobol85Parser.ReportGroupTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypeClause(Cobol85Parser.ReportGroupTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypeReportHeading(Cobol85Parser.ReportGroupTypeReportHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypeReportHeading(Cobol85Parser.ReportGroupTypeReportHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypePageHeading(Cobol85Parser.ReportGroupTypePageHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypePageHeading(Cobol85Parser.ReportGroupTypePageHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypeControlHeading(Cobol85Parser.ReportGroupTypeControlHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypeControlHeading(Cobol85Parser.ReportGroupTypeControlHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypeDetail(Cobol85Parser.ReportGroupTypeDetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypeDetail(Cobol85Parser.ReportGroupTypeDetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypeControlFooting(Cobol85Parser.ReportGroupTypeControlFootingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypeControlFooting(Cobol85Parser.ReportGroupTypeControlFootingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupUsageClause(Cobol85Parser.ReportGroupUsageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupUsageClause(Cobol85Parser.ReportGroupUsageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypePageFooting(Cobol85Parser.ReportGroupTypePageFootingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypePageFooting(Cobol85Parser.ReportGroupTypePageFootingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupTypeReportFooting(Cobol85Parser.ReportGroupTypeReportFootingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupTypeReportFooting(Cobol85Parser.ReportGroupTypeReportFootingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 */
	void enterReportGroupValueClause(Cobol85Parser.ReportGroupValueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 */
	void exitReportGroupValueClause(Cobol85Parser.ReportGroupValueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 */
	void enterProgramLibrarySection(Cobol85Parser.ProgramLibrarySectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 */
	void exitProgramLibrarySection(Cobol85Parser.ProgramLibrarySectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDescriptionEntry(Cobol85Parser.LibraryDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDescriptionEntry(Cobol85Parser.LibraryDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDescriptionEntryFormat1(Cobol85Parser.LibraryDescriptionEntryFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDescriptionEntryFormat1(Cobol85Parser.LibraryDescriptionEntryFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDescriptionEntryFormat2(Cobol85Parser.LibraryDescriptionEntryFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDescriptionEntryFormat2(Cobol85Parser.LibraryDescriptionEntryFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void enterLibraryAttributeClauseFormat1(Cobol85Parser.LibraryAttributeClauseFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void exitLibraryAttributeClauseFormat1(Cobol85Parser.LibraryAttributeClauseFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void enterLibraryAttributeClauseFormat2(Cobol85Parser.LibraryAttributeClauseFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void exitLibraryAttributeClauseFormat2(Cobol85Parser.LibraryAttributeClauseFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 */
	void enterLibraryAttributeFunction(Cobol85Parser.LibraryAttributeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 */
	void exitLibraryAttributeFunction(Cobol85Parser.LibraryAttributeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 */
	void enterLibraryAttributeParameter(Cobol85Parser.LibraryAttributeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 */
	void exitLibraryAttributeParameter(Cobol85Parser.LibraryAttributeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 */
	void enterLibraryAttributeTitle(Cobol85Parser.LibraryAttributeTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 */
	void exitLibraryAttributeTitle(Cobol85Parser.LibraryAttributeTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureClauseFormat1(Cobol85Parser.LibraryEntryProcedureClauseFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureClauseFormat1(Cobol85Parser.LibraryEntryProcedureClauseFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureClauseFormat2(Cobol85Parser.LibraryEntryProcedureClauseFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureClauseFormat2(Cobol85Parser.LibraryEntryProcedureClauseFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureForClause(Cobol85Parser.LibraryEntryProcedureForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureForClause(Cobol85Parser.LibraryEntryProcedureForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureGivingClause(Cobol85Parser.LibraryEntryProcedureGivingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureGivingClause(Cobol85Parser.LibraryEntryProcedureGivingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureUsingClause(Cobol85Parser.LibraryEntryProcedureUsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureUsingClause(Cobol85Parser.LibraryEntryProcedureUsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureUsingName(Cobol85Parser.LibraryEntryProcedureUsingNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureUsingName(Cobol85Parser.LibraryEntryProcedureUsingNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureWithClause(Cobol85Parser.LibraryEntryProcedureWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureWithClause(Cobol85Parser.LibraryEntryProcedureWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 */
	void enterLibraryEntryProcedureWithName(Cobol85Parser.LibraryEntryProcedureWithNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 */
	void exitLibraryEntryProcedureWithName(Cobol85Parser.LibraryEntryProcedureWithNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 */
	void enterLibraryIsCommonClause(Cobol85Parser.LibraryIsCommonClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 */
	void exitLibraryIsCommonClause(Cobol85Parser.LibraryIsCommonClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 */
	void enterLibraryIsGlobalClause(Cobol85Parser.LibraryIsGlobalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 */
	void exitLibraryIsGlobalClause(Cobol85Parser.LibraryIsGlobalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntry(Cobol85Parser.DataDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntry(Cobol85Parser.DataDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryFormat1(Cobol85Parser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryFormat1(Cobol85Parser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryFormat2(Cobol85Parser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryFormat2(Cobol85Parser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryFormat3(Cobol85Parser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryFormat3(Cobol85Parser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryExecSql(Cobol85Parser.DataDescriptionEntryExecSqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryExecSql(Cobol85Parser.DataDescriptionEntryExecSqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataAlignedClause(Cobol85Parser.DataAlignedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataAlignedClause(Cobol85Parser.DataAlignedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void enterDataBlankWhenZeroClause(Cobol85Parser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void exitDataBlankWhenZeroClause(Cobol85Parser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataCommonOwnLocalClause(Cobol85Parser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataCommonOwnLocalClause(Cobol85Parser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataExternalClause(Cobol85Parser.DataExternalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataExternalClause(Cobol85Parser.DataExternalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataGlobalClause(Cobol85Parser.DataGlobalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataGlobalClause(Cobol85Parser.DataGlobalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 */
	void enterDataIntegerStringClause(Cobol85Parser.DataIntegerStringClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 */
	void exitDataIntegerStringClause(Cobol85Parser.DataIntegerStringClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataJustifiedClause(Cobol85Parser.DataJustifiedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataJustifiedClause(Cobol85Parser.DataJustifiedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursClause(Cobol85Parser.DataOccursClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursClause(Cobol85Parser.DataOccursClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursTo(Cobol85Parser.DataOccursToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursTo(Cobol85Parser.DataOccursToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursSort(Cobol85Parser.DataOccursSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursSort(Cobol85Parser.DataOccursSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 */
	void enterDataPictureClause(Cobol85Parser.DataPictureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 */
	void exitDataPictureClause(Cobol85Parser.DataPictureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#pictureString}.
	 * @param ctx the parse tree
	 */
	void enterPictureString(Cobol85Parser.PictureStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#pictureString}.
	 * @param ctx the parse tree
	 */
	void exitPictureString(Cobol85Parser.PictureStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#pictureChars}.
	 * @param ctx the parse tree
	 */
	void enterPictureChars(Cobol85Parser.PictureCharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#pictureChars}.
	 * @param ctx the parse tree
	 */
	void exitPictureChars(Cobol85Parser.PictureCharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 */
	void enterPictureCardinality(Cobol85Parser.PictureCardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 */
	void exitPictureCardinality(Cobol85Parser.PictureCardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 */
	void enterDataReceivedByClause(Cobol85Parser.DataReceivedByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 */
	void exitDataReceivedByClause(Cobol85Parser.DataReceivedByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRecordAreaClause(Cobol85Parser.DataRecordAreaClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRecordAreaClause(Cobol85Parser.DataRecordAreaClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRedefinesClause(Cobol85Parser.DataRedefinesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRedefinesClause(Cobol85Parser.DataRedefinesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRenamesClause(Cobol85Parser.DataRenamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRenamesClause(Cobol85Parser.DataRenamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataSignClause}.
	 * @param ctx the parse tree
	 */
	void enterDataSignClause(Cobol85Parser.DataSignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataSignClause}.
	 * @param ctx the parse tree
	 */
	void exitDataSignClause(Cobol85Parser.DataSignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataSynchronizedClause(Cobol85Parser.DataSynchronizedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataSynchronizedClause(Cobol85Parser.DataSynchronizedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataThreadLocalClause(Cobol85Parser.DataThreadLocalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataThreadLocalClause(Cobol85Parser.DataThreadLocalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeClause(Cobol85Parser.DataTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeClause(Cobol85Parser.DataTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDefClause(Cobol85Parser.DataTypeDefClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDefClause(Cobol85Parser.DataTypeDefClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 */
	void enterDataUsageClause(Cobol85Parser.DataUsageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 */
	void exitDataUsageClause(Cobol85Parser.DataUsageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 */
	void enterDataUsingClause(Cobol85Parser.DataUsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 */
	void exitDataUsingClause(Cobol85Parser.DataUsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueClause}.
	 * @param ctx the parse tree
	 */
	void enterDataValueClause(Cobol85Parser.DataValueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueClause}.
	 * @param ctx the parse tree
	 */
	void exitDataValueClause(Cobol85Parser.DataValueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 */
	void enterDataValueInterval(Cobol85Parser.DataValueIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 */
	void exitDataValueInterval(Cobol85Parser.DataValueIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 */
	void enterDataValueIntervalFrom(Cobol85Parser.DataValueIntervalFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 */
	void exitDataValueIntervalFrom(Cobol85Parser.DataValueIntervalFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 */
	void enterDataValueIntervalTo(Cobol85Parser.DataValueIntervalToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 */
	void exitDataValueIntervalTo(Cobol85Parser.DataValueIntervalToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 */
	void enterDataWithLowerBoundsClause(Cobol85Parser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 */
	void exitDataWithLowerBoundsClause(Cobol85Parser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivision(Cobol85Parser.ProcedureDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivision(Cobol85Parser.ProcedureDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionUsingClause(Cobol85Parser.ProcedureDivisionUsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionUsingClause(Cobol85Parser.ProcedureDivisionUsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionGivingClause(Cobol85Parser.ProcedureDivisionGivingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionGivingClause(Cobol85Parser.ProcedureDivisionGivingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionUsingParameter(Cobol85Parser.ProcedureDivisionUsingParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionUsingParameter(Cobol85Parser.ProcedureDivisionUsingParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionByReferencePhrase(Cobol85Parser.ProcedureDivisionByReferencePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionByReferencePhrase(Cobol85Parser.ProcedureDivisionByReferencePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionByReference(Cobol85Parser.ProcedureDivisionByReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionByReference(Cobol85Parser.ProcedureDivisionByReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionByValuePhrase(Cobol85Parser.ProcedureDivisionByValuePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionByValuePhrase(Cobol85Parser.ProcedureDivisionByValuePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionByValue(Cobol85Parser.ProcedureDivisionByValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionByValue(Cobol85Parser.ProcedureDivisionByValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaratives(Cobol85Parser.ProcedureDeclarativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaratives(Cobol85Parser.ProcedureDeclarativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclarative(Cobol85Parser.ProcedureDeclarativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclarative(Cobol85Parser.ProcedureDeclarativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSectionHeader(Cobol85Parser.ProcedureSectionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSectionHeader(Cobol85Parser.ProcedureSectionHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionBody(Cobol85Parser.ProcedureDivisionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionBody(Cobol85Parser.ProcedureDivisionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureSection}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSection(Cobol85Parser.ProcedureSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureSection}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSection(Cobol85Parser.ProcedureSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paragraphs}.
	 * @param ctx the parse tree
	 */
	void enterParagraphs(Cobol85Parser.ParagraphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paragraphs}.
	 * @param ctx the parse tree
	 */
	void exitParagraphs(Cobol85Parser.ParagraphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(Cobol85Parser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(Cobol85Parser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(Cobol85Parser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(Cobol85Parser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Cobol85Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Cobol85Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptStatement}.
	 * @param ctx the parse tree
	 */
	void enterAcceptStatement(Cobol85Parser.AcceptStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptStatement}.
	 * @param ctx the parse tree
	 */
	void exitAcceptStatement(Cobol85Parser.AcceptStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 */
	void enterAcceptFromDateStatement(Cobol85Parser.AcceptFromDateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 */
	void exitAcceptFromDateStatement(Cobol85Parser.AcceptFromDateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 */
	void enterAcceptFromMnemonicStatement(Cobol85Parser.AcceptFromMnemonicStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 */
	void exitAcceptFromMnemonicStatement(Cobol85Parser.AcceptFromMnemonicStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 */
	void enterAcceptFromEscapeKeyStatement(Cobol85Parser.AcceptFromEscapeKeyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 */
	void exitAcceptFromEscapeKeyStatement(Cobol85Parser.AcceptFromEscapeKeyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 */
	void enterAcceptMessageCountStatement(Cobol85Parser.AcceptMessageCountStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 */
	void exitAcceptMessageCountStatement(Cobol85Parser.AcceptMessageCountStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddStatement(Cobol85Parser.AddStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddStatement(Cobol85Parser.AddStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addToStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddToStatement(Cobol85Parser.AddToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addToStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddToStatement(Cobol85Parser.AddToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddToGivingStatement(Cobol85Parser.AddToGivingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddToGivingStatement(Cobol85Parser.AddToGivingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddCorrespondingStatement(Cobol85Parser.AddCorrespondingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddCorrespondingStatement(Cobol85Parser.AddCorrespondingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addFrom}.
	 * @param ctx the parse tree
	 */
	void enterAddFrom(Cobol85Parser.AddFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addFrom}.
	 * @param ctx the parse tree
	 */
	void exitAddFrom(Cobol85Parser.AddFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addTo}.
	 * @param ctx the parse tree
	 */
	void enterAddTo(Cobol85Parser.AddToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addTo}.
	 * @param ctx the parse tree
	 */
	void exitAddTo(Cobol85Parser.AddToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addToGiving}.
	 * @param ctx the parse tree
	 */
	void enterAddToGiving(Cobol85Parser.AddToGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addToGiving}.
	 * @param ctx the parse tree
	 */
	void exitAddToGiving(Cobol85Parser.AddToGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#addGiving}.
	 * @param ctx the parse tree
	 */
	void enterAddGiving(Cobol85Parser.AddGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#addGiving}.
	 * @param ctx the parse tree
	 */
	void exitAddGiving(Cobol85Parser.AddGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 */
	void enterAlteredGoTo(Cobol85Parser.AlteredGoToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 */
	void exitAlteredGoTo(Cobol85Parser.AlteredGoToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatement(Cobol85Parser.AlterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatement(Cobol85Parser.AlterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 */
	void enterAlterProceedTo(Cobol85Parser.AlterProceedToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 */
	void exitAlterProceedTo(Cobol85Parser.AlterProceedToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(Cobol85Parser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(Cobol85Parser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterCallUsingPhrase(Cobol85Parser.CallUsingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitCallUsingPhrase(Cobol85Parser.CallUsingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 */
	void enterCallUsingParameter(Cobol85Parser.CallUsingParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 */
	void exitCallUsingParameter(Cobol85Parser.CallUsingParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	void enterCallByReferencePhrase(Cobol85Parser.CallByReferencePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 */
	void exitCallByReferencePhrase(Cobol85Parser.CallByReferencePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByReference}.
	 * @param ctx the parse tree
	 */
	void enterCallByReference(Cobol85Parser.CallByReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByReference}.
	 * @param ctx the parse tree
	 */
	void exitCallByReference(Cobol85Parser.CallByReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 */
	void enterCallByValuePhrase(Cobol85Parser.CallByValuePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 */
	void exitCallByValuePhrase(Cobol85Parser.CallByValuePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByValue}.
	 * @param ctx the parse tree
	 */
	void enterCallByValue(Cobol85Parser.CallByValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByValue}.
	 * @param ctx the parse tree
	 */
	void exitCallByValue(Cobol85Parser.CallByValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 */
	void enterCallByContentPhrase(Cobol85Parser.CallByContentPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 */
	void exitCallByContentPhrase(Cobol85Parser.CallByContentPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callByContent}.
	 * @param ctx the parse tree
	 */
	void enterCallByContent(Cobol85Parser.CallByContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callByContent}.
	 * @param ctx the parse tree
	 */
	void exitCallByContent(Cobol85Parser.CallByContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterCallGivingPhrase(Cobol85Parser.CallGivingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitCallGivingPhrase(Cobol85Parser.CallGivingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cancelStatement}.
	 * @param ctx the parse tree
	 */
	void enterCancelStatement(Cobol85Parser.CancelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cancelStatement}.
	 * @param ctx the parse tree
	 */
	void exitCancelStatement(Cobol85Parser.CancelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cancelCall}.
	 * @param ctx the parse tree
	 */
	void enterCancelCall(Cobol85Parser.CancelCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cancelCall}.
	 * @param ctx the parse tree
	 */
	void exitCancelCall(Cobol85Parser.CancelCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseStatement(Cobol85Parser.CloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseStatement(Cobol85Parser.CloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeFile}.
	 * @param ctx the parse tree
	 */
	void enterCloseFile(Cobol85Parser.CloseFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeFile}.
	 * @param ctx the parse tree
	 */
	void exitCloseFile(Cobol85Parser.CloseFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseReelUnitStatement(Cobol85Parser.CloseReelUnitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseReelUnitStatement(Cobol85Parser.CloseReelUnitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseRelativeStatement(Cobol85Parser.CloseRelativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseRelativeStatement(Cobol85Parser.CloseRelativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 */
	void enterClosePortFileIOStatement(Cobol85Parser.ClosePortFileIOStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 */
	void exitClosePortFileIOStatement(Cobol85Parser.ClosePortFileIOStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 */
	void enterClosePortFileIOUsing(Cobol85Parser.ClosePortFileIOUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 */
	void exitClosePortFileIOUsing(Cobol85Parser.ClosePortFileIOUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 */
	void enterClosePortFileIOUsingCloseDisposition(Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 */
	void exitClosePortFileIOUsingCloseDisposition(Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 */
	void enterClosePortFileIOUsingAssociatedData(Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 */
	void exitClosePortFileIOUsingAssociatedData(Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 */
	void enterClosePortFileIOUsingAssociatedDataLength(Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 */
	void exitClosePortFileIOUsingAssociatedDataLength(Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void enterComputeStatement(Cobol85Parser.ComputeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void exitComputeStatement(Cobol85Parser.ComputeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#computeStore}.
	 * @param ctx the parse tree
	 */
	void enterComputeStore(Cobol85Parser.ComputeStoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#computeStore}.
	 * @param ctx the parse tree
	 */
	void exitComputeStore(Cobol85Parser.ComputeStoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(Cobol85Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(Cobol85Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(Cobol85Parser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(Cobol85Parser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#disableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisableStatement(Cobol85Parser.DisableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#disableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisableStatement(Cobol85Parser.DisableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(Cobol85Parser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(Cobol85Parser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayOperand}.
	 * @param ctx the parse tree
	 */
	void enterDisplayOperand(Cobol85Parser.DisplayOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayOperand}.
	 * @param ctx the parse tree
	 */
	void exitDisplayOperand(Cobol85Parser.DisplayOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayAt}.
	 * @param ctx the parse tree
	 */
	void enterDisplayAt(Cobol85Parser.DisplayAtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayAt}.
	 * @param ctx the parse tree
	 */
	void exitDisplayAt(Cobol85Parser.DisplayAtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayUpon}.
	 * @param ctx the parse tree
	 */
	void enterDisplayUpon(Cobol85Parser.DisplayUponContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayUpon}.
	 * @param ctx the parse tree
	 */
	void exitDisplayUpon(Cobol85Parser.DisplayUponContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#displayWith}.
	 * @param ctx the parse tree
	 */
	void enterDisplayWith(Cobol85Parser.DisplayWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#displayWith}.
	 * @param ctx the parse tree
	 */
	void exitDisplayWith(Cobol85Parser.DisplayWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideStatement}.
	 * @param ctx the parse tree
	 */
	void enterDivideStatement(Cobol85Parser.DivideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideStatement}.
	 * @param ctx the parse tree
	 */
	void exitDivideStatement(Cobol85Parser.DivideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterDivideIntoStatement(Cobol85Parser.DivideIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitDivideIntoStatement(Cobol85Parser.DivideIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 */
	void enterDivideIntoGivingStatement(Cobol85Parser.DivideIntoGivingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 */
	void exitDivideIntoGivingStatement(Cobol85Parser.DivideIntoGivingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 */
	void enterDivideByGivingStatement(Cobol85Parser.DivideByGivingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 */
	void exitDivideByGivingStatement(Cobol85Parser.DivideByGivingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterDivideGivingPhrase(Cobol85Parser.DivideGivingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitDivideGivingPhrase(Cobol85Parser.DivideGivingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideInto}.
	 * @param ctx the parse tree
	 */
	void enterDivideInto(Cobol85Parser.DivideIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideInto}.
	 * @param ctx the parse tree
	 */
	void exitDivideInto(Cobol85Parser.DivideIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideGiving}.
	 * @param ctx the parse tree
	 */
	void enterDivideGiving(Cobol85Parser.DivideGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideGiving}.
	 * @param ctx the parse tree
	 */
	void exitDivideGiving(Cobol85Parser.DivideGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#divideRemainder}.
	 * @param ctx the parse tree
	 */
	void enterDivideRemainder(Cobol85Parser.DivideRemainderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#divideRemainder}.
	 * @param ctx the parse tree
	 */
	void exitDivideRemainder(Cobol85Parser.DivideRemainderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#enableStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnableStatement(Cobol85Parser.EnableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#enableStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnableStatement(Cobol85Parser.EnableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#entryStatement}.
	 * @param ctx the parse tree
	 */
	void enterEntryStatement(Cobol85Parser.EntryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#entryStatement}.
	 * @param ctx the parse tree
	 */
	void exitEntryStatement(Cobol85Parser.EntryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateStatement(Cobol85Parser.EvaluateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateStatement(Cobol85Parser.EvaluateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateSelect(Cobol85Parser.EvaluateSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateSelect(Cobol85Parser.EvaluateSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateAlsoSelect(Cobol85Parser.EvaluateAlsoSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateAlsoSelect(Cobol85Parser.EvaluateAlsoSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateWhenPhrase(Cobol85Parser.EvaluateWhenPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateWhenPhrase(Cobol85Parser.EvaluateWhenPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateWhen(Cobol85Parser.EvaluateWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateWhen(Cobol85Parser.EvaluateWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateCondition(Cobol85Parser.EvaluateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateCondition(Cobol85Parser.EvaluateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateThrough(Cobol85Parser.EvaluateThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateThrough(Cobol85Parser.EvaluateThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateAlsoCondition(Cobol85Parser.EvaluateAlsoConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateAlsoCondition(Cobol85Parser.EvaluateAlsoConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateWhenOther(Cobol85Parser.EvaluateWhenOtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateWhenOther(Cobol85Parser.EvaluateWhenOtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#evaluateValue}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateValue(Cobol85Parser.EvaluateValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#evaluateValue}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateValue(Cobol85Parser.EvaluateValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecCicsStatement(Cobol85Parser.ExecCicsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecCicsStatement(Cobol85Parser.ExecCicsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecSqlStatement(Cobol85Parser.ExecSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecSqlStatement(Cobol85Parser.ExecSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecSqlImsStatement(Cobol85Parser.ExecSqlImsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecSqlImsStatement(Cobol85Parser.ExecSqlImsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExhibitStatement(Cobol85Parser.ExhibitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExhibitStatement(Cobol85Parser.ExhibitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 */
	void enterExhibitOperand(Cobol85Parser.ExhibitOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 */
	void exitExhibitOperand(Cobol85Parser.ExhibitOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(Cobol85Parser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(Cobol85Parser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#generateStatement}.
	 * @param ctx the parse tree
	 */
	void enterGenerateStatement(Cobol85Parser.GenerateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#generateStatement}.
	 * @param ctx the parse tree
	 */
	void exitGenerateStatement(Cobol85Parser.GenerateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#gobackStatement}.
	 * @param ctx the parse tree
	 */
	void enterGobackStatement(Cobol85Parser.GobackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#gobackStatement}.
	 * @param ctx the parse tree
	 */
	void exitGobackStatement(Cobol85Parser.GobackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#goToStatement}.
	 * @param ctx the parse tree
	 */
	void enterGoToStatement(Cobol85Parser.GoToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#goToStatement}.
	 * @param ctx the parse tree
	 */
	void exitGoToStatement(Cobol85Parser.GoToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 */
	void enterGoToStatementSimple(Cobol85Parser.GoToStatementSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 */
	void exitGoToStatementSimple(Cobol85Parser.GoToStatementSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 */
	void enterGoToDependingOnStatement(Cobol85Parser.GoToDependingOnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 */
	void exitGoToDependingOnStatement(Cobol85Parser.GoToDependingOnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Cobol85Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Cobol85Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ifThen}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(Cobol85Parser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ifThen}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(Cobol85Parser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(Cobol85Parser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(Cobol85Parser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializeStatement(Cobol85Parser.InitializeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initializeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializeStatement(Cobol85Parser.InitializeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInitializeReplacingPhrase(Cobol85Parser.InitializeReplacingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInitializeReplacingPhrase(Cobol85Parser.InitializeReplacingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 */
	void enterInitializeReplacingBy(Cobol85Parser.InitializeReplacingByContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 */
	void exitInitializeReplacingBy(Cobol85Parser.InitializeReplacingByContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#initiateStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitiateStatement(Cobol85Parser.InitiateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#initiateStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitiateStatement(Cobol85Parser.InitiateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectStatement}.
	 * @param ctx the parse tree
	 */
	void enterInspectStatement(Cobol85Parser.InspectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectStatement}.
	 * @param ctx the parse tree
	 */
	void exitInspectStatement(Cobol85Parser.InspectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInspectTallyingPhrase(Cobol85Parser.InspectTallyingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInspectTallyingPhrase(Cobol85Parser.InspectTallyingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInspectReplacingPhrase(Cobol85Parser.InspectReplacingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInspectReplacingPhrase(Cobol85Parser.InspectReplacingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInspectTallyingReplacingPhrase(Cobol85Parser.InspectTallyingReplacingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInspectTallyingReplacingPhrase(Cobol85Parser.InspectTallyingReplacingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInspectConvertingPhrase(Cobol85Parser.InspectConvertingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInspectConvertingPhrase(Cobol85Parser.InspectConvertingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectFor}.
	 * @param ctx the parse tree
	 */
	void enterInspectFor(Cobol85Parser.InspectForContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectFor}.
	 * @param ctx the parse tree
	 */
	void exitInspectFor(Cobol85Parser.InspectForContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 */
	void enterInspectCharacters(Cobol85Parser.InspectCharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 */
	void exitInspectCharacters(Cobol85Parser.InspectCharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 */
	void enterInspectReplacingCharacters(Cobol85Parser.InspectReplacingCharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 */
	void exitInspectReplacingCharacters(Cobol85Parser.InspectReplacingCharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 */
	void enterInspectAllLeadings(Cobol85Parser.InspectAllLeadingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 */
	void exitInspectAllLeadings(Cobol85Parser.InspectAllLeadingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 */
	void enterInspectReplacingAllLeadings(Cobol85Parser.InspectReplacingAllLeadingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 */
	void exitInspectReplacingAllLeadings(Cobol85Parser.InspectReplacingAllLeadingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 */
	void enterInspectAllLeading(Cobol85Parser.InspectAllLeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 */
	void exitInspectAllLeading(Cobol85Parser.InspectAllLeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 */
	void enterInspectReplacingAllLeading(Cobol85Parser.InspectReplacingAllLeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 */
	void exitInspectReplacingAllLeading(Cobol85Parser.InspectReplacingAllLeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectBy}.
	 * @param ctx the parse tree
	 */
	void enterInspectBy(Cobol85Parser.InspectByContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectBy}.
	 * @param ctx the parse tree
	 */
	void exitInspectBy(Cobol85Parser.InspectByContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectTo}.
	 * @param ctx the parse tree
	 */
	void enterInspectTo(Cobol85Parser.InspectToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectTo}.
	 * @param ctx the parse tree
	 */
	void exitInspectTo(Cobol85Parser.InspectToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 */
	void enterInspectBeforeAfter(Cobol85Parser.InspectBeforeAfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 */
	void exitInspectBeforeAfter(Cobol85Parser.InspectBeforeAfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void enterMergeStatement(Cobol85Parser.MergeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void exitMergeStatement(Cobol85Parser.MergeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeOnKeyClause(Cobol85Parser.MergeOnKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeOnKeyClause(Cobol85Parser.MergeOnKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	void enterMergeCollatingSequencePhrase(Cobol85Parser.MergeCollatingSequencePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	void exitMergeCollatingSequencePhrase(Cobol85Parser.MergeCollatingSequencePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterMergeCollatingAlphanumeric(Cobol85Parser.MergeCollatingAlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitMergeCollatingAlphanumeric(Cobol85Parser.MergeCollatingAlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 */
	void enterMergeCollatingNational(Cobol85Parser.MergeCollatingNationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 */
	void exitMergeCollatingNational(Cobol85Parser.MergeCollatingNationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeUsing}.
	 * @param ctx the parse tree
	 */
	void enterMergeUsing(Cobol85Parser.MergeUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeUsing}.
	 * @param ctx the parse tree
	 */
	void exitMergeUsing(Cobol85Parser.MergeUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	void enterMergeOutputProcedurePhrase(Cobol85Parser.MergeOutputProcedurePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	void exitMergeOutputProcedurePhrase(Cobol85Parser.MergeOutputProcedurePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 */
	void enterMergeOutputThrough(Cobol85Parser.MergeOutputThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 */
	void exitMergeOutputThrough(Cobol85Parser.MergeOutputThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterMergeGivingPhrase(Cobol85Parser.MergeGivingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitMergeGivingPhrase(Cobol85Parser.MergeGivingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mergeGiving}.
	 * @param ctx the parse tree
	 */
	void enterMergeGiving(Cobol85Parser.MergeGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mergeGiving}.
	 * @param ctx the parse tree
	 */
	void exitMergeGiving(Cobol85Parser.MergeGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveStatement(Cobol85Parser.MoveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveStatement(Cobol85Parser.MoveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveToStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveToStatement(Cobol85Parser.MoveToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveToStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveToStatement(Cobol85Parser.MoveToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 */
	void enterMoveToSendingArea(Cobol85Parser.MoveToSendingAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 */
	void exitMoveToSendingArea(Cobol85Parser.MoveToSendingAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveCorrespondingToStatement(Cobol85Parser.MoveCorrespondingToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveCorrespondingToStatement(Cobol85Parser.MoveCorrespondingToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 */
	void enterMoveCorrespondingToSendingArea(Cobol85Parser.MoveCorrespondingToSendingAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 */
	void exitMoveCorrespondingToSendingArea(Cobol85Parser.MoveCorrespondingToSendingAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyStatement(Cobol85Parser.MultiplyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyStatement(Cobol85Parser.MultiplyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyRegular(Cobol85Parser.MultiplyRegularContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyRegular(Cobol85Parser.MultiplyRegularContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyRegularOperand(Cobol85Parser.MultiplyRegularOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyRegularOperand(Cobol85Parser.MultiplyRegularOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyGiving(Cobol85Parser.MultiplyGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyGiving(Cobol85Parser.MultiplyGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyGivingOperand(Cobol85Parser.MultiplyGivingOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyGivingOperand(Cobol85Parser.MultiplyGivingOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyGivingResult(Cobol85Parser.MultiplyGivingResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyGivingResult(Cobol85Parser.MultiplyGivingResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenStatement(Cobol85Parser.OpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenStatement(Cobol85Parser.OpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openInputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenInputStatement(Cobol85Parser.OpenInputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openInputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenInputStatement(Cobol85Parser.OpenInputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openInput}.
	 * @param ctx the parse tree
	 */
	void enterOpenInput(Cobol85Parser.OpenInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openInput}.
	 * @param ctx the parse tree
	 */
	void exitOpenInput(Cobol85Parser.OpenInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenOutputStatement(Cobol85Parser.OpenOutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenOutputStatement(Cobol85Parser.OpenOutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openOutput}.
	 * @param ctx the parse tree
	 */
	void enterOpenOutput(Cobol85Parser.OpenOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openOutput}.
	 * @param ctx the parse tree
	 */
	void exitOpenOutput(Cobol85Parser.OpenOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openIOStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenIOStatement(Cobol85Parser.OpenIOStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openIOStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenIOStatement(Cobol85Parser.OpenIOStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenExtendStatement(Cobol85Parser.OpenExtendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenExtendStatement(Cobol85Parser.OpenExtendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performStatement}.
	 * @param ctx the parse tree
	 */
	void enterPerformStatement(Cobol85Parser.PerformStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performStatement}.
	 * @param ctx the parse tree
	 */
	void exitPerformStatement(Cobol85Parser.PerformStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 */
	void enterPerformInlineStatement(Cobol85Parser.PerformInlineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 */
	void exitPerformInlineStatement(Cobol85Parser.PerformInlineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterPerformProcedureStatement(Cobol85Parser.PerformProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitPerformProcedureStatement(Cobol85Parser.PerformProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performType}.
	 * @param ctx the parse tree
	 */
	void enterPerformType(Cobol85Parser.PerformTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performType}.
	 * @param ctx the parse tree
	 */
	void exitPerformType(Cobol85Parser.PerformTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performTimes}.
	 * @param ctx the parse tree
	 */
	void enterPerformTimes(Cobol85Parser.PerformTimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performTimes}.
	 * @param ctx the parse tree
	 */
	void exitPerformTimes(Cobol85Parser.PerformTimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performUntil}.
	 * @param ctx the parse tree
	 */
	void enterPerformUntil(Cobol85Parser.PerformUntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performUntil}.
	 * @param ctx the parse tree
	 */
	void exitPerformUntil(Cobol85Parser.PerformUntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performVarying}.
	 * @param ctx the parse tree
	 */
	void enterPerformVarying(Cobol85Parser.PerformVaryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performVarying}.
	 * @param ctx the parse tree
	 */
	void exitPerformVarying(Cobol85Parser.PerformVaryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 */
	void enterPerformVaryingClause(Cobol85Parser.PerformVaryingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 */
	void exitPerformVaryingClause(Cobol85Parser.PerformVaryingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPerformVaryingPhrase(Cobol85Parser.PerformVaryingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPerformVaryingPhrase(Cobol85Parser.PerformVaryingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performAfter}.
	 * @param ctx the parse tree
	 */
	void enterPerformAfter(Cobol85Parser.PerformAfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performAfter}.
	 * @param ctx the parse tree
	 */
	void exitPerformAfter(Cobol85Parser.PerformAfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performFrom}.
	 * @param ctx the parse tree
	 */
	void enterPerformFrom(Cobol85Parser.PerformFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performFrom}.
	 * @param ctx the parse tree
	 */
	void exitPerformFrom(Cobol85Parser.PerformFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performBy}.
	 * @param ctx the parse tree
	 */
	void enterPerformBy(Cobol85Parser.PerformByContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performBy}.
	 * @param ctx the parse tree
	 */
	void exitPerformBy(Cobol85Parser.PerformByContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#performTestClause}.
	 * @param ctx the parse tree
	 */
	void enterPerformTestClause(Cobol85Parser.PerformTestClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#performTestClause}.
	 * @param ctx the parse tree
	 */
	void exitPerformTestClause(Cobol85Parser.PerformTestClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#purgeStatement}.
	 * @param ctx the parse tree
	 */
	void enterPurgeStatement(Cobol85Parser.PurgeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#purgeStatement}.
	 * @param ctx the parse tree
	 */
	void exitPurgeStatement(Cobol85Parser.PurgeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(Cobol85Parser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(Cobol85Parser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readInto}.
	 * @param ctx the parse tree
	 */
	void enterReadInto(Cobol85Parser.ReadIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readInto}.
	 * @param ctx the parse tree
	 */
	void exitReadInto(Cobol85Parser.ReadIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readWith}.
	 * @param ctx the parse tree
	 */
	void enterReadWith(Cobol85Parser.ReadWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readWith}.
	 * @param ctx the parse tree
	 */
	void exitReadWith(Cobol85Parser.ReadWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#readKey}.
	 * @param ctx the parse tree
	 */
	void enterReadKey(Cobol85Parser.ReadKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#readKey}.
	 * @param ctx the parse tree
	 */
	void exitReadKey(Cobol85Parser.ReadKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterReceiveStatement(Cobol85Parser.ReceiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitReceiveStatement(Cobol85Parser.ReceiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterReceiveFromStatement(Cobol85Parser.ReceiveFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitReceiveFromStatement(Cobol85Parser.ReceiveFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveFrom}.
	 * @param ctx the parse tree
	 */
	void enterReceiveFrom(Cobol85Parser.ReceiveFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveFrom}.
	 * @param ctx the parse tree
	 */
	void exitReceiveFrom(Cobol85Parser.ReceiveFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterReceiveIntoStatement(Cobol85Parser.ReceiveIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitReceiveIntoStatement(Cobol85Parser.ReceiveIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveNoData}.
	 * @param ctx the parse tree
	 */
	void enterReceiveNoData(Cobol85Parser.ReceiveNoDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveNoData}.
	 * @param ctx the parse tree
	 */
	void exitReceiveNoData(Cobol85Parser.ReceiveNoDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveWithData}.
	 * @param ctx the parse tree
	 */
	void enterReceiveWithData(Cobol85Parser.ReceiveWithDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveWithData}.
	 * @param ctx the parse tree
	 */
	void exitReceiveWithData(Cobol85Parser.ReceiveWithDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveBefore}.
	 * @param ctx the parse tree
	 */
	void enterReceiveBefore(Cobol85Parser.ReceiveBeforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveBefore}.
	 * @param ctx the parse tree
	 */
	void exitReceiveBefore(Cobol85Parser.ReceiveBeforeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveWith}.
	 * @param ctx the parse tree
	 */
	void enterReceiveWith(Cobol85Parser.ReceiveWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveWith}.
	 * @param ctx the parse tree
	 */
	void exitReceiveWith(Cobol85Parser.ReceiveWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveThread}.
	 * @param ctx the parse tree
	 */
	void enterReceiveThread(Cobol85Parser.ReceiveThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveThread}.
	 * @param ctx the parse tree
	 */
	void exitReceiveThread(Cobol85Parser.ReceiveThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveSize}.
	 * @param ctx the parse tree
	 */
	void enterReceiveSize(Cobol85Parser.ReceiveSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveSize}.
	 * @param ctx the parse tree
	 */
	void exitReceiveSize(Cobol85Parser.ReceiveSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#receiveStatus}.
	 * @param ctx the parse tree
	 */
	void enterReceiveStatus(Cobol85Parser.ReceiveStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#receiveStatus}.
	 * @param ctx the parse tree
	 */
	void exitReceiveStatus(Cobol85Parser.ReceiveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(Cobol85Parser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(Cobol85Parser.ReleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Cobol85Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Cobol85Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#returnInto}.
	 * @param ctx the parse tree
	 */
	void enterReturnInto(Cobol85Parser.ReturnIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#returnInto}.
	 * @param ctx the parse tree
	 */
	void exitReturnInto(Cobol85Parser.ReturnIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	void enterRewriteStatement(Cobol85Parser.RewriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 */
	void exitRewriteStatement(Cobol85Parser.RewriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 */
	void enterRewriteFrom(Cobol85Parser.RewriteFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 */
	void exitRewriteFrom(Cobol85Parser.RewriteFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#searchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSearchStatement(Cobol85Parser.SearchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#searchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSearchStatement(Cobol85Parser.SearchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#searchVarying}.
	 * @param ctx the parse tree
	 */
	void enterSearchVarying(Cobol85Parser.SearchVaryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#searchVarying}.
	 * @param ctx the parse tree
	 */
	void exitSearchVarying(Cobol85Parser.SearchVaryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#searchWhen}.
	 * @param ctx the parse tree
	 */
	void enterSearchWhen(Cobol85Parser.SearchWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#searchWhen}.
	 * @param ctx the parse tree
	 */
	void exitSearchWhen(Cobol85Parser.SearchWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void enterSendStatement(Cobol85Parser.SendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void exitSendStatement(Cobol85Parser.SendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 */
	void enterSendStatementSync(Cobol85Parser.SendStatementSyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 */
	void exitSendStatementSync(Cobol85Parser.SendStatementSyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 */
	void enterSendStatementAsync(Cobol85Parser.SendStatementAsyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 */
	void exitSendStatementAsync(Cobol85Parser.SendStatementAsyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSendFromPhrase(Cobol85Parser.SendFromPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSendFromPhrase(Cobol85Parser.SendFromPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSendWithPhrase(Cobol85Parser.SendWithPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSendWithPhrase(Cobol85Parser.SendWithPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSendReplacingPhrase(Cobol85Parser.SendReplacingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSendReplacingPhrase(Cobol85Parser.SendReplacingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSendAdvancingPhrase(Cobol85Parser.SendAdvancingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSendAdvancingPhrase(Cobol85Parser.SendAdvancingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 */
	void enterSendAdvancingPage(Cobol85Parser.SendAdvancingPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 */
	void exitSendAdvancingPage(Cobol85Parser.SendAdvancingPageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 */
	void enterSendAdvancingLines(Cobol85Parser.SendAdvancingLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 */
	void exitSendAdvancingLines(Cobol85Parser.SendAdvancingLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	void enterSendAdvancingMnemonic(Cobol85Parser.SendAdvancingMnemonicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	void exitSendAdvancingMnemonic(Cobol85Parser.SendAdvancingMnemonicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(Cobol85Parser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(Cobol85Parser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setToStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetToStatement(Cobol85Parser.SetToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setToStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetToStatement(Cobol85Parser.SetToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetUpDownByStatement(Cobol85Parser.SetUpDownByStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetUpDownByStatement(Cobol85Parser.SetUpDownByStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setTo}.
	 * @param ctx the parse tree
	 */
	void enterSetTo(Cobol85Parser.SetToContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setTo}.
	 * @param ctx the parse tree
	 */
	void exitSetTo(Cobol85Parser.SetToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setToValue}.
	 * @param ctx the parse tree
	 */
	void enterSetToValue(Cobol85Parser.SetToValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setToValue}.
	 * @param ctx the parse tree
	 */
	void exitSetToValue(Cobol85Parser.SetToValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#setByValue}.
	 * @param ctx the parse tree
	 */
	void enterSetByValue(Cobol85Parser.SetByValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#setByValue}.
	 * @param ctx the parse tree
	 */
	void exitSetByValue(Cobol85Parser.SetByValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortStatement}.
	 * @param ctx the parse tree
	 */
	void enterSortStatement(Cobol85Parser.SortStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortStatement}.
	 * @param ctx the parse tree
	 */
	void exitSortStatement(Cobol85Parser.SortStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterSortOnKeyClause(Cobol85Parser.SortOnKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitSortOnKeyClause(Cobol85Parser.SortOnKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSortDuplicatesPhrase(Cobol85Parser.SortDuplicatesPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSortDuplicatesPhrase(Cobol85Parser.SortDuplicatesPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	void enterSortCollatingSequencePhrase(Cobol85Parser.SortCollatingSequencePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 */
	void exitSortCollatingSequencePhrase(Cobol85Parser.SortCollatingSequencePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterSortCollatingAlphanumeric(Cobol85Parser.SortCollatingAlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitSortCollatingAlphanumeric(Cobol85Parser.SortCollatingAlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 */
	void enterSortCollatingNational(Cobol85Parser.SortCollatingNationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 */
	void exitSortCollatingNational(Cobol85Parser.SortCollatingNationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	void enterSortInputProcedurePhrase(Cobol85Parser.SortInputProcedurePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	void exitSortInputProcedurePhrase(Cobol85Parser.SortInputProcedurePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 */
	void enterSortInputThrough(Cobol85Parser.SortInputThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 */
	void exitSortInputThrough(Cobol85Parser.SortInputThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortUsing}.
	 * @param ctx the parse tree
	 */
	void enterSortUsing(Cobol85Parser.SortUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortUsing}.
	 * @param ctx the parse tree
	 */
	void exitSortUsing(Cobol85Parser.SortUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	void enterSortOutputProcedurePhrase(Cobol85Parser.SortOutputProcedurePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 */
	void exitSortOutputProcedurePhrase(Cobol85Parser.SortOutputProcedurePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 */
	void enterSortOutputThrough(Cobol85Parser.SortOutputThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 */
	void exitSortOutputThrough(Cobol85Parser.SortOutputThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSortGivingPhrase(Cobol85Parser.SortGivingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSortGivingPhrase(Cobol85Parser.SortGivingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sortGiving}.
	 * @param ctx the parse tree
	 */
	void enterSortGiving(Cobol85Parser.SortGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sortGiving}.
	 * @param ctx the parse tree
	 */
	void exitSortGiving(Cobol85Parser.SortGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#startStatement}.
	 * @param ctx the parse tree
	 */
	void enterStartStatement(Cobol85Parser.StartStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#startStatement}.
	 * @param ctx the parse tree
	 */
	void exitStartStatement(Cobol85Parser.StartStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#startKey}.
	 * @param ctx the parse tree
	 */
	void enterStartKey(Cobol85Parser.StartKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#startKey}.
	 * @param ctx the parse tree
	 */
	void exitStartKey(Cobol85Parser.StartKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stopStatement}.
	 * @param ctx the parse tree
	 */
	void enterStopStatement(Cobol85Parser.StopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stopStatement}.
	 * @param ctx the parse tree
	 */
	void exitStopStatement(Cobol85Parser.StopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringStatement(Cobol85Parser.StringStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringStatement(Cobol85Parser.StringStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterStringSendingPhrase(Cobol85Parser.StringSendingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitStringSendingPhrase(Cobol85Parser.StringSendingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringSending}.
	 * @param ctx the parse tree
	 */
	void enterStringSending(Cobol85Parser.StringSendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringSending}.
	 * @param ctx the parse tree
	 */
	void exitStringSending(Cobol85Parser.StringSendingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	void enterStringDelimitedByPhrase(Cobol85Parser.StringDelimitedByPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	void exitStringDelimitedByPhrase(Cobol85Parser.StringDelimitedByPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 */
	void enterStringForPhrase(Cobol85Parser.StringForPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 */
	void exitStringForPhrase(Cobol85Parser.StringForPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	void enterStringIntoPhrase(Cobol85Parser.StringIntoPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	void exitStringIntoPhrase(Cobol85Parser.StringIntoPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	void enterStringWithPointerPhrase(Cobol85Parser.StringWithPointerPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	void exitStringWithPointerPhrase(Cobol85Parser.StringWithPointerPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubtractStatement(Cobol85Parser.SubtractStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubtractStatement(Cobol85Parser.SubtractStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubtractFromStatement(Cobol85Parser.SubtractFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubtractFromStatement(Cobol85Parser.SubtractFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubtractFromGivingStatement(Cobol85Parser.SubtractFromGivingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubtractFromGivingStatement(Cobol85Parser.SubtractFromGivingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubtractCorrespondingStatement(Cobol85Parser.SubtractCorrespondingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubtractCorrespondingStatement(Cobol85Parser.SubtractCorrespondingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 */
	void enterSubtractSubtrahend(Cobol85Parser.SubtractSubtrahendContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 */
	void exitSubtractSubtrahend(Cobol85Parser.SubtractSubtrahendContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 */
	void enterSubtractMinuend(Cobol85Parser.SubtractMinuendContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 */
	void exitSubtractMinuend(Cobol85Parser.SubtractMinuendContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 */
	void enterSubtractMinuendGiving(Cobol85Parser.SubtractMinuendGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 */
	void exitSubtractMinuendGiving(Cobol85Parser.SubtractMinuendGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractGiving}.
	 * @param ctx the parse tree
	 */
	void enterSubtractGiving(Cobol85Parser.SubtractGivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractGiving}.
	 * @param ctx the parse tree
	 */
	void exitSubtractGiving(Cobol85Parser.SubtractGivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 */
	void enterSubtractMinuendCorresponding(Cobol85Parser.SubtractMinuendCorrespondingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 */
	void exitSubtractMinuendCorresponding(Cobol85Parser.SubtractMinuendCorrespondingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#terminateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTerminateStatement(Cobol85Parser.TerminateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#terminateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTerminateStatement(Cobol85Parser.TerminateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnstringStatement(Cobol85Parser.UnstringStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnstringStatement(Cobol85Parser.UnstringStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterUnstringSendingPhrase(Cobol85Parser.UnstringSendingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitUnstringSendingPhrase(Cobol85Parser.UnstringSendingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	void enterUnstringDelimitedByPhrase(Cobol85Parser.UnstringDelimitedByPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 */
	void exitUnstringDelimitedByPhrase(Cobol85Parser.UnstringDelimitedByPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 */
	void enterUnstringOrAllPhrase(Cobol85Parser.UnstringOrAllPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 */
	void exitUnstringOrAllPhrase(Cobol85Parser.UnstringOrAllPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	void enterUnstringIntoPhrase(Cobol85Parser.UnstringIntoPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 */
	void exitUnstringIntoPhrase(Cobol85Parser.UnstringIntoPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringInto}.
	 * @param ctx the parse tree
	 */
	void enterUnstringInto(Cobol85Parser.UnstringIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringInto}.
	 * @param ctx the parse tree
	 */
	void exitUnstringInto(Cobol85Parser.UnstringIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 */
	void enterUnstringDelimiterIn(Cobol85Parser.UnstringDelimiterInContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 */
	void exitUnstringDelimiterIn(Cobol85Parser.UnstringDelimiterInContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 */
	void enterUnstringCountIn(Cobol85Parser.UnstringCountInContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 */
	void exitUnstringCountIn(Cobol85Parser.UnstringCountInContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	void enterUnstringWithPointerPhrase(Cobol85Parser.UnstringWithPointerPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 */
	void exitUnstringWithPointerPhrase(Cobol85Parser.UnstringWithPointerPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterUnstringTallyingPhrase(Cobol85Parser.UnstringTallyingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitUnstringTallyingPhrase(Cobol85Parser.UnstringTallyingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(Cobol85Parser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(Cobol85Parser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useAfterClause}.
	 * @param ctx the parse tree
	 */
	void enterUseAfterClause(Cobol85Parser.UseAfterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useAfterClause}.
	 * @param ctx the parse tree
	 */
	void exitUseAfterClause(Cobol85Parser.UseAfterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useAfterOn}.
	 * @param ctx the parse tree
	 */
	void enterUseAfterOn(Cobol85Parser.UseAfterOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useAfterOn}.
	 * @param ctx the parse tree
	 */
	void exitUseAfterOn(Cobol85Parser.UseAfterOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useDebugClause}.
	 * @param ctx the parse tree
	 */
	void enterUseDebugClause(Cobol85Parser.UseDebugClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useDebugClause}.
	 * @param ctx the parse tree
	 */
	void exitUseDebugClause(Cobol85Parser.UseDebugClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#useDebugOn}.
	 * @param ctx the parse tree
	 */
	void enterUseDebugOn(Cobol85Parser.UseDebugOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#useDebugOn}.
	 * @param ctx the parse tree
	 */
	void exitUseDebugOn(Cobol85Parser.UseDebugOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(Cobol85Parser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(Cobol85Parser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 */
	void enterWriteFromPhrase(Cobol85Parser.WriteFromPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 */
	void exitWriteFromPhrase(Cobol85Parser.WriteFromPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterWriteAdvancingPhrase(Cobol85Parser.WriteAdvancingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitWriteAdvancingPhrase(Cobol85Parser.WriteAdvancingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 */
	void enterWriteAdvancingPage(Cobol85Parser.WriteAdvancingPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 */
	void exitWriteAdvancingPage(Cobol85Parser.WriteAdvancingPageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 */
	void enterWriteAdvancingLines(Cobol85Parser.WriteAdvancingLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 */
	void exitWriteAdvancingLines(Cobol85Parser.WriteAdvancingLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	void enterWriteAdvancingMnemonic(Cobol85Parser.WriteAdvancingMnemonicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 */
	void exitWriteAdvancingMnemonic(Cobol85Parser.WriteAdvancingMnemonicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	void enterWriteAtEndOfPagePhrase(Cobol85Parser.WriteAtEndOfPagePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	void exitWriteAtEndOfPagePhrase(Cobol85Parser.WriteAtEndOfPagePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	void enterWriteNotAtEndOfPagePhrase(Cobol85Parser.WriteNotAtEndOfPagePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 */
	void exitWriteNotAtEndOfPagePhrase(Cobol85Parser.WriteNotAtEndOfPagePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 */
	void enterAtEndPhrase(Cobol85Parser.AtEndPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 */
	void exitAtEndPhrase(Cobol85Parser.AtEndPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotAtEndPhrase(Cobol85Parser.NotAtEndPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotAtEndPhrase(Cobol85Parser.NotAtEndPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInvalidKeyPhrase(Cobol85Parser.InvalidKeyPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInvalidKeyPhrase(Cobol85Parser.InvalidKeyPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotInvalidKeyPhrase(Cobol85Parser.NotInvalidKeyPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotInvalidKeyPhrase(Cobol85Parser.NotInvalidKeyPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	void enterOnOverflowPhrase(Cobol85Parser.OnOverflowPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	void exitOnOverflowPhrase(Cobol85Parser.OnOverflowPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotOnOverflowPhrase(Cobol85Parser.NotOnOverflowPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotOnOverflowPhrase(Cobol85Parser.NotOnOverflowPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterOnSizeErrorPhrase(Cobol85Parser.OnSizeErrorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitOnSizeErrorPhrase(Cobol85Parser.OnSizeErrorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotOnSizeErrorPhrase(Cobol85Parser.NotOnSizeErrorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotOnSizeErrorPhrase(Cobol85Parser.NotOnSizeErrorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 */
	void enterOnExceptionClause(Cobol85Parser.OnExceptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 */
	void exitOnExceptionClause(Cobol85Parser.OnExceptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 */
	void enterNotOnExceptionClause(Cobol85Parser.NotOnExceptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 */
	void exitNotOnExceptionClause(Cobol85Parser.NotOnExceptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(Cobol85Parser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(Cobol85Parser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(Cobol85Parser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(Cobol85Parser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multDivs}.
	 * @param ctx the parse tree
	 */
	void enterMultDivs(Cobol85Parser.MultDivsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multDivs}.
	 * @param ctx the parse tree
	 */
	void exitMultDivs(Cobol85Parser.MultDivsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#multDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(Cobol85Parser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#multDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(Cobol85Parser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#powers}.
	 * @param ctx the parse tree
	 */
	void enterPowers(Cobol85Parser.PowersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#powers}.
	 * @param ctx the parse tree
	 */
	void exitPowers(Cobol85Parser.PowersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(Cobol85Parser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(Cobol85Parser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#basis}.
	 * @param ctx the parse tree
	 */
	void enterBasis(Cobol85Parser.BasisContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#basis}.
	 * @param ctx the parse tree
	 */
	void exitBasis(Cobol85Parser.BasisContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Cobol85Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Cobol85Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#andOrCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndOrCondition(Cobol85Parser.AndOrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#andOrCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndOrCondition(Cobol85Parser.AndOrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#combinableCondition}.
	 * @param ctx the parse tree
	 */
	void enterCombinableCondition(Cobol85Parser.CombinableConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#combinableCondition}.
	 * @param ctx the parse tree
	 */
	void exitCombinableCondition(Cobol85Parser.CombinableConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(Cobol85Parser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(Cobol85Parser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#classCondition}.
	 * @param ctx the parse tree
	 */
	void enterClassCondition(Cobol85Parser.ClassConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#classCondition}.
	 * @param ctx the parse tree
	 */
	void exitClassCondition(Cobol85Parser.ClassConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 */
	void enterConditionNameReference(Cobol85Parser.ConditionNameReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 */
	void exitConditionNameReference(Cobol85Parser.ConditionNameReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 */
	void enterConditionNameSubscriptReference(Cobol85Parser.ConditionNameSubscriptReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 */
	void exitConditionNameSubscriptReference(Cobol85Parser.ConditionNameSubscriptReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelationCondition(Cobol85Parser.RelationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelationCondition(Cobol85Parser.RelationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelationSignCondition(Cobol85Parser.RelationSignConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelationSignCondition(Cobol85Parser.RelationSignConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void enterRelationArithmeticComparison(Cobol85Parser.RelationArithmeticComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void exitRelationArithmeticComparison(Cobol85Parser.RelationArithmeticComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 */
	void enterRelationCombinedComparison(Cobol85Parser.RelationCombinedComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 */
	void exitRelationCombinedComparison(Cobol85Parser.RelationCombinedComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelationCombinedCondition(Cobol85Parser.RelationCombinedConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelationCombinedCondition(Cobol85Parser.RelationCombinedConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(Cobol85Parser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(Cobol85Parser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#abbreviation}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviation(Cobol85Parser.AbbreviationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#abbreviation}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviation(Cobol85Parser.AbbreviationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Cobol85Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Cobol85Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#tableCall}.
	 * @param ctx the parse tree
	 */
	void enterTableCall(Cobol85Parser.TableCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#tableCall}.
	 * @param ctx the parse tree
	 */
	void exitTableCall(Cobol85Parser.TableCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Cobol85Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Cobol85Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#referenceModifier}.
	 * @param ctx the parse tree
	 */
	void enterReferenceModifier(Cobol85Parser.ReferenceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#referenceModifier}.
	 * @param ctx the parse tree
	 */
	void exitReferenceModifier(Cobol85Parser.ReferenceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#characterPosition}.
	 * @param ctx the parse tree
	 */
	void enterCharacterPosition(Cobol85Parser.CharacterPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#characterPosition}.
	 * @param ctx the parse tree
	 */
	void exitCharacterPosition(Cobol85Parser.CharacterPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(Cobol85Parser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(Cobol85Parser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#subscript_}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_(Cobol85Parser.Subscript_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#subscript_}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_(Cobol85Parser.Subscript_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Cobol85Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Cobol85Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataName(Cobol85Parser.QualifiedDataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataName(Cobol85Parser.QualifiedDataNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataNameFormat1(Cobol85Parser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataNameFormat1(Cobol85Parser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataNameFormat2(Cobol85Parser.QualifiedDataNameFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataNameFormat2(Cobol85Parser.QualifiedDataNameFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataNameFormat3(Cobol85Parser.QualifiedDataNameFormat3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataNameFormat3(Cobol85Parser.QualifiedDataNameFormat3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataNameFormat4(Cobol85Parser.QualifiedDataNameFormat4Context ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataNameFormat4(Cobol85Parser.QualifiedDataNameFormat4Context ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedInData(Cobol85Parser.QualifiedInDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedInData(Cobol85Parser.QualifiedInDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inData}.
	 * @param ctx the parse tree
	 */
	void enterInData(Cobol85Parser.InDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inData}.
	 * @param ctx the parse tree
	 */
	void exitInData(Cobol85Parser.InDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inFile}.
	 * @param ctx the parse tree
	 */
	void enterInFile(Cobol85Parser.InFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inFile}.
	 * @param ctx the parse tree
	 */
	void exitInFile(Cobol85Parser.InFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inMnemonic}.
	 * @param ctx the parse tree
	 */
	void enterInMnemonic(Cobol85Parser.InMnemonicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inMnemonic}.
	 * @param ctx the parse tree
	 */
	void exitInMnemonic(Cobol85Parser.InMnemonicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inSection}.
	 * @param ctx the parse tree
	 */
	void enterInSection(Cobol85Parser.InSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inSection}.
	 * @param ctx the parse tree
	 */
	void exitInSection(Cobol85Parser.InSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inLibrary}.
	 * @param ctx the parse tree
	 */
	void enterInLibrary(Cobol85Parser.InLibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inLibrary}.
	 * @param ctx the parse tree
	 */
	void exitInLibrary(Cobol85Parser.InLibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#inTable}.
	 * @param ctx the parse tree
	 */
	void enterInTable(Cobol85Parser.InTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#inTable}.
	 * @param ctx the parse tree
	 */
	void exitInTable(Cobol85Parser.InTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#alphabetName}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetName(Cobol85Parser.AlphabetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#alphabetName}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetName(Cobol85Parser.AlphabetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#assignmentName}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentName(Cobol85Parser.AssignmentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#assignmentName}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentName(Cobol85Parser.AssignmentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#basisName}.
	 * @param ctx the parse tree
	 */
	void enterBasisName(Cobol85Parser.BasisNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#basisName}.
	 * @param ctx the parse tree
	 */
	void exitBasisName(Cobol85Parser.BasisNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cdName}.
	 * @param ctx the parse tree
	 */
	void enterCdName(Cobol85Parser.CdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cdName}.
	 * @param ctx the parse tree
	 */
	void exitCdName(Cobol85Parser.CdNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(Cobol85Parser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(Cobol85Parser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#computerName}.
	 * @param ctx the parse tree
	 */
	void enterComputerName(Cobol85Parser.ComputerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#computerName}.
	 * @param ctx the parse tree
	 */
	void exitComputerName(Cobol85Parser.ComputerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(Cobol85Parser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(Cobol85Parser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataName}.
	 * @param ctx the parse tree
	 */
	void enterDataName(Cobol85Parser.DataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataName}.
	 * @param ctx the parse tree
	 */
	void exitDataName(Cobol85Parser.DataNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#dataDescName}.
	 * @param ctx the parse tree
	 */
	void enterDataDescName(Cobol85Parser.DataDescNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#dataDescName}.
	 * @param ctx the parse tree
	 */
	void exitDataDescName(Cobol85Parser.DataDescNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#environmentName}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentName(Cobol85Parser.EnvironmentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#environmentName}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentName(Cobol85Parser.EnvironmentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(Cobol85Parser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(Cobol85Parser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(Cobol85Parser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(Cobol85Parser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(Cobol85Parser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(Cobol85Parser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#languageName}.
	 * @param ctx the parse tree
	 */
	void enterLanguageName(Cobol85Parser.LanguageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#languageName}.
	 * @param ctx the parse tree
	 */
	void exitLanguageName(Cobol85Parser.LanguageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#libraryName}.
	 * @param ctx the parse tree
	 */
	void enterLibraryName(Cobol85Parser.LibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#libraryName}.
	 * @param ctx the parse tree
	 */
	void exitLibraryName(Cobol85Parser.LibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#localName}.
	 * @param ctx the parse tree
	 */
	void enterLocalName(Cobol85Parser.LocalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#localName}.
	 * @param ctx the parse tree
	 */
	void exitLocalName(Cobol85Parser.LocalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#mnemonicName}.
	 * @param ctx the parse tree
	 */
	void enterMnemonicName(Cobol85Parser.MnemonicNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#mnemonicName}.
	 * @param ctx the parse tree
	 */
	void exitMnemonicName(Cobol85Parser.MnemonicNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#paragraphName}.
	 * @param ctx the parse tree
	 */
	void enterParagraphName(Cobol85Parser.ParagraphNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#paragraphName}.
	 * @param ctx the parse tree
	 */
	void exitParagraphName(Cobol85Parser.ParagraphNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(Cobol85Parser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(Cobol85Parser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(Cobol85Parser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(Cobol85Parser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#recordName}.
	 * @param ctx the parse tree
	 */
	void enterRecordName(Cobol85Parser.RecordNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#recordName}.
	 * @param ctx the parse tree
	 */
	void exitRecordName(Cobol85Parser.RecordNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#reportName}.
	 * @param ctx the parse tree
	 */
	void enterReportName(Cobol85Parser.ReportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#reportName}.
	 * @param ctx the parse tree
	 */
	void exitReportName(Cobol85Parser.ReportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(Cobol85Parser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(Cobol85Parser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#screenName}.
	 * @param ctx the parse tree
	 */
	void enterScreenName(Cobol85Parser.ScreenNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#screenName}.
	 * @param ctx the parse tree
	 */
	void exitScreenName(Cobol85Parser.ScreenNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#sectionName}.
	 * @param ctx the parse tree
	 */
	void enterSectionName(Cobol85Parser.SectionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#sectionName}.
	 * @param ctx the parse tree
	 */
	void exitSectionName(Cobol85Parser.SectionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#systemName}.
	 * @param ctx the parse tree
	 */
	void enterSystemName(Cobol85Parser.SystemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#systemName}.
	 * @param ctx the parse tree
	 */
	void exitSystemName(Cobol85Parser.SystemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicCharacter(Cobol85Parser.SymbolicCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicCharacter(Cobol85Parser.SymbolicCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#textName}.
	 * @param ctx the parse tree
	 */
	void enterTextName(Cobol85Parser.TextNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#textName}.
	 * @param ctx the parse tree
	 */
	void exitTextName(Cobol85Parser.TextNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cobolWord}.
	 * @param ctx the parse tree
	 */
	void enterCobolWord(Cobol85Parser.CobolWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cobolWord}.
	 * @param ctx the parse tree
	 */
	void exitCobolWord(Cobol85Parser.CobolWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Cobol85Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Cobol85Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(Cobol85Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(Cobol85Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(Cobol85Parser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(Cobol85Parser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(Cobol85Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(Cobol85Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCicsDfhRespLiteral(Cobol85Parser.CicsDfhRespLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCicsDfhRespLiteral(Cobol85Parser.CicsDfhRespLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCicsDfhValueLiteral(Cobol85Parser.CicsDfhValueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCicsDfhValueLiteral(Cobol85Parser.CicsDfhValueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 */
	void enterFigurativeConstant(Cobol85Parser.FigurativeConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 */
	void exitFigurativeConstant(Cobol85Parser.FigurativeConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#specialRegister}.
	 * @param ctx the parse tree
	 */
	void enterSpecialRegister(Cobol85Parser.SpecialRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#specialRegister}.
	 * @param ctx the parse tree
	 */
	void exitSpecialRegister(Cobol85Parser.SpecialRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol85Parser#commentEntry}.
	 * @param ctx the parse tree
	 */
	void enterCommentEntry(Cobol85Parser.CommentEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol85Parser#commentEntry}.
	 * @param ctx the parse tree
	 */
	void exitCommentEntry(Cobol85Parser.CommentEntryContext ctx);
}