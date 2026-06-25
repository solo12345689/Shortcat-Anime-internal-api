package id;

import java.util.Objects;

/* JADX INFO: renamed from: id.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5074f implements InterfaceC5077i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48868b;

    private C5074f(long j10, C5079k c5079k) {
        if (j10 < -999999999999999L || j10 > 999999999999999L) {
            throw new IllegalArgumentException("value must be in the range from -999999999999999 to 999999999999999");
        }
        this.f48867a = j10;
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48868b = c5079k;
    }

    public static C5074f e(long j10) {
        return new C5074f(j10, C5079k.f48870b);
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48868b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(Long.toString(this.f48867a));
        this.f48868b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long get() {
        return Long.valueOf(this.f48867a);
    }

    @Override // id.InterfaceC5075g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5074f b(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new C5074f(this.f48867a, c5079k);
    }
}
