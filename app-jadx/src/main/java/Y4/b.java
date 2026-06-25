package Y4;

import Y4.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0387b f22755a;

    /* JADX INFO: renamed from: Y4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0387b {
        Class a();

        Object b(byte[] bArr);
    }

    public b(InterfaceC0387b interfaceC0387b) {
        this.f22755a = interfaceC0387b;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(byte[] bArr, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(bArr), new c(bArr, this.f22755a));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {

        /* JADX INFO: renamed from: Y4.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0386a implements InterfaceC0387b {
            C0386a() {
            }

            @Override // Y4.b.InterfaceC0387b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // Y4.b.InterfaceC0387b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new b(new C0386a());
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f22757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0387b f22758b;

        c(byte[] bArr, InterfaceC0387b interfaceC0387b) {
            this.f22757a = bArr;
            this.f22758b = interfaceC0387b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f22758b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return S4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.f(this.f22758b.b(this.f22757a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d implements o {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements InterfaceC0387b {
            a() {
            }

            @Override // Y4.b.InterfaceC0387b
            public Class a() {
                return InputStream.class;
            }

            @Override // Y4.b.InterfaceC0387b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new b(new a());
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}
