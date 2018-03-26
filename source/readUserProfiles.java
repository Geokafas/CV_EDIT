/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author kafas
 */
public class readUserProfiles {

    private user_credentials fileUser;
    private static ArrayList<user_credentials> local_users = new ArrayList<user_credentials>();
    private static boolean foundDuplicateFlag = false;
    
    public void readFrom(){
        //file to open
        String fileName = "usrProfiles.txt";

        //read line by line
        String line = null;

        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            
            //TODO: TEST EXCEPTIONS HERE.. what if the file to read is corrupted?!?
            while((line = bufferedReader.readLine()) != null){
                fileUser = new user_credentials();
                
                fileUser.profile_name = line;
                System.out.println(fileUser.profile_name);
                fileUser.name = bufferedReader.readLine();
                System.out.println(fileUser.name);
                fileUser.adress = bufferedReader.readLine();
                System.out.println(fileUser.adress);
                fileUser.phone_number = Integer.parseInt(bufferedReader.readLine());
                System.out.println(fileUser.phone_number);
                fileUser.mobile_number = Integer.parseInt(bufferedReader.readLine());
                System.out.println(fileUser.mobile_number);
                fileUser.email = bufferedReader.readLine();
                System.out.println(fileUser.email);
                //consume the \n
                line = bufferedReader.readLine();
                updatelocalUsersArray(fileUser);
            }

            bufferedReader.close();
            
            //upfate users if local_users are added
            if(local_users.size() != profile_window.users.size()){
                updateUsersArray();
            }

        }catch(FileNotFoundException ex){
            System.out.println("Unable to open file '" + fileName + "'");
        }catch(IOException ex){
            System.out.println("Error reading file '"  + fileName + "'");
        }
    }
    
    //updates the users array ,containing the total saved users, 
    //with the ones read from the users file
    public void updatelocalUsersArray(user_credentials user){
        int local_users_arraySize = local_users.size();
        foundDuplicateFlag = false;
        
        if(local_users_arraySize == 0 ){
            local_users.add(user);
        }else{
            for(int i=0; i<local_users_arraySize; i++){
                if(userCompare(local_users.get(i),user)==true){
                    System.out.println("ENTERED"+local_users.get(i).profile_name+user.profile_name);
                    foundDuplicateFlag = true;
                }
            }
            
            if(foundDuplicateFlag == false){
                local_users.add(user);
            }else{
                foundDuplicateFlag = false;
            }
        }
        System.out.println("local users: "+local_users.size());
    }
    
    public void updateUsersArray(){
        for(int i=0; i<local_users.size(); i++){
            profile_window.users.add(local_users.get(i));
        }
        
    }
    
    public  boolean userCompare(user_credentials userx, user_credentials usery){
        if((userx.profile_name).equals(usery.profile_name)){
            return true;
        }else{
            System.out.println("FOUN NOT EQUAL: "+userx.profile_name+" "+usery.profile_name);
            return false;
        }
    }
   
}
