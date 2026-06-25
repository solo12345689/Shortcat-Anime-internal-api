package z2;

import java.nio.ByteBuffer;
import q2.AbstractC6076H;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC7276a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C6109x f65553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7278c f65554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f65555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f65556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f65558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f65559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f65560i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65562b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f65561a = i10;
            this.f65562b = i11;
        }
    }

    static {
        AbstractC6076H.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    public static f A() {
        return new f(0);
    }

    private ByteBuffer w(int i10) {
        int i11 = this.f65559h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f65555d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void B(int i10) {
        ByteBuffer byteBuffer = this.f65558g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f65558g = ByteBuffer.allocate(i10);
        } else {
            this.f65558g.clear();
        }
    }

    @Override // z2.AbstractC7276a
    public void m() {
        super.m();
        ByteBuffer byteBuffer = this.f65555d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f65558g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f65556e = false;
    }

    public void x(int i10) {
        int i11 = i10 + this.f65560i;
        ByteBuffer byteBuffer = this.f65555d;
        if (byteBuffer == null) {
            this.f65555d = w(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f65555d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferW = w(i12);
        byteBufferW.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferW.put(byteBuffer);
        }
        this.f65555d = byteBufferW;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.f65555d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f65558g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean z() {
        return n(1073741824);
    }

    public f(int i10, int i11) {
        this.f65554c = new C7278c();
        this.f65559h = i10;
        this.f65560i = i11;
    }
}
