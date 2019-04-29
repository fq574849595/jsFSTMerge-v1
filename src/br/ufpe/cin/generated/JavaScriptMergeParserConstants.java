/* Generated By:JavaCC: Do not edit this line. JavaScriptMergeParserConstants.java */
package br.ufpe.cin.generated;

import java.io.*;

public interface JavaScriptMergeParserConstants {

  int EOF = 0;
  int WHITE_SPACE = 1;
  int TAB = 2;
  int VT = 3;
  int FF = 4;
  int SP = 5;
  int NBSP = 6;
  int USP = 7;
  int LINE_TERMINATOR = 8;
  int LF = 9;
  int CR = 10;
  int LS = 11;
  int PS = 12;
  int SINGLE_LINE_COMMENT = 15;
  int MULTI_LINE_COMMENT = 16;
  int BREAK = 18;
  int CONTINUE = 19;
  int DELETE = 20;
  int ELSE = 21;
  int FOR = 22;
  int FUNCTION = 23;
  int IF = 24;
  int IN = 25;
  int NEW = 26;
  int RETURN = 27;
  int THIS = 28;
  int TYPEOF = 29;
  int VAR = 30;
  int VOID = 31;
  int WHILE = 32;
  int WITH = 33;
  int CASE = 34;
  int CATCH = 35;
  int CLASS = 36;
  int CONST = 37;
  int DEBUGGER = 38;
  int _DEFAULT = 39;
  int DO = 40;
  int ENUM = 41;
  int EXPORT = 42;
  int EXTENDS = 43;
  int FINALLY = 44;
  int IMPORT = 45;
  int SUPER = 46;
  int SWITCH = 47;
  int THROW = 48;
  int TRY = 49;
  int LBRACE = 50;
  int RBRACE = 51;
  int LPAREN = 52;
  int RPAREN = 53;
  int LBRACKET = 54;
  int RBRACKET = 55;
  int DOT = 56;
  int SEMICOLON = 57;
  int COMMA = 58;
  int LT = 59;
  int GT = 60;
  int LE = 61;
  int GE = 62;
  int EQ = 63;
  int NE = 64;
  int SEQ = 65;
  int SNEQ = 66;
  int PLUS = 67;
  int MINUS = 68;
  int STAR = 69;
  int SLASH = 70;
  int REM = 71;
  int INCR = 72;
  int DECR = 73;
  int LSHIFT = 74;
  int RSHIFT = 75;
  int RUNSHIFT = 76;
  int BIT_AND = 77;
  int BIT_OR = 78;
  int XOR = 79;
  int BANG = 80;
  int TILDE = 81;
  int SC_AND = 82;
  int SC_OR = 83;
  int HOOK = 84;
  int COLON = 85;
  int ASSIGN = 86;
  int PLUSASSIGN = 87;
  int MINUSASSIGN = 88;
  int STARASSIGN = 89;
  int SLASHASSIGN = 90;
  int REMASSIGN = 91;
  int LSHIFTASSIGN = 92;
  int RSIGNEDSHIFTASSIGN = 93;
  int RUNSIGNEDSHIFTASSIGN = 94;
  int ANDASSIGN = 95;
  int ORASSIGN = 96;
  int XORASSIGN = 97;
  int INTANCE_OF = 98;
  int DECIMAL_LITERAL = 99;
  int NON_ZERO_DIGIT = 100;
  int EXPONENT_PART = 101;
  int DECIMAL_INTEGER_LITERAL = 102;
  int HEX_INTEGER_LITERAL = 103;
  int DECIMAL_DIGITS = 104;
  int DECIMAL_DIGIT = 105;
  int NULL_LITERAL = 106;
  int BOOLEAN_LITERAL = 107;
  int STRING_LITERAL = 108;
  int DOUBLE_STRING_CHARACTERS = 109;
  int SINGLE_STRING_CHARACTERS = 110;
  int DOUBLE_STRING_CHARACTER = 111;
  int SINGLE_STRING_CHARACTER = 112;
  int ESCAPE_SEQUENCE = 113;
  int CHARACTER_ESCAPE_SEQUENCE = 114;
  int SINGLE_ESCAPE_CHARACTER = 115;
  int NON_ESCAPE_CHARACTER = 116;
  int IDENTIFIER_NAME = 117;
  int IDENTIFIER_START = 118;
  int IDENTIFIER_PART = 119;
  int DOLLAR_SIGN = 120;
  int UNDER_SCORE = 121;
  int UNICODE_LETTER = 122;
  int UNICODE_COMBINING_MARK = 123;
  int MC = 124;
  int MN = 125;
  int UNICODE_DIGIT = 126;
  int UNICODE_CONNECTOR_PUNCTUATION = 127;
  int UNICODE_ESCAPE_SEQUENCE = 128;
  int HEX_DIGIT = 129;
  int REGULAR_EXPRESSION_LITERAL = 130;
  int BACKSLASH_SEQUENCE = 131;

