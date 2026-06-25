package B5;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements K1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1565a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f1566b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f1567c = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f1566b);
        }
    }

    public static int e() {
        return f1566b;
    }

    @Override // K1.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b() {
        return (ByteBuffer) f1567c.get();
    }

    @Override // K1.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
