/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
/**
 *
 * @author yadai
 */
public class Kata4 {
    public static void main(String[] args) throws IOException {
 
	List<Mail> emails_valid = MailListReader.read("C:\\Users\\yadai\\Documents\\NetBeansProjects\\Kata4\\src\\kata4\\main\\email.txt"); 
        
        Histogram<String> histogram = MailHistogramBuilder.build(emails_valid);

        //view
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM DISPLAY", histogram);
        histogramDisplay.execute();
    }
}
