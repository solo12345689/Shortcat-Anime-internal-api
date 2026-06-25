package W4;

import O4.b;
import W4.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: b */
    private final File f20708b;

    /* JADX INFO: renamed from: c */
    private final long f20709c;

    /* JADX INFO: renamed from: e */
    private O4.b f20711e;

    /* JADX INFO: renamed from: d */
    private final c f20710d = new c();

    /* JADX INFO: renamed from: a */
    private final j f20707a = new j();

    protected e(File file, long j10) {
        this.f20708b = file;
        this.f20709c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized O4.b d() {
        try {
            if (this.f20711e == null) {
                this.f20711e = O4.b.S(this.f20708b, 1, 1, this.f20709c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20711e;
    }

    private synchronized void e() {
        this.f20711e = null;
    }

    @Override // W4.a
    public File a(S4.f fVar) {
        String strB = this.f20707a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + fVar);
        }
        try {
            b.e eVarJ = d().J(strB);
            if (eVarJ != null) {
                return eVarJ.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // W4.a
    public void b(S4.f fVar, a.b bVar) {
        String strB = this.f20707a.b(fVar);
        this.f20710d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + fVar);
            }
            try {
                O4.b bVarD = d();
                if (bVarD.J(strB) == null) {
                    b.c cVarD = bVarD.D(strB);
                    if (cVarD == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarD.f(0))) {
                            cVarD.e();
                        }
                        cVarD.b();
                    } catch (Throwable th2) {
                        cVarD.b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f20710d.b(strB);
        }
    }

    @Override // W4.a
    public synchronized void clear() {
        try {
            try {
                d().z();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            e();
        }
    }
}
