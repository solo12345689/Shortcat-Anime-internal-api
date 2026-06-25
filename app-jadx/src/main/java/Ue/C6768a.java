package ue;

import He.H;
import He.I;
import Qe.x;
import Ud.AbstractC2279u;
import Xe.b;
import Xe.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.J;
import ye.h0;

/* JADX INFO: renamed from: ue.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6768a {

    /* JADX INFO: renamed from: a */
    public static final C6768a f61506a = new C6768a();

    /* JADX INFO: renamed from: b */
    private static final Set f61507b;

    /* JADX INFO: renamed from: c */
    private static final b f61508c;

    static {
        List listP = AbstractC2279u.p(I.f8444a, I.f8455l, I.f8456m, I.f8447d, I.f8449f, I.f8452i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f21759d;
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f61507b = linkedHashSet;
        b.a aVar2 = b.f21759d;
        c REPEATABLE_ANNOTATION = I.f8453j;
        AbstractC5504s.g(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f61508c = aVar2.c(REPEATABLE_ANNOTATION);
    }

    private C6768a() {
    }

    public final b a() {
        return f61508c;
    }

    public final Set b() {
        return f61507b;
    }

    public final boolean c(x klass) {
        AbstractC5504s.h(klass, "klass");
        J j10 = new J();
        klass.b(new C0921a(j10), null);
        return j10.f52255a;
    }

    /* JADX INFO: renamed from: ue.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0921a implements x.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ J f61509a;

        C0921a(J j10) {
            this.f61509a = j10;
        }

        @Override // Qe.x.c
        public x.a b(b classId, h0 source) {
            AbstractC5504s.h(classId, "classId");
            AbstractC5504s.h(source, "source");
            if (!AbstractC5504s.c(classId, H.f8439a.a())) {
                return null;
            }
            this.f61509a.f52255a = true;
            return null;
        }

        @Override // Qe.x.c
        public void a() {
        }
    }
}
