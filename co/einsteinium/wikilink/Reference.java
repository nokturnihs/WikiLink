package co.einsteinium.wikilink;

import java.util.ArrayList;

/** Reference
 *
 * @since 1.6.2-001
 * @author DrEinsteinium
 *
 */
public class Reference
{
    public static final String MOD_ID = "WikiLink";
    public static final String MOD_NAME = "WikiLink";
    public static final String MOD_CHANNEL = "WikiLink";

    public static final String PROXY_COMMON_LOC = "co.einsteinium.wikilink.net.CommonProxy";
    public static final String PROXY_CLIENT_LOC = "co.einsteinium.wikilink.net.ClientProxy";

    public static final String VER_STATE = "Release";
    public static final String VER_MAJOR = "3";
    public static final String VER_MINOR = "00";
    public static final String VER_BUILD = "01";
    public static final String VER_MINECRAFT = "1.6.4";
    
    public static final String VER_MODHASH = "f7be4d3eade462a902291ad863bd917b";

    public static final String MOD_MINIVER = VER_MAJOR + "." + VER_MINOR + "." + VER_BUILD;
    public static final String MOD_VERSION = VER_MINECRAFT + "-" + VER_MAJOR + "." + VER_MINOR + "." + VER_BUILD + " (" + VER_STATE + ")";

    public static ArrayList wikiIdList = new ArrayList();
    public static ArrayList wikiNameList = new ArrayList();
    public static ArrayList wikiDomainList = new ArrayList();
    public static ArrayList wikiSoftwareList = new ArrayList();
    public static ArrayList wikiExtensionList = new ArrayList();
}