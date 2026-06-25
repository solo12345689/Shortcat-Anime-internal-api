package d3;

import java.nio.ByteBuffer;
import q2.C6078J;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements InterfaceC4565a {
    @Override // d3.InterfaceC4565a
    public final C6078J a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(bVar.f65555d);
        AbstractC6614a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract C6078J b(b bVar, ByteBuffer byteBuffer);
}
