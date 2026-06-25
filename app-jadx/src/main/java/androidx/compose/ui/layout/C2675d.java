package androidx.compose.ui.layout;

import Ud.AbstractC2273n;
import androidx.compose.ui.layout.C2674c;
import androidx.compose.ui.layout.E;

/* JADX INFO: renamed from: androidx.compose.ui.layout.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2675d implements u {

    /* JADX INFO: renamed from: b */
    private final u[] f26920b;

    /* JADX INFO: renamed from: c */
    private final E f26921c;

    /* JADX INFO: renamed from: d */
    private final C2674c f26922d;

    /* JADX INFO: renamed from: e */
    private final E f26923e;

    /* JADX INFO: renamed from: f */
    private final C2674c f26924f;

    public C2675d(u[] uVarArr) {
        this.f26920b = uVarArr;
        E.a aVar = E.f26881b;
        int length = uVarArr.length;
        E[] eArr = new E[length];
        for (int i10 = 0; i10 < length; i10++) {
            eArr[i10] = this.f26920b[i10].a();
        }
        this.f26921c = aVar.b(eArr);
        C2674c.a aVar2 = C2674c.f26917b;
        int length2 = this.f26920b.length;
        C2674c[] c2674cArr = new C2674c[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            c2674cArr[i11] = this.f26920b[i11].b();
        }
        this.f26922d = aVar2.a(c2674cArr);
        E.a aVar3 = E.f26881b;
        int length3 = this.f26920b.length;
        E[] eArr2 = new E[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            eArr2[i12] = this.f26920b[i12].c();
        }
        this.f26923e = aVar3.c(eArr2);
        C2674c.a aVar4 = C2674c.f26917b;
        int length4 = this.f26920b.length;
        C2674c[] c2674cArr2 = new C2674c[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            c2674cArr2[i13] = this.f26920b[i13].d();
        }
        this.f26924f = aVar4.b(c2674cArr2);
    }

    @Override // androidx.compose.ui.layout.u
    public E a() {
        return this.f26921c;
    }

    @Override // androidx.compose.ui.layout.u
    public C2674c b() {
        return this.f26922d;
    }

    @Override // androidx.compose.ui.layout.u
    public E c() {
        return this.f26923e;
    }

    @Override // androidx.compose.ui.layout.u
    public C2674c d() {
        return this.f26924f;
    }

    public String toString() {
        return AbstractC2273n.y0(this.f26920b, null, "innermostOf(", ")", 0, null, null, 57, null);
    }
}
