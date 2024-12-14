
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package CUP;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\002\000\002\004\010\000\002\004\010" +
    "\000\002\004\007\000\002\004\006\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\003\000\002\005" +
    "\003\000\002\005\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\014\002\ufffe\042\ufffe\044\ufffe\054\ufffe\056" +
    "\ufffe\001\002\000\014\002\000\042\013\044\012\054\007" +
    "\056\010\001\002\000\004\002\006\001\002\000\004\002" +
    "\001\001\002\000\004\015\056\001\002\000\004\017\053" +
    "\001\002\000\016\002\uffff\012\uffff\042\uffff\044\uffff\054" +
    "\uffff\056\uffff\001\002\000\004\011\046\001\002\000\004" +
    "\011\014\001\002\000\020\015\020\056\022\057\015\060" +
    "\017\061\021\062\016\063\023\001\002\000\024\012\ufff3" +
    "\016\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\024\ufff3\025" +
    "\ufff3\026\ufff3\001\002\000\024\012\ufff0\016\ufff0\020\ufff0" +
    "\021\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\026\ufff0\001" +
    "\002\000\024\012\ufff2\016\ufff2\020\ufff2\021\ufff2\022\ufff2" +
    "\023\ufff2\024\ufff2\025\ufff2\026\ufff2\001\002\000\020\015" +
    "\020\056\022\057\015\060\017\061\021\062\016\063\023" +
    "\001\002\000\024\012\ufff1\016\ufff1\020\ufff1\021\ufff1\022" +
    "\ufff1\023\ufff1\024\ufff1\025\ufff1\026\ufff1\001\002\000\024" +
    "\012\uffee\016\uffee\020\uffee\021\uffee\022\uffee\023\uffee\024" +
    "\uffee\025\uffee\026\uffee\001\002\000\024\012\uffef\016\uffef" +
    "\020\uffef\021\uffef\022\uffef\023\uffef\024\uffef\025\uffef\026" +
    "\uffef\001\002\000\020\012\025\021\026\022\031\023\033" +
    "\024\032\025\027\026\030\001\002\000\014\012\ufffe\042" +
    "\ufffe\044\ufffe\054\ufffe\056\ufffe\001\002\000\020\015\020" +
    "\056\022\057\015\060\017\061\021\062\016\063\023\001" +
    "\002\000\020\015\020\056\022\057\015\060\017\061\021" +
    "\062\016\063\023\001\002\000\020\015\020\056\022\057" +
    "\015\060\017\061\021\062\016\063\023\001\002\000\020" +
    "\015\020\056\022\057\015\060\017\061\021\062\016\063" +
    "\023\001\002\000\020\015\020\056\022\057\015\060\017" +
    "\061\021\062\016\063\023\001\002\000\020\015\020\056" +
    "\022\057\015\060\017\061\021\062\016\063\023\001\002" +
    "\000\024\012\ufff7\016\ufff7\020\ufff7\021\ufff7\022\ufff7\023" +
    "\ufff7\024\ufff7\025\ufff7\026\030\001\002\000\024\012\ufff6" +
    "\016\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6\025" +
    "\ufff6\026\030\001\002\000\024\012\ufff8\016\ufff8\020\ufff8" +
    "\021\ufff8\022\ufff8\023\033\024\032\025\027\026\030\001" +
    "\002\000\024\012\ufff4\016\ufff4\020\ufff4\021\ufff4\022\ufff4" +
    "\023\ufff4\024\ufff4\025\ufff4\026\ufff4\001\002\000\024\012" +
    "\ufff5\016\ufff5\020\ufff5\021\ufff5\022\ufff5\023\ufff5\024\ufff5" +
    "\025\ufff5\026\030\001\002\000\024\012\ufff9\016\ufff9\020" +
    "\ufff9\021\ufff9\022\ufff9\023\033\024\032\025\027\026\030" +
    "\001\002\000\014\012\043\042\013\044\012\054\007\056" +
    "\010\001\002\000\016\002\ufffd\012\ufffd\042\ufffd\044\ufffd" +
    "\054\ufffd\056\ufffd\001\002\000\020\016\045\021\026\022" +
    "\031\023\033\024\032\025\027\026\030\001\002\000\024" +
    "\012\uffed\016\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024" +
    "\uffed\025\uffed\026\uffed\001\002\000\020\015\020\056\022" +
    "\057\015\060\017\061\021\062\016\063\023\001\002\000" +
    "\020\012\050\021\026\022\031\023\033\024\032\025\027" +
    "\026\030\001\002\000\014\012\ufffe\042\ufffe\044\ufffe\054" +
    "\ufffe\056\ufffe\001\002\000\014\012\052\042\013\044\012" +
    "\054\007\056\010\001\002\000\016\002\ufffc\012\ufffc\042" +
    "\ufffc\044\ufffc\054\ufffc\056\ufffc\001\002\000\020\015\020" +
    "\056\022\057\015\060\017\061\021\062\016\063\023\001" +
    "\002\000\020\020\055\021\026\022\031\023\033\024\032" +
    "\025\027\026\030\001\002\000\016\002\ufffa\012\ufffa\042" +
    "\ufffa\044\ufffa\054\ufffa\056\ufffa\001\002\000\020\015\020" +
    "\056\022\057\015\060\017\061\021\062\016\063\023\001" +
    "\002\000\020\016\060\021\026\022\031\023\033\024\032" +
    "\025\027\026\030\001\002\000\004\020\061\001\002\000" +
    "\016\002\ufffb\012\ufffb\042\ufffb\044\ufffb\054\ufffb\056\ufffb" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\006\002\004\003\003\001\001\000\004\004" +
    "\010\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\023\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\041\001\001\000" +
    "\004\005\040\001\001\000\004\005\037\001\001\000\004" +
    "\005\036\001\001\000\004\005\035\001\001\000\004\005" +
    "\034\001\001\000\004\005\033\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\046\001\001\000\002\001\001\000\004\003\050" +
    "\001\001\000\004\004\010\001\001\000\002\001\001\000" +
    "\004\005\053\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\056\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= statement_list 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement_list ::= statement_list statement 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement_list ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= IF OPEN_BLOCK expression CLOSE_BLOCK statement_list CLOSE_BLOCK 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= WHILE OPEN_BLOCK expression CLOSE_BLOCK statement_list CLOSE_BLOCK 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= PRINT OPEN_PAREN expression CLOSE_PAREN END_STATEMENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= IDENTIFIER ASSIGN expression END_STATEMENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expression ::= expression PLUS expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expression ::= expression MINUS expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expression ::= expression MULTIPLY expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expression ::= expression DIVIDE expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expression ::= expression MODULO expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expression ::= expression POWER expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expression ::= INT_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expression ::= FLOAT_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expression ::= BOOL_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expression ::= CHAR_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression ::= STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expression ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expression ::= OPEN_PAREN expression CLOSE_PAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
