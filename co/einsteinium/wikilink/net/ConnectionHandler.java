package co.einsteinium.wikilink.net;

import co.einsteinium.wikilink.Reference;
import co.einsteinium.wikilink.util.VersionHandler;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class ConnectionHandler implements IConnectionHandler
{
    @Override
    public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login)
    {
    }

    //////////////////////////////////////////////////////////////
    @Override
    public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager)
    {
        try
        {
            VersionHandler.getWikiLinkVersionFromWeb();

                if(VersionHandler.getUpdateMod() == true)
                    netHandler.getPlayer().addChatMessage("\u00A76[\u00A7aWikiLink\u00A76]\u00A7c WikiLink is out of date for your Minecraft version. Please update at www.catacombs.co for the latest version.");
                
                if(VersionHandler.getUpdateLib() == true)
                    netHandler.getPlayer().addChatMessage("\u00A76[\u00A7aWikiLink\u00A76]\u00A7c WikiLinkLib is out of date for your Minecraft version. Please update at www.catacombs.co for the latest version.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            netHandler.getPlayer().addChatMessage("\u00A76[\u00A7aWikiLink\u00A76]\u00A74 There was a problem while checking the version of WikiLink. Please report this at www.catacombs.co/contact-me/");
        }
    }

    @Override
    public String connectionReceived(NetLoginHandler netHandler,
                                     INetworkManager manager)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void connectionOpened(NetHandler netClientHandler, String server,
                                 int port, INetworkManager manager)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void connectionOpened(NetHandler netClientHandler,
                                 MinecraftServer server, INetworkManager manager)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void connectionClosed(INetworkManager manager)
    {
        // TODO Auto-generated method stub
    }
}