package com.lmbm.learning.programming;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lux Ferre
 */
public class Archivos{

    public static void main(String[] args) throws Exception {

        //archivosConFileStream();
        //archivosConBuffered();
        //upload();
        //uploadFilesDisk();
        saveFileDisk(null, null);

    }

    public static void archivosConFileStream() {

        File archivo = new File("prueba.txt");

        // Para crear archivo -- Creates a file output stream to write to the file with the specified name. 
        FileOutputStream fos = null;
        // Para escribir
        PrintWriter pw = null;
        // Para leer
        FileInputStream fis = null;

        FileWriter fw = null;

        int line = 1;

        if (!archivo.exists()) {
            try {
                fos = new FileOutputStream(archivo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            pw = new PrintWriter(fos);
            pw.println("Creando archivooo");
            pw.close();
        } else {
            try {
                fw = new FileWriter(archivo, true);
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            pw = new PrintWriter(fw, true);
            System.out.println(line);
            pw.println("Agregando linea " + line);
            line++;
            pw.close();
        }

        try {
            // abrir el archivo
            fis = new FileInputStream(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner sc = new Scanner(fis);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        // cierro el archivo
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void archivosConBuffered() throws FileNotFoundException {

        BufferedReader in = new BufferedReader(new FileReader("prueba.txt"));

        int n = 0;

        try {
            String cad = "";
            while (cad != null) {
                cad = in.readLine();
                System.out.println(cad);
                n++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(n);
    }

    public static byte[] uploadArray() throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        FileInputStream fis = new FileInputStream("pic.jpg");

        byte[] n = new byte[fis.available()];
        int c;
        while ((c = fis.read(n)) != - 1) {
            baos.write(n, 0, c);
        }
        System.out.println(baos.toByteArray().length);

        baos.flush();
        return baos.toByteArray();
    }

    public static void saveFileDisk(InputStream archivo, File pp) throws FileNotFoundException, IOException {

        File carpeta = new File("C:\\Users\\Lux Ferre\\Desktop\\Algoritmos\\images");
        if (!carpeta.exists()) {
            System.out.println("Entra a crear carpeta");
            carpeta.mkdir();
        } else {
            System.out.println("Archivo ya creado");
            System.out.println("Ruta abs " + carpeta.getAbsolutePath());
            String p = "pic.jpg";
            String newFile = "pic2.jpg";
            archivo = new FileInputStream(p);
            File f = new File(carpeta.getAbsolutePath() + "\\" + newFile);
            try (FileOutputStream fos = new FileOutputStream(f)) {
                byte[] n = new byte[archivo.available()];
                int c;
                while ((c = archivo.read(n)) != - 1) {
                    System.out.println(archivo.read(n));
                    fos.write(n, 0, c);
                }
            }
            archivo.close();
        }

    }

    public static void uploadFilesDisk() throws FileNotFoundException {
        File carpeta = new File("C:\\Users\\Lux Ferre\\Desktop\\Algoritmos\\images");
        if (!carpeta.exists()) {
            System.out.println("Entra a crear carpeta");
            carpeta.mkdir();
        } else {
            System.out.println("Archivo ya creado");
            System.out.println("Ruta abs " + carpeta.getAbsolutePath());
            String p = "pic2.jpg";
            File f = new File(carpeta.getAbsolutePath() + "\\" + p);
            FileOutputStream fos = new FileOutputStream(f);

            try {
                fos.write(uploadArray());
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
