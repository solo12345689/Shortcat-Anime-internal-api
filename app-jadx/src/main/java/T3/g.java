package T3;

import S3.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f17147a;

    public g(SQLiteProgram delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f17147a = delegate;
    }

    @Override // S3.i
    public void I1(int i10) {
        this.f17147a.bindNull(i10);
    }

    @Override // S3.i
    public void Z0(int i10, String value) {
        AbstractC5504s.h(value, "value");
        this.f17147a.bindString(i10, value);
    }

    @Override // S3.i
    public void b0(int i10, double d10) {
        this.f17147a.bindDouble(i10, d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17147a.close();
    }

    @Override // S3.i
    public void m1(int i10, long j10) {
        this.f17147a.bindLong(i10, j10);
    }

    @Override // S3.i
    public void p1(int i10, byte[] value) {
        AbstractC5504s.h(value, "value");
        this.f17147a.bindBlob(i10, value);
    }
}
