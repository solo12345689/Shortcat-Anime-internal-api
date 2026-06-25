package Bb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1635a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1637c;

    public final void a(byte[] data) {
        AbstractC5504s.h(data, "data");
        this.f1637c = true;
        this.f1635a.add(data);
    }

    public final ByteBuffer b(boolean z10) {
        Iterator it = this.f1635a.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        ByteBuffer byteBufferAllocateDirect = z10 ? ByteBuffer.allocateDirect(length) : ByteBuffer.allocate(length);
        Iterator it2 = this.f1635a.iterator();
        while (it2.hasNext()) {
            byteBufferAllocateDirect.put((byte[]) it2.next());
        }
        this.f1635a.clear();
        this.f1637c = true;
        this.f1636b = true;
        AbstractC5504s.e(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    public final boolean c() {
        return this.f1637c;
    }
}
