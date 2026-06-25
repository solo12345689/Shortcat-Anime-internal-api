package dg;

import kotlin.jvm.internal.AbstractC5504s;
import tg.C6686k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class J {
    public abstract void a(I i10, int i11, String str);

    public void b(I webSocket, int i10, String reason) {
        AbstractC5504s.h(webSocket, "webSocket");
        AbstractC5504s.h(reason, "reason");
    }

    public abstract void c(I i10, Throwable th2, E e10);

    public abstract void d(I i10, String str);

    public void e(I webSocket, C6686k bytes) {
        AbstractC5504s.h(webSocket, "webSocket");
        AbstractC5504s.h(bytes, "bytes");
    }

    public abstract void f(I i10, E e10);
}
