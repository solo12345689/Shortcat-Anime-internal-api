package se;

import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import he.AbstractC4945a;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pe.EnumC6031u;
import pe.InterfaceC6013c;
import pe.InterfaceC6022l;
import pe.InterfaceC6027q;
import qe.C6171a;
import re.AbstractC6309b;
import se.a1;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;

/* JADX INFO: renamed from: se.A */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6453A implements InterfaceC6013c, X0 {

    /* JADX INFO: renamed from: a */
    private final a1.a f59354a;

    /* JADX INFO: renamed from: b */
    private final a1.a f59355b;

    /* JADX INFO: renamed from: c */
    private final a1.a f59356c;

    /* JADX INFO: renamed from: d */
    private final a1.a f59357d;

    /* JADX INFO: renamed from: e */
    private final a1.a f59358e;

    /* JADX INFO: renamed from: f */
    private final Lazy f59359f;

    /* JADX INFO: renamed from: se.A$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(((InterfaceC6022l) obj).getName(), ((InterfaceC6022l) obj2).getName());
        }
    }

    public AbstractC6453A() {
        a1.a aVarB = a1.b(new C6509q(this));
        AbstractC5504s.g(aVarB, "lazySoft(...)");
        this.f59354a = aVarB;
        a1.a aVarB2 = a1.b(new C6511r(this));
        AbstractC5504s.g(aVarB2, "lazySoft(...)");
        this.f59355b = aVarB2;
        a1.a aVarB3 = a1.b(new C6513s(this));
        AbstractC5504s.g(aVarB3, "lazySoft(...)");
        this.f59356c = aVarB3;
        a1.a aVarB4 = a1.b(new C6515t(this));
        AbstractC5504s.g(aVarB4, "lazySoft(...)");
        this.f59357d = aVarB4;
        a1.a aVarB5 = a1.b(new C6517u(this));
        AbstractC5504s.g(aVarB5, "lazySoft(...)");
        this.f59358e = aVarB5;
        this.f59359f = AbstractC2163n.a(Td.q.f17462b, new C6519v(this));
    }

    public static final ye.W A(InterfaceC7224b interfaceC7224b, int i10) {
        Object obj = interfaceC7224b.j().get(i10);
        AbstractC5504s.g(obj, "get(...)");
        return (ye.W) obj;
    }

    public static final U0 B(AbstractC6453A abstractC6453A) {
        qf.S returnType = abstractC6453A.b0().getReturnType();
        AbstractC5504s.e(returnType);
        return new U0(returnType, new C6527z(abstractC6453A));
    }

    public static final Type C(AbstractC6453A abstractC6453A) {
        Type typeR = abstractC6453A.R();
        return typeR == null ? abstractC6453A.T().getReturnType() : typeR;
    }

    public static final List D(AbstractC6453A abstractC6453A) {
        List<ye.m0> typeParameters = abstractC6453A.b0().getTypeParameters();
        AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(typeParameters, 10));
        for (ye.m0 m0Var : typeParameters) {
            AbstractC5504s.e(m0Var);
            arrayList.add(new W0(abstractC6453A, m0Var));
        }
        return arrayList;
    }

    private final Object O(Map map) throws C6171a {
        Object objQ;
        List<InterfaceC6022l> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
        for (InterfaceC6022l interfaceC6022l : parameters) {
            if (map.containsKey(interfaceC6022l)) {
                objQ = map.get(interfaceC6022l);
                if (objQ == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC6022l + ')');
                }
            } else if (interfaceC6022l.p()) {
                objQ = null;
            } else {
                if (!interfaceC6022l.a()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC6022l);
                }
                objQ = Q(interfaceC6022l.getType());
            }
            arrayList.add(objQ);
        }
        te.h hVarV = V();
        if (hVarV != null) {
            try {
                return hVarV.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new C6171a(e10);
            }
        }
        throw new Y0("This callable does not support a default call: " + b0());
    }

    private final Object Q(InterfaceC6027q interfaceC6027q) {
        Class clsB = AbstractC4945a.b(AbstractC6309b.b(interfaceC6027q));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            AbstractC5504s.g(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type R() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objA0 = AbstractC2279u.A0(T().a());
            ParameterizedType parameterizedType = objA0 instanceof ParameterizedType ? (ParameterizedType) objA0 : null;
            if (AbstractC5504s.c(parameterizedType != null ? parameterizedType.getRawType() : null, Zd.e.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                AbstractC5504s.g(actualTypeArguments, "getActualTypeArguments(...)");
                Object objH0 = AbstractC2273n.H0(actualTypeArguments);
                WildcardType wildcardType = objH0 instanceof WildcardType ? (WildcardType) objH0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC2273n.X(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] S() {
        return (Object[]) ((Object[]) this.f59358e.invoke()).clone();
    }

    private final int X(InterfaceC6022l interfaceC6022l) {
        if (!((Boolean) this.f59359f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!j1.k(interfaceC6022l.getType())) {
            return 1;
        }
        InterfaceC6027q type = interfaceC6022l.getType();
        AbstractC5504s.f(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listN = te.o.n(qf.F0.a(((U0) type).A()));
        AbstractC5504s.e(listN);
        return listN.size();
    }

    public static final boolean a0(AbstractC6453A abstractC6453A) {
        List parameters = abstractC6453A.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return false;
        }
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            if (j1.k(((InterfaceC6022l) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    public static final Object[] n(AbstractC6453A abstractC6453A) {
        int iX;
        List<InterfaceC6022l> parameters = abstractC6453A.getParameters();
        int size = parameters.size() + (abstractC6453A.isSuspend() ? 1 : 0);
        if (((Boolean) abstractC6453A.f59359f.getValue()).booleanValue()) {
            iX = 0;
            for (InterfaceC6022l interfaceC6022l : parameters) {
                iX += interfaceC6022l.h() == InterfaceC6022l.a.f56010c ? abstractC6453A.X(interfaceC6022l) : 0;
            }
        } else if (parameters.isEmpty()) {
            iX = 0;
        } else {
            Iterator it = parameters.iterator();
            iX = 0;
            while (it.hasNext()) {
                if (((InterfaceC6022l) it.next()).h() == InterfaceC6022l.a.f56010c && (iX = iX + 1) < 0) {
                    AbstractC2279u.v();
                }
            }
        }
        int i10 = (iX + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (InterfaceC6022l interfaceC6022l2 : parameters) {
            if (interfaceC6022l2.p() && !j1.l(interfaceC6022l2.getType())) {
                objArr[interfaceC6022l2.getIndex()] = j1.g(re.c.f(interfaceC6022l2.getType()));
            } else if (interfaceC6022l2.a()) {
                objArr[interfaceC6022l2.getIndex()] = abstractC6453A.Q(interfaceC6022l2.getType());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    public static final List r(AbstractC6453A abstractC6453A) {
        return j1.e(abstractC6453A.b0());
    }

    public static final ArrayList x(AbstractC6453A abstractC6453A) {
        int i10;
        InterfaceC7224b interfaceC7224bB0 = abstractC6453A.b0();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (abstractC6453A.Z()) {
            i10 = 0;
        } else {
            ye.c0 c0VarI = j1.i(interfaceC7224bB0);
            if (c0VarI != null) {
                arrayList.add(new C6526y0(abstractC6453A, 0, InterfaceC6022l.a.f56008a, new C6521w(c0VarI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            ye.c0 c0VarO = interfaceC7224bB0.O();
            if (c0VarO != null) {
                arrayList.add(new C6526y0(abstractC6453A, i10, InterfaceC6022l.a.f56009b, new C6523x(c0VarO)));
                i10++;
            }
        }
        int size = interfaceC7224bB0.j().size();
        while (i11 < size) {
            arrayList.add(new C6526y0(abstractC6453A, i10, InterfaceC6022l.a.f56010c, new C6525y(interfaceC7224bB0, i11)));
            i11++;
            i10++;
        }
        if (abstractC6453A.Y() && (interfaceC7224bB0 instanceof Je.a) && arrayList.size() > 1) {
            AbstractC2279u.B(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public final Object P(Map args, Zd.e eVar) throws C6171a {
        AbstractC5504s.h(args, "args");
        List<InterfaceC6022l> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return T().call(isSuspend() ? new Zd.e[]{eVar} : new Zd.e[0]);
            } catch (IllegalAccessException e10) {
                throw new C6171a(e10);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrS = S();
        if (isSuspend()) {
            objArrS[parameters.size()] = eVar;
        }
        boolean zBooleanValue = ((Boolean) this.f59359f.getValue()).booleanValue();
        int i10 = 0;
        for (InterfaceC6022l interfaceC6022l : parameters) {
            int iX = zBooleanValue ? X(interfaceC6022l) : 1;
            if (args.containsKey(interfaceC6022l)) {
                objArrS[interfaceC6022l.getIndex()] = args.get(interfaceC6022l);
            } else if (interfaceC6022l.p()) {
                if (zBooleanValue) {
                    int i11 = i10 + iX;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrS[i13];
                        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrS[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrS[i14];
                    AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrS[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!interfaceC6022l.a()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC6022l);
            }
            if (interfaceC6022l.h() == InterfaceC6022l.a.f56010c) {
                i10 += iX;
            }
        }
        if (!z10) {
            try {
                te.h hVarT = T();
                Object[] objArrCopyOf = Arrays.copyOf(objArrS, size);
                AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
                return hVarT.call(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new C6171a(e11);
            }
        }
        te.h hVarV = V();
        if (hVarV != null) {
            try {
                return hVarV.call(objArrS);
            } catch (IllegalAccessException e12) {
                throw new C6171a(e12);
            }
        }
        throw new Y0("This callable does not support a default call: " + b0());
    }

    public abstract te.h T();

    public abstract AbstractC6484d0 U();

    public abstract te.h V();

    /* JADX INFO: renamed from: W */
    public abstract InterfaceC7224b b0();

    protected final boolean Y() {
        return AbstractC5504s.c(getName(), "<init>") && U().j().isAnnotation();
    }

    public abstract boolean Z();

    @Override // pe.InterfaceC6013c
    public Object call(Object... args) throws C6171a {
        AbstractC5504s.h(args, "args");
        try {
            return T().call(args);
        } catch (IllegalAccessException e10) {
            throw new C6171a(e10);
        }
    }

    @Override // pe.InterfaceC6013c
    public Object callBy(Map args) {
        AbstractC5504s.h(args, "args");
        return Y() ? O(args) : P(args, null);
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        Object objInvoke = this.f59354a.invoke();
        AbstractC5504s.g(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // pe.InterfaceC6013c
    public List getParameters() {
        Object objInvoke = this.f59355b.invoke();
        AbstractC5504s.g(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // pe.InterfaceC6013c
    public InterfaceC6027q getReturnType() {
        Object objInvoke = this.f59356c.invoke();
        AbstractC5504s.g(objInvoke, "invoke(...)");
        return (InterfaceC6027q) objInvoke;
    }

    @Override // pe.InterfaceC6013c
    public List getTypeParameters() {
        Object objInvoke = this.f59357d.invoke();
        AbstractC5504s.g(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // pe.InterfaceC6013c
    public EnumC6031u getVisibility() {
        AbstractC7242u visibility = b0().getVisibility();
        AbstractC5504s.g(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    @Override // pe.InterfaceC6013c
    public boolean isAbstract() {
        return b0().r() == ye.E.f65063e;
    }

    @Override // pe.InterfaceC6013c
    public boolean isFinal() {
        return b0().r() == ye.E.f65060b;
    }

    @Override // pe.InterfaceC6013c
    public boolean isOpen() {
        return b0().r() == ye.E.f65062d;
    }

    public static final ye.W y(ye.c0 c0Var) {
        return c0Var;
    }

    public static final ye.W z(ye.c0 c0Var) {
        return c0Var;
    }
}
