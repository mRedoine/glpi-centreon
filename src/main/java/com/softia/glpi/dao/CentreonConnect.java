package com.softia.glpi.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;



import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.softia.glpi.model.Computer;
public enum CentreonConnect {
	INSTANCE;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	public void addtoCentreon(Computer comp) throws Exception {
		
		Properties prop=readPropertiesFile("src/main/resources/centreon.properties");
		
		String command = (String)prop.getProperty("centreon.path") +" ./centreon -u admin -p centreon -o HOST -a ADD -v \""+ comp.getName()+ ";"+dateFormat.format(date)+";" + prop.getProperty("centreon.ipglpi") + ";App-Monitoring-Centreon-Central-custom;" + prop.getProperty("centreon.poller")+";\"" ;

		System.out.println(command);
		try {
			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session = jsch.getSession(prop.getProperty("centreon.user"), prop.getProperty("centreon.host"), 22);
			session.setPassword(prop.getProperty("centreon.password"));
			session.setConfig(config);
			session.connect();
			ChannelExec channel = (ChannelExec) session.openChannel("exec");
			channel.setCommand(command);
			channel.setErrStream(System.err);

			InputStream in = channel.getInputStream();
			channel.connect();
			byte[] tmp = new byte[1024];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0) {
						break;
					}
					System.out.print(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					System.out.println("Exit Status: " + channel.getExitStatus());
					break;
				}
				Thread.sleep(1000);
			}
			channel.disconnect();
			session.disconnect();
			System.out.println("DONE!!!");
		} catch (Exception e) {
			throw e;
		}

	}
	
	public static Properties readPropertiesFile(String fileName) throws IOException
	 {
	  FileInputStream fis=null;
	  Properties prop=null;
	  try {
	   fis= new FileInputStream(fileName);
	   prop=new Properties();
	   prop.load(fis);
	 
	  } catch (FileNotFoundException e) {
	 
	   e.printStackTrace();
	  }catch (IOException e) {
	 
	   e.printStackTrace();
	  }
	  finally {
	   fis.close();
	  }
	 
	  return prop;
	 }
}
