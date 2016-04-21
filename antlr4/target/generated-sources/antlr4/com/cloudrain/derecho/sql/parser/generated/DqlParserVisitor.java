// Generated from com\cloudrain\derecho\sql\parser\generated\DqlParser.g4 by ANTLR 4.3
package com.cloudrain.derecho.sql.parser.generated;

// (C) Copyright 2003-2010 Hewlett-Packard Development Company, L.P.
// Generated from DqlParser.g4 - DQL grammar



import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull DqlParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull DqlParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(@NotNull DqlParser.WindowClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorVarRef}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorVarRef(@NotNull DqlParser.FactorVarRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(@NotNull DqlParser.JoinConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(@NotNull DqlParser.ComparisonOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#fieldRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldRef(@NotNull DqlParser.FieldRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#fieldRef2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldRef2(@NotNull DqlParser.FieldRef2Context ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull DqlParser.IdListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(@NotNull DqlParser.SelectClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull DqlParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#dataTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeExpression(@NotNull DqlParser.DataTypeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#conditionAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAnd(@NotNull DqlParser.ConditionAndContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorCaseExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorCaseExpr(@NotNull DqlParser.FactorCaseExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#objectOrSubqueryRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectOrSubqueryRef(@NotNull DqlParser.ObjectOrSubqueryRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#inConditionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInConditionParam(@NotNull DqlParser.InConditionParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#windowClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClauseItem(@NotNull DqlParser.WindowClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull DqlParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#nativeSqlId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeSqlId(@NotNull DqlParser.NativeSqlIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#rangeRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeRows(@NotNull DqlParser.RangeRowsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull DqlParser.SelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#orderByDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByDirection(@NotNull DqlParser.OrderByDirectionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorNull}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNull(@NotNull DqlParser.FactorNullContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#joinDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDirection(@NotNull DqlParser.JoinDirectionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code asAlias}
	 * labeled alternative in {@link DqlParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsAlias(@NotNull DqlParser.AsAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#inCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInCondition(@NotNull DqlParser.InConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#frameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(@NotNull DqlParser.FrameStartContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#plusMinusSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusSign(@NotNull DqlParser.PlusMinusSignContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#dql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDql(@NotNull DqlParser.DqlContext ctx);

	/**
	 * Visit a parse tree produced by the {@code commaObjOrQuery}
	 * labeled alternative in {@link DqlParser#fromClauseItem2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaObjOrQuery(@NotNull DqlParser.CommaObjOrQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#subqueryRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryRef(@NotNull DqlParser.SubqueryRefContext ctx);

	/**
	 * Visit a parse tree produced by the {@code frameStartEnd}
	 * labeled alternative in {@link DqlParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStartEnd(@NotNull DqlParser.FrameStartEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(@NotNull DqlParser.FromClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#dqlCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqlCondition(@NotNull DqlParser.DqlConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(@NotNull DqlParser.OrderByItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#caseExpressionElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpressionElse(@NotNull DqlParser.CaseExpressionElseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#nativeSqlIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeSqlIdList(@NotNull DqlParser.NativeSqlIdListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#timeSeriesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSeriesClause(@NotNull DqlParser.TimeSeriesClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#nativeSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeSql(@NotNull DqlParser.NativeSqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#windowFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunctionExpression(@NotNull DqlParser.WindowFunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(@NotNull DqlParser.SelectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull DqlParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#simpleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCondition(@NotNull DqlParser.SimpleConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#nullCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCondition(@NotNull DqlParser.NullConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull DqlParser.HavingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#timeSeriesLengthTimeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSeriesLengthTimeExpr(@NotNull DqlParser.TimeSeriesLengthTimeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#likeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeCondition(@NotNull DqlParser.LikeConditionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorParenExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorParenExpr(@NotNull DqlParser.FactorParenExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#betweenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenCondition(@NotNull DqlParser.BetweenConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(@NotNull DqlParser.CaseExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code frameStartOnly}
	 * labeled alternative in {@link DqlParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStartOnly(@NotNull DqlParser.FrameStartOnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#subquery2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery2(@NotNull DqlParser.Subquery2Context ctx);

	/**
	 * Visit a parse tree produced by the {@code factorUnarySign}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorUnarySign(@NotNull DqlParser.FactorUnarySignContext ctx);

	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DqlParser#setOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(@NotNull DqlParser.SetOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#existsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsCondition(@NotNull DqlParser.ExistsConditionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorFuncCall}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorFuncCall(@NotNull DqlParser.FactorFuncCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorString}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorString(@NotNull DqlParser.FactorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull DqlParser.FunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(@NotNull DqlParser.CasesContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#objectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectName(@NotNull DqlParser.ObjectNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(@NotNull DqlParser.AliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#orderByList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByList(@NotNull DqlParser.OrderByListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#dqlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqlExpression(@NotNull DqlParser.DqlExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(@NotNull DqlParser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code join}
	 * labeled alternative in {@link DqlParser#fromClauseItem2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(@NotNull DqlParser.JoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#frameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd(@NotNull DqlParser.FrameEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#variableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableRef(@NotNull DqlParser.VariableRefContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorSelectNode}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorSelectNode(@NotNull DqlParser.FactorSelectNodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#objectRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRef(@NotNull DqlParser.ObjectRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(@NotNull DqlParser.SubqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#windowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowName(@NotNull DqlParser.WindowNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(@NotNull DqlParser.WindowDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorFieldRef}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorFieldRef(@NotNull DqlParser.FactorFieldRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#timeSeriesAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSeriesAlias(@NotNull DqlParser.TimeSeriesAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull DqlParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorNumber}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNumber(@NotNull DqlParser.FactorNumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(@NotNull DqlParser.CastExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#caseExpressionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpressionItem(@NotNull DqlParser.CaseExpressionItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#partitionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpression(@NotNull DqlParser.PartitionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#simpleComparisonCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleComparisonCondition(@NotNull DqlParser.SimpleComparisonConditionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorNativeSQL}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNativeSQL(@NotNull DqlParser.FactorNativeSQLContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(@NotNull DqlParser.JoinTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#fromClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClauseList(@NotNull DqlParser.FromClauseListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DqlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(@NotNull DqlParser.GroupByClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code factorCastExpr}
	 * labeled alternative in {@link DqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorCastExpr(@NotNull DqlParser.FactorCastExprContext ctx);
}