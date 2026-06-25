package pc;

import Td.AbstractC2163n;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5972b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6027q f55934a;

    /* JADX INFO: renamed from: b */
    private final X f55935b;

    /* JADX INFO: renamed from: c */
    private final Lazy f55936c;

    public C5972b(InterfaceC6027q kType, X x10) {
        AbstractC5504s.h(kType, "kType");
        this.f55934a = kType;
        this.f55935b = x10;
        this.f55936c = AbstractC2163n.b(new InterfaceC5082a() { // from class: pc.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5972b.d(this.f55912a);
            }
        });
    }

    public static /* synthetic */ Object c(C5972b c5972b, Object obj, Ub.d dVar, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c5972b.b(obj, dVar, z10);
    }

    public static final expo.modules.kotlin.types.b d(C5972b c5972b) {
        expo.modules.kotlin.types.b bVarA;
        X x10 = c5972b.f55935b;
        return (x10 == null || (bVarA = x10.a(c5972b.f55934a)) == null) ? a0.f55913a.a(c5972b.f55934a) : bVarA;
    }

    private final expo.modules.kotlin.types.b e() {
        return (expo.modules.kotlin.types.b) this.f55936c.getValue();
    }

    public final Object b(Object obj, Ub.d dVar, boolean z10) {
        return (z10 || !e().b() || (obj instanceof Dynamic)) ? e().a(obj, dVar, z10) : obj;
    }

    public final ExpectedType f() {
        return e().c();
    }

    public final InterfaceC6027q g() {
        return this.f55934a;
    }

    public /* synthetic */ C5972b(InterfaceC6027q interfaceC6027q, X x10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6027q, (i10 & 2) != 0 ? null : x10);
    }
}
