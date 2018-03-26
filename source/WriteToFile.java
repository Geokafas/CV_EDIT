/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;
import java.io.*;
/**
 *
 * @author kafas
 */
public class WriteToFile {
    private static final String FILENAME = "usrProfiles.txt";
    private String user_name;
    private String user_adress;
    private String user_email;
    private long user_phone;
    private long user_mobile;
    private String user_profile;
    
    //user_credentials new_user = new user_credentials();
    
    public void writeToFile(user_credentials new_user){
        BufferedWriter bw = null;
	FileWriter fw = null;
        
        user_name = new_user.name;
        user_adress = new_user.adress;
        user_email = new_user.email;
        user_phone = new_user.phone_number;
        user_mobile = new_user.mobile_number;
        user_profile = new_user.profile_name;
        
        try{
            
            
            fw = new FileWriter(FILENAME,true);
            bw = new BufferedWriter(fw);
            
            bw.write(user_profile);
            bw.append(System.lineSeparator());
            bw.write(user_name);
            bw.append(System.lineSeparator());
            bw.write(user_adress);
            bw.append(System.lineSeparator());
            bw.write(new Long(user_phone).toString());
            bw.append(System.lineSeparator());
            bw.write(new Long(user_mobile).toString());
            bw.append(System.lineSeparator());
            bw.write(user_email);
            bw.write(System.lineSeparator());
            bw.write(System.lineSeparator());
            
            System.out.println("Done");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
		if (bw != null)
                    bw.close();
		if (fw != null)
                    fw.close();
            } catch (IOException ex) {
		ex.printStackTrace();

            }            
        }
    }
}
