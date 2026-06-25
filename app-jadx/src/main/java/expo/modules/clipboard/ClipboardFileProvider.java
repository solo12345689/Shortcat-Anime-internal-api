package expo.modules.clipboard;

import Df.r;
import Td.L;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import app.notifee.core.event.LogEvent;
import fe.k;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0003(,/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lexpo/modules/clipboard/ClipboardFileProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "onCreate", "()Z", "Landroid/content/Context;", "context", "Landroid/content/pm/ProviderInfo;", LogEvent.LEVEL_INFO, "LTd/L;", "attachInfo", "(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V", "Landroid/net/Uri;", "uri", "", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "mode", "Landroid/os/ParcelFileDescriptor;", "openFile", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;", "a", "[Ljava/lang/String;", "defaultProjectionColumns", "Lexpo/modules/clipboard/ClipboardFileProvider$b;", "b", "Lexpo/modules/clipboard/ClipboardFileProvider$b;", "strategy", "c", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipboardFileProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final File f46020d = new File("/");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap f46021e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] defaultProjectionColumns = {"_display_name", "_size"};

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b strategy;

    /* JADX INFO: renamed from: expo.modules.clipboard.ClipboardFileProvider$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File a(File file, String... strArr) {
            for (String str : strArr) {
                if (str != null) {
                    file = new File(file, str);
                }
            }
            return file;
        }

        private final b d(Context context, String str) throws XmlPullParserException, IOException {
            c cVar = new c(str);
            PackageManager packageManager = context.getPackageManager();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 128);
            if (providerInfoResolveContentProvider == null) {
                throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
            }
            XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(packageManager, "expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS");
            if (xmlResourceParserLoadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = xmlResourceParserLoadXmlMetaData.next();
                if (next == 1) {
                    return cVar;
                }
                if (next == 2) {
                    String name = xmlResourceParserLoadXmlMetaData.getName();
                    AbstractC5504s.e(name);
                    File fileE = e(name, context);
                    if (fileE != null) {
                        cVar.c(xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name"), ClipboardFileProvider.INSTANCE.a(fileE, xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path")));
                    }
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final File e(String str, Context context) {
            switch (str.hashCode()) {
                case -1642807877:
                    if (str.equals("files-path")) {
                        return context.getFilesDir();
                    }
                    return null;
                case -1360690478:
                    if (str.equals("external-cache-path")) {
                        File[] externalCacheDirs = context.getExternalCacheDirs();
                        AbstractC5504s.g(externalCacheDirs, "getExternalCacheDirs(...)");
                        if (externalCacheDirs.length == 0) {
                            externalCacheDirs = null;
                        }
                        if (externalCacheDirs != null) {
                            return externalCacheDirs[0];
                        }
                        return null;
                    }
                    return null;
                case -913292752:
                    if (str.equals("root-path")) {
                        return ClipboardFileProvider.f46020d;
                    }
                    return null;
                case -50149145:
                    if (str.equals("external-path")) {
                        return Environment.getExternalStorageDirectory();
                    }
                    return null;
                case -17221744:
                    if (str.equals("cache-path")) {
                        return context.getCacheDir();
                    }
                    return null;
                case 1308690685:
                    if (str.equals("external-files-path")) {
                        File[] externalFilesDirs = context.getExternalFilesDirs(null);
                        AbstractC5504s.g(externalFilesDirs, "getExternalFilesDirs(...)");
                        if (externalFilesDirs.length == 0) {
                            externalFilesDirs = null;
                        }
                        if (externalFilesDirs != null) {
                            return externalFilesDirs[0];
                        }
                        return null;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final b b(Context context, String authority) {
            b bVar;
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(authority, "authority");
            N n10 = new N();
            synchronized (ClipboardFileProvider.f46021e) {
                try {
                    bVar = (b) ClipboardFileProvider.f46021e.get(authority);
                    if (bVar == null) {
                        try {
                            n10.f52259a = ClipboardFileProvider.INSTANCE.d(context, authority);
                            ClipboardFileProvider.f46021e.put(authority, n10.f52259a);
                            bVar = (b) n10.f52259a;
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data", e10);
                        } catch (XmlPullParserException e11) {
                            throw new IllegalArgumentException("Failed to parse expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data", e11);
                        }
                    }
                    n10.f52259a = bVar;
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }

        public final Uri c(Context context, String authority, File file) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(authority, "authority");
            AbstractC5504s.h(file, "file");
            return b(context, authority).a(file);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f46025b;

        public c(String authority) {
            AbstractC5504s.h(authority, "authority");
            this.f46024a = authority;
            this.f46025b = new HashMap();
        }

        @Override // expo.modules.clipboard.ClipboardFileProvider.b
        public Uri a(File file) {
            String strSubstring;
            AbstractC5504s.h(file, "file");
            try {
                String canonicalPath = file.getCanonicalPath();
                AbstractC5504s.e(canonicalPath);
                Map.Entry entry = null;
                for (Object obj : this.f46025b.entrySet()) {
                    AbstractC5504s.g(obj, "next(...)");
                    Map.Entry entry2 = (Map.Entry) obj;
                    String path = ((File) entry2.getValue()).getPath();
                    AbstractC5504s.e(path);
                    if (r.Q(canonicalPath, path, false, 2, null) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(("Failed to find configured root that contains " + ((Object) canonicalPath)).toString());
                }
                String path2 = ((File) entry.getValue()).getPath();
                AbstractC5504s.e(path2);
                if (r.A(path2, "/", false, 2, null)) {
                    strSubstring = canonicalPath.substring(path2.length());
                    AbstractC5504s.g(strSubstring, "substring(...)");
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                    AbstractC5504s.g(strSubstring, "substring(...)");
                }
                return new Uri.Builder().scheme("content").authority(this.f46024a).encodedPath(Uri.encode((String) entry.getKey()) + "/" + Uri.encode(strSubstring, "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // expo.modules.clipboard.ClipboardFileProvider.b
        public File b(Uri uri) {
            AbstractC5504s.h(uri, "uri");
            String encodedPath = uri.getEncodedPath();
            AbstractC5504s.e(encodedPath);
            int iI0 = r.i0(encodedPath, '/', 1, false, 4, null);
            String strSubstring = encodedPath.substring(1, iI0);
            AbstractC5504s.g(strSubstring, "substring(...)");
            String strDecode = Uri.decode(strSubstring);
            String strSubstring2 = encodedPath.substring(iI0 + 1);
            AbstractC5504s.g(strSubstring2, "substring(...)");
            String strDecode2 = Uri.decode(strSubstring2);
            AbstractC5504s.g(strDecode2, "decode(...)");
            File file = (File) this.f46025b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                AbstractC5504s.e(canonicalFile);
                if (k.G(canonicalFile, file)) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        public final void c(String str, File root) {
            AbstractC5504s.h(root, "root");
            if (str == null || TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f46025b.put(str, root.getCanonicalFile());
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + root, e10);
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo info) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(info, "info");
        super.attachInfo(context, info);
        if (!info.exported) {
            throw new AssertionError("ClipboardFileProvider must be exported");
        }
        Companion companion = INSTANCE;
        String authority = info.authority;
        AbstractC5504s.g(authority, "authority");
        this.strategy = companion.b(context, authority);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        AbstractC5504s.h(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        b bVar = this.strategy;
        if (bVar == null) {
            AbstractC5504s.u("strategy");
            bVar = null;
        }
        File fileB = bVar.b(uri);
        String name = fileB.getName();
        AbstractC5504s.g(name, "getName(...)");
        int iO0 = r.o0(name, com.amazon.a.a.o.c.a.b.f34706a, 0, false, 6, null);
        if (iO0 < 0) {
            return "application/octet-stream";
        }
        String name2 = fileB.getName();
        AbstractC5504s.g(name2, "getName(...)");
        String strSubstring = name2.substring(iO0 + 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring);
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        AbstractC5504s.h(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) {
        AbstractC5504s.h(uri, "uri");
        AbstractC5504s.h(mode, "mode");
        if (!AbstractC5504s.c("r", mode)) {
            throw new IllegalArgumentException("mode must be \"r\"");
        }
        b bVar = this.strategy;
        if (bVar == null) {
            AbstractC5504s.u("strategy");
            bVar = null;
        }
        return ParcelFileDescriptor.open(bVar.b(uri), 268435456);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int i10;
        AbstractC5504s.h(uri, "uri");
        if (projection == null) {
            projection = this.defaultProjectionColumns;
        }
        b bVar = this.strategy;
        if (bVar == null) {
            AbstractC5504s.u("strategy");
            bVar = null;
        }
        File fileB = bVar.b(uri);
        String[] strArr = new String[projection.length];
        Object[] objArr = new Object[projection.length];
        int i11 = 0;
        for (String str : projection) {
            if (AbstractC5504s.c(str, "_display_name")) {
                strArr[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = fileB.getName();
            } else if (AbstractC5504s.c(str, "_size")) {
                strArr[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(fileB.length());
            }
            i11 = i10;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i11);
        AbstractC5504s.g(objArrCopyOf2, "copyOf(...)");
        MatrixCursor matrixCursor = new MatrixCursor((String[]) objArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        AbstractC5504s.h(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }
}
