package f3;

import java.nio.ByteBuffer;
import java.util.Arrays;
import q2.C6078J;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: f3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4769b extends d3.c {
    @Override // d3.c
    protected C6078J b(d3.b bVar, ByteBuffer byteBuffer) {
        return new C6078J(c(new C6609I(byteBuffer.array(), byteBuffer.limit())));
    }

    public C4768a c(C6609I c6609i) {
        return new C4768a((String) AbstractC6614a.e(c6609i.G()), (String) AbstractC6614a.e(c6609i.G()), c6609i.F(), c6609i.F(), Arrays.copyOfRange(c6609i.f(), c6609i.g(), c6609i.j()));
    }
}
