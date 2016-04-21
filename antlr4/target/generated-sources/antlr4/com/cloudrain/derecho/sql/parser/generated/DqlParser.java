// Generated from com\cloudrain\derecho\sql\parser\generated\DqlParser.g4 by ANTLR 4.3
package com.cloudrain.derecho.sql.parser.generated;

// (C) Copyright 2003-2010 Hewlett-Packard Development Company, L.P.
// Generated from DqlParser.g4 - DQL grammar



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=76, CAST=42, OVER=43, WHERE=9, INNER=18, ROW=53, ORDER=11, MOD=74, 
		CASE=37, LCPAREN=83, EQUALS=66, NOT=34, GREATEROREQUALS=71, ID=60, FOLLOWING=51, 
		EXCEPT=31, AND=32, QUOTED_ID=59, CROSS=19, NATIVE_SELECT=54, LPAREN=82, 
		NOTEQUAL=67, ML_COMMENT=62, AS=23, RPAREN=81, QUOTE=80, GREATER=69, FULL=14, 
		IN=6, THEN=40, ESCAPE=36, COMMA=77, OFFSET=22, IS=25, PARTITION=44, LEFT=15, 
		PRECEDING=50, ALL=8, QUESTION_MARK=85, LESS=68, PLUS=63, EXISTS=7, DOT=75, 
		SELECT=1, LIKE=35, OUTER=17, BY=4, ASC=12, CONCAT=72, TIMESERIES=46, OVERLAPS=86, 
		NULL=26, ELSE=41, LESSOREQUALS=70, NUMBER=56, ON=5, NATIVE=28, WHITESPACE=58, 
		RANGE=48, RIGHT=16, SEMICOLON=79, HAVING=24, MULT=65, MINUS=64, JOIN=3, 
		CURRENT=52, UNION=29, COLON=78, GROUP=10, INTERSECT=30, VARIABLE=57, WHEN=39, 
		RCPAREN=84, SL_COMMENT=61, OR=33, ROWS=47, WINDOW=45, DIV=73, DESC=13, 
		FROM=2, END=38, UNBOUNDED=49, TOP=21, DISTINCT=20, BETWEEN=27, STRING=55;
	public static final String[] tokenNames = {
		"<INVALID>", "SELECT", "FROM", "JOIN", "BY", "ON", "IN", "EXISTS", "ALL", 
		"WHERE", "GROUP", "ORDER", "ASC", "DESC", "FULL", "LEFT", "RIGHT", "OUTER", 
		"INNER", "CROSS", "DISTINCT", "TOP", "OFFSET", "AS", "HAVING", "IS", "NULL", 
		"BETWEEN", "NATIVE", "UNION", "INTERSECT", "EXCEPT", "AND", "OR", "NOT", 
		"LIKE", "ESCAPE", "CASE", "END", "WHEN", "THEN", "ELSE", "CAST", "OVER", 
		"PARTITION", "WINDOW", "TIMESERIES", "ROWS", "RANGE", "UNBOUNDED", "PRECEDING", 
		"FOLLOWING", "CURRENT", "ROW", "NATIVE_SELECT", "STRING", "NUMBER", "VARIABLE", 
		"WHITESPACE", "QUOTED_ID", "ID", "SL_COMMENT", "ML_COMMENT", "'+'", "'-'", 
		"'*'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'||'", "'/'", "'%'", 
		"'.'", "'$'", "','", "':'", "';'", "'''", "')'", "'('", "'{'", "'}'", 
		"'?'", "'&&'"
	};
	public static final int
		RULE_dql = 0, RULE_dqlExpression = 1, RULE_dqlCondition = 2, RULE_select = 3, 
		RULE_subquery = 4, RULE_setOperator = 5, RULE_subquery2 = 6, RULE_nativeSql = 7, 
		RULE_nativeSqlIdList = 8, RULE_nativeSqlId = 9, RULE_selectClause = 10, 
		RULE_selectList = 11, RULE_selectItem = 12, RULE_alias = 13, RULE_fromClause = 14, 
		RULE_fromClauseList = 15, RULE_fromClauseItem2 = 16, RULE_joinDirection = 17, 
		RULE_joinType = 18, RULE_objectOrSubqueryRef = 19, RULE_objectRef = 20, 
		RULE_subqueryRef = 21, RULE_objectName = 22, RULE_joinCondition = 23, 
		RULE_fieldRef = 24, RULE_fieldRef2 = 25, RULE_whereClause = 26, RULE_groupByClause = 27, 
		RULE_havingClause = 28, RULE_orderByClause = 29, RULE_orderByList = 30, 
		RULE_orderByItem = 31, RULE_orderByDirection = 32, RULE_windowClause = 33, 
		RULE_windowClauseItem = 34, RULE_timeSeriesClause = 35, RULE_timeSeriesAlias = 36, 
		RULE_timeSeriesLengthTimeExpr = 37, RULE_expr = 38, RULE_term = 39, RULE_factor = 40, 
		RULE_plusMinusSign = 41, RULE_caseExpression = 42, RULE_cases = 43, RULE_caseExpressionItem = 44, 
		RULE_caseExpressionElse = 45, RULE_functionCall = 46, RULE_functionExpression = 47, 
		RULE_windowFunctionExpression = 48, RULE_windowDefinition = 49, RULE_windowName = 50, 
		RULE_partitionExpression = 51, RULE_frameClause = 52, RULE_rangeRows = 53, 
		RULE_frameStart = 54, RULE_frameEnd = 55, RULE_condition = 56, RULE_conditionAnd = 57, 
		RULE_simpleCondition = 58, RULE_simpleComparisonCondition = 59, RULE_comparisonOp = 60, 
		RULE_likeCondition = 61, RULE_betweenCondition = 62, RULE_nullCondition = 63, 
		RULE_inCondition = 64, RULE_inConditionParam = 65, RULE_expressionList = 66, 
		RULE_existsCondition = 67, RULE_variableRef = 68, RULE_castExpression = 69, 
		RULE_dataTypeExpression = 70, RULE_idList = 71;
	public static final String[] ruleNames = {
		"dql", "dqlExpression", "dqlCondition", "select", "subquery", "setOperator", 
		"subquery2", "nativeSql", "nativeSqlIdList", "nativeSqlId", "selectClause", 
		"selectList", "selectItem", "alias", "fromClause", "fromClauseList", "fromClauseItem2", 
		"joinDirection", "joinType", "objectOrSubqueryRef", "objectRef", "subqueryRef", 
		"objectName", "joinCondition", "fieldRef", "fieldRef2", "whereClause", 
		"groupByClause", "havingClause", "orderByClause", "orderByList", "orderByItem", 
		"orderByDirection", "windowClause", "windowClauseItem", "timeSeriesClause", 
		"timeSeriesAlias", "timeSeriesLengthTimeExpr", "expr", "term", "factor", 
		"plusMinusSign", "caseExpression", "cases", "caseExpressionItem", "caseExpressionElse", 
		"functionCall", "functionExpression", "windowFunctionExpression", "windowDefinition", 
		"windowName", "partitionExpression", "frameClause", "rangeRows", "frameStart", 
		"frameEnd", "condition", "conditionAnd", "simpleCondition", "simpleComparisonCondition", 
		"comparisonOp", "likeCondition", "betweenCondition", "nullCondition", 
		"inCondition", "inConditionParam", "expressionList", "existsCondition", 
		"variableRef", "castExpression", "dataTypeExpression", "idList"
	};

	@Override
	public String getGrammarFileName() { return "DqlParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public DqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DqlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DqlParser.EOF, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public DqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterDql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitDql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitDql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlContext dql() throws RecognitionException {
		DqlContext _localctx = new DqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144); select();
			}
			setState(145); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DqlExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DqlParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DqlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dqlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterDqlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitDqlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitDqlExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlExpressionContext dqlExpression() throws RecognitionException {
		DqlExpressionContext _localctx = new DqlExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dqlExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); expr();
			setState(148); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DqlConditionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DqlParser.EOF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DqlConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dqlCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterDqlCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitDqlCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitDqlCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlConditionContext dqlCondition() throws RecognitionException {
		DqlConditionContext _localctx = new DqlConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dqlCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); condition();
			setState(151); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); subquery();
			setState(155);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(154); orderByClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Subquery2Context subquery2(int i) {
			return getRuleContext(Subquery2Context.class,i);
		}
		public SetOperatorContext setOperator(int i) {
			return getRuleContext(SetOperatorContext.class,i);
		}
		public List<SetOperatorContext> setOperator() {
			return getRuleContexts(SetOperatorContext.class);
		}
		public List<Subquery2Context> subquery2() {
			return getRuleContexts(Subquery2Context.class);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); subquery2();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) {
				{
				{
				setState(158); setOperator();
				setState(159); subquery2();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetOperatorContext extends ParserRuleContext {
		public SetOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperator; }
	 
		public SetOperatorContext() { }
		public void copyFrom(SetOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetOperationContext extends SetOperatorContext {
		public TerminalNode EXCEPT() { return getToken(DqlParser.EXCEPT, 0); }
		public TerminalNode UNION() { return getToken(DqlParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(DqlParser.ALL, 0); }
		public TerminalNode INTERSECT() { return getToken(DqlParser.INTERSECT, 0); }
		public SetOperationContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetOperatorContext setOperator() throws RecognitionException {
		SetOperatorContext _localctx = new SetOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setOperator);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SetOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166); match(UNION);
				setState(167); match(ALL);
				}
				break;

			case 2:
				_localctx = new SetOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); match(UNION);
				}
				break;

			case 3:
				_localctx = new SetOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169); match(INTERSECT);
				}
				break;

			case 4:
				_localctx = new SetOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170); match(EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery2Context extends ParserRuleContext {
		public NativeSqlContext nativeSql() {
			return getRuleContext(NativeSqlContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TimeSeriesClauseContext timeSeriesClause() {
			return getRuleContext(TimeSeriesClauseContext.class,0);
		}
		public Subquery2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSubquery2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSubquery2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSubquery2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery2Context subquery2() throws RecognitionException {
		Subquery2Context _localctx = new Subquery2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_subquery2);
		int _la;
		try {
			setState(195);
			switch (_input.LA(1)) {
			case NATIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); nativeSql();
				}
				break;
			case SELECT:
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); selectClause();
				setState(175); fromClause();
				setState(177);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(176); whereClause();
					}
				}

				setState(189);
				switch (_input.LA(1)) {
				case TIMESERIES:
					{
					setState(179); timeSeriesClause();
					}
					break;
				case EOF:
				case GROUP:
				case ORDER:
				case HAVING:
				case UNION:
				case INTERSECT:
				case EXCEPT:
				case WINDOW:
				case RPAREN:
					{
					{
					setState(181);
					_la = _input.LA(1);
					if (_la==GROUP) {
						{
						setState(180); groupByClause();
						}
					}

					setState(184);
					_la = _input.LA(1);
					if (_la==HAVING) {
						{
						setState(183); havingClause();
						}
					}

					setState(187);
					_la = _input.LA(1);
					if (_la==WINDOW) {
						{
						setState(186); windowClause();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(LPAREN);
				setState(192); subquery();
				setState(193); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NativeSqlContext extends ParserRuleContext {
		public TerminalNode NATIVE_SELECT() { return getToken(DqlParser.NATIVE_SELECT, 0); }
		public TerminalNode NATIVE() { return getToken(DqlParser.NATIVE, 0); }
		public NativeSqlIdListContext nativeSqlIdList() {
			return getRuleContext(NativeSqlIdListContext.class,0);
		}
		public NativeSqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeSql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterNativeSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitNativeSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitNativeSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeSqlContext nativeSql() throws RecognitionException {
		NativeSqlContext _localctx = new NativeSqlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nativeSql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(NATIVE);
			setState(199);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(198); nativeSqlIdList();
				}
			}

			setState(201); match(NATIVE_SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NativeSqlIdListContext extends ParserRuleContext {
		public List<NativeSqlIdContext> nativeSqlId() {
			return getRuleContexts(NativeSqlIdContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public NativeSqlIdContext nativeSqlId(int i) {
			return getRuleContext(NativeSqlIdContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DqlParser.COMMA, i);
		}
		public NativeSqlIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeSqlIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterNativeSqlIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitNativeSqlIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitNativeSqlIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeSqlIdListContext nativeSqlIdList() throws RecognitionException {
		NativeSqlIdListContext _localctx = new NativeSqlIdListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nativeSqlIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(LPAREN);
			setState(204); nativeSqlId();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205); match(COMMA);
				setState(206); nativeSqlId();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NativeSqlIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public NativeSqlIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeSqlId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterNativeSqlId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitNativeSqlId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitNativeSqlId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeSqlIdContext nativeSqlId() throws RecognitionException {
		NativeSqlIdContext _localctx = new NativeSqlIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nativeSqlId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(DqlParser.OFFSET, 0); }
		public TerminalNode DISTINCT() { return getToken(DqlParser.DISTINCT, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(DqlParser.NUMBER, i);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(DqlParser.NUMBER); }
		public TerminalNode TOP() { return getToken(DqlParser.TOP, 0); }
		public TerminalNode SELECT() { return getToken(DqlParser.SELECT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectClause);
		int _la;
		try {
			setState(230);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(SELECT);
				setState(218);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(217); match(DISTINCT);
					}
				}

				setState(222);
				_la = _input.LA(1);
				if (_la==TOP) {
					{
					setState(220); match(TOP);
					setState(221); match(NUMBER);
					}
				}

				setState(226);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(224); match(OFFSET);
					setState(225); match(NUMBER);
					}
				}

				setState(228); selectList();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DqlParser.COMMA); }
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DqlParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); selectItem();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233); match(COMMA);
				setState(234); selectItem();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsAliasContext extends SelectItemContext {
		public TerminalNode AS() { return getToken(DqlParser.AS, 0); }
		public TerminalNode DOT() { return getToken(DqlParser.DOT, 0); }
		public TerminalNode MULT() { return getToken(DqlParser.MULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public AsAliasContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterAsAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitAsAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitAsAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectItem);
		int _la;
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AsAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240); expr();
				setState(245);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << QUOTED_ID) | (1L << ID))) != 0)) {
					{
					setState(242);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(241); match(AS);
						}
					}

					setState(244); alias();
					}
				}

				}
				break;

			case 2:
				_localctx = new AsAliasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				_la = _input.LA(1);
				if (_la==QUOTED_ID || _la==ID) {
					{
					setState(247); alias();
					setState(248); match(DOT);
					}
				}

				setState(252); match(MULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode QUOTED_ID() { return getToken(DqlParser.QUOTED_ID, 0); }
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public FromClauseListContext fromClauseList() {
			return getRuleContext(FromClauseListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(DqlParser.FROM, 0); }
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(FROM);
			setState(258); fromClauseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseListContext extends ParserRuleContext {
		public List<FromClauseItem2Context> fromClauseItem2() {
			return getRuleContexts(FromClauseItem2Context.class);
		}
		public NativeSqlContext nativeSql() {
			return getRuleContext(NativeSqlContext.class,0);
		}
		public FromClauseItem2Context fromClauseItem2(int i) {
			return getRuleContext(FromClauseItem2Context.class,i);
		}
		public ObjectOrSubqueryRefContext objectOrSubqueryRef() {
			return getRuleContext(ObjectOrSubqueryRefContext.class,0);
		}
		public FromClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClauseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFromClauseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFromClauseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFromClauseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseListContext fromClauseList() throws RecognitionException {
		FromClauseListContext _localctx = new FromClauseListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch (_input.LA(1)) {
			case QUOTED_ID:
			case ID:
			case LPAREN:
				{
				setState(260); objectOrSubqueryRef();
				}
				break;
			case NATIVE:
				{
				setState(261); nativeSql();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << FULL) | (1L << LEFT) | (1L << RIGHT) | (1L << OUTER) | (1L << INNER) | (1L << CROSS))) != 0) || _la==COMMA) {
				{
				{
				setState(264); fromClauseItem2();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseItem2Context extends ParserRuleContext {
		public FromClauseItem2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClauseItem2; }
	 
		public FromClauseItem2Context() { }
		public void copyFrom(FromClauseItem2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinContext extends FromClauseItem2Context {
		public TerminalNode JOIN() { return getToken(DqlParser.JOIN, 0); }
		public JoinDirectionContext joinDirection() {
			return getRuleContext(JoinDirectionContext.class,0);
		}
		public ObjectOrSubqueryRefContext objectOrSubqueryRef() {
			return getRuleContext(ObjectOrSubqueryRefContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinContext(FromClauseItem2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaObjOrQueryContext extends FromClauseItem2Context {
		public NativeSqlContext nativeSql() {
			return getRuleContext(NativeSqlContext.class,0);
		}
		public ObjectOrSubqueryRefContext objectOrSubqueryRef() {
			return getRuleContext(ObjectOrSubqueryRefContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DqlParser.COMMA, 0); }
		public CommaObjOrQueryContext(FromClauseItem2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCommaObjOrQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCommaObjOrQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCommaObjOrQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseItem2Context fromClauseItem2() throws RecognitionException {
		FromClauseItem2Context _localctx = new FromClauseItem2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_fromClauseItem2);
		int _la;
		try {
			setState(286);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new CommaObjOrQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(270); match(COMMA);
				setState(273);
				switch (_input.LA(1)) {
				case QUOTED_ID:
				case ID:
				case LPAREN:
					{
					setState(271); objectOrSubqueryRef();
					}
					break;
				case NATIVE:
					{
					setState(272); nativeSql();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case JOIN:
			case FULL:
			case LEFT:
			case RIGHT:
			case OUTER:
			case INNER:
			case CROSS:
				_localctx = new JoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(276);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(275); joinDirection();
					}
				}

				setState(279);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTER) | (1L << INNER) | (1L << CROSS))) != 0)) {
					{
					setState(278); joinType();
					}
				}

				setState(281); match(JOIN);
				setState(282); objectOrSubqueryRef();
				setState(284);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(283); joinCondition();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinDirectionContext extends ParserRuleContext {
		public TerminalNode FULL() { return getToken(DqlParser.FULL, 0); }
		public TerminalNode LEFT() { return getToken(DqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(DqlParser.RIGHT, 0); }
		public JoinDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterJoinDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitJoinDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitJoinDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinDirectionContext joinDirection() throws RecognitionException {
		JoinDirectionContext _localctx = new JoinDirectionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_joinDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << LEFT) | (1L << RIGHT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(DqlParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(DqlParser.CROSS, 0); }
		public TerminalNode INNER() { return getToken(DqlParser.INNER, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTER) | (1L << INNER) | (1L << CROSS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectOrSubqueryRefContext extends ParserRuleContext {
		public SubqueryRefContext subqueryRef() {
			return getRuleContext(SubqueryRefContext.class,0);
		}
		public ObjectRefContext objectRef() {
			return getRuleContext(ObjectRefContext.class,0);
		}
		public ObjectOrSubqueryRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectOrSubqueryRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterObjectOrSubqueryRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitObjectOrSubqueryRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitObjectOrSubqueryRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectOrSubqueryRefContext objectOrSubqueryRef() throws RecognitionException {
		ObjectOrSubqueryRefContext _localctx = new ObjectOrSubqueryRefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectOrSubqueryRef);
		try {
			setState(294);
			switch (_input.LA(1)) {
			case QUOTED_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(292); objectRef();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(293); subqueryRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectRefContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(DqlParser.AS, 0); }
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ObjectRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterObjectRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitObjectRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitObjectRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectRefContext objectRef() throws RecognitionException {
		ObjectRefContext _localctx = new ObjectRefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objectRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); objectName();
			setState(298);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(297); match(AS);
				}
			}

			setState(301);
			_la = _input.LA(1);
			if (_la==QUOTED_ID || _la==ID) {
				{
				setState(300); alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryRefContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(DqlParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSubqueryRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSubqueryRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSubqueryRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryRefContext subqueryRef() throws RecognitionException {
		SubqueryRefContext _localctx = new SubqueryRefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subqueryRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303); match(LPAREN);
			setState(304); select();
			setState(305); match(RPAREN);
			}
			setState(308);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(307); match(AS);
				}
			}

			setState(310); alias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode QUOTED_ID() { return getToken(DqlParser.QUOTED_ID, 0); }
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(DqlParser.ON, 0); }
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314); match(ON);
			setState(315); condition();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldRefContext extends ParserRuleContext {
		public FieldRef2Context fieldRef2() {
			return getRuleContext(FieldRef2Context.class,0);
		}
		public FieldRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFieldRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFieldRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFieldRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldRefContext fieldRef() throws RecognitionException {
		FieldRefContext _localctx = new FieldRefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); fieldRef2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldRef2Context extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(DqlParser.DOT); }
		public TerminalNode QUOTED_ID(int i) {
			return getToken(DqlParser.QUOTED_ID, i);
		}
		public List<TerminalNode> QUOTED_ID() { return getTokens(DqlParser.QUOTED_ID); }
		public List<TerminalNode> ID() { return getTokens(DqlParser.ID); }
		public TerminalNode DOT(int i) {
			return getToken(DqlParser.DOT, i);
		}
		public TerminalNode ID(int i) {
			return getToken(DqlParser.ID, i);
		}
		public FieldRef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldRef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFieldRef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFieldRef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFieldRef2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldRef2Context fieldRef2() throws RecognitionException {
		FieldRef2Context _localctx = new FieldRef2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldRef2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(320); match(DOT);
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==QUOTED_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(DqlParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(WHERE);
			setState(328); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode BY() { return getToken(DqlParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(DqlParser.GROUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(GROUP);
			setState(331); match(BY);
			setState(332); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(DqlParser.HAVING, 0); }
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(HAVING);
			setState(335); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public OrderByListContext orderByList() {
			return getRuleContext(OrderByListContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(DqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DqlParser.BY, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(ORDER);
			setState(338); match(BY);
			setState(339); orderByList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByListContext extends ParserRuleContext {
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DqlParser.COMMA, i);
		}
		public OrderByListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterOrderByList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitOrderByList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitOrderByList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByListContext orderByList() throws RecognitionException {
		OrderByListContext _localctx = new OrderByListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_orderByList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); orderByItem();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342); match(COMMA);
				setState(343); orderByItem();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public OrderByDirectionContext orderByDirection() {
			return getRuleContext(OrderByDirectionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); expr();
			setState(351);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(350); orderByDirection();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByDirectionContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(DqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(DqlParser.ASC, 0); }
		public OrderByDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterOrderByDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitOrderByDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitOrderByDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByDirectionContext orderByDirection() throws RecognitionException {
		OrderByDirectionContext _localctx = new OrderByDirectionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderByDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(DqlParser.WINDOW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DqlParser.COMMA); }
		public List<WindowClauseItemContext> windowClauseItem() {
			return getRuleContexts(WindowClauseItemContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DqlParser.COMMA, i);
		}
		public WindowClauseItemContext windowClauseItem(int i) {
			return getRuleContext(WindowClauseItemContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_windowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(WINDOW);
			setState(356); windowClauseItem();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357); match(COMMA);
				setState(358); windowClauseItem();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseItemContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(DqlParser.AS, 0); }
		public WindowDefinitionContext windowDefinition() {
			return getRuleContext(WindowDefinitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public WindowClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterWindowClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitWindowClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitWindowClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseItemContext windowClauseItem() throws RecognitionException {
		WindowClauseItemContext _localctx = new WindowClauseItemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_windowClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(ID);
			setState(365); match(AS);
			setState(366); match(LPAREN);
			setState(367); windowDefinition();
			setState(368); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeSeriesClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(DqlParser.AS, 0); }
		public TerminalNode OVER() { return getToken(DqlParser.OVER, 0); }
		public OrderByItemContext orderByItem() {
			return getRuleContext(OrderByItemContext.class,0);
		}
		public TimeSeriesLengthTimeExprContext timeSeriesLengthTimeExpr() {
			return getRuleContext(TimeSeriesLengthTimeExprContext.class,0);
		}
		public TerminalNode TIMESERIES() { return getToken(DqlParser.TIMESERIES, 0); }
		public TerminalNode ORDER() { return getToken(DqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DqlParser.BY, 0); }
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public PartitionExpressionContext partitionExpression() {
			return getRuleContext(PartitionExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public TimeSeriesAliasContext timeSeriesAlias() {
			return getRuleContext(TimeSeriesAliasContext.class,0);
		}
		public TimeSeriesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSeriesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterTimeSeriesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitTimeSeriesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitTimeSeriesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSeriesClauseContext timeSeriesClause() throws RecognitionException {
		TimeSeriesClauseContext _localctx = new TimeSeriesClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_timeSeriesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(TIMESERIES);
			setState(371); timeSeriesAlias();
			setState(372); match(AS);
			setState(373); timeSeriesLengthTimeExpr();
			setState(374); match(OVER);
			setState(375); match(LPAREN);
			setState(377);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(376); partitionExpression();
				}
			}

			setState(379); match(ORDER);
			setState(380); match(BY);
			setState(381); orderByItem();
			setState(382); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeSeriesAliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public TimeSeriesAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSeriesAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterTimeSeriesAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitTimeSeriesAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitTimeSeriesAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSeriesAliasContext timeSeriesAlias() throws RecognitionException {
		TimeSeriesAliasContext _localctx = new TimeSeriesAliasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_timeSeriesAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeSeriesLengthTimeExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TimeSeriesLengthTimeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSeriesLengthTimeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterTimeSeriesLengthTimeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitTimeSeriesLengthTimeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitTimeSeriesLengthTimeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSeriesLengthTimeExprContext timeSeriesLengthTimeExpr() throws RecognitionException {
		TimeSeriesLengthTimeExprContext _localctx = new TimeSeriesLengthTimeExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_timeSeriesLengthTimeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(DqlParser.MINUS, i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(DqlParser.CONCAT); }
		public List<TerminalNode> MINUS() { return getTokens(DqlParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(DqlParser.PLUS); }
		public TerminalNode CONCAT(int i) {
			return getToken(DqlParser.CONCAT, i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(DqlParser.PLUS, i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388); term();
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					_la = _input.LA(1);
					if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (PLUS - 63)) | (1L << (MINUS - 63)) | (1L << (CONCAT - 63)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(390); term();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(DqlParser.DIV); }
		public List<TerminalNode> MULT() { return getTokens(DqlParser.MULT); }
		public TerminalNode DIV(int i) {
			return getToken(DqlParser.DIV, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode MOD(int i) {
			return getToken(DqlParser.MOD, i);
		}
		public TerminalNode MULT(int i) {
			return getToken(DqlParser.MULT, i);
		}
		public List<TerminalNode> MOD() { return getTokens(DqlParser.MOD); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396); factor();
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					_la = _input.LA(1);
					if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (MULT - 65)) | (1L << (DIV - 65)) | (1L << (MOD - 65)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(398); factor();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorFieldRefContext extends FactorContext {
		public FieldRefContext fieldRef() {
			return getRuleContext(FieldRefContext.class,0);
		}
		public FactorFieldRefContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorFieldRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorFieldRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorFieldRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorStringContext extends FactorContext {
		public TerminalNode STRING() { return getToken(DqlParser.STRING, 0); }
		public FactorStringContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorParenExprContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public FactorParenExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorNumberContext extends FactorContext {
		public TerminalNode NUMBER() { return getToken(DqlParser.NUMBER, 0); }
		public FactorNumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorVarRefContext extends FactorContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public FactorVarRefContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorVarRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorNullContext extends FactorContext {
		public TerminalNode NULL() { return getToken(DqlParser.NULL, 0); }
		public FactorNullContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorCaseExprContext extends FactorContext {
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public FactorCaseExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorUnarySignContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PlusMinusSignContext plusMinusSign() {
			return getRuleContext(PlusMinusSignContext.class,0);
		}
		public FactorUnarySignContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorUnarySign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorUnarySign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorUnarySign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorNativeSQLContext extends FactorContext {
		public NativeSqlContext nativeSql() {
			return getRuleContext(NativeSqlContext.class,0);
		}
		public FactorNativeSQLContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorNativeSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorNativeSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorNativeSQL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorFuncCallContext extends FactorContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FactorFuncCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorSelectNodeContext extends FactorContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public FactorSelectNodeContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorSelectNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorSelectNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorSelectNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorCastExprContext extends FactorContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public FactorCastExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFactorCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFactorCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFactorCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		try {
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new FactorSelectNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(404); match(LPAREN);
				setState(405); select();
				setState(406); match(RPAREN);
				}
				}
				break;

			case 2:
				_localctx = new FactorParenExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(408); match(LPAREN);
				setState(409); expr();
				setState(410); match(RPAREN);
				}
				}
				break;

			case 3:
				_localctx = new FactorUnarySignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(412); plusMinusSign();
				setState(413); expr();
				}
				break;

			case 4:
				_localctx = new FactorCaseExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(415); caseExpression();
				}
				break;

			case 5:
				_localctx = new FactorNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(416); match(NUMBER);
				}
				break;

			case 6:
				_localctx = new FactorStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(417); match(STRING);
				}
				break;

			case 7:
				_localctx = new FactorNullContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(418); match(NULL);
				}
				break;

			case 8:
				_localctx = new FactorFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(419); functionCall();
				}
				break;

			case 9:
				_localctx = new FactorVarRefContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(420); variableRef();
				}
				break;

			case 10:
				_localctx = new FactorFieldRefContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(421); fieldRef();
				}
				break;

			case 11:
				_localctx = new FactorNativeSQLContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(422); nativeSql();
				}
				break;

			case 12:
				_localctx = new FactorCastExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(423); castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusMinusSignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(DqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(DqlParser.PLUS, 0); }
		public PlusMinusSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterPlusMinusSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitPlusMinusSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitPlusMinusSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusSignContext plusMinusSign() throws RecognitionException {
		PlusMinusSignContext _localctx = new PlusMinusSignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_plusMinusSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CASE() { return getToken(DqlParser.CASE, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode END() { return getToken(DqlParser.END, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(CASE);
			setState(430);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NULL - 26)) | (1L << (NATIVE - 26)) | (1L << (CASE - 26)) | (1L << (CAST - 26)) | (1L << (STRING - 26)) | (1L << (NUMBER - 26)) | (1L << (VARIABLE - 26)) | (1L << (QUOTED_ID - 26)) | (1L << (ID - 26)) | (1L << (PLUS - 26)) | (1L << (MINUS - 26)) | (1L << (LPAREN - 26)) | (1L << (QUESTION_MARK - 26)))) != 0)) {
				{
				setState(429); expr();
				}
			}

			setState(432); cases();
			setState(433); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public CaseExpressionElseContext caseExpressionElse() {
			return getRuleContext(CaseExpressionElseContext.class,0);
		}
		public CaseExpressionItemContext caseExpressionItem(int i) {
			return getRuleContext(CaseExpressionItemContext.class,i);
		}
		public List<CaseExpressionItemContext> caseExpressionItem() {
			return getRuleContexts(CaseExpressionItemContext.class);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435); caseExpressionItem();
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(441);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(440); caseExpressionElse();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionItemContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(DqlParser.THEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WHEN() { return getToken(DqlParser.WHEN, 0); }
		public CaseExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCaseExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCaseExpressionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCaseExpressionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionItemContext caseExpressionItem() throws RecognitionException {
		CaseExpressionItemContext _localctx = new CaseExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_caseExpressionItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(WHEN);
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(444); expr();
				}
				break;

			case 2:
				{
				setState(445); condition();
				}
				break;
			}
			setState(448); match(THEN);
			setState(449); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionElseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(DqlParser.ELSE, 0); }
		public CaseExpressionElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpressionElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCaseExpressionElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCaseExpressionElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCaseExpressionElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionElseContext caseExpressionElse() throws RecognitionException {
		CaseExpressionElseContext _localctx = new CaseExpressionElseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_caseExpressionElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(ELSE);
			setState(452); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public WindowFunctionExpressionContext windowFunctionExpression() {
			return getRuleContext(WindowFunctionExpressionContext.class,0);
		}
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); functionExpression();
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(455); windowFunctionExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode MULT() { return getToken(DqlParser.MULT, 0); }
		public TerminalNode DISTINCT() { return getToken(DqlParser.DISTINCT, 0); }
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(ID);
			setState(459); match(LPAREN);
			setState(461);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(460); match(DISTINCT);
				}
			}

			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(464);
				_la = _input.LA(1);
				if (_la==MULT) {
					{
					setState(463); match(MULT);
					}
				}

				}
				break;

			case 2:
				{
				setState(467);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NULL - 26)) | (1L << (NATIVE - 26)) | (1L << (CASE - 26)) | (1L << (CAST - 26)) | (1L << (STRING - 26)) | (1L << (NUMBER - 26)) | (1L << (VARIABLE - 26)) | (1L << (QUOTED_ID - 26)) | (1L << (ID - 26)) | (1L << (PLUS - 26)) | (1L << (MINUS - 26)) | (1L << (LPAREN - 26)) | (1L << (QUESTION_MARK - 26)))) != 0)) {
					{
					setState(466); expressionList();
					}
				}

				}
				break;
			}
			setState(471); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunctionExpressionContext extends ParserRuleContext {
		public WindowNameContext windowName() {
			return getRuleContext(WindowNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(DqlParser.OVER, 0); }
		public WindowDefinitionContext windowDefinition() {
			return getRuleContext(WindowDefinitionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public WindowFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterWindowFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitWindowFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitWindowFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionExpressionContext windowFunctionExpression() throws RecognitionException {
		WindowFunctionExpressionContext _localctx = new WindowFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_windowFunctionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); match(OVER);
			setState(479);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(474); match(LPAREN);
				setState(475); windowDefinition();
				setState(476); match(RPAREN);
				}
				}
				break;
			case ID:
				{
				setState(478); windowName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowDefinitionContext extends ParserRuleContext {
		public WindowNameContext windowName() {
			return getRuleContext(WindowNameContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public PartitionExpressionContext partitionExpression() {
			return getRuleContext(PartitionExpressionContext.class,0);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterWindowDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitWindowDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitWindowDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_windowDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(481); windowName();
				}
				break;
			case PARTITION:
				{
				setState(482); partitionExpression();
				}
				break;
			case ORDER:
			case ROWS:
			case RANGE:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(486);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(485); orderByClause();
				}
			}

			setState(489);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(488); frameClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DqlParser.ID, 0); }
		public WindowNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterWindowName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitWindowName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitWindowName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowNameContext windowName() throws RecognitionException {
		WindowNameContext _localctx = new WindowNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_windowName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode BY() { return getToken(DqlParser.BY, 0); }
		public TerminalNode PARTITION() { return getToken(DqlParser.PARTITION, 0); }
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterPartitionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitPartitionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitPartitionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_partitionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(PARTITION);
			setState(494); match(BY);
			setState(495); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameClauseContext extends ParserRuleContext {
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
	 
		public FrameClauseContext() { }
		public void copyFrom(FrameClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FrameStartOnlyContext extends FrameClauseContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public RangeRowsContext rangeRows() {
			return getRuleContext(RangeRowsContext.class,0);
		}
		public FrameStartOnlyContext(FrameClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFrameStartOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFrameStartOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFrameStartOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameStartEndContext extends FrameClauseContext {
		public TerminalNode BETWEEN() { return getToken(DqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DqlParser.AND, 0); }
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public RangeRowsContext rangeRows() {
			return getRuleContext(RangeRowsContext.class,0);
		}
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameStartEndContext(FrameClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFrameStartEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFrameStartEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFrameStartEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_frameClause);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new FrameStartOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(497); rangeRows();
				setState(498); frameStart();
				}
				}
				break;

			case 2:
				_localctx = new FrameStartEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(500); rangeRows();
				setState(501); match(BETWEEN);
				setState(502); frameStart();
				setState(503); match(AND);
				setState(504); frameEnd();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeRowsContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(DqlParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(DqlParser.ROWS, 0); }
		public RangeRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeRows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterRangeRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitRangeRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitRangeRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeRowsContext rangeRows() throws RecognitionException {
		RangeRowsContext _localctx = new RangeRowsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rangeRows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(DqlParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(DqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(DqlParser.PRECEDING, 0); }
		public TerminalNode CURRENT() { return getToken(DqlParser.CURRENT, 0); }
		public TerminalNode NUMBER() { return getToken(DqlParser.NUMBER, 0); }
		public TerminalNode FOLLOWING() { return getToken(DqlParser.FOLLOWING, 0); }
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFrameStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFrameStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFrameStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_frameStart);
		try {
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(510); match(UNBOUNDED);
				setState(511); match(PRECEDING);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(512); match(NUMBER);
				setState(513); match(PRECEDING);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(514); match(CURRENT);
				setState(515); match(ROW);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(516); match(NUMBER);
				setState(517); match(FOLLOWING);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameEndContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(DqlParser.UNBOUNDED, 0); }
		public TerminalNode ROW() { return getToken(DqlParser.ROW, 0); }
		public TerminalNode PRECEDING() { return getToken(DqlParser.PRECEDING, 0); }
		public TerminalNode CURRENT() { return getToken(DqlParser.CURRENT, 0); }
		public TerminalNode NUMBER() { return getToken(DqlParser.NUMBER, 0); }
		public TerminalNode FOLLOWING() { return getToken(DqlParser.FOLLOWING, 0); }
		public FrameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterFrameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitFrameEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitFrameEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameEndContext frameEnd() throws RecognitionException {
		FrameEndContext _localctx = new FrameEndContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_frameEnd);
		try {
			setState(528);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(520); match(NUMBER);
				setState(521); match(PRECEDING);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(522); match(CURRENT);
				setState(523); match(ROW);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(524); match(NUMBER);
				setState(525); match(FOLLOWING);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(526); match(UNBOUNDED);
				setState(527); match(FOLLOWING);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionAndContext conditionAnd(int i) {
			return getRuleContext(ConditionAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(DqlParser.OR); }
		public List<ConditionAndContext> conditionAnd() {
			return getRuleContexts(ConditionAndContext.class);
		}
		public TerminalNode OR(int i) {
			return getToken(DqlParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); conditionAnd();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(531); match(OR);
				setState(532); conditionAnd();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionAndContext extends ParserRuleContext {
		public SimpleConditionContext simpleCondition(int i) {
			return getRuleContext(SimpleConditionContext.class,i);
		}
		public List<SimpleConditionContext> simpleCondition() {
			return getRuleContexts(SimpleConditionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(DqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DqlParser.AND, i);
		}
		public ConditionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterConditionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitConditionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitConditionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionAndContext conditionAnd() throws RecognitionException {
		ConditionAndContext _localctx = new ConditionAndContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_conditionAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); simpleCondition();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(539); match(AND);
				setState(540); simpleCondition();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleConditionContext extends ParserRuleContext {
		public NativeSqlContext nativeSql() {
			return getRuleContext(NativeSqlContext.class,0);
		}
		public InConditionContext inCondition() {
			return getRuleContext(InConditionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NullConditionContext nullCondition() {
			return getRuleContext(NullConditionContext.class,0);
		}
		public SimpleConditionContext simpleCondition() {
			return getRuleContext(SimpleConditionContext.class,0);
		}
		public SimpleComparisonConditionContext simpleComparisonCondition() {
			return getRuleContext(SimpleComparisonConditionContext.class,0);
		}
		public BetweenConditionContext betweenCondition() {
			return getRuleContext(BetweenConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DqlParser.NOT, 0); }
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public LikeConditionContext likeCondition() {
			return getRuleContext(LikeConditionContext.class,0);
		}
		public ExistsConditionContext existsCondition() {
			return getRuleContext(ExistsConditionContext.class,0);
		}
		public SimpleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSimpleCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSimpleCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleConditionContext simpleCondition() throws RecognitionException {
		SimpleConditionContext _localctx = new SimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_simpleCondition);
		try {
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(546); match(LPAREN);
				setState(547); condition();
				setState(548); match(RPAREN);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(550); match(NOT);
				setState(551); simpleCondition();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552); existsCondition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553); likeCondition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(554); nullCondition();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(555); inCondition();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(556); simpleComparisonCondition();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(557); betweenCondition();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(558); nativeSql();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleComparisonConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public SimpleComparisonConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleComparisonCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterSimpleComparisonCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitSimpleComparisonCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitSimpleComparisonCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleComparisonConditionContext simpleComparisonCondition() throws RecognitionException {
		SimpleComparisonConditionContext _localctx = new SimpleComparisonConditionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_simpleComparisonCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); expr();
			setState(562); comparisonOp();
			setState(563); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOpContext extends ParserRuleContext {
		public TerminalNode LESSOREQUALS() { return getToken(DqlParser.LESSOREQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(DqlParser.EQUALS, 0); }
		public TerminalNode LESS() { return getToken(DqlParser.LESS, 0); }
		public TerminalNode OVERLAPS() { return getToken(DqlParser.OVERLAPS, 0); }
		public TerminalNode GREATER() { return getToken(DqlParser.GREATER, 0); }
		public TerminalNode GREATEROREQUALS() { return getToken(DqlParser.GREATEROREQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(DqlParser.NOTEQUAL, 0); }
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitComparisonOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitComparisonOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (EQUALS - 66)) | (1L << (NOTEQUAL - 66)) | (1L << (LESS - 66)) | (1L << (GREATER - 66)) | (1L << (LESSOREQUALS - 66)) | (1L << (GREATEROREQUALS - 66)) | (1L << (OVERLAPS - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeConditionContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode ESCAPE() { return getToken(DqlParser.ESCAPE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DqlParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(DqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(DqlParser.STRING, 0); }
		public LikeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterLikeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitLikeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitLikeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeConditionContext likeCondition() throws RecognitionException {
		LikeConditionContext _localctx = new LikeConditionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_likeCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); ((LikeConditionContext)_localctx).e1 = expr();
			setState(569);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(568); match(NOT);
				}
			}

			setState(571); match(LIKE);
			setState(572); ((LikeConditionContext)_localctx).e2 = expr();
			setState(575);
			_la = _input.LA(1);
			if (_la==ESCAPE) {
				{
				setState(573); match(ESCAPE);
				setState(574); match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BetweenConditionContext extends ParserRuleContext {
		public ExprContext e;
		public ExprContext bound1;
		public ExprContext bound2;
		public TerminalNode BETWEEN() { return getToken(DqlParser.BETWEEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AND() { return getToken(DqlParser.AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DqlParser.NOT, 0); }
		public BetweenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterBetweenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitBetweenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitBetweenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenConditionContext betweenCondition() throws RecognitionException {
		BetweenConditionContext _localctx = new BetweenConditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_betweenCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); ((BetweenConditionContext)_localctx).e = expr();
			setState(579);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(578); match(NOT);
				}
			}

			setState(581); match(BETWEEN);
			setState(582); ((BetweenConditionContext)_localctx).bound1 = expr();
			setState(583); match(AND);
			setState(584); ((BetweenConditionContext)_localctx).bound2 = expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DqlParser.NOT, 0); }
		public TerminalNode IS() { return getToken(DqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(DqlParser.NULL, 0); }
		public NullConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterNullCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitNullCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitNullCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullConditionContext nullCondition() throws RecognitionException {
		NullConditionContext _localctx = new NullConditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nullCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); expr();
			setState(587); match(IS);
			setState(589);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(588); match(NOT);
				}
			}

			setState(591); match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InConditionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(DqlParser.IN, 0); }
		public InConditionParamContext inConditionParam() {
			return getRuleContext(InConditionParamContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DqlParser.NOT, 0); }
		public InConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterInCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitInCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitInCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InConditionContext inCondition() throws RecognitionException {
		InConditionContext _localctx = new InConditionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_inCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); expr();
			setState(595);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(594); match(NOT);
				}
			}

			setState(597); match(IN);
			setState(598); inConditionParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InConditionParamContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public InConditionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inConditionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterInConditionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitInConditionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitInConditionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InConditionParamContext inConditionParam() throws RecognitionException {
		InConditionParamContext _localctx = new InConditionParamContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_inConditionParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); match(LPAREN);
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(601); subquery();
				}
				break;

			case 2:
				{
				setState(602); expressionList();
				}
				break;
			}
			setState(605); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DqlParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DqlParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); expr();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(608); match(COMMA);
				setState(609); expr();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsConditionContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(DqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public ExistsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterExistsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitExistsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitExistsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsConditionContext existsCondition() throws RecognitionException {
		ExistsConditionContext _localctx = new ExistsConditionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_existsCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); match(EXISTS);
			setState(616); match(LPAREN);
			setState(617); subquery();
			setState(618); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableRefContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(DqlParser.VARIABLE, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(DqlParser.QUESTION_MARK, 0); }
		public VariableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterVariableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitVariableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitVariableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_variableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==QUESTION_MARK) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(DqlParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public DataTypeExpressionContext dataTypeExpression() {
			return getRuleContext(DataTypeExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public TerminalNode CAST() { return getToken(DqlParser.CAST, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(CAST);
			setState(623); match(LPAREN);
			setState(624); expr();
			setState(625); match(AS);
			setState(626); dataTypeExpression();
			setState(627); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeExpressionContext extends ParserRuleContext {
		public Token precision_length;
		public Token scale;
		public TerminalNode COMMA() { return getToken(DqlParser.COMMA, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(DqlParser.NUMBER, i);
		}
		public TerminalNode RPAREN() { return getToken(DqlParser.RPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(DqlParser.NUMBER); }
		public TerminalNode LPAREN() { return getToken(DqlParser.LPAREN, 0); }
		public DataTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterDataTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitDataTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitDataTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeExpressionContext dataTypeExpression() throws RecognitionException {
		DataTypeExpressionContext _localctx = new DataTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dataTypeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); idList();
			setState(637);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(630); match(LPAREN);
				setState(631); ((DataTypeExpressionContext)_localctx).precision_length = match(NUMBER);
				setState(634);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(632); match(COMMA);
					setState(633); ((DataTypeExpressionContext)_localctx).scale = match(NUMBER);
					}
				}

				setState(636); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DqlParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlParserListener ) ((DqlParserListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DqlParserVisitor ) return ((DqlParserVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); match(ID);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(640); match(ID);
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u0289\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\u009e\n\5\3\6\3\6"+
		"\3\6\3\6\7\6\u00a4\n\6\f\6\16\6\u00a7\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00ae"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\b\3\b\5\b\u00b8\n\b\3\b\5\b\u00bb"+
		"\n\b\3\b\5\b\u00be\n\b\5\b\u00c0\n\b\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\t"+
		"\3\t\5\t\u00ca\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5"+
		"\13\n\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u00dd\n\f\3\f\3\f\5\f\u00e1\n\f\3"+
		"\f\3\f\5\f\u00e5\n\f\3\f\3\f\5\f\u00e9\n\f\3\r\3\r\3\r\7\r\u00ee\n\r\f"+
		"\r\16\r\u00f1\13\r\3\16\3\16\5\16\u00f5\n\16\3\16\5\16\u00f8\n\16\3\16"+
		"\3\16\3\16\5\16\u00fd\n\16\3\16\5\16\u0100\n\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\5\21\u0109\n\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13"+
		"\21\3\22\3\22\3\22\5\22\u0114\n\22\3\22\5\22\u0117\n\22\3\22\5\22\u011a"+
		"\n\22\3\22\3\22\3\22\5\22\u011f\n\22\5\22\u0121\n\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\5\25\u0129\n\25\3\26\3\26\5\26\u012d\n\26\3\26\5\26\u0130"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u0137\n\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u0145\n\33\f\33\16\33\u0148\13"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \7 \u015b\n \f \16 \u015e\13 \3!\3!\5!\u0162\n!\3\"\3\"\3"+
		"#\3#\3#\3#\7#\u016a\n#\f#\16#\u016d\13#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\5%\u017c\n%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\7(\u018a\n"+
		"(\f(\16(\u018d\13(\3)\3)\3)\7)\u0192\n)\f)\16)\u0195\13)\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01ab\n*\3+\3+\3,\3"+
		",\5,\u01b1\n,\3,\3,\3,\3-\6-\u01b7\n-\r-\16-\u01b8\3-\5-\u01bc\n-\3.\3"+
		".\3.\5.\u01c1\n.\3.\3.\3.\3/\3/\3/\3\60\3\60\5\60\u01cb\n\60\3\61\3\61"+
		"\3\61\5\61\u01d0\n\61\3\61\5\61\u01d3\n\61\3\61\5\61\u01d6\n\61\5\61\u01d8"+
		"\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01e2\n\62\3\63\3\63"+
		"\5\63\u01e6\n\63\3\63\5\63\u01e9\n\63\3\63\5\63\u01ec\n\63\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01fd"+
		"\n\66\3\67\3\67\38\38\38\38\38\38\38\38\58\u0209\n8\39\39\39\39\39\39"+
		"\39\39\59\u0213\n9\3:\3:\3:\7:\u0218\n:\f:\16:\u021b\13:\3;\3;\3;\7;\u0220"+
		"\n;\f;\16;\u0223\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0232\n"+
		"<\3=\3=\3=\3=\3>\3>\3?\3?\5?\u023c\n?\3?\3?\3?\3?\5?\u0242\n?\3@\3@\5"+
		"@\u0246\n@\3@\3@\3@\3@\3@\3A\3A\3A\5A\u0250\nA\3A\3A\3B\3B\5B\u0256\n"+
		"B\3B\3B\3B\3C\3C\3C\5C\u025e\nC\3C\3C\3D\3D\3D\7D\u0265\nD\fD\16D\u0268"+
		"\13D\3E\3E\3E\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\5H\u027d"+
		"\nH\3H\5H\u0280\nH\3I\3I\7I\u0284\nI\fI\16I\u0287\13I\3I\2\2J\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\2\f\3\2=>\3\2\20\22\3\2\23\25\3\2\16\17\4\2ABJJ\4\2CCKL\3\2AB\3\2\61"+
		"\62\4\2DIXX\4\2;;WW\u029d\2\u0092\3\2\2\2\4\u0095\3\2\2\2\6\u0098\3\2"+
		"\2\2\b\u009b\3\2\2\2\n\u009f\3\2\2\2\f\u00ad\3\2\2\2\16\u00c5\3\2\2\2"+
		"\20\u00c7\3\2\2\2\22\u00cd\3\2\2\2\24\u00d8\3\2\2\2\26\u00e8\3\2\2\2\30"+
		"\u00ea\3\2\2\2\32\u00ff\3\2\2\2\34\u0101\3\2\2\2\36\u0103\3\2\2\2 \u0108"+
		"\3\2\2\2\"\u0120\3\2\2\2$\u0122\3\2\2\2&\u0124\3\2\2\2(\u0128\3\2\2\2"+
		"*\u012a\3\2\2\2,\u0131\3\2\2\2.\u013a\3\2\2\2\60\u013c\3\2\2\2\62\u013f"+
		"\3\2\2\2\64\u0141\3\2\2\2\66\u0149\3\2\2\28\u014c\3\2\2\2:\u0150\3\2\2"+
		"\2<\u0153\3\2\2\2>\u0157\3\2\2\2@\u015f\3\2\2\2B\u0163\3\2\2\2D\u0165"+
		"\3\2\2\2F\u016e\3\2\2\2H\u0174\3\2\2\2J\u0182\3\2\2\2L\u0184\3\2\2\2N"+
		"\u0186\3\2\2\2P\u018e\3\2\2\2R\u01aa\3\2\2\2T\u01ac\3\2\2\2V\u01ae\3\2"+
		"\2\2X\u01b6\3\2\2\2Z\u01bd\3\2\2\2\\\u01c5\3\2\2\2^\u01c8\3\2\2\2`\u01cc"+
		"\3\2\2\2b\u01db\3\2\2\2d\u01e5\3\2\2\2f\u01ed\3\2\2\2h\u01ef\3\2\2\2j"+
		"\u01fc\3\2\2\2l\u01fe\3\2\2\2n\u0208\3\2\2\2p\u0212\3\2\2\2r\u0214\3\2"+
		"\2\2t\u021c\3\2\2\2v\u0231\3\2\2\2x\u0233\3\2\2\2z\u0237\3\2\2\2|\u0239"+
		"\3\2\2\2~\u0243\3\2\2\2\u0080\u024c\3\2\2\2\u0082\u0253\3\2\2\2\u0084"+
		"\u025a\3\2\2\2\u0086\u0261\3\2\2\2\u0088\u0269\3\2\2\2\u008a\u026e\3\2"+
		"\2\2\u008c\u0270\3\2\2\2\u008e\u0277\3\2\2\2\u0090\u0281\3\2\2\2\u0092"+
		"\u0093\5\b\5\2\u0093\u0094\7\2\2\3\u0094\3\3\2\2\2\u0095\u0096\5N(\2\u0096"+
		"\u0097\7\2\2\3\u0097\5\3\2\2\2\u0098\u0099\5r:\2\u0099\u009a\7\2\2\3\u009a"+
		"\7\3\2\2\2\u009b\u009d\5\n\6\2\u009c\u009e\5<\37\2\u009d\u009c\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a5\5\16\b\2\u00a0\u00a1"+
		"\5\f\7\2\u00a1\u00a2\5\16\b\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\13"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00ae\7\n\2\2"+
		"\u00aa\u00ae\7\37\2\2\u00ab\u00ae\7 \2\2\u00ac\u00ae\7!\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\r\3\2\2\2\u00af\u00c6\5\20\t\2\u00b0\u00b1\5\26\f\2\u00b1\u00b3\5\36"+
		"\20\2\u00b2\u00b4\5\66\34\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00bf\3\2\2\2\u00b5\u00c0\5H%\2\u00b6\u00b8\58\35\2\u00b7\u00b6\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5:\36\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\5D#\2\u00bd"+
		"\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b5\3\2"+
		"\2\2\u00bf\u00b7\3\2\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\7T\2\2\u00c2"+
		"\u00c3\5\n\6\2\u00c3\u00c4\7S\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00af\3\2"+
		"\2\2\u00c5\u00b0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00c9"+
		"\7\36\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00cc\78\2\2\u00cc\21\3\2\2\2\u00cd\u00ce\7"+
		"T\2\2\u00ce\u00d3\5\24\13\2\u00cf\u00d0\7O\2\2\u00d0\u00d2\5\24\13\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7S\2\2\u00d7"+
		"\23\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\25\3\2\2\2\u00da\u00dc\7\3\2\2\u00db"+
		"\u00dd\7\26\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e1\7:\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e5\7"+
		":\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\5\30\r\2\u00e7\u00e9\3\2\2\2\u00e8\u00da\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\27\3\2\2\2\u00ea\u00ef\5\32\16\2\u00eb\u00ec\7O\2\2\u00ec"+
		"\u00ee\5\32\16\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\31\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f7\5N(\2\u00f3\u00f5\7\31\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u0100\3\2\2\2\u00f9\u00fa\5\34\17\2\u00fa\u00fb\7"+
		"M\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\7C\2\2\u00ff\u00f2\3\2\2\2\u00ff\u00fc\3\2"+
		"\2\2\u0100\33\3\2\2\2\u0101\u0102\t\2\2\2\u0102\35\3\2\2\2\u0103\u0104"+
		"\7\4\2\2\u0104\u0105\5 \21\2\u0105\37\3\2\2\2\u0106\u0109\5(\25\2\u0107"+
		"\u0109\5\20\t\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010d\3"+
		"\2\2\2\u010a\u010c\5\"\22\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e!\3\2\2\2\u010f\u010d\3\2\2\2"+
		"\u0110\u0113\7O\2\2\u0111\u0114\5(\25\2\u0112\u0114\5\20\t\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0121\3\2\2\2\u0115\u0117\5$\23\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\5&"+
		"\24\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\7\5\2\2\u011c\u011e\5(\25\2\u011d\u011f\5\60\31\2\u011e\u011d\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0110\3\2\2\2\u0120"+
		"\u0116\3\2\2\2\u0121#\3\2\2\2\u0122\u0123\t\3\2\2\u0123%\3\2\2\2\u0124"+
		"\u0125\t\4\2\2\u0125\'\3\2\2\2\u0126\u0129\5*\26\2\u0127\u0129\5,\27\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129)\3\2\2\2\u012a\u012c\5"+
		".\30\2\u012b\u012d\7\31\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0130\5\34\17\2\u012f\u012e\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130+\3\2\2\2\u0131\u0132\7T\2\2\u0132\u0133\5\b\5\2\u0133\u0134"+
		"\7S\2\2\u0134\u0136\3\2\2\2\u0135\u0137\7\31\2\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\5\34\17\2\u0139-\3\2\2"+
		"\2\u013a\u013b\t\2\2\2\u013b/\3\2\2\2\u013c\u013d\7\7\2\2\u013d\u013e"+
		"\5r:\2\u013e\61\3\2\2\2\u013f\u0140\5\64\33\2\u0140\63\3\2\2\2\u0141\u0146"+
		"\t\2\2\2\u0142\u0143\7M\2\2\u0143\u0145\t\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\65\3\2\2"+
		"\2\u0148\u0146\3\2\2\2\u0149\u014a\7\13\2\2\u014a\u014b\5r:\2\u014b\67"+
		"\3\2\2\2\u014c\u014d\7\f\2\2\u014d\u014e\7\6\2\2\u014e\u014f\5\u0086D"+
		"\2\u014f9\3\2\2\2\u0150\u0151\7\32\2\2\u0151\u0152\5r:\2\u0152;\3\2\2"+
		"\2\u0153\u0154\7\r\2\2\u0154\u0155\7\6\2\2\u0155\u0156\5> \2\u0156=\3"+
		"\2\2\2\u0157\u015c\5@!\2\u0158\u0159\7O\2\2\u0159\u015b\5@!\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"?\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\5N(\2\u0160\u0162\5B\"\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162A\3\2\2\2\u0163\u0164\t\5\2\2"+
		"\u0164C\3\2\2\2\u0165\u0166\7/\2\2\u0166\u016b\5F$\2\u0167\u0168\7O\2"+
		"\2\u0168\u016a\5F$\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016cE\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\7>\2\2\u016f\u0170\7\31\2\2\u0170\u0171\7T\2\2\u0171\u0172\5d\63"+
		"\2\u0172\u0173\7S\2\2\u0173G\3\2\2\2\u0174\u0175\7\60\2\2\u0175\u0176"+
		"\5J&\2\u0176\u0177\7\31\2\2\u0177\u0178\5L\'\2\u0178\u0179\7-\2\2\u0179"+
		"\u017b\7T\2\2\u017a\u017c\5h\65\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\r\2\2\u017e\u017f\7\6\2\2\u017f"+
		"\u0180\5@!\2\u0180\u0181\7S\2\2\u0181I\3\2\2\2\u0182\u0183\7>\2\2\u0183"+
		"K\3\2\2\2\u0184\u0185\5N(\2\u0185M\3\2\2\2\u0186\u018b\5P)\2\u0187\u0188"+
		"\t\6\2\2\u0188\u018a\5P)\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cO\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018e\u0193\5R*\2\u018f\u0190\t\7\2\2\u0190\u0192\5R*\2\u0191\u018f\3"+
		"\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"Q\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7T\2\2\u0197\u0198\5\b\5\2\u0198"+
		"\u0199\7S\2\2\u0199\u01ab\3\2\2\2\u019a\u019b\7T\2\2\u019b\u019c\5N(\2"+
		"\u019c\u019d\7S\2\2\u019d\u01ab\3\2\2\2\u019e\u019f\5T+\2\u019f\u01a0"+
		"\5N(\2\u01a0\u01ab\3\2\2\2\u01a1\u01ab\5V,\2\u01a2\u01ab\7:\2\2\u01a3"+
		"\u01ab\79\2\2\u01a4\u01ab\7\34\2\2\u01a5\u01ab\5^\60\2\u01a6\u01ab\5\u008a"+
		"F\2\u01a7\u01ab\5\62\32\2\u01a8\u01ab\5\20\t\2\u01a9\u01ab\5\u008cG\2"+
		"\u01aa\u0196\3\2\2\2\u01aa\u019a\3\2\2\2\u01aa\u019e\3\2\2\2\u01aa\u01a1"+
		"\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01a3\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa"+
		"\u01a5\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01aa\u01a9\3\2\2\2\u01abS\3\2\2\2\u01ac\u01ad\t\b\2\2\u01adU\3\2"+
		"\2\2\u01ae\u01b0\7\'\2\2\u01af\u01b1\5N(\2\u01b0\u01af\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\5X-\2\u01b3\u01b4\7(\2\2\u01b4"+
		"W\3\2\2\2\u01b5\u01b7\5Z.\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\5\\"+
		"/\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcY\3\2\2\2\u01bd\u01c0"+
		"\7)\2\2\u01be\u01c1\5N(\2\u01bf\u01c1\5r:\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7*\2\2\u01c3\u01c4\5N("+
		"\2\u01c4[\3\2\2\2\u01c5\u01c6\7+\2\2\u01c6\u01c7\5N(\2\u01c7]\3\2\2\2"+
		"\u01c8\u01ca\5`\61\2\u01c9\u01cb\5b\62\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb_\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd\u01cf\7T\2\2\u01ce\u01d0"+
		"\7\26\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d7\3\2\2\2"+
		"\u01d1\u01d3\7C\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d8"+
		"\3\2\2\2\u01d4\u01d6\5\u0086D\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2"+
		"\2\u01d6\u01d8\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\7S\2\2\u01daa\3\2\2\2\u01db\u01e1\7-\2\2\u01dc\u01dd"+
		"\7T\2\2\u01dd\u01de\5d\63\2\u01de\u01df\7S\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01e2\5f\64\2\u01e1\u01dc\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2c\3\2\2\2"+
		"\u01e3\u01e6\5f\64\2\u01e4\u01e6\5h\65\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\5<\37\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\5j"+
		"\66\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ece\3\2\2\2\u01ed\u01ee"+
		"\7>\2\2\u01eeg\3\2\2\2\u01ef\u01f0\7.\2\2\u01f0\u01f1\7\6\2\2\u01f1\u01f2"+
		"\5\u0086D\2\u01f2i\3\2\2\2\u01f3\u01f4\5l\67\2\u01f4\u01f5\5n8\2\u01f5"+
		"\u01fd\3\2\2\2\u01f6\u01f7\5l\67\2\u01f7\u01f8\7\35\2\2\u01f8\u01f9\5"+
		"n8\2\u01f9\u01fa\7\"\2\2\u01fa\u01fb\5p9\2\u01fb\u01fd\3\2\2\2\u01fc\u01f3"+
		"\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fdk\3\2\2\2\u01fe\u01ff\t\t\2\2\u01ff"+
		"m\3\2\2\2\u0200\u0201\7\63\2\2\u0201\u0209\7\64\2\2\u0202\u0203\7:\2\2"+
		"\u0203\u0209\7\64\2\2\u0204\u0205\7\66\2\2\u0205\u0209\7\67\2\2\u0206"+
		"\u0207\7:\2\2\u0207\u0209\7\65\2\2\u0208\u0200\3\2\2\2\u0208\u0202\3\2"+
		"\2\2\u0208\u0204\3\2\2\2\u0208\u0206\3\2\2\2\u0209o\3\2\2\2\u020a\u020b"+
		"\7:\2\2\u020b\u0213\7\64\2\2\u020c\u020d\7\66\2\2\u020d\u0213\7\67\2\2"+
		"\u020e\u020f\7:\2\2\u020f\u0213\7\65\2\2\u0210\u0211\7\63\2\2\u0211\u0213"+
		"\7\65\2\2\u0212\u020a\3\2\2\2\u0212\u020c\3\2\2\2\u0212\u020e\3\2\2\2"+
		"\u0212\u0210\3\2\2\2\u0213q\3\2\2\2\u0214\u0219\5t;\2\u0215\u0216\7#\2"+
		"\2\u0216\u0218\5t;\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021as\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u0221\5v<\2\u021d\u021e\7\"\2\2\u021e\u0220\5v<\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222u\3"+
		"\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7T\2\2\u0225\u0226\5r:\2\u0226"+
		"\u0227\7S\2\2\u0227\u0232\3\2\2\2\u0228\u0229\7$\2\2\u0229\u0232\5v<\2"+
		"\u022a\u0232\5\u0088E\2\u022b\u0232\5|?\2\u022c\u0232\5\u0080A\2\u022d"+
		"\u0232\5\u0082B\2\u022e\u0232\5x=\2\u022f\u0232\5~@\2\u0230\u0232\5\20"+
		"\t\2\u0231\u0224\3\2\2\2\u0231\u0228\3\2\2\2\u0231\u022a\3\2\2\2\u0231"+
		"\u022b\3\2\2\2\u0231\u022c\3\2\2\2\u0231\u022d\3\2\2\2\u0231\u022e\3\2"+
		"\2\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232w\3\2\2\2\u0233\u0234"+
		"\5N(\2\u0234\u0235\5z>\2\u0235\u0236\5N(\2\u0236y\3\2\2\2\u0237\u0238"+
		"\t\n\2\2\u0238{\3\2\2\2\u0239\u023b\5N(\2\u023a\u023c\7$\2\2\u023b\u023a"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\7%\2\2\u023e"+
		"\u0241\5N(\2\u023f\u0240\7&\2\2\u0240\u0242\79\2\2\u0241\u023f\3\2\2\2"+
		"\u0241\u0242\3\2\2\2\u0242}\3\2\2\2\u0243\u0245\5N(\2\u0244\u0246\7$\2"+
		"\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248"+
		"\7\35\2\2\u0248\u0249\5N(\2\u0249\u024a\7\"\2\2\u024a\u024b\5N(\2\u024b"+
		"\177\3\2\2\2\u024c\u024d\5N(\2\u024d\u024f\7\33\2\2\u024e\u0250\7$\2\2"+
		"\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252"+
		"\7\34\2\2\u0252\u0081\3\2\2\2\u0253\u0255\5N(\2\u0254\u0256\7$\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7\b"+
		"\2\2\u0258\u0259\5\u0084C\2\u0259\u0083\3\2\2\2\u025a\u025d\7T\2\2\u025b"+
		"\u025e\5\n\6\2\u025c\u025e\5\u0086D\2\u025d\u025b\3\2\2\2\u025d\u025c"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7S\2\2\u0260\u0085\3\2\2\2\u0261"+
		"\u0266\5N(\2\u0262\u0263\7O\2\2\u0263\u0265\5N(\2\u0264\u0262\3\2\2\2"+
		"\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0087"+
		"\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\7\t\2\2\u026a\u026b\7T\2\2\u026b"+
		"\u026c\5\n\6\2\u026c\u026d\7S\2\2\u026d\u0089\3\2\2\2\u026e\u026f\t\13"+
		"\2\2\u026f\u008b\3\2\2\2\u0270\u0271\7,\2\2\u0271\u0272\7T\2\2\u0272\u0273"+
		"\5N(\2\u0273\u0274\7\31\2\2\u0274\u0275\5\u008eH\2\u0275\u0276\7S\2\2"+
		"\u0276\u008d\3\2\2\2\u0277\u027f\5\u0090I\2\u0278\u0279\7T\2\2\u0279\u027c"+
		"\7:\2\2\u027a\u027b\7O\2\2\u027b\u027d\7:\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\7S\2\2\u027f\u0278\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\u008f\3\2\2\2\u0281\u0285\7>\2\2\u0282"+
		"\u0284\7>\2\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2"+
		"\2\2\u0285\u0286\3\2\2\2\u0286\u0091\3\2\2\2\u0287\u0285\3\2\2\2F\u009d"+
		"\u00a5\u00ad\u00b3\u00b7\u00ba\u00bd\u00bf\u00c5\u00c9\u00d3\u00dc\u00e0"+
		"\u00e4\u00e8\u00ef\u00f4\u00f7\u00fc\u00ff\u0108\u010d\u0113\u0116\u0119"+
		"\u011e\u0120\u0128\u012c\u012f\u0136\u0146\u015c\u0161\u016b\u017b\u018b"+
		"\u0193\u01aa\u01b0\u01b8\u01bb\u01c0\u01ca\u01cf\u01d2\u01d5\u01d7\u01e1"+
		"\u01e5\u01e8\u01eb\u01fc\u0208\u0212\u0219\u0221\u0231\u023b\u0241\u0245"+
		"\u024f\u0255\u025d\u0266\u027c\u027f\u0285";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}