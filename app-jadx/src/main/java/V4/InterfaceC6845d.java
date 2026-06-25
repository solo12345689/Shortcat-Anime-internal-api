package v4;

import E4.c;
import G4.h;
import L4.i;
import L4.o;
import L4.s;
import Td.AbstractC2163n;
import android.content.Context;
import dg.C4618A;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5506u;
import v4.InterfaceC6843b;
import y4.InterfaceC7199a;

/* JADX INFO: renamed from: v4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6845d {

    /* JADX INFO: renamed from: v4.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private G4.c f61917b = i.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Lazy f61918c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Lazy f61919d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Lazy f61920e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC6843b.c f61921f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C6842a f61922g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private o f61923h = new o(false, false, false, 0, null, 31, null);

        /* JADX INFO: renamed from: v4.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0930a extends AbstractC5506u implements InterfaceC5082a {
            C0930a() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E4.c invoke() {
                return new c.a(a.this.f61916a).a();
            }
        }

        /* JADX INFO: renamed from: v4.d$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements InterfaceC5082a {
            b() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final InterfaceC7199a invoke() {
                return s.f11295a.a(a.this.f61916a);
            }
        }

        /* JADX INFO: renamed from: v4.d$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f61926a = new c();

            c() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4618A invoke() {
                return new C4618A();
            }
        }

        public a(Context context) {
            this.f61916a = context.getApplicationContext();
        }

        public final InterfaceC6845d b() {
            Context context = this.f61916a;
            G4.c cVar = this.f61917b;
            Lazy lazyB = this.f61918c;
            if (lazyB == null) {
                lazyB = AbstractC2163n.b(new C0930a());
            }
            Lazy lazyB2 = this.f61919d;
            if (lazyB2 == null) {
                lazyB2 = AbstractC2163n.b(new b());
            }
            Lazy lazyB3 = this.f61920e;
            if (lazyB3 == null) {
                lazyB3 = AbstractC2163n.b(c.f61926a);
            }
            InterfaceC6843b.c cVar2 = this.f61921f;
            if (cVar2 == null) {
                cVar2 = InterfaceC6843b.c.f61914b;
            }
            C6842a c6842a = this.f61922g;
            if (c6842a == null) {
                c6842a = new C6842a();
            }
            return new C6846e(context, cVar, lazyB, lazyB2, lazyB3, cVar2, c6842a, this.f61923h, null);
        }

        public final a c(C6842a c6842a) {
            this.f61922g = c6842a;
            return this;
        }

        public final a d(InterfaceC5082a interfaceC5082a) {
            this.f61919d = AbstractC2163n.b(interfaceC5082a);
            return this;
        }
    }

    G4.c a();

    G4.e b(h hVar);

    Object c(h hVar, Zd.e eVar);

    E4.c d();

    C6842a getComponents();
}
