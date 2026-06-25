package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G extends C3331f implements InterfaceC3327b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f38541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f38542e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f38545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f38546c;

        b(boolean z10, File file, n nVar) {
            this.f38544a = z10;
            this.f38545b = file;
            this.f38546c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f38544a) {
                        SysUtil.f(G.this.f38578a);
                    }
                    G.u(this.f38545b, (byte) 1, this.f38544a);
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f38578a + " (from syncer thread)");
                    this.f38546c.close();
                } catch (Throwable th2) {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f38578a + " (from syncer thread)");
                    this.f38546c.close();
                    throw th2;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f38549b;

        public c(String str, String str2) {
            this.f38548a = str;
            this.f38549b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f38550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InputStream f38551b;

        public d(c cVar, InputStream inputStream) {
            this.f38550a = cVar;
            this.f38551b = inputStream;
        }

        public int available() {
            return this.f38551b.available();
        }

        public c b() {
            return this.f38550a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f38551b.close();
        }
    }

    protected G(Context context, String str, boolean z10) {
        super(p(context, str), z10 ? 1 : 0);
        this.f38541d = context;
    }

    private void j() throws IOException {
        File[] fileArrListFiles = this.f38578a.listFiles(new a());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f38578a);
        }
        for (File file : fileArrListFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean m(int i10) {
        return (i10 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean r(com.facebook.soloader.n r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.G.r(com.facebook.soloader.n, int):boolean");
    }

    private static boolean s(int i10) {
        return (i10 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(File file, byte b10, boolean z10) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z10) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e10) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.InterfaceC3327b
    public void a() throws Throwable {
        try {
            n nVarI = SysUtil.i(this.f38578a, new File(this.f38578a, "dso_lock"));
            if (nVarI != null) {
                nVarI.close();
            }
        } catch (Exception e10) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f38578a + "): ", e10);
        }
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) throws IOException {
        n nVarI;
        SysUtil.m(this.f38578a);
        if (!this.f38578a.canWrite() && !this.f38578a.setWritable(true)) {
            throw new IOException("error adding " + this.f38578a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                nVarI = SysUtil.i(this.f38578a, new File(this.f38578a, "dso_lock"));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                p.f("fb-UnpackingSoSource", "locked dso store " + this.f38578a);
                if (!this.f38578a.canWrite() && !this.f38578a.setWritable(true)) {
                    throw new IOException("error adding " + this.f38578a.getCanonicalPath() + " write permission");
                }
                if (!r(nVarI, i10)) {
                    p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f38578a);
                    nVar = nVarI;
                }
                if (nVar != null) {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f38578a);
                    nVar.close();
                } else {
                    p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f38578a + " (syncer thread started)");
                }
                if (!this.f38578a.canWrite() || this.f38578a.setWritable(false)) {
                    return;
                }
                throw new IOException("error removing " + this.f38578a.getCanonicalPath() + " write permission");
            } catch (Throwable th3) {
                th = th3;
                nVar = nVarI;
                if (nVar != null) {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f38578a);
                    nVar.close();
                } else {
                    p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f38578a + " (syncer thread started)");
                }
                throw th;
            }
        } catch (Throwable th4) {
            if (!this.f38578a.canWrite() || this.f38578a.setWritable(false)) {
                throw th4;
            }
            throw new IOException("error removing " + this.f38578a.getCanonicalPath() + " write permission");
        }
    }

    protected boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f38578a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean zL = l(bArr2, bArr);
                        randomAccessFile.close();
                        return zL;
                    }
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } finally {
            }
        } catch (IOException e10) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e10);
            return true;
        }
    }

    protected boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarQ = q();
        try {
            c[] cVarArrB = eVarQ.b();
            parcelObtain.writeInt(cVarArrB.length);
            for (c cVar : cVarArrB) {
                parcelObtain.writeString(cVar.f38548a);
                parcelObtain.writeString(cVar.f38549b);
            }
            eVarQ.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public c[] o() {
        e eVarQ = q();
        try {
            c[] cVarArrB = eVarQ.b();
            eVarQ.close();
            return cVarArrB;
        } catch (Throwable th2) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected abstract e q();

    public void t(String[] strArr) {
        this.f38542e = strArr;
    }

    protected G(Context context, String str) {
        this(context, str, true);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void a(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.b().f38548a);
            File file2 = new File(file, dVar.b().f38548a);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = dVar.available();
                        if (iAvailable > 1) {
                            SysUtil.d(randomAccessFile.getFD(), iAvailable);
                        }
                        SysUtil.a(randomAccessFile, dVar.f38551b, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (file2.setExecutable(true, false)) {
                            randomAccessFile.close();
                        } else {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                    } finally {
                    }
                } catch (IOException e10) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e10);
                    SysUtil.c(file2);
                    throw e10;
                }
            } finally {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
            }
        }

        public abstract c[] b();

        public abstract void g(File file);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
