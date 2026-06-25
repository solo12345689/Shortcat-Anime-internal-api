package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class Z extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f29919b = new StringBuilder(128);

    Z(String str) {
        this.f29918a = str;
    }

    private void a() {
        if (this.f29919b.length() > 0) {
            Log.d(this.f29918a, this.f29919b.toString());
            StringBuilder sb2 = this.f29919b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f29919b.append(c10);
            }
        }
    }
}
