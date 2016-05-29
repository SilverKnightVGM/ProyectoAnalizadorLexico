package analizador;

import static analizador.Tokens.*;
%%
%class AnalizadorJFlex
%type Tokens
D=[0-9]
Esp=[\ \t\r\n]
%{
public String Tipo;
%}
%%

"+" {return SUMA;}
"-" {return RESTA;}
"*" {return MULTIPLICACION;}
"/" {return DIVISION;}
"^" {return POTENCIA;}
.*|,+ {return ERROR;}