package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2946k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class w extends AbstractC2946k {

    /* JADX INFO: renamed from: q0 */
    int f32485q0;

    /* JADX INFO: renamed from: o0 */
    ArrayList f32483o0 = new ArrayList();

    /* JADX INFO: renamed from: p0 */
    private boolean f32484p0 = true;

    /* JADX INFO: renamed from: r0 */
    boolean f32486r0 = false;

    /* JADX INFO: renamed from: s0 */
    private int f32487s0 = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends s {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2946k f32488a;

        a(AbstractC2946k abstractC2946k) {
            this.f32488a = abstractC2946k;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            this.f32488a.j0();
            abstractC2946k.f0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends s {
        b() {
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
            w.this.f32483o0.remove(abstractC2946k);
            if (w.this.Q()) {
                return;
            }
            w.this.b0(AbstractC2946k.j.f32472c, false);
            w wVar = w.this;
            wVar.f32415B = true;
            wVar.b0(AbstractC2946k.j.f32471b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends s {

        /* JADX INFO: renamed from: a */
        w f32491a;

        c(w wVar) {
            this.f32491a = wVar;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
            w wVar = this.f32491a;
            if (wVar.f32486r0) {
                return;
            }
            wVar.r0();
            this.f32491a.f32486r0 = true;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            w wVar = this.f32491a;
            int i10 = wVar.f32485q0 - 1;
            wVar.f32485q0 = i10;
            if (i10 == 0) {
                wVar.f32486r0 = false;
                wVar.u();
            }
            abstractC2946k.f0(this);
        }
    }

    private void H0() {
        c cVar = new c(this);
        Iterator it = this.f32483o0.iterator();
        while (it.hasNext()) {
            ((AbstractC2946k) it.next()).d(cVar);
        }
        this.f32485q0 = this.f32483o0.size();
    }

    private void w0(AbstractC2946k abstractC2946k) {
        this.f32483o0.add(abstractC2946k);
        abstractC2946k.f32442r = this;
    }

    private int z0(long j10) {
        for (int i10 = 1; i10 < this.f32483o0.size(); i10++) {
            if (((AbstractC2946k) this.f32483o0.get(i10)).f32424Y > j10) {
                return i10 - 1;
            }
        }
        return this.f32483o0.size() - 1;
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: A0 */
    public w f0(AbstractC2946k.i iVar) {
        return (w) super.f0(iVar);
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: C0 */
    public w g0(View view) {
        for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).g0(view);
        }
        return (w) super.g0(view);
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: D0 */
    public w l0(long j10) {
        ArrayList arrayList;
        super.l0(j10);
        if (this.f32427c >= 0 && (arrayList = this.f32483o0) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC2946k) this.f32483o0.get(i10)).l0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: E0 */
    public w n0(TimeInterpolator timeInterpolator) {
        this.f32487s0 |= 1;
        ArrayList arrayList = this.f32483o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC2946k) this.f32483o0.get(i10)).n0(timeInterpolator);
            }
        }
        return (w) super.n0(timeInterpolator);
    }

    public w F0(int i10) {
        if (i10 == 0) {
            this.f32484p0 = true;
            return this;
        }
        if (i10 == 1) {
            this.f32484p0 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: G0 */
    public w q0(long j10) {
        return (w) super.q0(j10);
    }

    @Override // androidx.transition.AbstractC2946k
    boolean Q() {
        for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
            if (((AbstractC2946k) this.f32483o0.get(i10)).Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.AbstractC2946k
    public boolean R() {
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((AbstractC2946k) this.f32483o0.get(i10)).R()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.AbstractC2946k
    public void c0(View view) {
        super.c0(view);
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).c0(view);
        }
    }

    @Override // androidx.transition.AbstractC2946k
    protected void cancel() {
        super.cancel();
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.AbstractC2946k
    void e0() {
        this.f32422I = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
            AbstractC2946k abstractC2946k = (AbstractC2946k) this.f32483o0.get(i10);
            abstractC2946k.d(bVar);
            abstractC2946k.e0();
            long jN = abstractC2946k.N();
            if (this.f32484p0) {
                this.f32422I = Math.max(this.f32422I, jN);
            } else {
                long j10 = this.f32422I;
                abstractC2946k.f32424Y = j10;
                this.f32422I = j10 + jN;
            }
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public void h0(View view) {
        super.h0(view);
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).h0(view);
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public void i(y yVar) {
        if (T(yVar.f32494b)) {
            for (AbstractC2946k abstractC2946k : this.f32483o0) {
                if (abstractC2946k.T(yVar.f32494b)) {
                    abstractC2946k.i(yVar);
                    yVar.f32495c.add(abstractC2946k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2946k
    protected void j0() {
        if (this.f32483o0.isEmpty()) {
            r0();
            u();
            return;
        }
        H0();
        if (this.f32484p0) {
            Iterator it = this.f32483o0.iterator();
            while (it.hasNext()) {
                ((AbstractC2946k) it.next()).j0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f32483o0.size(); i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10 - 1)).d(new a((AbstractC2946k) this.f32483o0.get(i10)));
        }
        AbstractC2946k abstractC2946k = (AbstractC2946k) this.f32483o0.get(0);
        if (abstractC2946k != null) {
            abstractC2946k.j0();
        }
    }

    @Override // androidx.transition.AbstractC2946k
    void k(y yVar) {
        super.k(yVar);
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).k(yVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.AbstractC2946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void k0(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.N()
            androidx.transition.w r7 = r0.f32442r
            r8 = 0
            if (r7 == 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc2
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            goto Lc2
        L22:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L2a
            r12 = r11
            goto L2b
        L2a:
            r12 = r10
        L2b:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L33
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L3b
        L33:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L42
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L42
        L3b:
            r0.f32415B = r10
            androidx.transition.k$j r14 = androidx.transition.AbstractC2946k.j.f32470a
            r0.b0(r14, r12)
        L42:
            boolean r14 = r0.f32484p0
            if (r14 == 0) goto L5f
        L46:
            java.util.ArrayList r7 = r0.f32483o0
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList r7 = r0.f32483o0
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.k r7 = (androidx.transition.AbstractC2946k) r7
            r7.k0(r1, r3)
            int r10 = r10 + 1
            goto L46
        L5c:
            r16 = r8
            goto La7
        L5f:
            int r10 = r0.z0(r3)
            if (r7 < 0) goto L8a
        L65:
            java.util.ArrayList r7 = r0.f32483o0
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList r7 = r0.f32483o0
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.k r7 = (androidx.transition.AbstractC2946k) r7
            long r14 = r7.f32424Y
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L80
            goto La7
        L80:
            long r14 = r3 - r14
            r7.k0(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L65
        L8a:
            r16 = r8
        L8c:
            if (r10 < 0) goto La7
            java.util.ArrayList r7 = r0.f32483o0
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.k r7 = (androidx.transition.AbstractC2946k) r7
            long r8 = r7.f32424Y
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.k0(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto La4
            goto La7
        La4:
            int r10 = r10 + (-1)
            goto L8c
        La7:
            androidx.transition.w r7 = r0.f32442r
            if (r7 == 0) goto Lc2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb3
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb9
        Lb3:
            if (r13 >= 0) goto Lc2
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lc2
        Lb9:
            if (r1 <= 0) goto Lbd
            r0.f32415B = r11
        Lbd:
            androidx.transition.k$j r1 = androidx.transition.AbstractC2946k.j.f32471b
            r0.b0(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.w.k0(long, long):void");
    }

    @Override // androidx.transition.AbstractC2946k
    public void m(y yVar) {
        if (T(yVar.f32494b)) {
            for (AbstractC2946k abstractC2946k : this.f32483o0) {
                if (abstractC2946k.T(yVar.f32494b)) {
                    abstractC2946k.m(yVar);
                    yVar.f32495c.add(abstractC2946k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public void m0(AbstractC2946k.f fVar) {
        super.m0(fVar);
        this.f32487s0 |= 8;
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).m0(fVar);
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public void o0(AbstractC2942g abstractC2942g) {
        super.o0(abstractC2942g);
        this.f32487s0 |= 4;
        if (this.f32483o0 != null) {
            for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
                ((AbstractC2946k) this.f32483o0.get(i10)).o0(abstractC2942g);
            }
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public void p0(u uVar) {
        super.p0(uVar);
        this.f32487s0 |= 2;
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).p0(uVar);
        }
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: q */
    public AbstractC2946k clone() {
        w wVar = (w) super.clone();
        wVar.f32483o0 = new ArrayList();
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            wVar.w0(((AbstractC2946k) this.f32483o0.get(i10)).clone());
        }
        return wVar;
    }

    @Override // androidx.transition.AbstractC2946k
    void s(ViewGroup viewGroup, z zVar, z zVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jI = I();
        int size = this.f32483o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2946k abstractC2946k = (AbstractC2946k) this.f32483o0.get(i10);
            if (jI > 0 && (this.f32484p0 || i10 == 0)) {
                long jI2 = abstractC2946k.I();
                if (jI2 > 0) {
                    abstractC2946k.q0(jI2 + jI);
                } else {
                    abstractC2946k.q0(jI);
                }
            }
            abstractC2946k.s(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC2946k
    String s0(String str) {
        String strS0 = super.s0(str);
        for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strS0);
            sb2.append("\n");
            sb2.append(((AbstractC2946k) this.f32483o0.get(i10)).s0(str + "  "));
            strS0 = sb2.toString();
        }
        return strS0;
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: t0 */
    public w d(AbstractC2946k.i iVar) {
        return (w) super.d(iVar);
    }

    @Override // androidx.transition.AbstractC2946k
    /* JADX INFO: renamed from: u0 */
    public w e(View view) {
        for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).e(view);
        }
        return (w) super.e(view);
    }

    @Override // androidx.transition.AbstractC2946k
    public AbstractC2946k v(Class cls, boolean z10) {
        for (int i10 = 0; i10 < this.f32483o0.size(); i10++) {
            ((AbstractC2946k) this.f32483o0.get(i10)).v(cls, z10);
        }
        return super.v(cls, z10);
    }

    public w v0(AbstractC2946k abstractC2946k) {
        w0(abstractC2946k);
        long j10 = this.f32427c;
        if (j10 >= 0) {
            abstractC2946k.l0(j10);
        }
        if ((this.f32487s0 & 1) != 0) {
            abstractC2946k.n0(B());
        }
        if ((this.f32487s0 & 2) != 0) {
            F();
            abstractC2946k.p0(null);
        }
        if ((this.f32487s0 & 4) != 0) {
            abstractC2946k.o0(E());
        }
        if ((this.f32487s0 & 8) != 0) {
            abstractC2946k.m0(A());
        }
        return this;
    }

    public AbstractC2946k x0(int i10) {
        if (i10 < 0 || i10 >= this.f32483o0.size()) {
            return null;
        }
        return (AbstractC2946k) this.f32483o0.get(i10);
    }

    public int y0() {
        return this.f32483o0.size();
    }
}
