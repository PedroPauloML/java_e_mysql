package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BD {
    
    // CONEXÃO
    public static Connection getConexao(String host, String banco_de_dados, String usuario, String senha) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://" + host + "/" + banco_de_dados, usuario + "", senha + "");
        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex.getMessage());
        }
    }
    
    // INSERIR
    public static String setInserir(String nome_tabela, String campos, String valores){
        String comando_inserir = "INSERT INTO " + nome_tabela + "(" + campos + ") VALUES(" + valores +")";
        return comando_inserir;
    }
    
    // CONSULTA
    public static String getConsulta(String o_que_selecionar, String nome_da_tabela, String coluna_de_pesquisa, String dados, String ordenador_por){
        
        String comando = "SELECT " + o_que_selecionar + " FROM " + nome_da_tabela +" WHERE " + coluna_de_pesquisa + " LIKE " + dados + " ORDER BY " + ordenador_por;
        
        return comando;
    }
    public static String getConsulta(String o_que_selecionar, String nome_da_tabela, String coluna_de_pesquisa_1, String dados_1, String coluna_de_pesquisa_2, String dados_2, String ordenador_por){
        
        String comando = "SELECT " + o_que_selecionar + " FROM " + nome_da_tabela +" WHERE " + coluna_de_pesquisa_1 + " LIKE " + dados_1 + " OR " + coluna_de_pesquisa_2 + " LIKE " + dados_2 + " ORDER BY " + ordenador_por;
        
        return comando;
    }
    public static String getConsulta(String o_que_selecionar, String nome_da_tabela, String coluna_de_pesquisa_1, String dados_1, String coluna_de_pesquisa_2, String dados_2, String coluna_de_pesquisa_3, String dados_3, String ordenador_por){
        
        String comando = "SELECT " + o_que_selecionar + " FROM " + nome_da_tabela +" WHERE " + coluna_de_pesquisa_1 + " LIKE " + dados_1 + " OR " + coluna_de_pesquisa_2 + " LIKE " + dados_2 + " OR " + coluna_de_pesquisa_3 + " LIKE " + dados_3 + " ORDER BY " + ordenador_por;
        
        return comando;
    }
    
    // ATUALIZAÇÃO
    public static String setAtualizacao(String nome_da_tabela, String campo, String dados, String campo_localizador, String dados_do_campo_localizador){
        
        String comando = "UPDATE " + nome_da_tabela + " SET " + campo + " = " + dados + " where " + campo_localizador + " = " + dados_do_campo_localizador;
        
        return comando;
    }
    public static String setAtualizacao(String nome_da_tabela, String campo_1, String dados_1, String campo_2, String dados_2, String campo_localizador, String dados_do_campo_localizador){
        
        String comando = "UPDATE " + nome_da_tabela + " SET " + campo_1 + " = " + dados_1 + ", " + campo_2 + " = " + dados_2 + " where " + campo_localizador + " = " + dados_do_campo_localizador;
        
        return comando;
    }
    public static String setAtualizacao(String nome_da_tabela, String campo_1, String dados_1, String campo_2, String dados_2, String campo_3, String dados_3, String campo_localizador, String dados_do_campo_localizador){
        
        String comando = "UPDATE " + nome_da_tabela + " SET " + campo_1 + " = " + dados_1 + ", " + campo_2 + " = " + dados_2 + ", " + campo_3 + " = " + dados_3 + " where " + campo_localizador + " = " + dados_do_campo_localizador;
        
        return comando;
    }
}