  int DEFAULT = 0;
  int IN_REGEX = 1;
  int IN_SINGLE_LINE_COMMENT = 2;
  int IN_MULTI_LINE_COMMENT = 3;
  int IN_PATTERN = 4;

  String[] tokenImage = {
    "<EOF>",
    "<WHITE_SPACE>",
    "<TAB>",
    "\"\\u000b\"",
    "<FF>",
    "<SP>",
    "\"\\u00a0\"",
    "<USP>",
    "<LINE_TERMINATOR>",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\u2028\"",
    "\"\\u2029\"",
    "\"//\"",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "<token of kind 17>",
    "\"break\"",
    "\"continue\"",
    "\"delete\"",
    "\"else\"",
    "\"for\"",
    "\"function\"",
    "\"if\"",
    "\"in\"",
    "\"new\"",
    "\"return\"",
    "\"this\"",
    "\"typeof\"",
    "\"var\"",
    "\"void\"",
    "\"while\"",
    "\"with\"",
    "\"case\"",
    "\"catch\"",
    "\"class\"",
    "\"const\"",
    "\"debugger\"",
    "\"default\"",
    "\"do\"",
    "\"enum\"",
    "\"export\"",
    "\"extends\"",
    "\"finally\"",
    "\"import\"",
    "\"super\"",
    "\"switch\"",
    "\"throw\"",
    "\"try\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\".\"",
    "\";\"",
    "\",\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"==\"",
    "\"!=\"",
    "\"===\"",
    "\"!==\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"<<\"",
    "\">>\"",
    "\">>>\"",
    "\"&\"",
    "\"|\"",
    "\"^\"",
    "\"!\"",
    "\"~\"",
    "\"&&\"",
    "\"||\"",
    "\"?\"",
    "\":\"",
    "\"=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"<<=\"",
    "\">>=\"",
    "\">>>=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"instanceof\"",
    "<DECIMAL_LITERAL>",
    "<NON_ZERO_DIGIT>",
    "<EXPONENT_PART>",
    "<DECIMAL_INTEGER_LITERAL>",
    "<HEX_INTEGER_LITERAL>",
    "<DECIMAL_DIGITS>",
    "<DECIMAL_DIGIT>",
    "\"null\"",
    "<BOOLEAN_LITERAL>",
    "<STRING_LITERAL>",
    "<DOUBLE_STRING_CHARACTERS>",
    "<SINGLE_STRING_CHARACTERS>",
    "<DOUBLE_STRING_CHARACTER>",
    "<SINGLE_STRING_CHARACTER>",
    "<ESCAPE_SEQUENCE>",
    "<CHARACTER_ESCAPE_SEQUENCE>",
    "<SINGLE_ESCAPE_CHARACTER>",
    "<NON_ESCAPE_CHARACTER>",
    "<IDENTIFIER_NAME>",
    "<IDENTIFIER_START>",
    "<IDENTIFIER_PART>",
    "\"$\"",
    "\"_\"",
    "<UNICODE_LETTER>",
    "<UNICODE_COMBINING_MARK>",
    "<MC>",
    "<MN>",
    "<UNICODE_DIGIT>",
    "<UNICODE_CONNECTOR_PUNCTUATION>",
    "<UNICODE_ESCAPE_SEQUENCE>",
    "<HEX_DIGIT>",
    "<REGULAR_EXPRESSION_LITERAL>",
    "<BACKSLASH_SEQUENCE>",
  };

}