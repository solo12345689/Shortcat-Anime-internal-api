package id;

import java.util.Objects;

/* JADX INFO: renamed from: id.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5069a implements InterfaceC5075g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C5069a f48855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C5069a f48856d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48858b;

    static {
        C5079k c5079k = C5079k.f48870b;
        f48855c = new C5069a(true, c5079k);
        f48856d = new C5069a(false, c5079k);
    }

    private C5069a(boolean z10, C5079k c5079k) {
        this.f48857a = z10;
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48858b = c5079k;
    }

    public static C5069a e(boolean z10) {
        return z10 ? f48855c : f48856d;
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48858b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(this.f48857a ? "?1" : "?0");
        this.f48858b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(this.f48857a);
    }

    @Override // id.InterfaceC5075g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5069a b(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new C5069a(this.f48857a, c5079k);
    }
}
