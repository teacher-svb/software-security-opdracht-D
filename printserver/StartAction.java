package printserver;

import java.io.File;
import java.security.Permission;
import java.security.PrivilegedAction;

public class StartAction implements PrivilegedAction {
    private String filename;

    public Object run() {
        Permission p = new PrintServerPermission("start");
        SecurityManager s = System.getSecurityManager();
        if (s != null)
            s.checkPermission(p);
        PrintServer.print(filename);
        return null;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}