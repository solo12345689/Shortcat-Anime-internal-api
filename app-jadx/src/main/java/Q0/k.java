package Q0;

import Gf.P;
import I0.AbstractC1691q;
import Q0.c;
import R0.v;
import Td.L;
import Y.C0;
import Y.b2;
import a0.C2507c;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import i1.AbstractC5024q;
import i1.C5021n;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5487a;
import r0.C6226h;
import s0.s1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f14257a = b2.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends C5487a implements Function1 {
        a(Object obj) {
            super(1, obj, C2507c.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(l lVar) {
            ((C2507c) this.receiver).c(lVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14258a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(l lVar) {
            return Integer.valueOf(lVar.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14259a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(l lVar) {
            return Integer.valueOf(lVar.d().e());
        }
    }

    private final void e(boolean z10) {
        this.f14257a.setValue(Boolean.valueOf(z10));
    }

    @Override // Q0.c.a
    public void a() {
        e(true);
    }

    @Override // Q0.c.a
    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.f14257a.getValue()).booleanValue();
    }

    public final void d(View view, v vVar, Zd.i iVar, Consumer consumer) {
        C2507c c2507c = new C2507c(new l[16], 0);
        m.e(vVar.d(), 0, new a(c2507c), 2, null);
        c2507c.G(Xd.a.b(b.f14258a, c.f14259a));
        l lVar = (l) (c2507c.p() != 0 ? c2507c.f23496a[c2507c.p() - 1] : null);
        if (lVar == null) {
            return;
        }
        Q0.c cVar = new Q0.c(lVar.c(), lVar.d(), P.a(iVar), this, view);
        C6226h c6226hB = AbstractC1691q.b(lVar.a());
        long jI = lVar.d().i();
        ScrollCaptureTarget scrollCaptureTargetA = h.a(view, s1.a(AbstractC5024q.b(c6226hB)), new Point(C5021n.k(jI), C5021n.l(jI)), i.a(cVar));
        scrollCaptureTargetA.setScrollBounds(s1.a(lVar.d()));
        consumer.accept(scrollCaptureTargetA);
    }
}
