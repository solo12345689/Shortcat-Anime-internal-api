package te;

import Df.r;
import Ee.AbstractC1527f;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;
import qf.F0;
import qf.S;
import se.AbstractC6484d0;
import se.j1;
import te.h;
import te.i;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7247z;
import ye.W;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f60947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f60948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Member f60949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f60950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5870f[] f60951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f60952f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5870f f60953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List[] f60954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f60955c;

        public a(C5870f argumentRange, List[] unboxParameters, Method method) {
            AbstractC5504s.h(argumentRange, "argumentRange");
            AbstractC5504s.h(unboxParameters, "unboxParameters");
            this.f60953a = argumentRange;
            this.f60954b = unboxParameters;
            this.f60955c = method;
        }

        public final C5870f a() {
            return this.f60953a;
        }

        public final Method b() {
            return this.f60955c;
        }

        public final List[] c() {
            return this.f60954b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f60956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f60957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f60958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f60959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f60960e;

        public b(InterfaceC7247z descriptor, AbstractC6484d0 container, String constructorDesc, List originalParameters) {
            Collection collectionE;
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(container, "container");
            AbstractC5504s.h(constructorDesc, "constructorDesc");
            AbstractC5504s.h(originalParameters, "originalParameters");
            Method methodD = container.D("constructor-impl", constructorDesc);
            AbstractC5504s.e(methodD);
            this.f60956a = methodD;
            Method methodD2 = container.D("box-impl", r.D0(constructorDesc, "V") + AbstractC1527f.f(container.j()));
            AbstractC5504s.e(methodD2);
            this.f60957b = methodD2;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(originalParameters, 10));
            Iterator it = originalParameters.iterator();
            while (it.hasNext()) {
                S type = ((W) it.next()).getType();
                AbstractC5504s.g(type, "getType(...)");
                arrayList.add(o.p(F0.a(type), descriptor));
            }
            this.f60958c = arrayList;
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(originalParameters, 10));
            int i10 = 0;
            for (Object obj : originalParameters) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                InterfaceC7230h interfaceC7230hP = ((W) obj).getType().N0().p();
                AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC7227e interfaceC7227e = (InterfaceC7227e) interfaceC7230hP;
                List list = (List) this.f60958c.get(i10);
                if (list != null) {
                    collectionE = new ArrayList(AbstractC2279u.x(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsQ = j1.q(interfaceC7227e);
                    AbstractC5504s.e(clsQ);
                    collectionE = AbstractC2279u.e(clsQ);
                }
                arrayList2.add(collectionE);
                i10 = i11;
            }
            this.f60959d = arrayList2;
            this.f60960e = AbstractC2279u.z(arrayList2);
        }

        @Override // te.h
        public List a() {
            return this.f60960e;
        }

        @Override // te.h
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) d();
        }

        @Override // te.h
        public boolean c() {
            return h.a.b(this);
        }

        @Override // te.h
        public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionE;
            AbstractC5504s.h(args, "args");
            List<Pair> listM1 = AbstractC2273n.m1(args, this.f60958c);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listM1) {
                Object first = pair.getFirst();
                List list = (List) pair.getSecond();
                if (list != null) {
                    collectionE = new ArrayList(AbstractC2279u.x(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(first, null));
                    }
                } else {
                    collectionE = AbstractC2279u.e(first);
                }
                AbstractC2279u.D(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f60956a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f60957b.invoke(null, Arrays.copyOf(array, array.length));
        }

        public Void d() {
            return null;
        }

        public final List e() {
            return this.f60959d;
        }

        @Override // te.h
        public Type getReturnType() {
            Class<?> returnType = this.f60957b.getReturnType();
            AbstractC5504s.g(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[LOOP:1: B:25:0x0073->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(ye.InterfaceC7224b r11, te.h r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.n.<init>(ye.b, te.h, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC7227e makeKotlinParameterTypes) {
        AbstractC5504s.h(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return bf.k.g(makeKotlinParameterTypes);
    }

    @Override // te.h
    public List a() {
        return this.f60948b.a();
    }

    @Override // te.h
    public Member b() {
        return this.f60949c;
    }

    @Override // te.h
    public boolean c() {
        return this.f60948b instanceof i.h.a;
    }

    @Override // te.h
    public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        AbstractC5504s.h(args, "args");
        C5870f c5870fA = this.f60950d.a();
        List[] listArrC = this.f60950d.c();
        Method methodB = this.f60950d.b();
        if (!c5870fA.isEmpty()) {
            if (this.f60952f) {
                List listD = AbstractC2279u.d(args.length);
                int iF = c5870fA.f();
                for (int i10 = 0; i10 < iF; i10++) {
                    listD.add(args[i10]);
                }
                int iF2 = c5870fA.f();
                int i11 = c5870fA.i();
                if (iF2 <= i11) {
                    while (true) {
                        List<Method> list = listArrC[iF2];
                        Object obj = args[iF2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    AbstractC5504s.g(returnType, "getReturnType(...)");
                                    objG2 = j1.g(returnType);
                                }
                                listD.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (iF2 == i11) {
                            break;
                        }
                        iF2++;
                    }
                }
                int i12 = c5870fA.i() + 1;
                int iF0 = AbstractC2273n.f0(args);
                if (i12 <= iF0) {
                    while (true) {
                        listD.add(args[i12]);
                        if (i12 == iF0) {
                            break;
                        }
                        i12++;
                    }
                }
                args = AbstractC2279u.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i13 = 0; i13 < length; i13++) {
                    int iF3 = c5870fA.f();
                    if (i13 > c5870fA.i() || iF3 > i13) {
                        objG = args[i13];
                    } else {
                        List list2 = listArrC[i13];
                        Method method2 = list2 != null ? (Method) AbstractC2279u.M0(list2) : null;
                        objG = args[i13];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                AbstractC5504s.g(returnType2, "getReturnType(...)");
                                objG = j1.g(returnType2);
                            }
                        }
                    }
                    objArr[i13] = objG;
                }
                args = objArr;
            }
        }
        Object objCall = this.f60948b.call(args);
        return (objCall == AbstractC2605b.f() || methodB == null || (objInvoke = methodB.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final C5870f f(int i10) {
        if (i10 >= 0) {
            C5870f[] c5870fArr = this.f60951e;
            if (i10 < c5870fArr.length) {
                return c5870fArr[i10];
            }
        }
        C5870f[] c5870fArr2 = this.f60951e;
        if (c5870fArr2.length == 0) {
            return new C5870f(i10, i10);
        }
        int length = (i10 - c5870fArr2.length) + ((C5870f) AbstractC2273n.z0(c5870fArr2)).i() + 1;
        return new C5870f(length, length);
    }

    @Override // te.h
    public Type getReturnType() {
        return this.f60948b.getReturnType();
    }
}
