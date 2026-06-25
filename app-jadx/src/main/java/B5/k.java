package B5;

import java.io.IOException;
import java.io.OutputStream;
import y5.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends OutputStream {
    public abstract h a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e10) {
            p.a(e10);
        }
    }

    public abstract int size();
}
