package h8;

import com.github.penfeizhou.animation.io.e;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: h8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4923a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IntBuffer f47779a;

    public C4923a() {
        c(10240);
    }

    public IntBuffer a() {
        return this.f47779a;
    }

    public int[] b() {
        return this.f47779a.array();
    }

    public void c(int i10) {
        IntBuffer intBuffer = this.f47779a;
        if (intBuffer == null || i10 > intBuffer.capacity()) {
            this.f47779a = IntBuffer.allocate(i10);
        }
        this.f47779a.clear();
        this.f47779a.limit(i10);
        this.f47779a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }
}
