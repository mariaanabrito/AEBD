/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import conn.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import objects.CPU;
import objects.Datafile;
import objects.Memory;
import objects.Privilege;
import objects.Role;
import objects.Session;
import objects.Tablespace;
import objects.User;

/**
 * REST Web Service
 *
 * @author Luismf20
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;
    private Connection c;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
        try {
            this.c = new Connect().getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves representation of an instance of webService.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "{}";
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("cpu")
    public String getCpuJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM cpu "
                                                  + "ORDER BY idcpu DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            //sb.append("{\"cpu\":[");
            sb.append("[");
            while(rs.next()) {
                
                CPU cpuObj = new CPU();
                cpuObj.setId(rs.getInt("idcpu"));
                cpuObj.setDbid(rs.getString("dbid"));
                cpuObj.setCpu_core_count(rs.getString("cpu_core_count"));
                cpuObj.setCpu_count(rs.getString("cpu_count"));
                cpuObj.setTimeStamp_cpu(rs.getString("timestamp_cpu"));
                cpuObj.setCpu_socket_count(rs.getString("cpu_socket_count"));
                cpuObj.setVersion(rs.getString("version"));
                cpuObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(cpuObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("datafile")
    public String getDatafileJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM Datafile "
                                                  + "ORDER BY id_datafile DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"datafile\":[");
            sb.append("[");
            while(rs.next()) {
                
                Datafile datafileObj = new Datafile();
                datafileObj.setId(rs.getInt("id_datafile"));
                datafileObj.setFreeSpace(rs.getString("freespace"));
                datafileObj.setAutoExtend(rs.getString("autoextend"));
                datafileObj.setName(rs.getString("name"));
                datafileObj.setStatus(rs.getString("status"));
                datafileObj.setMaximumSize(rs.getString("maximumsize"));
                datafileObj.setSize(rs.getString("df_size"));
                datafileObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(datafileObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("memory")
    public String getMemoryJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM Memory "
                                                  + "ORDER BY idmemory DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"memory\":[");
            sb.append("[");
            while(rs.next()) {
                
                Memory memoryObj = new Memory();
                memoryObj.setId(rs.getInt("idmemory"));
                memoryObj.setStatistic(rs.getString("statistic"));
                memoryObj.setSgaPool(rs.getString("spapool"));
                memoryObj.setBytes(rs.getString("bytes"));
                memoryObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(memoryObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("privilege")
    public String getPrivilegeJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM Privilege "
                                                  + "ORDER BY idprivilege DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"privilege\":[");
            sb.append("[");
            while(rs.next()) {
                
                Privilege privilegeObj = new Privilege();
                privilegeObj.setId(rs.getInt("idprivilege"));
                privilegeObj.setProperty(rs.getString("property"));
                privilegeObj.setPrivilege(rs.getString("privilege"));
                privilegeObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(privilegeObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("role")
    public String getRoleJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM Role "
                                                  + "ORDER BY idrole DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"role\":[");
            sb.append("[");
            while(rs.next()) {
                
                Role roleObj = new Role();
                roleObj.setId(rs.getInt("idrole"));
                roleObj.setRole(rs.getString("role"));
                roleObj.setCommon(rs.getString("common"));
                roleObj.setAuthentication_type(rs.getString("authentication_type"));
                roleObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(roleObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("session")
    public String getSessionJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM SessionDB "
                                                  + "ORDER BY idsession DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"session\":[");
            sb.append("[");
            while(rs.next()) {
                
                Session sessionObj = new Session();
                sessionObj.setId(rs.getInt("idsession"));
                sessionObj.setSecs_in_wait(rs.getString("secs_in_wait"));
                sessionObj.setSql_child_number(rs.getString("sql_child_number"));
                sessionObj.setSql_id(rs.getString("sql_id"));
                sessionObj.setStatus(rs.getString("status"));
                sessionObj.setOsuser(rs.getString("osuser"));
                sessionObj.setMachine(rs.getString("machine"));
                sessionObj.setModule(rs.getString("module"));
                sessionObj.setCommand(rs.getString("command"));
                sessionObj.setType(rs.getString("type"));
                sessionObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(sessionObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("tablespace")
    public String getTablespaceJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM Tablespace "
                                                  + "ORDER BY id_tablespace DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"tablespace\":[");
            sb.append("[");
            while(rs.next()) {
                
                Tablespace tablespaceObj = new Tablespace();
                tablespaceObj.setId(rs.getInt("id_tablespace"));
                tablespaceObj.setMaximumSize(rs.getString("maximumsize"));
                tablespaceObj.setSize(rs.getString("ts_size"));
                tablespaceObj.setName(rs.getString("name"));
                tablespaceObj.setType(rs.getString("type"));
                tablespaceObj.setAutoextend(rs.getString("autoextend"));
                tablespaceObj.setFreeSpace(rs.getString("freespace"));
                tablespaceObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(tablespaceObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("user")
    public String getUserJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT * FROM DBUser "
                                                  + "ORDER BY id_user DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"user\":[");
            sb.append("[");
            while(rs.next()) {
                
                User userObj = new User();
                userObj.setId(rs.getInt("id_user"));
                userObj.setName(rs.getString("name"));
                userObj.setExpirationDate(rs.getString("expirationdate"));
                userObj.setCreationDate(rs.getString("creationdate"));
                userObj.setCommon(rs.getString("common"));
                userObj.setAccountStatus(rs.getString("accountstatus"));
                userObj.setProfile(rs.getString("profile"));
                userObj.setTimeStamp(rs.getString("timestamp"));
                sb.append(userObj.toString());
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("sessionuser")
    public String getTesteJson() throws SQLException {
        
        PreparedStatement stmt = c.prepareStatement("SELECT S.STATUS, U.NAME, U.TIMESTAMP FROM SESSIONDB S " +
                                                    "JOIN DBUSER U ON U.ID_USER = S.USER_IDUSER " +
                                                    "ORDER BY S.TIMESTAMP DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"teste\":[");
            sb.append("[");
            while(rs.next()) {
                sb.append("{\"status\":\"");
                sb.append(rs.getString("status"));
                sb.append("\",\"name\":\"");
                sb.append(rs.getString("name"));
                sb.append("\",\"timestamp\":\"");
                sb.append(rs.getString("timestamp"));
                sb.append("\"},");
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("privilegeuser")
    public String getPrivilegeUserJson() throws SQLException {
        
        PreparedStatement stmt = 
            c.prepareStatement("select name, privilege, u.timestamp from dbuser u "
                             + "join privilege_user on privilege_user.id_user = u.id_user "
                             + "join privilege on privilege.idprivilege = privilege_user.id_privilege "
                             + "order by u.timestamp desc");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"datafile\":[");
            sb.append("[");
            while(rs.next()) {
                sb.append("{\"name\":\"");
                sb.append(rs.getString("name"));
                sb.append("\",\"privilege\":\"");
                sb.append(rs.getString("privilege"));
                sb.append("\",\"timestamp\":\"");
                sb.append(rs.getString("timestamp"));
                sb.append("\"},");
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("roleprivilege")
    public String getRolePrivilegeJson() throws SQLException {
        
        PreparedStatement stmt = 
            c.prepareStatement("select role, privilege, r.timestamp from role r "
                             + "join role_privilege on r.idrole = role_privilege.id_role "
                             + "join privilege on privilege.idprivilege = role_privilege.id_privilege "
                             + "order by r.timestamp desc");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"datafile\":[");
            sb.append("[");
            while(rs.next()) {
                sb.append("{\"role\":\"");
                sb.append(rs.getString("role"));
                sb.append("\",\"privilege\":\"");
                sb.append(rs.getString("privilege"));
                sb.append("\",\"timestamp\":\"");
                sb.append(rs.getString("timestamp"));
                sb.append("\"},");
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("countusers")
    public String getCountUsersJson() throws SQLException {
        
        PreparedStatement stmt = 
            c.prepareStatement("SELECT timestamp, COUNT(*) AS Numero_Users FROM dbuser "
                             + "GROUP BY timestamp "
                             + "ORDER BY timestamp DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"datafile\":[");
            sb.append("[");
            while(rs.next()) {
                sb.append("{\"timestamp\":\"");
                sb.append(rs.getString("timestamp"));
                sb.append("\",\"Numero de Users\":\"");
                sb.append(rs.getString("Numero_Users"));
                sb.append("\"},");
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("countsessions")
    public String getCountSessionsJson() throws SQLException {
        
        PreparedStatement stmt = 
            c.prepareStatement("SELECT timestamp, COUNT(*) AS Numero_Sessoes FROM sessiondb "
                             + "GROUP BY timestamp "
                             + "ORDER BY timestamp DESC");
        ResultSet rs = stmt.executeQuery();
        StringBuilder sb = new StringBuilder();
        
        try {
            
            //sb.append("{\"datafile\":[");
            sb.append("[");
            while(rs.next()) {
                sb.append("{\"timestamp\":\"");
                sb.append(rs.getString("timestamp"));
                sb.append("\",\"Numero de Sessões\":\"");
                sb.append(rs.getString("Numero_Sessoes"));
                sb.append("\"},");
            }
            sb.setCharAt(sb.length()-1, ']');
            //sb.append("}");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //TODO return proper representation object
        return sb.toString();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
