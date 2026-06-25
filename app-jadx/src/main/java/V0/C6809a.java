package v0;

import kotlin.jvm.internal.AbstractC5504s;
import s0.AbstractC6350e1;
import t.f0;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6809a {

    /* JADX INFO: renamed from: a */
    private C6811c f61783a;

    /* JADX INFO: renamed from: b */
    private C6811c f61784b;

    /* JADX INFO: renamed from: c */
    private t.Q f61785c;

    /* JADX INFO: renamed from: d */
    private t.Q f61786d;

    /* JADX INFO: renamed from: e */
    private boolean f61787e;

    public final boolean i(C6811c c6811c) {
        if (!this.f61787e) {
            AbstractC6350e1.a("Only add dependencies during a tracking");
        }
        t.Q q10 = this.f61785c;
        if (q10 != null) {
            AbstractC5504s.e(q10);
            q10.h(c6811c);
        } else if (this.f61783a != null) {
            t.Q qB = f0.b();
            C6811c c6811c2 = this.f61783a;
            AbstractC5504s.e(c6811c2);
            qB.h(c6811c2);
            qB.h(c6811c);
            this.f61785c = qB;
            this.f61783a = null;
        } else {
            this.f61783a = c6811c;
        }
        t.Q q11 = this.f61786d;
        if (q11 != null) {
            AbstractC5504s.e(q11);
            return !q11.y(c6811c);
        }
        if (this.f61784b != c6811c) {
            return true;
        }
        this.f61784b = null;
        return false;
    }
}
