package r3;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends z2.h implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f58501o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends p {
        a() {
        }

        @Override // z2.g
        public void w() {
            i.this.u(this);
        }
    }

    protected i(String str) {
        super(new o[2], new p[2]);
        this.f58501o = str;
        x(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final p k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final l l(Throwable th2) {
        return new l("Unexpected decode error", th2);
    }

    protected abstract j C(byte[] bArr, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final l m(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(oVar.f65555d);
            pVar.x(oVar.f65557f, C(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f58517j);
            pVar.f65565d = false;
            return null;
        } catch (l e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final o j() {
        return new o();
    }

    @Override // r3.k
    public void c(long j10) {
    }
}
