package l1;

import Td.L;
import Y.InterfaceC2453v1;
import android.os.Handler;
import android.os.Looper;
import i0.C4968L;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l1.C5533o;

/* JADX INFO: renamed from: l1.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5533o implements InterfaceC5532n, InterfaceC2453v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5530l f52498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f52499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4968L f52500c = new C4968L(new b());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52501d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f52502e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f52503f = new ArrayList();

    /* JADX INFO: renamed from: l1.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f52504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5533o f52505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5515C f52506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, C5533o c5533o, C5515C c5515c) {
            super(0);
            this.f52504a = list;
            this.f52505b = c5533o;
            this.f52506c = c5515c;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m963invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m963invoke() {
            List list = this.f52504a;
            C5533o c5533o = this.f52505b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objJ = ((I0.A) list.get(i10)).j();
                C5529k c5529k = objJ instanceof C5529k ? (C5529k) objJ : null;
                if (c5529k != null) {
                    C5524f c5524fB = c5529k.b();
                    c5529k.a().invoke(new C5523e(c5524fB.a(), c5533o.i().b(c5524fB)));
                }
                c5533o.f52503f.add(c5529k);
            }
            this.f52505b.i().a(this.f52506c);
        }
    }

    /* JADX INFO: renamed from: l1.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC5082a interfaceC5082a) {
            interfaceC5082a.invoke();
        }

        public final void b(final InterfaceC5082a interfaceC5082a) {
            if (AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper())) {
                interfaceC5082a.invoke();
                return;
            }
            Handler handler = C5533o.this.f52499b;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                C5533o.this.f52499b = handler;
            }
            handler.post(new Runnable() { // from class: l1.p
                @Override // java.lang.Runnable
                public final void run() {
                    C5533o.b.c(interfaceC5082a);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC5082a) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: l1.o$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {
        c() {
            super(1);
        }

        public final void a(L l10) {
            C5533o.this.j(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L) obj);
            return L.f17438a;
        }
    }

    public C5533o(C5530l c5530l) {
        this.f52498a = c5530l;
    }

    @Override // l1.InterfaceC5532n
    public boolean a(List list) {
        if (this.f52501d || list.size() != this.f52503f.size()) {
            return true;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objJ = ((I0.A) list.get(i10)).j();
            if (!AbstractC5504s.c(objJ instanceof C5529k ? (C5529k) objJ : null, this.f52503f.get(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.InterfaceC5532n
    public void b(C5515C c5515c, List list) {
        this.f52503f.clear();
        this.f52500c.k(L.f17438a, this.f52502e, new a(list, this, c5515c));
        this.f52501d = false;
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        this.f52500c.q();
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        this.f52500c.r();
        this.f52500c.f();
    }

    public final C5530l i() {
        return this.f52498a;
    }

    public final void j(boolean z10) {
        this.f52501d = z10;
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
    }
}
