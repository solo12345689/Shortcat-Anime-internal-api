package qe;

import Td.r;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.EnumC6030t;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;
import qf.AbstractC6183d0;
import qf.B0;
import qf.C6197k0;
import qf.D0;
import qf.N0;
import qf.S;
import qf.V;
import qf.r0;
import qf.v0;
import se.InterfaceC6476Y;
import se.U0;
import se.Y0;
import ye.InterfaceC7230h;
import ye.m0;

/* JADX INFO: renamed from: qe.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6174d {

    /* JADX INFO: renamed from: qe.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57951a;

        static {
            int[] iArr = new int[EnumC6030t.values().length];
            try {
                iArr[EnumC6030t.f56018a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6030t.f56019b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6030t.f56020c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57951a = iArr;
        }
    }

    private static final AbstractC6183d0 a(r0 r0Var, v0 v0Var, List list, boolean z10) {
        B0 c6197k0;
        List parameters = v0Var.getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            C6029s c6029s = (C6029s) obj;
            U0 u02 = (U0) c6029s.c();
            S sA = u02 != null ? u02.A() : null;
            EnumC6030t enumC6030tD = c6029s.d();
            int i12 = enumC6030tD == null ? -1 : a.f57951a[enumC6030tD.ordinal()];
            if (i12 == -1) {
                Object obj2 = parameters.get(i10);
                AbstractC5504s.g(obj2, "get(...)");
                c6197k0 = new C6197k0((m0) obj2);
            } else if (i12 == 1) {
                N0 n02 = N0.f57999e;
                AbstractC5504s.e(sA);
                c6197k0 = new D0(n02, sA);
            } else if (i12 == 2) {
                N0 n03 = N0.f58000f;
                AbstractC5504s.e(sA);
                c6197k0 = new D0(n03, sA);
            } else {
                if (i12 != 3) {
                    throw new r();
                }
                N0 n04 = N0.f58001g;
                AbstractC5504s.e(sA);
                c6197k0 = new D0(n04, sA);
            }
            arrayList.add(c6197k0);
            i10 = i11;
        }
        return V.k(r0Var, v0Var, arrayList, z10, null, 16, null);
    }

    public static final InterfaceC6027q b(InterfaceC6016f interfaceC6016f, List arguments, boolean z10, List annotations) {
        InterfaceC7230h descriptor;
        AbstractC5504s.h(interfaceC6016f, "<this>");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(annotations, "annotations");
        InterfaceC6476Y interfaceC6476Y = interfaceC6016f instanceof InterfaceC6476Y ? (InterfaceC6476Y) interfaceC6016f : null;
        if (interfaceC6476Y == null || (descriptor = interfaceC6476Y.getDescriptor()) == null) {
            throw new Y0("Cannot create type for an unsupported classifier: " + interfaceC6016f + " (" + interfaceC6016f.getClass() + ')');
        }
        v0 v0VarL = descriptor.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        List parameters = v0VarL.getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new U0(a(annotations.isEmpty() ? r0.f58089b.k() : r0.f58089b.k(), v0VarL, arguments, z10), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
