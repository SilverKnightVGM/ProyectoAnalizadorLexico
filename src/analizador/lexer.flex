package analizador;

import static analizador.Tokens.*;
%%
%class AnalizadorJFlex
%type Tokens
D=[0-9]
Op=[\+\-\*\/]
Esp=[\ \t\r\n]
%{
public String Tipo;
%}
%%

{D} {Tipo=yytext(); return DIGITO;}
"+" {Tipo=yytext(); return SUMA;}
"-" {Tipo=yytext(); return RESTA;}
"*" {Tipo=yytext(); return MULTIPLICACION;}
"/" {Tipo=yytext(); return DIVISION;}
"(" {Tipo=yytext(); return ABRE_PARENTESIS;}
")" {Tipo=yytext(); return CIERRA_PARENTESIS;}
({Esp}*{D}+{Esp}*{Op}{1}{Esp}*)+{D}+{Esp}* {Tipo=yytext(); return VALIDA;}
.*|,+ {return ERROR;}