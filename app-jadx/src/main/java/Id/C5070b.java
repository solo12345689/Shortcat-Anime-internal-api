package id;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: id.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5070b implements InterfaceC5075g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f48859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48860b;

    private C5070b(byte[] bArr, C5079k c5079k) {
        Objects.requireNonNull(bArr, "value must not be null");
        this.f48859a = bArr;
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48860b = c5079k;
    }

    public static C5070b e(byte[] bArr) {
        return new C5070b(bArr, C5079k.f48870b);
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48860b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(':');
        sb2.append(Base64.encodeToString(this.f48859a, 0));
        sb2.append(':');
        this.f48860b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer get() {
        return ByteBuffer.wrap(this.f48859a);
    }

    @Override // id.InterfaceC5075g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5070b b(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new C5070b(this.f48859a, c5079k);
    }
}
