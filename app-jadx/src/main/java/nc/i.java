package nc;

import Td.AbstractC2163n;
import Ub.n;
import Ud.AbstractC2279u;
import cc.o;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f54113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f54114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f54115c;

    public i(InterfaceC6027q type) {
        AbstractC5504s.h(type, "type");
        this.f54113a = type;
        this.f54114b = new f(type);
        this.f54115c = AbstractC2163n.b(new InterfaceC5082a() { // from class: nc.h
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return i.i(this.f54112a);
            }
        });
    }

    private final SharedRef f(SharedRef sharedRef) throws o {
        Object ref = sharedRef.getRef();
        if (ref != null) {
            InterfaceC6027q interfaceC6027qH = h();
            InterfaceC6016f interfaceC6016fC = interfaceC6027qH != null ? interfaceC6027qH.c() : null;
            InterfaceC6014d interfaceC6014d = interfaceC6016fC instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC : null;
            if (interfaceC6014d != null && !n.a(interfaceC6014d, ref.getClass())) {
                throw new o(this.f54113a, sharedRef.getClass());
            }
        }
        return sharedRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6027q i(i iVar) {
        List listE;
        InterfaceC6016f interfaceC6016fC = iVar.f54113a.c();
        InterfaceC6014d interfaceC6014d = interfaceC6016fC instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC : null;
        InterfaceC6027q interfaceC6027q = iVar.f54113a;
        while (interfaceC6014d != null) {
            if (AbstractC5504s.c(interfaceC6014d, O.b(SharedRef.class))) {
                C6029s c6029s = (interfaceC6027q == null || (listE = interfaceC6027q.e()) == null) ? null : (C6029s) AbstractC2279u.m0(listE);
                if (AbstractC5504s.c(c6029s, C6029s.f56013c.c())) {
                    return null;
                }
                InterfaceC6027q interfaceC6027qC = c6029s != null ? c6029s.c() : null;
                if (interfaceC6027qC != null) {
                    return interfaceC6027qC;
                }
                throw new IllegalArgumentException(("The " + iVar.h() + " type should contain the type of the inner ref").toString());
            }
            interfaceC6027q = (InterfaceC6027q) AbstractC2279u.o0(interfaceC6014d.k());
            InterfaceC6016f interfaceC6016fC2 = interfaceC6027q != null ? interfaceC6027q.c() : null;
            interfaceC6014d = interfaceC6016fC2 instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC2 : null;
        }
        return null;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return this.f54114b.b();
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return this.f54114b.c();
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SharedRef d(Object value, Ub.d dVar, boolean z10) throws o {
        AbstractC5504s.h(value, "value");
        SharedRef sharedRefF = f((SharedRef) this.f54114b.a(value, dVar, z10));
        AbstractC5504s.f(sharedRefF, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
        return sharedRefF;
    }

    public final InterfaceC6027q h() {
        return (InterfaceC6027q) this.f54115c.getValue();
    }
}
