package printserver.principal;

import java.security.Principal;

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a Sample user.
 *
 * <p> Principals such as this <code>SamplePrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
public class PrintserverPrincipal implements Principal, java.io.Serializable {

    /**
     * @serial
     */
    private String name;

    /**
     * Create a PrintserverPrincipal with a Printserver username.
     *
     * <p>
     *
     * @param name the Printserver username for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
    public PrintserverPrincipal(String name) {
        if (name == null)
            throw new NullPointerException("illegal null input");

        this.name = name;
    }

    /**
     * Return the Printserver username for this <code>PrintserverPrincipal</code>.
     *
     * <p>
     *
     * @return the Printserver username for this <code>PrintserverPrincipal</code>
     */
    public String getName() {
        return name;
    }

    /**
     * Return a string representation of this <code>PrintserverPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>PrintserverPrincipal</code>.
     */
    public String toString() {
        return("PrintserverPrincipal:  " + name);
    }

    /**
     * Compares the specified Object with this <code>PrintserverPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>PrintserverPrincipal</code> and the two PrintserverPrincipals
     * have the same username.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>PrintserverPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>PrintserverPrincipal</code>.
     */
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this == o)
            return true;

        if (!(o instanceof PrintserverPrincipal))
            return false;
        PrintserverPrincipal that = (PrintserverPrincipal)o;

        if (this.getName().equals(that.getName()))
            return true;
        return false;
    }

    /**
     * Return a hash code for this <code>PrintserverPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>PrintserverPrincipal</code>.
     */
    public int hashCode() {
        return name.hashCode();
    }
}