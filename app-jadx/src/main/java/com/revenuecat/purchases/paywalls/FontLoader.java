package com.revenuecat.purchases.paywalls;

import Df.C1271d;
import Df.r;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Gf.X0;
import Td.AbstractC2163n;
import Td.L;
import Td.q;
import Td.u;
import Td.v;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.a0;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import fe.c;
import fe.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R&\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020,0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010C\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/paywalls/FontLoader;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "providedCacheDir", "LGf/O;", "ioScope", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "urlConnectionFactory", "<init>", "(Landroid/content/Context;Ljava/io/File;LGf/O;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "fontInfo", "LTd/L;", "startFontDownload", "(Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;)V", "", "urlHash", "file", "addFileToCache", "(Ljava/lang/String;Ljava/io/File;)V", "cacheDir", "", "ensureFoldersExist", "(Ljava/io/File;)Z", "url", "expectedMd5", "extension", "LTd/u;", "performDownloadAndCache-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;", "performDownloadAndCache", "outputFile", "downloadToFile", "Ljava/io/InputStream;", "input", "writeStream", "(Ljava/io/InputStream;Ljava/io/File;)V", "", "bytes", "md5Hex", "([B)Ljava/lang/String;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/content/Context;", "Ljava/io/File;", "LGf/O;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCheckedFoldersExist", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cacheDirectory$delegate", "Lkotlin/Lazy;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Ljava/security/MessageDigest;", "md$delegate", "getMd", "()Ljava/security/MessageDigest;", "md", "", "", "fontInfosForHash", "Ljava/util/Map;", "lock", "Ljava/lang/Object;", "cachedFontFamilyByFontInfo", "cachedFontFamilyByFamilyName", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontLoader {

    /* JADX INFO: renamed from: cacheDirectory$delegate, reason: from kotlin metadata */
    private final Lazy cacheDirectory;
    private final Map<String, DownloadedFontFamily> cachedFontFamilyByFamilyName;
    private final Map<DownloadableFontInfo, String> cachedFontFamilyByFontInfo;
    private final Context context;
    private final Map<String, Set<DownloadableFontInfo>> fontInfosForHash;
    private AtomicBoolean hasCheckedFoldersExist;
    private final O ioScope;
    private final Object lock;

    /* JADX INFO: renamed from: md$delegate, reason: from kotlin metadata */
    private final Lazy md;
    private final File providedCacheDir;
    private final UrlConnectionFactory urlConnectionFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.FontLoader$md5Hex$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b10) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            AbstractC5504s.g(str, "format(...)");
            return str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1", f = "FontLoader.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41431 extends l implements Function2 {
        final /* synthetic */ String $expectedMd5;
        final /* synthetic */ DownloadableFontInfo $fontInfo;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41431(String str, String str2, DownloadableFontInfo downloadableFontInfo, e eVar) {
            super(2, eVar);
            this.$url = str;
            this.$expectedMd5 = str2;
            this.$fontInfo = downloadableFontInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return FontLoader.this.new C41431(this.$url, this.$expectedMd5, this.$fontInfo, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C41431) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            FontLoader fontLoader;
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            File cacheDirectory = FontLoader.this.getCacheDirectory();
            if (cacheDirectory == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot download font: cache directory is not available", null);
                return L.f17438a;
            }
            if (!FontLoader.this.ensureFoldersExist(cacheDirectory)) {
                return L.f17438a;
            }
            FontLoader fontLoader2 = FontLoader.this;
            byte[] bytes = this.$url.getBytes(C1271d.f3718b);
            AbstractC5504s.g(bytes, "getBytes(...)");
            String strMd5Hex = fontLoader2.md5Hex(bytes);
            String strX0 = r.X0(this.$url, b.f34706a, "");
            File file = new File(cacheDirectory, strMd5Hex + b.f34706a + strX0);
            Object obj3 = FontLoader.this.lock;
            FontLoader fontLoader3 = FontLoader.this;
            DownloadableFontInfo downloadableFontInfo = this.$fontInfo;
            String str = this.$url;
            synchronized (obj3) {
                Set set = (Set) fontLoader3.fontInfosForHash.get(strMd5Hex);
                if (set != null) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font download already in progress for " + str);
                    }
                    set.add(downloadableFontInfo);
                    return L.f17438a;
                }
                fontLoader3.fontInfosForHash.put(strMd5Hex, a0.f(downloadableFontInfo));
                L l10 = L.f17438a;
                if (file.exists()) {
                    FontLoader.this.addFileToCache(strMd5Hex, file);
                    return L.f17438a;
                }
                try {
                    Object objM268performDownloadAndCacheyxL6bBk = FontLoader.this.m268performDownloadAndCacheyxL6bBk(this.$url, this.$expectedMd5, strMd5Hex, strX0, cacheDirectory);
                    FontLoader fontLoader4 = FontLoader.this;
                    if (u.h(objM268performDownloadAndCacheyxL6bBk)) {
                        fontLoader4.addFileToCache(strMd5Hex, (File) objM268performDownloadAndCacheyxL6bBk);
                    }
                    DownloadableFontInfo downloadableFontInfo2 = this.$fontInfo;
                    if (u.e(objM268performDownloadAndCacheyxL6bBk) != null) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to download font for " + downloadableFontInfo2.getFamily(), null);
                    }
                    obj2 = FontLoader.this.lock;
                    fontLoader = FontLoader.this;
                } catch (Throwable th2) {
                    try {
                        String str2 = this.$url;
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading remote font from " + str2, th2);
                        obj2 = FontLoader.this.lock;
                        FontLoader fontLoader5 = FontLoader.this;
                        synchronized (obj2) {
                        }
                    } catch (Throwable th3) {
                        Object obj4 = FontLoader.this.lock;
                        FontLoader fontLoader6 = FontLoader.this;
                        synchronized (obj4) {
                            throw th3;
                        }
                    }
                }
                synchronized (obj2) {
                    return L.f17438a;
                }
            }
        }
    }

    public FontLoader(Context context, File file, O ioScope, UrlConnectionFactory urlConnectionFactory) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(ioScope, "ioScope");
        AbstractC5504s.h(urlConnectionFactory, "urlConnectionFactory");
        this.context = context;
        this.providedCacheDir = file;
        this.ioScope = ioScope;
        this.urlConnectionFactory = urlConnectionFactory;
        this.hasCheckedFoldersExist = new AtomicBoolean(false);
        this.cacheDirectory = AbstractC2163n.a(q.f17461a, new FontLoader$cacheDirectory$2(this));
        this.md = AbstractC2163n.b(FontLoader$md$2.INSTANCE);
        this.fontInfosForHash = new LinkedHashMap();
        this.lock = new Object();
        this.cachedFontFamilyByFontInfo = new LinkedHashMap();
        this.cachedFontFamilyByFamilyName = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFileToCache(String urlHash, File file) {
        synchronized (this.lock) {
            try {
                Set<DownloadableFontInfo> setD = this.fontInfosForHash.get(urlHash);
                if (setD == null) {
                    setD = a0.d();
                }
                for (DownloadableFontInfo downloadableFontInfo : setD) {
                    String family = downloadableFontInfo.getFamily();
                    if (this.cachedFontFamilyByFontInfo.get(downloadableFontInfo) != null) {
                        LogLevel logLevel = LogLevel.VERBOSE;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font already cached for " + family + ". Skipping download.");
                        }
                    } else {
                        DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(family);
                        if (downloadedFontFamily != null) {
                            this.cachedFontFamilyByFamilyName.put(family, new DownloadedFontFamily(downloadedFontFamily.getFamily(), AbstractC2279u.J0(downloadedFontFamily.getFonts(), new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file))));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                        } else {
                            DownloadedFontFamily downloadedFontFamily2 = new DownloadedFontFamily(family, AbstractC2279u.e(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file)));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                            this.cachedFontFamilyByFamilyName.put(family, downloadedFontFamily2);
                        }
                    }
                }
                this.fontInfosForHash.remove(urlHash);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void downloadToFile(String url, File outputFile) throws Throwable {
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Downloading remote font from " + url);
        }
        UrlConnection urlConnection = null;
        try {
            UrlConnection urlConnectionCreateConnection$default = UrlConnectionFactory.createConnection$default(this.urlConnectionFactory, url, null, 2, null);
            try {
                if (urlConnectionCreateConnection$default.getResponseCode() != 200) {
                    throw new IOException("HTTP " + urlConnectionCreateConnection$default.getResponseCode() + " when downloading paywall font: " + url);
                }
                InputStream inputStream = urlConnectionCreateConnection$default.getInputStream();
                try {
                    writeStream(inputStream, outputFile);
                    L l10 = L.f17438a;
                    c.a(inputStream, null);
                    urlConnectionCreateConnection$default.disconnect();
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                urlConnection = urlConnectionCreateConnection$default;
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ensureFoldersExist(File cacheDir) {
        boolean z10 = true;
        if (this.hasCheckedFoldersExist.get()) {
            return true;
        }
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            if (!cacheDir.isDirectory()) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Remote fonts cache path exists but is not a directory: " + cacheDir.getAbsolutePath(), null);
            }
            this.hasCheckedFoldersExist.set(z10);
            return z10;
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unable to create cache directory for remote fonts: " + cacheDir.getAbsolutePath(), null);
        z10 = false;
        this.hasCheckedFoldersExist.set(z10);
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return (File) this.cacheDirectory.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        AbstractC5504s.g(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String md5Hex(byte[] bytes) {
        byte[] digest = getMd().digest(bytes);
        AbstractC5504s.g(digest, "digest");
        return AbstractC2273n.w0(digest, "", null, null, 0, null, AnonymousClass1.INSTANCE, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performDownloadAndCache-yxL6bBk, reason: not valid java name */
    public final Object m268performDownloadAndCacheyxL6bBk(String url, String expectedMd5, String urlHash, String extension, File cacheDir) throws Throwable {
        File file = new File(cacheDir, urlHash + b.f34706a + extension);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.f34706a);
        sb2.append(extension);
        File tempFile = File.createTempFile("rc_paywall_font_download_", sb2.toString(), cacheDir);
        try {
            AbstractC5504s.g(tempFile, "tempFile");
            downloadToFile(url, tempFile);
            String strMd5Hex = md5Hex(k.i(tempFile));
            if (r.B(strMd5Hex, expectedMd5, true)) {
                if (!tempFile.renameTo(file)) {
                    k.y(tempFile, file, true, 0, 4, null);
                    tempFile.delete();
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Font downloaded successfully from " + url);
                }
                return u.b(file);
            }
            tempFile.delete();
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Downloaded font file is corrupt for " + url + ". expected=" + expectedMd5 + ", actual=" + strMd5Hex, null);
            u.a aVar = u.f17466b;
            return u.b(v.a(new IOException("Downloaded font file is corrupt for " + url)));
        } catch (IOException e10) {
            if (tempFile.exists()) {
                tempFile.delete();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading font from " + url + ": " + e10.getMessage(), null);
            u.a aVar2 = u.f17466b;
            return u.b(v.a(e10));
        }
    }

    private final void startFontDownload(DownloadableFontInfo fontInfo) {
        AbstractC1617k.d(this.ioScope, null, null, new C41431(fontInfo.getUrl(), fontInfo.getExpectedMd5(), fontInfo, null), 3, null);
    }

    private final void writeStream(InputStream input, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = input.read(bArr);
                if (i10 < 0) {
                    L l10 = L.f17438a;
                    c.a(fileOutputStream, null);
                    return;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } finally {
        }
    }

    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        AbstractC5504s.h(fontInfo, "fontInfo");
        Result downloadableFontInfo = DownloadableFontInfoKt.toDownloadableFontInfo(fontInfo);
        if (!(downloadableFontInfo instanceof Result.Success)) {
            if (!(downloadableFontInfo instanceof Result.Error)) {
                throw new Td.r();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) ((Result.Error) downloadableFontInfo).getValue(), null);
            return null;
        }
        DownloadableFontInfo downloadableFontInfo2 = (DownloadableFontInfo) ((Result.Success) downloadableFontInfo).getValue();
        synchronized (this.lock) {
            DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(this.cachedFontFamilyByFontInfo.get(downloadableFontInfo2));
            if (downloadedFontFamily != null) {
                return downloadedFontFamily;
            }
            L l10 = L.f17438a;
            startFontDownload(downloadableFontInfo2);
            return null;
        }
    }

    public /* synthetic */ FontLoader(Context context, File file, O o10, UrlConnectionFactory urlConnectionFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : file, (i10 & 4) != 0 ? P.a(X0.b(null, 1, null).w(C1608f0.b())) : o10, (i10 & 8) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }
}
