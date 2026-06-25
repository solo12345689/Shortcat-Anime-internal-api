package K0;

import K0.J;
import K0.W;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f10514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1803p f10515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f10516c;

    public Q(J j10, C1803p c1803p, List list) {
        this.f10514a = j10;
        this.f10515b = c1803p;
        this.f10516c = list;
    }

    private final boolean b(J j10) {
        Object obj;
        J jA0 = j10.A0();
        Object obj2 = null;
        J.e eVarF0 = jA0 != null ? jA0.f0() : null;
        if (j10.p() || (j10.B0() != Integer.MAX_VALUE && jA0 != null && jA0.p())) {
            if (j10.m0()) {
                List list = this.f10516c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i10);
                    W.a aVar = (W.a) obj;
                    if (AbstractC5504s.c(aVar.a(), j10) && !aVar.c()) {
                        break;
                    }
                    i10++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (j10.z()) {
                return true;
            }
            if (j10.m0()) {
                return this.f10515b.e(j10) || j10.f0() == J.e.f10477b || (jA0 != null && jA0.m0()) || ((jA0 != null && jA0.h0()) || eVarF0 == J.e.f10476a);
            }
            if (j10.e0()) {
                if (!this.f10515b.e(j10) && jA0 != null && !jA0.m0() && !jA0.e0() && eVarF0 != J.e.f10476a && eVarF0 != J.e.f10478c) {
                    List list2 = this.f10516c;
                    int size2 = list2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            if (j10.f0() == J.e.f10476a) {
                                break;
                            }
                            return false;
                        }
                        if (AbstractC5504s.c(((W.a) list2.get(i11)).a(), j10)) {
                            break;
                        }
                        i11++;
                    }
                }
                return true;
            }
        }
        if (AbstractC5504s.c(j10.Y0(), Boolean.TRUE)) {
            if (j10.h0()) {
                List list3 = this.f10516c;
                int size3 = list3.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    Object obj3 = list3.get(i12);
                    W.a aVar2 = (W.a) obj3;
                    if (AbstractC5504s.c(aVar2.a(), j10) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                    i12++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (j10.h0()) {
                return this.f10515b.f(j10, true) || (jA0 != null && jA0.h0()) || eVarF0 == J.e.f10477b || (jA0 != null && jA0.m0() && AbstractC5504s.c(j10.j0(), j10));
            }
            if (j10.g0() && !this.f10515b.f(j10, true) && jA0 != null && !jA0.h0() && !jA0.g0() && eVarF0 != J.e.f10477b && eVarF0 != J.e.f10479d && (!jA0.e0() || !AbstractC5504s.c(j10.j0(), j10))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(J j10) {
        if (!b(j10)) {
            return false;
        }
        List listP = j10.P();
        int size = listP.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c((J) listP.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        AbstractC5504s.g(sb2, "append(...)");
        sb2.append('\n');
        AbstractC5504s.g(sb2, "append(...)");
        e(this, sb2, this.f10514a, 0);
        return sb2.toString();
    }

    private static final void e(Q q10, StringBuilder sb2, J j10, int i10) {
        String strF = q10.f(j10);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            AbstractC5504s.g(sb2, "append(...)");
            sb2.append('\n');
            AbstractC5504s.g(sb2, "append(...)");
            i10++;
        }
        List listP = j10.P();
        int size = listP.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(q10, sb2, (J) listP.get(i12), i10);
        }
    }

    private final String f(J j10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(j10.f0());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!j10.p()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + j10.o0() + ']');
        if (!b(j10)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (c(this.f10514a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
