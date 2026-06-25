package Vh;

import Yh.A;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class f implements bi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f20405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f20409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f20410g;

    public f(List list, char c10, boolean z10, boolean z11, f fVar) {
        this.f20404a = list;
        this.f20405b = c10;
        this.f20407d = z10;
        this.f20408e = z11;
        this.f20409f = fVar;
        this.f20406c = list.size();
    }

    @Override // bi.b
    public Iterable a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List list = this.f20404a;
            return list.subList(list.size() - i10, this.f20404a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // bi.b
    public A b() {
        return (A) this.f20404a.get(0);
    }

    @Override // bi.b
    public boolean c() {
        return this.f20408e;
    }

    @Override // bi.b
    public A d() {
        return (A) this.f20404a.get(r0.size() - 1);
    }

    @Override // bi.b
    public Iterable e(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f20404a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // bi.b
    public int f() {
        return this.f20406c;
    }

    @Override // bi.b
    public boolean g() {
        return this.f20407d;
    }

    @Override // bi.b
    public int length() {
        return this.f20404a.size();
    }
}
