package com.revenuecat.purchases.storage;

import Zd.e;
import com.revenuecat.purchases.models.Checksum;
import java.net.URI;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002H&¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/storage/FileRepository;", "", "", "Lkotlin/Pair;", "Ljava/net/URL;", "Lcom/revenuecat/purchases/models/Checksum;", "urls", "LTd/L;", "prefetch", "(Ljava/util/List;)V", "url", "checksum", "Ljava/net/URI;", "generateOrGetCachedFileURL", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;)Ljava/lang/Object;", "getFile", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FileRepository {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object generateOrGetCachedFileURL$default(FileRepository fileRepository, URL url, Checksum checksum, e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateOrGetCachedFileURL");
        }
        if ((i10 & 2) != 0) {
            checksum = null;
        }
        return fileRepository.generateOrGetCachedFileURL(url, checksum, eVar);
    }

    static /* synthetic */ URI getFile$default(FileRepository fileRepository, URL url, Checksum checksum, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
        if ((i10 & 2) != 0) {
            checksum = null;
        }
        return fileRepository.getFile(url, checksum);
    }

    Object generateOrGetCachedFileURL(URL url, Checksum checksum, e eVar);

    URI getFile(URL url, Checksum checksum);

    void prefetch(List<Pair<URL, Checksum>> urls);
}
