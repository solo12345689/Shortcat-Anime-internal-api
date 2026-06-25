package d8;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: d8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4570a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f45078a;

    public C4570a(Reader reader) {
        super(reader);
        this.f45078a = null;
    }

    public ByteBuffer a() {
        if (this.f45078a == null) {
            int iAvailable = available();
            byte[] bArr = new byte[iAvailable];
            read(bArr, 0, iAvailable);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iAvailable);
            this.f45078a = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(bArr);
        }
        this.f45078a.flip();
        return this.f45078a;
    }
}
