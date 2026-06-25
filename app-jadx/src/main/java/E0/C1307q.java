package E0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: E0.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1307q {

    /* JADX INFO: renamed from: a */
    private final List f4172a;

    /* JADX INFO: renamed from: b */
    private final C1297g f4173b;

    /* JADX INFO: renamed from: c */
    private final int f4174c;

    /* JADX INFO: renamed from: d */
    private final int f4175d;

    /* JADX INFO: renamed from: e */
    private final int f4176e;

    /* JADX INFO: renamed from: f */
    private int f4177f;

    public C1307q(List list, C1297g c1297g) {
        MotionEvent motionEventE;
        this.f4172a = list;
        this.f4173b = c1297g;
        this.f4174c = (Build.VERSION.SDK_INT < 29 || (motionEventE = e()) == null) ? 0 : motionEventE.getClassification();
        MotionEvent motionEventE2 = e();
        this.f4175d = AbstractC1305o.a(motionEventE2 != null ? motionEventE2.getButtonState() : 0);
        MotionEvent motionEventE3 = e();
        this.f4176e = P.b(motionEventE3 != null ? motionEventE3.getMetaState() : 0);
        this.f4177f = a();
    }

    private final int a() {
        MotionEvent motionEventE = e();
        if (motionEventE == null) {
            List list = this.f4172a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C c10 = (C) list.get(i10);
                if (r.d(c10)) {
                    return AbstractC1310u.f4183a.e();
                }
                if (r.b(c10)) {
                    return AbstractC1310u.f4183a.d();
                }
            }
            return AbstractC1310u.f4183a.c();
        }
        int actionMasked = motionEventE.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return AbstractC1310u.f4183a.f();
                        case 9:
                            return AbstractC1310u.f4183a.a();
                        case 10:
                            return AbstractC1310u.f4183a.b();
                        default:
                            return AbstractC1310u.f4183a.g();
                    }
                }
                return AbstractC1310u.f4183a.c();
            }
            return AbstractC1310u.f4183a.e();
        }
        return AbstractC1310u.f4183a.d();
    }

    public final int b() {
        return this.f4175d;
    }

    public final List c() {
        return this.f4172a;
    }

    public final C1297g d() {
        return this.f4173b;
    }

    public final MotionEvent e() {
        C1297g c1297g = this.f4173b;
        if (c1297g != null) {
            return c1297g.c();
        }
        return null;
    }

    public final int f() {
        return this.f4177f;
    }

    public final void g(int i10) {
        this.f4177f = i10;
    }

    public C1307q(List list) {
        this(list, null);
    }
}
