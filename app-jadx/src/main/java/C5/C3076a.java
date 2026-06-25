package c5;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3076a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f33513a;

    /* JADX INFO: renamed from: c5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0568a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ByteBuffer byteBuffer) {
            return new C3076a(byteBuffer);
        }
    }

    public C3076a(ByteBuffer byteBuffer) {
        this.f33513a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f33513a.position(0);
        return this.f33513a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
