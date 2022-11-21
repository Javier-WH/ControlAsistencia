package controllers;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class UpdatePassword {

    public static boolean updateAdminPassword(String id, String password) {
        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("update admins set password = ? where id = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, libraries.Encript.encriptar(password, env.GetLocalConfig.getKey()));
            st.setString(2, id);
            st.execute();
            return true;

        } catch (SQLException | UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
