import me.PauMAVA.MojangAPI.MojangAPI;
import me.PauMAVA.MojangAPI.MojangAPICache;
import me.PauMAVA.MojangAPI.services.PlayerInfoHandler;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class testCacheSaving {

    private final MojangAPI api = new MojangAPI();
    private final MojangAPICache cache = new MojangAPICache(api);
    private final PlayerInfoHandler pih = api.getPlayerInfoHandler();

    @Test
    public void TestSaving() {
        cache.saveUUID("GoldLord_", pih.fetchUUID("GoldLord_"));
        cache.saveUUID("theresajayne", pih.fetchUUID("theresajayne")); //died
        cache.saveUUID("zilacon", pih.fetchUUID("zilacon"));
        cache.saveUUID("braddevans", pih.fetchUUID("braddevans"));

        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        File file = new File(path.toFile() + File.separator + "cache.dat");
        System.out.println(file.getAbsolutePath());
        cache.saveCacheToFile(file);
        try {
            System.out.println(FileUtils.readLines(new File(path.toFile() + File.separator + "cache.dat")).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestLoading() {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        File cacheFile = new File(path.toFile() + File.separator + "cache.dat");
        cache.cleanCache();
        System.out.println("Cleared Cache Size: " + cache.cacheSize());

        cache.loadCacheFromFile(cacheFile);

        System.out.println("new Cache Size: " + cache.cacheSize());
    }

}
