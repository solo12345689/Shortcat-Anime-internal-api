package id;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: id.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5078j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48869a;

    private C5078j(List list) {
        Objects.requireNonNull(list, "value must not be null");
        this.f48869a = list;
    }

    public static C5078j f(List list) {
        return new C5078j(list);
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        String str = "";
        for (InterfaceC5076h interfaceC5076h : this.f48869a) {
            sb2.append(str);
            interfaceC5076h.c(sb2);
            str = ", ";
        }
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get() {
        return this.f48869a;
    }

    public String e() {
        return c(new StringBuilder()).toString();
    }
}
