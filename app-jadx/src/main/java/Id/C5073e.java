package id;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: id.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5073e implements InterfaceC5076h, InterfaceC5080l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48866b;

    private C5073e(List list, C5079k c5079k) {
        Objects.requireNonNull(list, "value must not be null");
        this.f48865a = list;
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48866b = c5079k;
    }

    public static C5073e e(List list) {
        return new C5073e(list, C5079k.f48870b);
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48866b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append('(');
        String str = "";
        for (InterfaceC5075g interfaceC5075g : this.f48865a) {
            sb2.append(str);
            interfaceC5075g.c(sb2);
            str = " ";
        }
        sb2.append(')');
        this.f48866b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get() {
        return this.f48865a;
    }

    public C5073e f(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new C5073e(this.f48865a, c5079k);
    }
}
