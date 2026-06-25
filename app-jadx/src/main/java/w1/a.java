package W1;

import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Gf.X0;
import Ud.AbstractC2279u;
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import le.InterfaceC5592c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: W1.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0361a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C0361a f20613a = new C0361a();

        C0361a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final List invoke(Context it) {
            AbstractC5504s.h(it, "it");
            return AbstractC2279u.m();
        }
    }

    public static final InterfaceC5592c a(String name, U1.b bVar, Function1 produceMigrations, O scope) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(produceMigrations, "produceMigrations");
        AbstractC5504s.h(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC5592c b(String str, U1.b bVar, Function1 function1, O o10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0361a.f20613a;
        }
        if ((i10 & 8) != 0) {
            o10 = P.a(C1608f0.b().w(X0.b(null, 1, null)));
        }
        return a(str, bVar, function1, o10);
    }
}
