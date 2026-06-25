package mf;

import Se.b;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.verification.SigningManager;
import df.AbstractC4598g;
import df.AbstractC4603l;
import df.C4587A;
import df.C4588B;
import df.C4589C;
import df.C4590D;
import df.C4592a;
import df.C4593b;
import df.C4594c;
import df.C4595d;
import df.C4596e;
import df.C4600i;
import df.C4601j;
import df.C4602k;
import df.C4604m;
import df.C4605n;
import df.C4610s;
import df.C4611t;
import df.C4614w;
import df.C4615x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import qf.AbstractC6183d0;
import ye.AbstractC7246y;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.h0;
import ye.t0;
import ze.C7370d;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: mf.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5676g {

    /* JADX INFO: renamed from: a */
    private final ye.H f53419a;

    /* JADX INFO: renamed from: b */
    private final ye.M f53420b;

    /* JADX INFO: renamed from: mf.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53421a;

        static {
            int[] iArr = new int[b.C0278b.c.EnumC0281c.values().length];
            try {
                iArr[b.C0278b.c.EnumC0281c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.C0278b.c.EnumC0281c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f53421a = iArr;
        }
    }

    public C5676g(ye.H module, ye.M notFoundClasses) {
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        this.f53419a = module;
        this.f53420b = notFoundClasses;
    }

    private final boolean b(AbstractC4598g abstractC4598g, qf.S s10, b.C0278b.c cVar) {
        b.C0278b.c.EnumC0281c enumC0281cT = cVar.T();
        int i10 = enumC0281cT == null ? -1 : a.f53421a[enumC0281cT.ordinal()];
        if (i10 == 10) {
            InterfaceC7230h interfaceC7230hP = s10.N0().p();
            InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
            return interfaceC7227e == null || ve.i.m0(interfaceC7227e);
        }
        if (i10 != 13) {
            return AbstractC5504s.c(abstractC4598g.a(this.f53419a), s10);
        }
        if (!(abstractC4598g instanceof C4593b) || ((List) ((C4593b) abstractC4598g).b()).size() != cVar.K().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC4598g).toString());
        }
        qf.S sL = c().l(s10);
        if (sL == null) {
            return false;
        }
        C4593b c4593b = (C4593b) abstractC4598g;
        Iterable iterableN = AbstractC2279u.n((Collection) c4593b.b());
        if ((iterableN instanceof Collection) && ((Collection) iterableN).isEmpty()) {
            return true;
        }
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            int iNextInt = ((Ud.O) it).nextInt();
            AbstractC4598g abstractC4598g2 = (AbstractC4598g) ((List) c4593b.b()).get(iNextInt);
            b.C0278b.c cVarI = cVar.I(iNextInt);
            AbstractC5504s.g(cVarI, "getArrayElement(...)");
            if (!b(abstractC4598g2, sL, cVarI)) {
                return false;
            }
        }
        return true;
    }

    private final ve.i c() {
        return this.f53419a.n();
    }

    private final Pair d(b.C0278b c0278b, Map map, Ue.d dVar) {
        t0 t0Var = (t0) map.get(L.b(dVar, c0278b.x()));
        if (t0Var == null) {
            return null;
        }
        Xe.f fVarB = L.b(dVar, c0278b.x());
        qf.S type = t0Var.getType();
        AbstractC5504s.g(type, "getType(...)");
        b.C0278b.c cVarY = c0278b.y();
        AbstractC5504s.g(cVarY, "getValue(...)");
        return new Pair(fVarB, g(type, cVarY, dVar));
    }

    private final InterfaceC7227e e(Xe.b bVar) {
        return AbstractC7246y.d(this.f53419a, bVar, this.f53420b);
    }

    private final AbstractC4598g g(qf.S s10, b.C0278b.c cVar, Ue.d dVar) {
        AbstractC4598g abstractC4598gF = f(s10, cVar, dVar);
        if (!b(abstractC4598gF, s10, cVar)) {
            abstractC4598gF = null;
        }
        if (abstractC4598gF != null) {
            return abstractC4598gF;
        }
        return AbstractC4603l.f45159b.a("Unexpected argument value: actual type " + cVar.T() + " != expected type " + s10);
    }

    public final InterfaceC7369c a(Se.b proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        InterfaceC7227e interfaceC7227eE = e(L.a(nameResolver, proto.B()));
        Map mapI = Ud.S.i();
        if (proto.y() != 0 && !sf.l.m(interfaceC7227eE) && bf.i.t(interfaceC7227eE)) {
            Collection collectionI = interfaceC7227eE.i();
            AbstractC5504s.g(collectionI, "getConstructors(...)");
            InterfaceC7226d interfaceC7226d = (InterfaceC7226d) AbstractC2279u.N0(collectionI);
            if (interfaceC7226d != null) {
                List listJ = interfaceC7226d.j();
                AbstractC5504s.g(listJ, "getValueParameters(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(listJ, 10)), 16));
                for (Object obj : listJ) {
                    linkedHashMap.put(((t0) obj).getName(), obj);
                }
                List<b.C0278b> listZ = proto.z();
                AbstractC5504s.g(listZ, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (b.C0278b c0278b : listZ) {
                    AbstractC5504s.e(c0278b);
                    Pair pairD = d(c0278b, linkedHashMap, nameResolver);
                    if (pairD != null) {
                        arrayList.add(pairD);
                    }
                }
                mapI = Ud.S.w(arrayList);
            }
        }
        return new C7370d(interfaceC7227eE.p(), mapI, h0.f65112a);
    }

    public final AbstractC4598g f(qf.S expectedType, b.C0278b.c value, Ue.d nameResolver) {
        AbstractC5504s.h(expectedType, "expectedType");
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(nameResolver, "nameResolver");
        Boolean boolD = Ue.b.f19544P.d(value.P());
        AbstractC5504s.g(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        b.C0278b.c.EnumC0281c enumC0281cT = value.T();
        switch (enumC0281cT == null ? -1 : a.f53421a[enumC0281cT.ordinal()]) {
            case 1:
                byte bR = (byte) value.R();
                return zBooleanValue ? new C4587A(bR) : new C4595d(bR);
            case 2:
                return new C4596e((char) value.R());
            case 3:
                short sR = (short) value.R();
                return zBooleanValue ? new C4590D(sR) : new C4614w(sR);
            case 4:
                int iR = (int) value.R();
                return zBooleanValue ? new C4588B(iR) : new C4605n(iR);
            case 5:
                long jR = value.R();
                return zBooleanValue ? new C4589C(jR) : new C4611t(jR);
            case 6:
                return new C4604m(value.Q());
            case 7:
                return new C4601j(value.N());
            case 8:
                return new C4594c(value.R() != 0);
            case 9:
                return new C4615x(nameResolver.getString(value.S()));
            case 10:
                return new C4610s(L.a(nameResolver, value.L()), value.H());
            case 11:
                return new C4602k(L.a(nameResolver, value.L()), L.b(nameResolver, value.O()));
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                Se.b bVarG = value.G();
                AbstractC5504s.g(bVarG, "getAnnotation(...)");
                return new C4592a(a(bVarG, nameResolver));
            case 13:
                C4600i c4600i = C4600i.f45156a;
                List<b.C0278b.c> listK = value.K();
                AbstractC5504s.g(listK, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(listK, 10));
                for (b.C0278b.c cVar : listK) {
                    AbstractC6183d0 abstractC6183d0I = c().i();
                    AbstractC5504s.g(abstractC6183d0I, "getAnyType(...)");
                    AbstractC5504s.e(cVar);
                    arrayList.add(f(abstractC6183d0I, cVar, nameResolver));
                }
                return c4600i.b(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.T() + " (expected " + expectedType + ')').toString());
        }
    }
}
