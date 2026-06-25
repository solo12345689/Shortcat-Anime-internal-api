package Vh;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class m implements Zh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f20447b;

    public m(List list, p pVar) {
        this.f20446a = list;
        this.f20447b = pVar;
    }

    @Override // Zh.c
    public Yh.p a(String str) {
        return this.f20447b.b(str);
    }

    @Override // Zh.c
    public List b() {
        return this.f20446a;
    }
}
