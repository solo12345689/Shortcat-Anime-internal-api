package com.facebook.soloader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f38603a;

    public o(x xVar) {
        this.f38603a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i10) {
        S7.b.j(this.f38603a, "load", i10);
        try {
            this.f38603a.a(str, i10);
            S7.b.i(null);
        } finally {
        }
    }
}
