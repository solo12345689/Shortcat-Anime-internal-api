package T1;

import Td.L;
import ae.AbstractC2605b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: T1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2144h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16799a = new a(null);

    /* JADX INFO: renamed from: T1.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: T1.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0288a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f16801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f16802c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0288a(List list, Zd.e eVar) {
                super(2, eVar);
                this.f16802c = list;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, Zd.e eVar) {
                return ((C0288a) create(sVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0288a c0288a = new C0288a(this.f16802c, eVar);
                c0288a.f16801b = obj;
                return c0288a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f16800a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    s sVar = (s) this.f16801b;
                    a aVar = AbstractC2144h.f16799a;
                    List list = this.f16802c;
                    this.f16800a = 1;
                    if (aVar.c(list, sVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: T1.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f16803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f16804b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f16805c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f16807e;

            b(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16805c = obj;
                this.f16807e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: T1.h$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f16808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f16809b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f16810c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f16811d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f16812e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f16813f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f16814g;

            /* JADX INFO: renamed from: T1.h$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0289a extends kotlin.coroutines.jvm.internal.l implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f16815a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC2143g f16816b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0289a(InterfaceC2143g interfaceC2143g, Zd.e eVar) {
                    super(1, eVar);
                    this.f16816b = interfaceC2143g;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Zd.e eVar) {
                    return ((C0289a) create(eVar)).invokeSuspend(L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Zd.e eVar) {
                    return new C0289a(this.f16816b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f16815a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        InterfaceC2143g interfaceC2143g = this.f16816b;
                        this.f16815a = 1;
                        if (interfaceC2143g.b(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    return L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, Zd.e eVar) {
                super(2, eVar);
                this.f16813f = list;
                this.f16814g = list2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, Zd.e eVar) {
                return ((c) create(obj, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                c cVar = new c(this.f16813f, this.f16814g, eVar);
                cVar.f16812e = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r9.f16811d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f16808a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f16812e
                    java.util.List r4 = (java.util.List) r4
                    Td.v.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f16810c
                    java.lang.Object r4 = r9.f16809b
                    T1.g r4 = (T1.InterfaceC2143g) r4
                    java.lang.Object r5 = r9.f16808a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f16812e
                    java.util.List r6 = (java.util.List) r6
                    Td.v.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    Td.v.b(r10)
                    java.lang.Object r10 = r9.f16812e
                    java.util.List r1 = r9.f16813f
                    java.util.List r4 = r9.f16814g
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    T1.g r5 = (T1.InterfaceC2143g) r5
                    r9.f16812e = r4
                    r9.f16808a = r1
                    r9.f16809b = r5
                    r9.f16810c = r10
                    r9.f16811d = r3
                    java.lang.Object r6 = r5.c(r10, r9)
                    if (r6 != r0) goto L61
                    goto L87
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    T1.h$a$c$a r10 = new T1.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f16812e = r4
                    r9.f16808a = r5
                    r9.f16809b = r7
                    r9.f16810c = r7
                    r9.f16811d = r2
                    java.lang.Object r10 = r6.a(r1, r9)
                    if (r10 != r0) goto L88
                L87:
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: T1.AbstractC2144h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, T1.s r8, Zd.e r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof T1.AbstractC2144h.a.b
                if (r0 == 0) goto L13
                r0 = r9
                T1.h$a$b r0 = (T1.AbstractC2144h.a.b) r0
                int r1 = r0.f16807e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16807e = r1
                goto L18
            L13:
                T1.h$a$b r0 = new T1.h$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f16805c
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f16807e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f16804b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f16803a
                kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
                Td.v.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f16803a
                java.util.List r7 = (java.util.List) r7
                Td.v.b(r9)
                goto L60
            L46:
                Td.v.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                T1.h$a$c r2 = new T1.h$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f16803a = r9
                r0.f16807e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L81
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.N r8 = new kotlin.jvm.internal.N
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r7.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r0.f16803a = r8     // Catch: java.lang.Throwable -> L34
                r0.f16804b = r7     // Catch: java.lang.Throwable -> L34
                r0.f16807e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
            L81:
                return r1
            L82:
                java.lang.Object r2 = r8.f52259a
                if (r2 != 0) goto L89
                r8.f52259a = r9
                goto L69
            L89:
                kotlin.jvm.internal.AbstractC5504s.e(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                Td.AbstractC2156g.a(r2, r9)
                goto L69
            L92:
                java.lang.Object r7 = r8.f52259a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9b
                Td.L r7 = Td.L.f17438a
                return r7
            L9b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: T1.AbstractC2144h.a.c(java.util.List, T1.s, Zd.e):java.lang.Object");
        }

        public final Function2 b(List migrations) {
            AbstractC5504s.h(migrations, "migrations");
            return new C0288a(migrations, null);
        }

        private a() {
        }
    }
}
