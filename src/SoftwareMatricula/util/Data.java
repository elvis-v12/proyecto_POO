/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoftwareMatricula.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

/**
 *
 * @author elnoe
 */
public class Data {

        public static String getString(Supplier<Object> get) {
                return String.valueOf(get.get());
        }

        public static String getDateString() {
                Date ahora = new Date();

                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");

                String fechaYHoraFormateada = formato.format(ahora);

                return fechaYHoraFormateada;
        }

}
