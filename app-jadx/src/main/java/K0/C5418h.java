package k0;

import Y.C2442s;
import Zd.i;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5418h implements InterfaceC5416f, Z.f, i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f51976b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51977c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2442s f51978a;

    /* JADX INFO: renamed from: k0.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        private a() {
        }
    }

    public C5418h(C2442s c2442s) {
        this.f51978a = c2442s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(C5418h c5418h, Object obj) {
        return c5418h.f51978a.u1(obj);
    }

    @Override // k0.InterfaceC5416f
    public boolean a(Throwable th2, final Object obj) {
        return AbstractC5414d.c(th2, new InterfaceC5082a() { // from class: k0.g
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5418h.e(this.f51974a, obj);
            }
        });
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // Z.f
    public List c(Integer num) {
        return this.f51978a.a1();
    }

    @Override // Zd.i.b
    public i.c getKey() {
        return f51976b;
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return i.b.a.a(this, obj, function2);
    }
}
