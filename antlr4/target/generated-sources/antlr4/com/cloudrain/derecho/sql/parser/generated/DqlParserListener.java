// Generated from com\cloudrain\derecho\sql\parser\generated\DqlParser.g4 by ANTLR 4.3
package com.cloudrain.derecho.sql.parser.generated;

// (C) Copyright 2003-2010 Hewlett-Packard Development Company, L.P.
// Generated from DqlParser.g4 - DQL grammar



import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DqlParser}.
 */
public interface DqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull DqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull DqlParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull DqlParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull DqlParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(@NotNull DqlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(@NotNull DqlParser.WindowClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorVarRef}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorVarRef(@NotNull DqlParser.FactorVarRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorVarRef}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorVarRef(@NotNull DqlParser.FactorVarRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(@NotNull DqlParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(@NotNull DqlParser.JoinConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(@NotNull DqlParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(@NotNull DqlParser.ComparisonOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#fieldRef}.
	 * @param ctx the parse tree
	 */
	void enterFieldRef(@NotNull DqlParser.FieldRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#fieldRef}.
	 * @param ctx the parse tree
	 */
	void exitFieldRef(@NotNull DqlParser.FieldRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#fieldRef2}.
	 * @param ctx the parse tree
	 */
	void enterFieldRef2(@NotNull DqlParser.FieldRef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#fieldRef2}.
	 * @param ctx the parse tree
	 */
	void exitFieldRef2(@NotNull DqlParser.FieldRef2Context ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull DqlParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull DqlParser.IdListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(@NotNull DqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(@NotNull DqlParser.SelectClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull DqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull DqlParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#dataTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeExpression(@NotNull DqlParser.DataTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#dataTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeExpression(@NotNull DqlParser.DataTypeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#conditionAnd}.
	 * @param ctx the parse tree
	 */
	void enterConditionAnd(@NotNull DqlParser.ConditionAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#conditionAnd}.
	 * @param ctx the parse tree
	 */
	void exitConditionAnd(@NotNull DqlParser.ConditionAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorCaseExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorCaseExpr(@NotNull DqlParser.FactorCaseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorCaseExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorCaseExpr(@NotNull DqlParser.FactorCaseExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#objectOrSubqueryRef}.
	 * @param ctx the parse tree
	 */
	void enterObjectOrSubqueryRef(@NotNull DqlParser.ObjectOrSubqueryRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#objectOrSubqueryRef}.
	 * @param ctx the parse tree
	 */
	void exitObjectOrSubqueryRef(@NotNull DqlParser.ObjectOrSubqueryRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#inConditionParam}.
	 * @param ctx the parse tree
	 */
	void enterInConditionParam(@NotNull DqlParser.InConditionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#inConditionParam}.
	 * @param ctx the parse tree
	 */
	void exitInConditionParam(@NotNull DqlParser.InConditionParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#windowClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterWindowClauseItem(@NotNull DqlParser.WindowClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#windowClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitWindowClauseItem(@NotNull DqlParser.WindowClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull DqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull DqlParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#nativeSqlId}.
	 * @param ctx the parse tree
	 */
	void enterNativeSqlId(@NotNull DqlParser.NativeSqlIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#nativeSqlId}.
	 * @param ctx the parse tree
	 */
	void exitNativeSqlId(@NotNull DqlParser.NativeSqlIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#rangeRows}.
	 * @param ctx the parse tree
	 */
	void enterRangeRows(@NotNull DqlParser.RangeRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#rangeRows}.
	 * @param ctx the parse tree
	 */
	void exitRangeRows(@NotNull DqlParser.RangeRowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull DqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull DqlParser.SelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#orderByDirection}.
	 * @param ctx the parse tree
	 */
	void enterOrderByDirection(@NotNull DqlParser.OrderByDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#orderByDirection}.
	 * @param ctx the parse tree
	 */
	void exitOrderByDirection(@NotNull DqlParser.OrderByDirectionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorNull}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNull(@NotNull DqlParser.FactorNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNull}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNull(@NotNull DqlParser.FactorNullContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#joinDirection}.
	 * @param ctx the parse tree
	 */
	void enterJoinDirection(@NotNull DqlParser.JoinDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#joinDirection}.
	 * @param ctx the parse tree
	 */
	void exitJoinDirection(@NotNull DqlParser.JoinDirectionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code asAlias}
	 * labeled alternative in {@link DqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterAsAlias(@NotNull DqlParser.AsAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asAlias}
	 * labeled alternative in {@link DqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitAsAlias(@NotNull DqlParser.AsAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#inCondition}.
	 * @param ctx the parse tree
	 */
	void enterInCondition(@NotNull DqlParser.InConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#inCondition}.
	 * @param ctx the parse tree
	 */
	void exitInCondition(@NotNull DqlParser.InConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(@NotNull DqlParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(@NotNull DqlParser.FrameStartContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#plusMinusSign}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusSign(@NotNull DqlParser.PlusMinusSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#plusMinusSign}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusSign(@NotNull DqlParser.PlusMinusSignContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#dql}.
	 * @param ctx the parse tree
	 */
	void enterDql(@NotNull DqlParser.DqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#dql}.
	 * @param ctx the parse tree
	 */
	void exitDql(@NotNull DqlParser.DqlContext ctx);

	/**
	 * Enter a parse tree produced by the {@code commaObjOrQuery}
	 * labeled alternative in {@link DqlParser#fromClauseItem2}.
	 * @param ctx the parse tree
	 */
	void enterCommaObjOrQuery(@NotNull DqlParser.CommaObjOrQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaObjOrQuery}
	 * labeled alternative in {@link DqlParser#fromClauseItem2}.
	 * @param ctx the parse tree
	 */
	void exitCommaObjOrQuery(@NotNull DqlParser.CommaObjOrQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#subqueryRef}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryRef(@NotNull DqlParser.SubqueryRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#subqueryRef}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryRef(@NotNull DqlParser.SubqueryRefContext ctx);

	/**
	 * Enter a parse tree produced by the {@code frameStartEnd}
	 * labeled alternative in {@link DqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameStartEnd(@NotNull DqlParser.FrameStartEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code frameStartEnd}
	 * labeled alternative in {@link DqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameStartEnd(@NotNull DqlParser.FrameStartEndContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull DqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull DqlParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#dqlCondition}.
	 * @param ctx the parse tree
	 */
	void enterDqlCondition(@NotNull DqlParser.DqlConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#dqlCondition}.
	 * @param ctx the parse tree
	 */
	void exitDqlCondition(@NotNull DqlParser.DqlConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(@NotNull DqlParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(@NotNull DqlParser.OrderByItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#caseExpressionElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionElse(@NotNull DqlParser.CaseExpressionElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#caseExpressionElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionElse(@NotNull DqlParser.CaseExpressionElseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#nativeSqlIdList}.
	 * @param ctx the parse tree
	 */
	void enterNativeSqlIdList(@NotNull DqlParser.NativeSqlIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#nativeSqlIdList}.
	 * @param ctx the parse tree
	 */
	void exitNativeSqlIdList(@NotNull DqlParser.NativeSqlIdListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#timeSeriesClause}.
	 * @param ctx the parse tree
	 */
	void enterTimeSeriesClause(@NotNull DqlParser.TimeSeriesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#timeSeriesClause}.
	 * @param ctx the parse tree
	 */
	void exitTimeSeriesClause(@NotNull DqlParser.TimeSeriesClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#nativeSql}.
	 * @param ctx the parse tree
	 */
	void enterNativeSql(@NotNull DqlParser.NativeSqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#nativeSql}.
	 * @param ctx the parse tree
	 */
	void exitNativeSql(@NotNull DqlParser.NativeSqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#windowFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunctionExpression(@NotNull DqlParser.WindowFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#windowFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunctionExpression(@NotNull DqlParser.WindowFunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(@NotNull DqlParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(@NotNull DqlParser.SelectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DqlParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(@NotNull DqlParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(@NotNull DqlParser.SimpleConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#nullCondition}.
	 * @param ctx the parse tree
	 */
	void enterNullCondition(@NotNull DqlParser.NullConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#nullCondition}.
	 * @param ctx the parse tree
	 */
	void exitNullCondition(@NotNull DqlParser.NullConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(@NotNull DqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(@NotNull DqlParser.HavingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#timeSeriesLengthTimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeSeriesLengthTimeExpr(@NotNull DqlParser.TimeSeriesLengthTimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#timeSeriesLengthTimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeSeriesLengthTimeExpr(@NotNull DqlParser.TimeSeriesLengthTimeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#likeCondition}.
	 * @param ctx the parse tree
	 */
	void enterLikeCondition(@NotNull DqlParser.LikeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#likeCondition}.
	 * @param ctx the parse tree
	 */
	void exitLikeCondition(@NotNull DqlParser.LikeConditionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorParenExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorParenExpr(@NotNull DqlParser.FactorParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorParenExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorParenExpr(@NotNull DqlParser.FactorParenExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#betweenCondition}.
	 * @param ctx the parse tree
	 */
	void enterBetweenCondition(@NotNull DqlParser.BetweenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#betweenCondition}.
	 * @param ctx the parse tree
	 */
	void exitBetweenCondition(@NotNull DqlParser.BetweenConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(@NotNull DqlParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(@NotNull DqlParser.CaseExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code frameStartOnly}
	 * labeled alternative in {@link DqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameStartOnly(@NotNull DqlParser.FrameStartOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code frameStartOnly}
	 * labeled alternative in {@link DqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameStartOnly(@NotNull DqlParser.FrameStartOnlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#subquery2}.
	 * @param ctx the parse tree
	 */
	void enterSubquery2(@NotNull DqlParser.Subquery2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#subquery2}.
	 * @param ctx the parse tree
	 */
	void exitSubquery2(@NotNull DqlParser.Subquery2Context ctx);

	/**
	 * Enter a parse tree produced by the {@code factorUnarySign}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorUnarySign(@NotNull DqlParser.FactorUnarySignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorUnarySign}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorUnarySign(@NotNull DqlParser.FactorUnarySignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DqlParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(@NotNull DqlParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DqlParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(@NotNull DqlParser.SetOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#existsCondition}.
	 * @param ctx the parse tree
	 */
	void enterExistsCondition(@NotNull DqlParser.ExistsConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#existsCondition}.
	 * @param ctx the parse tree
	 */
	void exitExistsCondition(@NotNull DqlParser.ExistsConditionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorFuncCall}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorFuncCall(@NotNull DqlParser.FactorFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFuncCall}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorFuncCall(@NotNull DqlParser.FactorFuncCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorString}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorString(@NotNull DqlParser.FactorStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorString}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorString(@NotNull DqlParser.FactorStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull DqlParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull DqlParser.FunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(@NotNull DqlParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(@NotNull DqlParser.CasesContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(@NotNull DqlParser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(@NotNull DqlParser.ObjectNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull DqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull DqlParser.AliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#orderByList}.
	 * @param ctx the parse tree
	 */
	void enterOrderByList(@NotNull DqlParser.OrderByListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#orderByList}.
	 * @param ctx the parse tree
	 */
	void exitOrderByList(@NotNull DqlParser.OrderByListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#dqlExpression}.
	 * @param ctx the parse tree
	 */
	void enterDqlExpression(@NotNull DqlParser.DqlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#dqlExpression}.
	 * @param ctx the parse tree
	 */
	void exitDqlExpression(@NotNull DqlParser.DqlExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull DqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull DqlParser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code join}
	 * labeled alternative in {@link DqlParser#fromClauseItem2}.
	 * @param ctx the parse tree
	 */
	void enterJoin(@NotNull DqlParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code join}
	 * labeled alternative in {@link DqlParser#fromClauseItem2}.
	 * @param ctx the parse tree
	 */
	void exitJoin(@NotNull DqlParser.JoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(@NotNull DqlParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(@NotNull DqlParser.FrameEndContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterVariableRef(@NotNull DqlParser.VariableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitVariableRef(@NotNull DqlParser.VariableRefContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorSelectNode}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorSelectNode(@NotNull DqlParser.FactorSelectNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorSelectNode}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorSelectNode(@NotNull DqlParser.FactorSelectNodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#objectRef}.
	 * @param ctx the parse tree
	 */
	void enterObjectRef(@NotNull DqlParser.ObjectRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#objectRef}.
	 * @param ctx the parse tree
	 */
	void exitObjectRef(@NotNull DqlParser.ObjectRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(@NotNull DqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(@NotNull DqlParser.SubqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void enterWindowName(@NotNull DqlParser.WindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void exitWindowName(@NotNull DqlParser.WindowNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(@NotNull DqlParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(@NotNull DqlParser.WindowDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorFieldRef}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorFieldRef(@NotNull DqlParser.FactorFieldRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFieldRef}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorFieldRef(@NotNull DqlParser.FactorFieldRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#timeSeriesAlias}.
	 * @param ctx the parse tree
	 */
	void enterTimeSeriesAlias(@NotNull DqlParser.TimeSeriesAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#timeSeriesAlias}.
	 * @param ctx the parse tree
	 */
	void exitTimeSeriesAlias(@NotNull DqlParser.TimeSeriesAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull DqlParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull DqlParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorNumber}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNumber(@NotNull DqlParser.FactorNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNumber}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNumber(@NotNull DqlParser.FactorNumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull DqlParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull DqlParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#caseExpressionItem}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionItem(@NotNull DqlParser.CaseExpressionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#caseExpressionItem}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionItem(@NotNull DqlParser.CaseExpressionItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpression(@NotNull DqlParser.PartitionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpression(@NotNull DqlParser.PartitionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#simpleComparisonCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleComparisonCondition(@NotNull DqlParser.SimpleComparisonConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#simpleComparisonCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleComparisonCondition(@NotNull DqlParser.SimpleComparisonConditionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorNativeSQL}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNativeSQL(@NotNull DqlParser.FactorNativeSQLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNativeSQL}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNativeSQL(@NotNull DqlParser.FactorNativeSQLContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(@NotNull DqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(@NotNull DqlParser.JoinTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#fromClauseList}.
	 * @param ctx the parse tree
	 */
	void enterFromClauseList(@NotNull DqlParser.FromClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#fromClauseList}.
	 * @param ctx the parse tree
	 */
	void exitFromClauseList(@NotNull DqlParser.FromClauseListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(@NotNull DqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(@NotNull DqlParser.GroupByClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code factorCastExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorCastExpr(@NotNull DqlParser.FactorCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorCastExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorCastExpr(@NotNull DqlParser.FactorCastExprContext ctx);
}