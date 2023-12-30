/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageLogger {
    public static void saveMessageToDatabase(String sender, String message) {
        try (Connection connection = DatabaseManager.connect()) {
            String sql = "INSERT INTO messages.log_messages (sender, message) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, sender);
                statement.setString(2, message);
                statement.executeUpdate();
                /*
                MESAJLAR BU METOD İLE MYSQL SERVERE LOGLANIYOR
                */
            }
        } catch (SQLException e) {
            System.out.println("Hata oluştu, hata kodunuz: " + e);
        }
    }
}
