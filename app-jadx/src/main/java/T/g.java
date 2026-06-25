package T;

import Ud.AbstractC2279u;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f16725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f16726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16727e;

    public g(Context context) {
        super(context);
        this.f16723a = 5;
        ArrayList arrayList = new ArrayList();
        this.f16724b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f16725c = arrayList2;
        this.f16726d = new i();
        setClipChildren(false);
        k kVar = new k(context);
        addView(kVar);
        arrayList.add(kVar);
        arrayList2.add(kVar);
        this.f16727e = 1;
        setTag(l0.l.f52357J, Boolean.TRUE);
    }

    public final void a(h hVar) {
        hVar.b1();
        k kVarB = this.f16726d.b(hVar);
        if (kVarB != null) {
            kVarB.d();
            this.f16726d.c(hVar);
            this.f16725c.add(kVarB);
        }
    }

    public final k b(h hVar) {
        k kVarB = this.f16726d.b(hVar);
        if (kVarB != null) {
            return kVarB;
        }
        k kVar = (k) AbstractC2279u.L(this.f16725c);
        if (kVar == null) {
            if (this.f16727e > AbstractC2279u.o(this.f16724b)) {
                kVar = new k(getContext());
                addView(kVar);
                this.f16724b.add(kVar);
            } else {
                kVar = (k) this.f16724b.get(this.f16727e);
                h hVarA = this.f16726d.a(kVar);
                if (hVarA != null) {
                    hVarA.b1();
                    this.f16726d.c(hVarA);
                    kVar.d();
                }
            }
            int i10 = this.f16727e;
            if (i10 < this.f16723a - 1) {
                this.f16727e = i10 + 1;
            } else {
                this.f16727e = 0;
            }
        }
        this.f16726d.d(hVar, kVar);
        return kVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
