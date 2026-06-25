package Eb;

import Cf.l;
import Df.r;
import Td.L;
import Td.u;
import Td.v;
import Ud.AbstractC2279u;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a */
    private final Context f5870a;

    /* JADX INFO: renamed from: b */
    private final Uri f5871b;

    /* JADX INFO: renamed from: c */
    private final String f5872c;

    /* JADX INFO: renamed from: d */
    private Uri f5873d;

    /* JADX INFO: renamed from: Eb.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0057a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f5874a;

        /* JADX INFO: renamed from: b */
        Object f5875b;

        /* JADX INFO: renamed from: c */
        int f5876c;

        /* JADX INFO: renamed from: d */
        int f5877d;

        /* JADX INFO: renamed from: e */
        int f5878e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f5879f;

        C0057a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((C0057a) create(kVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            C0057a c0057a = a.this.new C0057a(eVar);
            c0057a.f5879f = obj;
            return c0057a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0045, code lost:
        
            if (r1.d(r13, r12) == r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
        
            if (r7.e(r13, r12) == r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00c9 -> B:55:0x00cc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Eb.a.C0057a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Context context, Uri uri) {
        String strM1;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(uri, "uri");
        this.f5870a = context;
        this.f5871b = uri;
        String path = c().getPath();
        if (path != null && (strM1 = r.m1(path, '/')) != null) {
            this.f5872c = strM1;
            return;
        }
        throw new IllegalArgumentException("Invalid asset URI: " + c());
    }

    @Override // Eb.k
    public InputStream L() throws IOException {
        InputStream inputStreamOpen = this.f5870a.getAssets().open(this.f5872c);
        AbstractC5504s.g(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    @Override // Eb.k
    public k M(String mimeType, String displayName) {
        AbstractC5504s.h(mimeType, "mimeType");
        AbstractC5504s.h(displayName, "displayName");
        throw new UnsupportedOperationException("Asset files are not writable and cannot be created");
    }

    @Override // Eb.k
    public Cf.i N() {
        return l.b(new C0057a(null));
    }

    @Override // Eb.k
    public k O(String displayName) {
        AbstractC5504s.h(displayName, "displayName");
        throw new UnsupportedOperationException("Asset directories are not writable and cannot be created");
    }

    @Override // Eb.k
    public OutputStream P(boolean z10) {
        throw new UnsupportedOperationException("Asset files are not writable");
    }

    @Override // Eb.k
    public List Q() throws IOException {
        String[] list = this.f5870a.getAssets().list(this.f5872c);
        if (list == null) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(list.length);
        for (String str : list) {
            if (this.f5872c.length() != 0) {
                str = this.f5872c + "/" + str;
            }
            arrayList.add(new a(this.f5870a, Uri.parse("asset:///" + str)));
        }
        return arrayList;
    }

    @Override // Eb.k
    public boolean R() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // Eb.k
    public Long S() {
        return null;
    }

    @Override // Eb.k
    public Uri T(Ub.d appContext) throws IOException {
        AbstractC5504s.h(appContext, "appContext");
        InputStream inputStreamL = L();
        try {
            File file = new File(this.f5870a.getCacheDir(), "expo_shared_assets/" + getFileName());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fe.b.b(inputStreamL, fileOutputStream, 0, 2, null);
                fe.c.a(fileOutputStream, null);
                Uri uriT = new h(Uri.fromFile(file)).T(appContext);
                this.f5873d = uriT;
                fe.c.a(inputStreamL, null);
                return uriT;
            } finally {
            }
        } finally {
        }
    }

    public final String b() {
        return this.f5872c;
    }

    @Override // Eb.k
    public Uri c() {
        return this.f5871b;
    }

    @Override // Eb.k
    public boolean delete() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // Eb.k
    public boolean exists() {
        return isDirectory() || isFile();
    }

    @Override // Eb.k
    public Long getCreationTime() {
        return null;
    }

    @Override // Eb.k
    public String getFileName() {
        return c().getLastPathSegment();
    }

    @Override // Eb.k
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(c().toString());
        AbstractC5504s.e(fileExtensionFromUrl);
        if (fileExtensionFromUrl.length() <= 0) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // Eb.k
    public boolean isDirectory() throws IOException {
        String[] list = this.f5870a.getAssets().list(this.f5872c);
        if (list != null) {
            if (!(list.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // Eb.k
    public boolean isFile() {
        Object objB;
        try {
            u.a aVar = u.f17466b;
            fe.c.a(this.f5870a.getAssets().open(this.f5872c), null);
            objB = u.b(Boolean.TRUE);
        } catch (Throwable th2) {
            u.a aVar2 = u.f17466b;
            objB = u.b(v.a(th2));
        }
        if (u.e(objB) != null) {
            objB = Boolean.FALSE;
        }
        return ((Boolean) objB).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:87|53|54|(2:56|57)(8:60|61|89|69|70|92|71|(5:72|(1:74)(4:97|75|76|77)|78|85|86))|89|69|70|92|71|(6:72|(0)(0)|78|85|86|74)) */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0052 A[Catch: all -> 0x005d, LOOP:0: B:72:0x004b->B:74:0x0052, LOOP_END, TryCatch #3 {all -> 0x005d, blocks: (B:71:0x0048, B:72:0x004b, B:74:0x0052, B:75:0x0055), top: B:92:0x0048, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0055 A[SYNTHETIC] */
    @Override // Eb.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long length() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            Td.u$a r3 = Td.u.f17466b     // Catch: java.lang.Throwable -> L1d
            android.content.Context r3 = r9.f5870a     // Catch: java.lang.Throwable -> L1d
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = r9.f5872c     // Catch: java.lang.Throwable -> L1d
            android.content.res.AssetFileDescriptor r3 = r3.openFd(r4)     // Catch: java.lang.Throwable -> L1d
            long r4 = r3.getLength()     // Catch: java.lang.Throwable -> L2a
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L1f
            fe.c.a(r3, r0)     // Catch: java.lang.Throwable -> L1d
            return r4
        L1d:
            r3 = move-exception
            goto L31
        L1f:
            Td.L r4 = Td.L.f17438a     // Catch: java.lang.Throwable -> L2a
            fe.c.a(r3, r0)     // Catch: java.lang.Throwable -> L1d
            Td.L r3 = Td.L.f17438a     // Catch: java.lang.Throwable -> L1d
            Td.u.b(r3)     // Catch: java.lang.Throwable -> L1d
            goto L3a
        L2a:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L2c
        L2c:
            r5 = move-exception
            fe.c.a(r3, r4)     // Catch: java.lang.Throwable -> L1d
            throw r5     // Catch: java.lang.Throwable -> L1d
        L31:
            Td.u$a r4 = Td.u.f17466b
            java.lang.Object r3 = Td.v.a(r3)
            Td.u.b(r3)
        L3a:
            android.content.Context r3 = r9.f5870a     // Catch: java.lang.Throwable -> L5b
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r9.f5872c     // Catch: java.lang.Throwable -> L5b
            java.io.InputStream r3 = r3.open(r4)     // Catch: java.lang.Throwable -> L5b
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L5d
            r5 = r1
        L4b:
            int r7 = r3.read(r4)     // Catch: java.lang.Throwable -> L5d
            r8 = -1
            if (r7 == r8) goto L55
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L5d
            long r5 = r5 + r7
            goto L4b
        L55:
            Td.L r4 = Td.L.f17438a     // Catch: java.lang.Throwable -> L5d
            fe.c.a(r3, r0)     // Catch: java.lang.Throwable -> L5b
            return r5
        L5b:
            r0 = move-exception
            goto L64
        L5d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r4 = move-exception
            fe.c.a(r3, r0)     // Catch: java.lang.Throwable -> L5b
            throw r4     // Catch: java.lang.Throwable -> L5b
        L64:
            Td.u$a r3 = Td.u.f17466b
            java.lang.Object r0 = Td.v.a(r0)
            Td.u.b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Eb.a.length():long");
    }
}
