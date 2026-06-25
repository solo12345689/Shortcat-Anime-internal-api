package fe;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class e extends ByteArrayOutputStream {
    public e(int i10) {
        super(i10);
    }

    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        AbstractC5504s.g(buf, "buf");
        return buf;
    }
}
