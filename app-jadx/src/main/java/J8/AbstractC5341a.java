package j8;

import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: j8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5341a implements InterfaceC5342b {
    @Override // j8.InterfaceC5342b
    public Reader a() {
        return new com.github.penfeizhou.animation.io.a(b());
    }

    public abstract ByteBuffer b();
}
