package E6;

import java.io.Closeable;
import k6.InterfaceC5452a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface e extends Closeable, m, C5.d, InterfaceC5452a {
    int A();

    m B1();

    boolean W1();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    boolean isClosed();

    p x1();
}
