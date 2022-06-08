// Generated from .\Cobol85.g4 by ANTLR 4.9.2

   package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cobol85Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Cobol85Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(Cobol85Parser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Cobol85Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramUnit(Cobol85Parser.ProgramUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndProgramStatement(Cobol85Parser.EndProgramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#identificationDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivision(Cobol85Parser.IdentificationDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivisionBody(Cobol85Parser.IdentificationDivisionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdParagraph(Cobol85Parser.ProgramIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#authorParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorParagraph(Cobol85Parser.AuthorParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#installationParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallationParagraph(Cobol85Parser.InstallationParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateWrittenParagraph(Cobol85Parser.DateWrittenParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateCompiledParagraph(Cobol85Parser.DateCompiledParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#securityParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityParagraph(Cobol85Parser.SecurityParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemarksParagraph(Cobol85Parser.RemarksParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDivision(Cobol85Parser.EnvironmentDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDivisionBody(Cobol85Parser.EnvironmentDivisionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#configurationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationSection(Cobol85Parser.ConfigurationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationSectionParagraph(Cobol85Parser.ConfigurationSectionParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceComputerParagraph(Cobol85Parser.SourceComputerParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectComputerParagraph(Cobol85Parser.ObjectComputerParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectComputerClause(Cobol85Parser.ObjectComputerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemorySizeClause(Cobol85Parser.MemorySizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiskSizeClause(Cobol85Parser.DiskSizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollatingSequenceClause(Cobol85Parser.CollatingSequenceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollatingSequenceClauseAlphanumeric(Cobol85Parser.CollatingSequenceClauseAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollatingSequenceClauseNational(Cobol85Parser.CollatingSequenceClauseNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentLimitClause(Cobol85Parser.SegmentLimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#characterSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSetClause(Cobol85Parser.CharacterSetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialNamesParagraph(Cobol85Parser.SpecialNamesParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#specialNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialNameClause(Cobol85Parser.SpecialNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetClause(Cobol85Parser.AlphabetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetClauseFormat1(Cobol85Parser.AlphabetClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetLiterals(Cobol85Parser.AlphabetLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetThrough(Cobol85Parser.AlphabetThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetAlso(Cobol85Parser.AlphabetAlsoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetClauseFormat2(Cobol85Parser.AlphabetClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#channelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelClause(Cobol85Parser.ChannelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClause(Cobol85Parser.ClassClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClauseThrough(Cobol85Parser.ClassClauseThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClauseFrom(Cobol85Parser.ClassClauseFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classClauseTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClauseTo(Cobol85Parser.ClassClauseToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#currencySignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrencySignClause(Cobol85Parser.CurrencySignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalPointClause(Cobol85Parser.DecimalPointClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultComputationalSignClause(Cobol85Parser.DefaultComputationalSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultDisplaySignClause(Cobol85Parser.DefaultDisplaySignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentSwitchNameClause(Cobol85Parser.EnvironmentSwitchNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentSwitchNameSpecialNamesStatusPhrase(Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#odtClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdtClause(Cobol85Parser.OdtClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserveNetworkClause(Cobol85Parser.ReserveNetworkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicCharactersClause(Cobol85Parser.SymbolicCharactersClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicCharacters(Cobol85Parser.SymbolicCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputOutputSection(Cobol85Parser.InputOutputSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputOutputSectionParagraph(Cobol85Parser.InputOutputSectionParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlParagraph(Cobol85Parser.FileControlParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlEntry(Cobol85Parser.FileControlEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(Cobol85Parser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlClause(Cobol85Parser.FileControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#assignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignClause(Cobol85Parser.AssignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reserveClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserveClause(Cobol85Parser.ReserveClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#organizationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizationClause(Cobol85Parser.OrganizationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingCharacterClause(Cobol85Parser.PaddingCharacterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDelimiterClause(Cobol85Parser.RecordDelimiterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#accessModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModeClause(Cobol85Parser.AccessModeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordKeyClause(Cobol85Parser.RecordKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternateRecordKeyClause(Cobol85Parser.AlternateRecordKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#passwordClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordClause(Cobol85Parser.PasswordClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStatusClause(Cobol85Parser.FileStatusClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeKeyClause(Cobol85Parser.RelativeKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoControlParagraph(Cobol85Parser.IoControlParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ioControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoControlClause(Cobol85Parser.IoControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunClause(Cobol85Parser.RerunClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunEveryRecords(Cobol85Parser.RerunEveryRecordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunEveryOf(Cobol85Parser.RerunEveryOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunEveryClock(Cobol85Parser.RerunEveryClockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameClause(Cobol85Parser.SameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleFileClause(Cobol85Parser.MultipleFileClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleFilePosition(Cobol85Parser.MultipleFilePositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitmentControlClause(Cobol85Parser.CommitmentControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivision(Cobol85Parser.DataDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivisionSection(Cobol85Parser.DataDivisionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSection(Cobol85Parser.FileSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDescriptionEntry(Cobol85Parser.FileDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDescriptionEntryClause(Cobol85Parser.FileDescriptionEntryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#externalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalClause(Cobol85Parser.ExternalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#globalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalClause(Cobol85Parser.GlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContainsClause(Cobol85Parser.BlockContainsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContainsTo(Cobol85Parser.BlockContainsToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClause(Cobol85Parser.RecordContainsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClauseFormat1(Cobol85Parser.RecordContainsClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClauseFormat2(Cobol85Parser.RecordContainsClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClauseFormat3(Cobol85Parser.RecordContainsClauseFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsTo(Cobol85Parser.RecordContainsToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelRecordsClause(Cobol85Parser.LabelRecordsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#valueOfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOfClause(Cobol85Parser.ValueOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#valuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePair(Cobol85Parser.ValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRecordsClause(Cobol85Parser.DataRecordsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageClause(Cobol85Parser.LinageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageAt(Cobol85Parser.LinageAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageFootingAt(Cobol85Parser.LinageFootingAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageLinesAtTop(Cobol85Parser.LinageLinesAtTopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageLinesAtBottom(Cobol85Parser.LinageLinesAtBottomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordingModeClause(Cobol85Parser.RecordingModeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#modeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeStatement(Cobol85Parser.ModeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#codeSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSetClause(Cobol85Parser.CodeSetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportClause(Cobol85Parser.ReportClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBaseSection(Cobol85Parser.DataBaseSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBaseSectionEntry(Cobol85Parser.DataBaseSectionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkingStorageSection(Cobol85Parser.WorkingStorageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#linkageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSection(Cobol85Parser.LinkageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationSection(Cobol85Parser.CommunicationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntry(Cobol85Parser.CommunicationDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntryFormat1(Cobol85Parser.CommunicationDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntryFormat2(Cobol85Parser.CommunicationDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntryFormat3(Cobol85Parser.CommunicationDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationCountClause(Cobol85Parser.DestinationCountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationTableClause(Cobol85Parser.DestinationTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#endKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndKeyClause(Cobol85Parser.EndKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorKeyClause(Cobol85Parser.ErrorKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#messageCountClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageCountClause(Cobol85Parser.MessageCountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#messageDateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageDateClause(Cobol85Parser.MessageDateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageTimeClause(Cobol85Parser.MessageTimeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusKeyClause(Cobol85Parser.StatusKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicDestinationClause(Cobol85Parser.SymbolicDestinationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicQueueClause(Cobol85Parser.SymbolicQueueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicSourceClause(Cobol85Parser.SymbolicSourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicTerminalClause(Cobol85Parser.SymbolicTerminalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicSubQueueClause(Cobol85Parser.SymbolicSubQueueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#textLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLengthClause(Cobol85Parser.TextLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#localStorageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalStorageSection(Cobol85Parser.LocalStorageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenSection(Cobol85Parser.ScreenSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionEntry(Cobol85Parser.ScreenDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBlankClause(Cobol85Parser.ScreenDescriptionBlankClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBellClause(Cobol85Parser.ScreenDescriptionBellClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBlinkClause(Cobol85Parser.ScreenDescriptionBlinkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionEraseClause(Cobol85Parser.ScreenDescriptionEraseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionLightClause(Cobol85Parser.ScreenDescriptionLightClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionGridClause(Cobol85Parser.ScreenDescriptionGridClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionReverseVideoClause(Cobol85Parser.ScreenDescriptionReverseVideoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUnderlineClause(Cobol85Parser.ScreenDescriptionUnderlineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionSizeClause(Cobol85Parser.ScreenDescriptionSizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionLineClause(Cobol85Parser.ScreenDescriptionLineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionColumnClause(Cobol85Parser.ScreenDescriptionColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionForegroundColorClause(Cobol85Parser.ScreenDescriptionForegroundColorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBackgroundColorClause(Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionControlClause(Cobol85Parser.ScreenDescriptionControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionValueClause(Cobol85Parser.ScreenDescriptionValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionPictureClause(Cobol85Parser.ScreenDescriptionPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionFromClause(Cobol85Parser.ScreenDescriptionFromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionToClause(Cobol85Parser.ScreenDescriptionToClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUsingClause(Cobol85Parser.ScreenDescriptionUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUsageClause(Cobol85Parser.ScreenDescriptionUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBlankWhenZeroClause(Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionJustifiedClause(Cobol85Parser.ScreenDescriptionJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionSignClause(Cobol85Parser.ScreenDescriptionSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionAutoClause(Cobol85Parser.ScreenDescriptionAutoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionSecureClause(Cobol85Parser.ScreenDescriptionSecureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionRequiredClause(Cobol85Parser.ScreenDescriptionRequiredClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionPromptClause(Cobol85Parser.ScreenDescriptionPromptClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionPromptOccursClause(Cobol85Parser.ScreenDescriptionPromptOccursClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionFullClause(Cobol85Parser.ScreenDescriptionFullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionZeroFillClause(Cobol85Parser.ScreenDescriptionZeroFillClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportSection(Cobol85Parser.ReportSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescription(Cobol85Parser.ReportDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionEntry(Cobol85Parser.ReportDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionGlobalClause(Cobol85Parser.ReportDescriptionGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionPageLimitClause(Cobol85Parser.ReportDescriptionPageLimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionHeadingClause(Cobol85Parser.ReportDescriptionHeadingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionFirstDetailClause(Cobol85Parser.ReportDescriptionFirstDetailClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionLastDetailClause(Cobol85Parser.ReportDescriptionLastDetailClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionFootingClause(Cobol85Parser.ReportDescriptionFootingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntry(Cobol85Parser.ReportGroupDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntryFormat1(Cobol85Parser.ReportGroupDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntryFormat2(Cobol85Parser.ReportGroupDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntryFormat3(Cobol85Parser.ReportGroupDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupBlankWhenZeroClause(Cobol85Parser.ReportGroupBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupColumnNumberClause(Cobol85Parser.ReportGroupColumnNumberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupIndicateClause(Cobol85Parser.ReportGroupIndicateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupJustifiedClause(Cobol85Parser.ReportGroupJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupLineNumberClause(Cobol85Parser.ReportGroupLineNumberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupLineNumberNextPage(Cobol85Parser.ReportGroupLineNumberNextPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupLineNumberPlus(Cobol85Parser.ReportGroupLineNumberPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupNextGroupClause(Cobol85Parser.ReportGroupNextGroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupNextGroupPlus(Cobol85Parser.ReportGroupNextGroupPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupNextGroupNextPage(Cobol85Parser.ReportGroupNextGroupNextPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupPictureClause(Cobol85Parser.ReportGroupPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupResetClause(Cobol85Parser.ReportGroupResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupSignClause(Cobol85Parser.ReportGroupSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupSourceClause(Cobol85Parser.ReportGroupSourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupSumClause(Cobol85Parser.ReportGroupSumClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeClause(Cobol85Parser.ReportGroupTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeReportHeading(Cobol85Parser.ReportGroupTypeReportHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypePageHeading(Cobol85Parser.ReportGroupTypePageHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeControlHeading(Cobol85Parser.ReportGroupTypeControlHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeDetail(Cobol85Parser.ReportGroupTypeDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeControlFooting(Cobol85Parser.ReportGroupTypeControlFootingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupUsageClause(Cobol85Parser.ReportGroupUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypePageFooting(Cobol85Parser.ReportGroupTypePageFootingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeReportFooting(Cobol85Parser.ReportGroupTypeReportFootingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupValueClause(Cobol85Parser.ReportGroupValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramLibrarySection(Cobol85Parser.ProgramLibrarySectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDescriptionEntry(Cobol85Parser.LibraryDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDescriptionEntryFormat1(Cobol85Parser.LibraryDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDescriptionEntryFormat2(Cobol85Parser.LibraryDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeClauseFormat1(Cobol85Parser.LibraryAttributeClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeClauseFormat2(Cobol85Parser.LibraryAttributeClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeFunction(Cobol85Parser.LibraryAttributeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeParameter(Cobol85Parser.LibraryAttributeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeTitle(Cobol85Parser.LibraryAttributeTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureClauseFormat1(Cobol85Parser.LibraryEntryProcedureClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureClauseFormat2(Cobol85Parser.LibraryEntryProcedureClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureForClause(Cobol85Parser.LibraryEntryProcedureForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureGivingClause(Cobol85Parser.LibraryEntryProcedureGivingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureUsingClause(Cobol85Parser.LibraryEntryProcedureUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureUsingName(Cobol85Parser.LibraryEntryProcedureUsingNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureWithClause(Cobol85Parser.LibraryEntryProcedureWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureWithName(Cobol85Parser.LibraryEntryProcedureWithNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryIsCommonClause(Cobol85Parser.LibraryIsCommonClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryIsGlobalClause(Cobol85Parser.LibraryIsGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntry(Cobol85Parser.DataDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat1(Cobol85Parser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat2(Cobol85Parser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat3(Cobol85Parser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryExecSql(Cobol85Parser.DataDescriptionEntryExecSqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAlignedClause(Cobol85Parser.DataAlignedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlankWhenZeroClause(Cobol85Parser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCommonOwnLocalClause(Cobol85Parser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataExternalClause(Cobol85Parser.DataExternalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataGlobalClause(Cobol85Parser.DataGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataIntegerStringClause(Cobol85Parser.DataIntegerStringClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataJustifiedClause(Cobol85Parser.DataJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursClause(Cobol85Parser.DataOccursClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursTo(Cobol85Parser.DataOccursToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursSort(Cobol85Parser.DataOccursSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPictureClause(Cobol85Parser.DataPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#pictureString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureString(Cobol85Parser.PictureStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#pictureChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureChars(Cobol85Parser.PictureCharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureCardinality(Cobol85Parser.PictureCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataReceivedByClause(Cobol85Parser.DataReceivedByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRecordAreaClause(Cobol85Parser.DataRecordAreaClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRedefinesClause(Cobol85Parser.DataRedefinesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRenamesClause(Cobol85Parser.DataRenamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSignClause(Cobol85Parser.DataSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSynchronizedClause(Cobol85Parser.DataSynchronizedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataThreadLocalClause(Cobol85Parser.DataThreadLocalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeClause(Cobol85Parser.DataTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeDefClause(Cobol85Parser.DataTypeDefClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsageClause(Cobol85Parser.DataUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsingClause(Cobol85Parser.DataUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueClause(Cobol85Parser.DataValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueInterval(Cobol85Parser.DataValueIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueIntervalFrom(Cobol85Parser.DataValueIntervalFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueIntervalTo(Cobol85Parser.DataValueIntervalToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWithLowerBoundsClause(Cobol85Parser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivision(Cobol85Parser.ProcedureDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionUsingClause(Cobol85Parser.ProcedureDivisionUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionGivingClause(Cobol85Parser.ProcedureDivisionGivingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionUsingParameter(Cobol85Parser.ProcedureDivisionUsingParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByReferencePhrase(Cobol85Parser.ProcedureDivisionByReferencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByReference(Cobol85Parser.ProcedureDivisionByReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByValuePhrase(Cobol85Parser.ProcedureDivisionByValuePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByValue(Cobol85Parser.ProcedureDivisionByValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaratives(Cobol85Parser.ProcedureDeclarativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclarative(Cobol85Parser.ProcedureDeclarativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSectionHeader(Cobol85Parser.ProcedureSectionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionBody(Cobol85Parser.ProcedureDivisionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSection(Cobol85Parser.ProcedureSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paragraphs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphs(Cobol85Parser.ParagraphsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(Cobol85Parser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(Cobol85Parser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Cobol85Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptStatement(Cobol85Parser.AcceptStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptFromDateStatement(Cobol85Parser.AcceptFromDateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptFromMnemonicStatement(Cobol85Parser.AcceptFromMnemonicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptFromEscapeKeyStatement(Cobol85Parser.AcceptFromEscapeKeyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptMessageCountStatement(Cobol85Parser.AcceptMessageCountStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStatement(Cobol85Parser.AddStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToStatement(Cobol85Parser.AddToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToGivingStatement(Cobol85Parser.AddToGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCorrespondingStatement(Cobol85Parser.AddCorrespondingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFrom(Cobol85Parser.AddFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTo(Cobol85Parser.AddToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addToGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToGiving(Cobol85Parser.AddToGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#addGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddGiving(Cobol85Parser.AddGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteredGoTo(Cobol85Parser.AlteredGoToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatement(Cobol85Parser.AlterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProceedTo(Cobol85Parser.AlterProceedToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(Cobol85Parser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallUsingPhrase(Cobol85Parser.CallUsingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallUsingParameter(Cobol85Parser.CallUsingParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByReferencePhrase(Cobol85Parser.CallByReferencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByReference(Cobol85Parser.CallByReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByValuePhrase(Cobol85Parser.CallByValuePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByValue(Cobol85Parser.CallByValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByContentPhrase(Cobol85Parser.CallByContentPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callByContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByContent(Cobol85Parser.CallByContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallGivingPhrase(Cobol85Parser.CallGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cancelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelStatement(Cobol85Parser.CancelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cancelCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelCall(Cobol85Parser.CancelCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStatement(Cobol85Parser.CloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseFile(Cobol85Parser.CloseFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseReelUnitStatement(Cobol85Parser.CloseReelUnitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseRelativeStatement(Cobol85Parser.CloseRelativeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOStatement(Cobol85Parser.ClosePortFileIOStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsing(Cobol85Parser.ClosePortFileIOUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsingCloseDisposition(Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsingAssociatedData(Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsingAssociatedDataLength(Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#computeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeStatement(Cobol85Parser.ComputeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#computeStore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeStore(Cobol85Parser.ComputeStoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Cobol85Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(Cobol85Parser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#disableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisableStatement(Cobol85Parser.DisableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(Cobol85Parser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayOperand(Cobol85Parser.DisplayOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayAt(Cobol85Parser.DisplayAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayUpon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayUpon(Cobol85Parser.DisplayUponContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#displayWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayWith(Cobol85Parser.DisplayWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideStatement(Cobol85Parser.DivideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideIntoStatement(Cobol85Parser.DivideIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideIntoGivingStatement(Cobol85Parser.DivideIntoGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideByGivingStatement(Cobol85Parser.DivideByGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideGivingPhrase(Cobol85Parser.DivideGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideInto(Cobol85Parser.DivideIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideGiving(Cobol85Parser.DivideGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#divideRemainder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideRemainder(Cobol85Parser.DivideRemainderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#enableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableStatement(Cobol85Parser.EnableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#entryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryStatement(Cobol85Parser.EntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateStatement(Cobol85Parser.EvaluateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateSelect(Cobol85Parser.EvaluateSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateAlsoSelect(Cobol85Parser.EvaluateAlsoSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateWhenPhrase(Cobol85Parser.EvaluateWhenPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateWhen(Cobol85Parser.EvaluateWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateCondition(Cobol85Parser.EvaluateConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateThrough(Cobol85Parser.EvaluateThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateAlsoCondition(Cobol85Parser.EvaluateAlsoConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateWhenOther(Cobol85Parser.EvaluateWhenOtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#evaluateValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateValue(Cobol85Parser.EvaluateValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecCicsStatement(Cobol85Parser.ExecCicsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSqlStatement(Cobol85Parser.ExecSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSqlImsStatement(Cobol85Parser.ExecSqlImsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExhibitStatement(Cobol85Parser.ExhibitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExhibitOperand(Cobol85Parser.ExhibitOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#exitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(Cobol85Parser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#generateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerateStatement(Cobol85Parser.GenerateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#gobackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGobackStatement(Cobol85Parser.GobackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#goToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatement(Cobol85Parser.GoToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatementSimple(Cobol85Parser.GoToStatementSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToDependingOnStatement(Cobol85Parser.GoToDependingOnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Cobol85Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(Cobol85Parser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(Cobol85Parser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initializeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeStatement(Cobol85Parser.InitializeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeReplacingPhrase(Cobol85Parser.InitializeReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeReplacingBy(Cobol85Parser.InitializeReplacingByContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#initiateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitiateStatement(Cobol85Parser.InitiateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectStatement(Cobol85Parser.InspectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectTallyingPhrase(Cobol85Parser.InspectTallyingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingPhrase(Cobol85Parser.InspectReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectTallyingReplacingPhrase(Cobol85Parser.InspectTallyingReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectConvertingPhrase(Cobol85Parser.InspectConvertingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectFor(Cobol85Parser.InspectForContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectCharacters(Cobol85Parser.InspectCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingCharacters(Cobol85Parser.InspectReplacingCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectAllLeadings(Cobol85Parser.InspectAllLeadingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingAllLeadings(Cobol85Parser.InspectReplacingAllLeadingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectAllLeading(Cobol85Parser.InspectAllLeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingAllLeading(Cobol85Parser.InspectReplacingAllLeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectBy(Cobol85Parser.InspectByContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectTo(Cobol85Parser.InspectToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectBeforeAfter(Cobol85Parser.InspectBeforeAfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(Cobol85Parser.MergeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeOnKeyClause(Cobol85Parser.MergeOnKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeCollatingSequencePhrase(Cobol85Parser.MergeCollatingSequencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeCollatingAlphanumeric(Cobol85Parser.MergeCollatingAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeCollatingNational(Cobol85Parser.MergeCollatingNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUsing(Cobol85Parser.MergeUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeOutputProcedurePhrase(Cobol85Parser.MergeOutputProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeOutputThrough(Cobol85Parser.MergeOutputThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeGivingPhrase(Cobol85Parser.MergeGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mergeGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeGiving(Cobol85Parser.MergeGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStatement(Cobol85Parser.MoveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveToStatement(Cobol85Parser.MoveToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveToSendingArea(Cobol85Parser.MoveToSendingAreaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCorrespondingToStatement(Cobol85Parser.MoveCorrespondingToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCorrespondingToSendingArea(Cobol85Parser.MoveCorrespondingToSendingAreaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyStatement(Cobol85Parser.MultiplyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyRegular(Cobol85Parser.MultiplyRegularContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyRegularOperand(Cobol85Parser.MultiplyRegularOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyGiving(Cobol85Parser.MultiplyGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyGivingOperand(Cobol85Parser.MultiplyGivingOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyGivingResult(Cobol85Parser.MultiplyGivingResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStatement(Cobol85Parser.OpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenInputStatement(Cobol85Parser.OpenInputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenInput(Cobol85Parser.OpenInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenOutputStatement(Cobol85Parser.OpenOutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenOutput(Cobol85Parser.OpenOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openIOStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenIOStatement(Cobol85Parser.OpenIOStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenExtendStatement(Cobol85Parser.OpenExtendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformStatement(Cobol85Parser.PerformStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformInlineStatement(Cobol85Parser.PerformInlineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformProcedureStatement(Cobol85Parser.PerformProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformType(Cobol85Parser.PerformTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performTimes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformTimes(Cobol85Parser.PerformTimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performUntil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformUntil(Cobol85Parser.PerformUntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performVarying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformVarying(Cobol85Parser.PerformVaryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformVaryingClause(Cobol85Parser.PerformVaryingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformVaryingPhrase(Cobol85Parser.PerformVaryingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformAfter(Cobol85Parser.PerformAfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformFrom(Cobol85Parser.PerformFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformBy(Cobol85Parser.PerformByContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#performTestClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformTestClause(Cobol85Parser.PerformTestClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#purgeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurgeStatement(Cobol85Parser.PurgeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(Cobol85Parser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInto(Cobol85Parser.ReadIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadWith(Cobol85Parser.ReadWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#readKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadKey(Cobol85Parser.ReadKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveStatement(Cobol85Parser.ReceiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveFromStatement(Cobol85Parser.ReceiveFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveFrom(Cobol85Parser.ReceiveFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveIntoStatement(Cobol85Parser.ReceiveIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveNoData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveNoData(Cobol85Parser.ReceiveNoDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveWithData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveWithData(Cobol85Parser.ReceiveWithDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveBefore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveBefore(Cobol85Parser.ReceiveBeforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveWith(Cobol85Parser.ReceiveWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveThread(Cobol85Parser.ReceiveThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveSize(Cobol85Parser.ReceiveSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#receiveStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveStatus(Cobol85Parser.ReceiveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseStatement(Cobol85Parser.ReleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Cobol85Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#returnInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInto(Cobol85Parser.ReturnIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteStatement(Cobol85Parser.RewriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteFrom(Cobol85Parser.RewriteFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#searchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchStatement(Cobol85Parser.SearchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#searchVarying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchVarying(Cobol85Parser.SearchVaryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#searchWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchWhen(Cobol85Parser.SearchWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStatement(Cobol85Parser.SendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStatementSync(Cobol85Parser.SendStatementSyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStatementAsync(Cobol85Parser.SendStatementAsyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendFromPhrase(Cobol85Parser.SendFromPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendWithPhrase(Cobol85Parser.SendWithPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendReplacingPhrase(Cobol85Parser.SendReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingPhrase(Cobol85Parser.SendAdvancingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingPage(Cobol85Parser.SendAdvancingPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingLines(Cobol85Parser.SendAdvancingLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingMnemonic(Cobol85Parser.SendAdvancingMnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(Cobol85Parser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetToStatement(Cobol85Parser.SetToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUpDownByStatement(Cobol85Parser.SetUpDownByStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTo(Cobol85Parser.SetToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setToValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetToValue(Cobol85Parser.SetToValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#setByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetByValue(Cobol85Parser.SetByValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortStatement(Cobol85Parser.SortStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOnKeyClause(Cobol85Parser.SortOnKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDuplicatesPhrase(Cobol85Parser.SortDuplicatesPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCollatingSequencePhrase(Cobol85Parser.SortCollatingSequencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCollatingAlphanumeric(Cobol85Parser.SortCollatingAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCollatingNational(Cobol85Parser.SortCollatingNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortInputProcedurePhrase(Cobol85Parser.SortInputProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortInputThrough(Cobol85Parser.SortInputThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortUsing(Cobol85Parser.SortUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOutputProcedurePhrase(Cobol85Parser.SortOutputProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOutputThrough(Cobol85Parser.SortOutputThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortGivingPhrase(Cobol85Parser.SortGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sortGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortGiving(Cobol85Parser.SortGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#startStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartStatement(Cobol85Parser.StartStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#startKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartKey(Cobol85Parser.StartKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatement(Cobol85Parser.StopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringStatement(Cobol85Parser.StringStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSendingPhrase(Cobol85Parser.StringSendingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringSending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSending(Cobol85Parser.StringSendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDelimitedByPhrase(Cobol85Parser.StringDelimitedByPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringForPhrase(Cobol85Parser.StringForPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringIntoPhrase(Cobol85Parser.StringIntoPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringWithPointerPhrase(Cobol85Parser.StringWithPointerPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractStatement(Cobol85Parser.SubtractStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractFromStatement(Cobol85Parser.SubtractFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractFromGivingStatement(Cobol85Parser.SubtractFromGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractCorrespondingStatement(Cobol85Parser.SubtractCorrespondingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractSubtrahend(Cobol85Parser.SubtractSubtrahendContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractMinuend(Cobol85Parser.SubtractMinuendContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractMinuendGiving(Cobol85Parser.SubtractMinuendGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractGiving(Cobol85Parser.SubtractGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractMinuendCorresponding(Cobol85Parser.SubtractMinuendCorrespondingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#terminateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminateStatement(Cobol85Parser.TerminateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringStatement(Cobol85Parser.UnstringStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringSendingPhrase(Cobol85Parser.UnstringSendingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringDelimitedByPhrase(Cobol85Parser.UnstringDelimitedByPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringOrAllPhrase(Cobol85Parser.UnstringOrAllPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringIntoPhrase(Cobol85Parser.UnstringIntoPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringInto(Cobol85Parser.UnstringIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringDelimiterIn(Cobol85Parser.UnstringDelimiterInContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringCountIn(Cobol85Parser.UnstringCountInContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringWithPointerPhrase(Cobol85Parser.UnstringWithPointerPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringTallyingPhrase(Cobol85Parser.UnstringTallyingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(Cobol85Parser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useAfterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseAfterClause(Cobol85Parser.UseAfterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useAfterOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseAfterOn(Cobol85Parser.UseAfterOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useDebugClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDebugClause(Cobol85Parser.UseDebugClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#useDebugOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDebugOn(Cobol85Parser.UseDebugOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(Cobol85Parser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFromPhrase(Cobol85Parser.WriteFromPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingPhrase(Cobol85Parser.WriteAdvancingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingPage(Cobol85Parser.WriteAdvancingPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingLines(Cobol85Parser.WriteAdvancingLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingMnemonic(Cobol85Parser.WriteAdvancingMnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAtEndOfPagePhrase(Cobol85Parser.WriteAtEndOfPagePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteNotAtEndOfPagePhrase(Cobol85Parser.WriteNotAtEndOfPagePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtEndPhrase(Cobol85Parser.AtEndPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotAtEndPhrase(Cobol85Parser.NotAtEndPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidKeyPhrase(Cobol85Parser.InvalidKeyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInvalidKeyPhrase(Cobol85Parser.NotInvalidKeyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnOverflowPhrase(Cobol85Parser.OnOverflowPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOnOverflowPhrase(Cobol85Parser.NotOnOverflowPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSizeErrorPhrase(Cobol85Parser.OnSizeErrorPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOnSizeErrorPhrase(Cobol85Parser.NotOnSizeErrorPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnExceptionClause(Cobol85Parser.OnExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOnExceptionClause(Cobol85Parser.NotOnExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(Cobol85Parser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#plusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(Cobol85Parser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multDivs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivs(Cobol85Parser.MultDivsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#multDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(Cobol85Parser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#powers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowers(Cobol85Parser.PowersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(Cobol85Parser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#basis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasis(Cobol85Parser.BasisContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Cobol85Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#andOrCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrCondition(Cobol85Parser.AndOrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#combinableCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinableCondition(Cobol85Parser.CombinableConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#simpleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCondition(Cobol85Parser.SimpleConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#classCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCondition(Cobol85Parser.ClassConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNameReference(Cobol85Parser.ConditionNameReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNameSubscriptReference(Cobol85Parser.ConditionNameSubscriptReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCondition(Cobol85Parser.RelationConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationSignCondition(Cobol85Parser.RelationSignConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationArithmeticComparison(Cobol85Parser.RelationArithmeticComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCombinedComparison(Cobol85Parser.RelationCombinedComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCombinedCondition(Cobol85Parser.RelationCombinedConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(Cobol85Parser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviation(Cobol85Parser.AbbreviationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Cobol85Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#tableCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCall(Cobol85Parser.TableCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Cobol85Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#referenceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceModifier(Cobol85Parser.ReferenceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#characterPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterPosition(Cobol85Parser.CharacterPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(Cobol85Parser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#subscript_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_(Cobol85Parser.Subscript_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Cobol85Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataName(Cobol85Parser.QualifiedDataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat1(Cobol85Parser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat2(Cobol85Parser.QualifiedDataNameFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat3(Cobol85Parser.QualifiedDataNameFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat4(Cobol85Parser.QualifiedDataNameFormat4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedInData(Cobol85Parser.QualifiedInDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInData(Cobol85Parser.InDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInFile(Cobol85Parser.InFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInMnemonic(Cobol85Parser.InMnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSection(Cobol85Parser.InSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inLibrary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInLibrary(Cobol85Parser.InLibraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#inTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInTable(Cobol85Parser.InTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#alphabetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetName(Cobol85Parser.AlphabetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#assignmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentName(Cobol85Parser.AssignmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#basisName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasisName(Cobol85Parser.BasisNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdName(Cobol85Parser.CdNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(Cobol85Parser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#computerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputerName(Cobol85Parser.ComputerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(Cobol85Parser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataName(Cobol85Parser.DataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#dataDescName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescName(Cobol85Parser.DataDescNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#environmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentName(Cobol85Parser.EnvironmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(Cobol85Parser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(Cobol85Parser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(Cobol85Parser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#languageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageName(Cobol85Parser.LanguageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#libraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryName(Cobol85Parser.LibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#localName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalName(Cobol85Parser.LocalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#mnemonicName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnemonicName(Cobol85Parser.MnemonicNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#paragraphName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphName(Cobol85Parser.ParagraphNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(Cobol85Parser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#programName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramName(Cobol85Parser.ProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#recordName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordName(Cobol85Parser.RecordNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#reportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportName(Cobol85Parser.ReportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(Cobol85Parser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#screenName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenName(Cobol85Parser.ScreenNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#sectionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionName(Cobol85Parser.SectionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#systemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemName(Cobol85Parser.SystemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicCharacter(Cobol85Parser.SymbolicCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#textName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextName(Cobol85Parser.TextNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cobolWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobolWord(Cobol85Parser.CobolWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Cobol85Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(Cobol85Parser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(Cobol85Parser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(Cobol85Parser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicsDfhRespLiteral(Cobol85Parser.CicsDfhRespLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicsDfhValueLiteral(Cobol85Parser.CicsDfhValueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigurativeConstant(Cobol85Parser.FigurativeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#specialRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialRegister(Cobol85Parser.SpecialRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cobol85Parser#commentEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentEntry(Cobol85Parser.CommentEntryContext ctx);
}