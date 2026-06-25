package androidx.compose.ui.layout;

import Ud.AbstractC2273n;
import androidx.compose.ui.layout.u;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.ui.layout.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2676e implements F {

    /* JADX INFO: renamed from: b */
    private final String f26925b;

    /* JADX INFO: renamed from: c */
    private final F[] f26926c;

    /* JADX INFO: renamed from: d */
    private final u f26927d;

    /* JADX INFO: renamed from: e */
    private final u f26928e;

    public C2676e(String str, F[] fArr) {
        this.f26925b = str;
        this.f26926c = fArr;
        u.a aVar = u.f27012a;
        ArrayList arrayList = new ArrayList(fArr.length);
        for (F f10 : fArr) {
            arrayList.add(f10.a());
        }
        u[] uVarArr = (u[]) arrayList.toArray(new u[0]);
        this.f26927d = w.b(aVar, (u[]) Arrays.copyOf(uVarArr, uVarArr.length));
        u.a aVar2 = u.f27012a;
        F[] fArr2 = this.f26926c;
        ArrayList arrayList2 = new ArrayList(fArr2.length);
        for (F f11 : fArr2) {
            arrayList2.add(f11.b());
        }
        u[] uVarArr2 = (u[]) arrayList2.toArray(new u[0]);
        this.f26928e = w.b(aVar2, (u[]) Arrays.copyOf(uVarArr2, uVarArr2.length));
    }

    @Override // androidx.compose.ui.layout.F
    public u a() {
        return this.f26927d;
    }

    @Override // androidx.compose.ui.layout.F
    public u b() {
        return this.f26928e;
    }

    public String toString() {
        String str = this.f26925b;
        return str == null ? AbstractC2273n.y0(this.f26926c, null, "innermostOf(", ")", 0, null, null, 57, null) : str;
    }
}
