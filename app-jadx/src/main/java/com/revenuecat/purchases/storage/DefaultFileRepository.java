package com.revenuecat.purchases.storage;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.O0;
import Gf.P;
import Gf.W;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import fe.c;
import ie.InterfaceC5082a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0002/0BC\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\u001c2\u001a\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001a0 0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010'R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository;", "Lcom/revenuecat/purchases/storage/FileRepository;", "Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$CacheKey;", "Ljava/net/URI;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/storage/LocalFileCache;", "fileCacheManager", "LGf/O;", "ioScope", "Lcom/revenuecat/purchases/LogHandler;", "logHandler", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "urlConnectionFactory", "<init>", "(Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;Lcom/revenuecat/purchases/storage/LocalFileCache;LGf/O;Lcom/revenuecat/purchases/LogHandler;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Ljava/net/URL;", "url", "Lcom/revenuecat/purchases/utils/UrlConnection;", "downloadFile", "(Ljava/net/URL;LZd/e;)Ljava/lang/Object;", "uri", "connectionWithStream", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "LTd/L;", "saveCachedFile", "(Ljava/net/URI;Lcom/revenuecat/purchases/utils/UrlConnection;Lcom/revenuecat/purchases/models/Checksum;)V", "", "Lkotlin/Pair;", "urls", "prefetch", "(Ljava/util/List;)V", "generateOrGetCachedFileURL", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;)Ljava/lang/Object;", "getFile", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;", "Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "getStore$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "LGf/O;", "Lcom/revenuecat/purchases/LogHandler;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "CacheKey", "Error", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultFileRepository implements FileRepository {
    private final LocalFileCache fileCacheManager;
    private final O ioScope;
    private final LogHandler logHandler;
    private final KeyedDeferredValueStore<CacheKey, URI> store;
    private final UrlConnectionFactory urlConnectionFactory;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$CacheKey;", "", "url", "Ljava/net/URL;", "checksum", "Lcom/revenuecat/purchases/models/Checksum;", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)V", "getChecksum", "()Lcom/revenuecat/purchases/models/Checksum;", "getUrl", "()Ljava/net/URL;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CacheKey {
        private final Checksum checksum;
        private final URL url;

        public CacheKey(URL url, Checksum checksum) {
            AbstractC5504s.h(url, "url");
            this.url = url;
            this.checksum = checksum;
        }

        public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, URL url, Checksum checksum, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                url = cacheKey.url;
            }
            if ((i10 & 2) != 0) {
                checksum = cacheKey.checksum;
            }
            return cacheKey.copy(url, checksum);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final URL getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Checksum getChecksum() {
            return this.checksum;
        }

        public final CacheKey copy(URL url, Checksum checksum) {
            AbstractC5504s.h(url, "url");
            return new CacheKey(url, checksum);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return AbstractC5504s.c(this.url, cacheKey.url) && AbstractC5504s.c(this.checksum, cacheKey.checksum);
        }

        public final Checksum getChecksum() {
            return this.checksum;
        }

        public final URL getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            Checksum checksum = this.checksum;
            return iHashCode + (checksum == null ? 0 : checksum.hashCode());
        }

        public String toString() {
            return "CacheKey(url=" + this.url + ", checksum=" + this.checksum + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "Ljava/io/IOException;", "message", "", "(Ljava/lang/String;)V", "ChecksumValidationFailed", "FailedToCreateCacheDirectory", "FailedToFetchFileFromRemoteSource", "FailedToSaveCachedFile", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$ChecksumValidationFailed;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToCreateCacheDirectory;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToSaveCachedFile;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Error extends IOException {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$ChecksumValidationFailed;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ChecksumValidationFailed extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChecksumValidationFailed(String message) {
                super(message, null);
                AbstractC5504s.h(message, "message");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToCreateCacheDirectory;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "url", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToCreateCacheDirectory extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToCreateCacheDirectory(String url) {
                super("Failed to create cache directory for " + url, null);
                AbstractC5504s.h(url, "url");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToFetchFileFromRemoteSource extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToFetchFileFromRemoteSource(String message) {
                super(message, null);
                AbstractC5504s.h(message, "message");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToSaveCachedFile;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToSaveCachedFile extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToSaveCachedFile(String message) {
                super(message, null);
                AbstractC5504s.h(message, "message");
            }
        }

        public /* synthetic */ Error(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Error(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository", f = "DefaultFileRepository.kt", l = {131}, m = "downloadFile")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultFileRepository.this.downloadFile(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2", f = "DefaultFileRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "Lcom/revenuecat/purchases/utils/UrlConnection;", "<anonymous>", "(LGf/O;)Lcom/revenuecat/purchases/utils/UrlConnection;"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ URL $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(URL url, e eVar) {
            super(2, eVar);
            this.$url = url;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DefaultFileRepository.this.new AnonymousClass2(this.$url, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass2) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            URL url = this.$url;
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Downloading remote file from " + url);
            }
            UrlConnectionFactory urlConnectionFactory = DefaultFileRepository.this.urlConnectionFactory;
            String string = this.$url.toString();
            AbstractC5504s.g(string, "url.toString()");
            UrlConnection urlConnectionCreateConnection$default = UrlConnectionFactory.createConnection$default(urlConnectionFactory, string, null, 2, null);
            if (urlConnectionCreateConnection$default.getResponseCode() == 200) {
                return urlConnectionCreateConnection$default;
            }
            urlConnectionCreateConnection$default.disconnect();
            throw new IOException("HTTP " + urlConnectionCreateConnection$default.getResponseCode() + " when downloading file at: " + this.$url);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/W;", "Ljava/net/URI;", "invoke", "()LGf/W;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41452 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Checksum $checksum;
        final /* synthetic */ URL $url;

        /* JADX INFO: renamed from: com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2$1", f = "DefaultFileRepository.kt", l = {118}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "Ljava/net/URI;", "<anonymous>", "(LGf/O;)Ljava/net/URI;"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends l implements Function2 {
            final /* synthetic */ Checksum $checksum;
            final /* synthetic */ URL $url;
            Object L$0;
            int label;
            final /* synthetic */ DefaultFileRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DefaultFileRepository defaultFileRepository, URL url, Checksum checksum, e eVar) {
                super(2, eVar);
                this.this$0 = defaultFileRepository;
                this.$url = url;
                this.$checksum = checksum;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new AnonymousClass1(this.this$0, this.$url, this.$checksum, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, e eVar) {
                return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Error.FailedToFetchFileFromRemoteSource, Error.FailedToCreateCacheDirectory {
                URI uri;
                Object objF = AbstractC2605b.f();
                int i10 = this.label;
                if (i10 == 0) {
                    v.b(obj);
                    URI uriGenerateLocalFilesystemURI = this.this$0.fileCacheManager.generateLocalFilesystemURI(this.$url, this.$checksum);
                    if (uriGenerateLocalFilesystemURI == null) {
                        String string = this.$url.toString();
                        AbstractC5504s.g(string, "url.toString()");
                        Error.FailedToCreateCacheDirectory failedToCreateCacheDirectory = new Error.FailedToCreateCacheDirectory(string);
                        this.this$0.logHandler.e("FileRepository", "Failed to create cache directory for " + this.$url, failedToCreateCacheDirectory);
                        throw failedToCreateCacheDirectory;
                    }
                    if (this.this$0.fileCacheManager.cachedContentExists(uriGenerateLocalFilesystemURI)) {
                        return uriGenerateLocalFilesystemURI;
                    }
                    DefaultFileRepository defaultFileRepository = this.this$0;
                    URL url = this.$url;
                    this.L$0 = uriGenerateLocalFilesystemURI;
                    this.label = 1;
                    Object objDownloadFile = defaultFileRepository.downloadFile(url, this);
                    if (objDownloadFile == objF) {
                        return objF;
                    }
                    uri = uriGenerateLocalFilesystemURI;
                    obj = objDownloadFile;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uri = (URI) this.L$0;
                    v.b(obj);
                }
                this.this$0.saveCachedFile(uri, (UrlConnection) obj, this.$checksum);
                return uri;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41452(URL url, Checksum checksum) {
            super(0);
            this.$url = url;
            this.$checksum = checksum;
        }

        @Override // ie.InterfaceC5082a
        public final W invoke() {
            return AbstractC1617k.b(DefaultFileRepository.this.ioScope, null, null, new AnonymousClass1(DefaultFileRepository.this, this.$url, this.$checksum, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.storage.DefaultFileRepository$prefetch$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.storage.DefaultFileRepository$prefetch$1", f = "DefaultFileRepository.kt", l = {94}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41461 extends l implements Function2 {
        final /* synthetic */ List<Pair<URL, Checksum>> $urls;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DefaultFileRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41461(List<Pair<URL, Checksum>> list, DefaultFileRepository defaultFileRepository, e eVar) {
            super(2, eVar);
            this.$urls = list;
            this.this$0 = defaultFileRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C41461(this.$urls, this.this$0, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C41461) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:13:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            DefaultFileRepository defaultFileRepository;
            URL url;
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                List<Pair<URL, Checksum>> list = this.$urls;
                DefaultFileRepository defaultFileRepository2 = this.this$0;
                it = list.iterator();
                defaultFileRepository = defaultFileRepository2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (URL) this.L$2;
                it = (Iterator) this.L$1;
                defaultFileRepository = (DefaultFileRepository) this.L$0;
                try {
                    v.b(obj);
                } catch (IOException e10) {
                    defaultFileRepository.logHandler.e("FileRepository", "Prefetch failed for " + url + ": " + e10, e10);
                }
            }
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                url = (URL) pair.getFirst();
                Checksum checksum = (Checksum) pair.getSecond();
                this.L$0 = defaultFileRepository;
                this.L$1 = it;
                this.L$2 = url;
                this.label = 1;
                if (defaultFileRepository.generateOrGetCachedFileURL(url, checksum, this) == objF) {
                    return objF;
                }
            }
            return L.f17438a;
        }
    }

    public DefaultFileRepository(KeyedDeferredValueStore<CacheKey, URI> store, LocalFileCache fileCacheManager, O ioScope, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory) {
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(fileCacheManager, "fileCacheManager");
        AbstractC5504s.h(ioScope, "ioScope");
        AbstractC5504s.h(logHandler, "logHandler");
        AbstractC5504s.h(urlConnectionFactory, "urlConnectionFactory");
        this.store = store;
        this.fileCacheManager = fileCacheManager;
        this.ioScope = ioScope;
        this.logHandler = logHandler;
        this.urlConnectionFactory = urlConnectionFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object downloadFile(java.net.URL r6, Zd.e r7) throws com.revenuecat.purchases.storage.DefaultFileRepository.Error.FailedToFetchFileFromRemoteSource {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.revenuecat.purchases.storage.DefaultFileRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1 r0 = (com.revenuecat.purchases.storage.DefaultFileRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1 r0 = new com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.net.URL r6 = (java.net.URL) r6
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.storage.DefaultFileRepository r0 = (com.revenuecat.purchases.storage.DefaultFileRepository) r0
            Td.v.b(r7)     // Catch: java.io.IOException -> L31
            goto L56
        L31:
            r7 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Td.v.b(r7)
            Gf.K r7 = Gf.C1608f0.b()     // Catch: java.io.IOException -> L59
            com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2 r2 = new com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2     // Catch: java.io.IOException -> L59
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L59
            r0.L$0 = r5     // Catch: java.io.IOException -> L59
            r0.L$1 = r6     // Catch: java.io.IOException -> L59
            r0.label = r3     // Catch: java.io.IOException -> L59
            java.lang.Object r7 = Gf.AbstractC1613i.g(r7, r2, r0)     // Catch: java.io.IOException -> L59
            if (r7 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            com.revenuecat.purchases.utils.UrlConnection r7 = (com.revenuecat.purchases.utils.UrlConnection) r7     // Catch: java.io.IOException -> L31
            return r7
        L59:
            r7 = move-exception
            r0 = r5
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to fetch file from remote source: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ". Error: "
            r1.append(r6)
            java.lang.String r6 = r7.getLocalizedMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.revenuecat.purchases.LogHandler r0 = r0.logHandler
            java.lang.String r1 = "FileRepository"
            r0.e(r1, r6, r7)
            com.revenuecat.purchases.storage.DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource r7 = new com.revenuecat.purchases.storage.DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.storage.DefaultFileRepository.downloadFile(java.net.URL, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveCachedFile(URI uri, UrlConnection connectionWithStream, Checksum checksum) {
        try {
            try {
                InputStream inputStream = connectionWithStream.getInputStream();
                try {
                    this.fileCacheManager.saveData(inputStream, uri, checksum);
                    L l10 = L.f17438a;
                    c.a(inputStream, null);
                } finally {
                }
            } catch (Checksum.ChecksumValidationException e10) {
                String str = "Checksum validation failed for " + uri + ": " + e10.getMessage();
                this.logHandler.e("FileRepository", str, e10);
                throw new Error.ChecksumValidationFailed(str);
            } catch (IOException e11) {
                String str2 = "Failed to save cached file: " + uri + ". Error: " + e11.getLocalizedMessage();
                this.logHandler.e("FileRepository", str2, e11);
                throw new Error.FailedToSaveCachedFile(str2);
            }
        } finally {
            connectionWithStream.disconnect();
        }
    }

    @Override // com.revenuecat.purchases.storage.FileRepository
    public Object generateOrGetCachedFileURL(URL url, Checksum checksum, e eVar) {
        return this.store.getOrPut(new CacheKey(url, checksum), new C41452(url, checksum)).M0(eVar);
    }

    @Override // com.revenuecat.purchases.storage.FileRepository
    public URI getFile(URL url, Checksum checksum) {
        AbstractC5504s.h(url, "url");
        URI uriGenerateLocalFilesystemURI = this.fileCacheManager.generateLocalFilesystemURI(url, checksum);
        if (uriGenerateLocalFilesystemURI == null || !this.fileCacheManager.cachedContentExists(uriGenerateLocalFilesystemURI)) {
            return null;
        }
        return uriGenerateLocalFilesystemURI;
    }

    public final KeyedDeferredValueStore<CacheKey, URI> getStore$purchases_defaultsBc8Release() {
        return this.store;
    }

    @Override // com.revenuecat.purchases.storage.FileRepository
    public void prefetch(List<Pair<URL, Checksum>> urls) {
        AbstractC5504s.h(urls, "urls");
        AbstractC1617k.d(this.ioScope, null, null, new C41461(urls, this, null), 3, null);
    }

    public /* synthetic */ DefaultFileRepository(KeyedDeferredValueStore keyedDeferredValueStore, LocalFileCache localFileCache, O o10, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new KeyedDeferredValueStore(null, 1, null) : keyedDeferredValueStore, localFileCache, (i10 & 4) != 0 ? P.a(C1608f0.b().w(O0.f7527b)) : o10, (i10 & 8) != 0 ? LogWrapperKt.getCurrentLogHandler() : logHandler, (i10 & 16) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFileRepository(Context context) {
        this(null, new DefaultFileCache(context), null, null, null, 29, null);
        AbstractC5504s.h(context, "context");
    }
}
