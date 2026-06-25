package pf;

import Df.r;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pf.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6041f implements pf.n {

    /* JADX INFO: renamed from: d */
    private static final String f56044d = r.g1(C6041f.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e */
    public static final pf.n f56045e = new a("NO_LOCKS", InterfaceC0861f.f56054a, C6040e.f56043b);

    /* JADX INFO: renamed from: a */
    protected final InterfaceC6046k f56046a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0861f f56047b;

    /* JADX INFO: renamed from: c */
    private final String f56048c;

    /* JADX INFO: renamed from: pf.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends C6041f {
        a(String str, InterfaceC0861f interfaceC0861f, InterfaceC6046k interfaceC6046k) {
            super(str, interfaceC0861f, interfaceC6046k, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // pf.C6041f
        protected o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    /* JADX INFO: renamed from: pf.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends j {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f56049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6041f c6041f, InterfaceC5082a interfaceC5082a, Object obj) {
            super(c6041f, interfaceC5082a);
            this.f56049d = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // pf.C6041f.h
        protected o c(boolean z10) {
            o oVarD = o.d(this.f56049d);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    /* JADX INFO: renamed from: pf.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends k {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function1 f56051e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Function1 f56052f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6041f c6041f, InterfaceC5082a interfaceC5082a, Function1 function1, Function1 function12) {
            super(c6041f, interfaceC5082a);
            this.f56051e = function1;
            this.f56052f = function12;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // pf.C6041f.h
        protected o c(boolean z10) {
            Function1 function1 = this.f56051e;
            if (function1 == null) {
                o oVarC = super.c(z10);
                if (oVarC == null) {
                    a(0);
                }
                return oVarC;
            }
            o oVarD = o.d(function1.invoke(Boolean.valueOf(z10)));
            if (oVarD == null) {
                a(1);
            }
            return oVarD;
        }

        @Override // pf.C6041f.i
        protected void e(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f56052f.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: pf.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends e implements InterfaceC6036a {
        /* synthetic */ d(C6041f c6041f, ConcurrentMap concurrentMap, a aVar) {
            this(c6041f, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // pf.C6041f.e, pf.InterfaceC6036a
        public Object a(Object obj, InterfaceC5082a interfaceC5082a) {
            if (interfaceC5082a == null) {
                b(2);
            }
            Object objA = super.a(obj, interfaceC5082a);
            if (objA == null) {
                b(3);
            }
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(C6041f c6041f, ConcurrentMap concurrentMap) {
            super(c6041f, concurrentMap, null);
            if (c6041f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* JADX INFO: renamed from: pf.f$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends l implements InterfaceC6037b {

        /* JADX INFO: renamed from: pf.f$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Function1 {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public Object invoke(g gVar) {
                return gVar.f56056b.invoke();
            }
        }

        /* synthetic */ e(C6041f c6041f, ConcurrentMap concurrentMap, a aVar) {
            this(c6041f, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, InterfaceC5082a interfaceC5082a) {
            if (interfaceC5082a == null) {
                b(2);
            }
            return invoke(new g(obj, interfaceC5082a));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(C6041f c6041f, ConcurrentMap concurrentMap) {
            super(c6041f, concurrentMap, new a());
            if (c6041f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* JADX INFO: renamed from: pf.f$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0861f {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC0861f f56054a = new a();

        /* JADX INFO: renamed from: pf.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements InterfaceC0861f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // pf.C6041f.InterfaceC0861f
            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw Af.c.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    /* JADX INFO: renamed from: pf.f$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g {

        /* JADX INFO: renamed from: a */
        private final Object f56055a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC5082a f56056b;

        public g(Object obj, InterfaceC5082a interfaceC5082a) {
            this.f56055a = obj;
            this.f56056b = interfaceC5082a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f56055a.equals(((g) obj).f56055a);
        }

        public int hashCode() {
            return this.f56055a.hashCode();
        }
    }

    /* JADX INFO: renamed from: pf.f$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class i extends h {

        /* JADX INFO: renamed from: d */
        private volatile C6047l f56060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C6041f c6041f, InterfaceC5082a interfaceC5082a) {
            super(c6041f, interfaceC5082a);
            if (c6041f == null) {
                a(0);
            }
            if (interfaceC5082a == null) {
                a(1);
            }
            this.f56060d = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // pf.C6041f.h
        protected final void b(Object obj) {
            this.f56060d = new C6047l(obj);
            try {
                e(obj);
            } finally {
                this.f56060d = null;
            }
        }

        protected abstract void e(Object obj);

        @Override // pf.C6041f.h, ie.InterfaceC5082a
        public Object invoke() {
            C6047l c6047l = this.f56060d;
            return (c6047l == null || !c6047l.b()) ? super.invoke() : c6047l.a();
        }
    }

    /* JADX INFO: renamed from: pf.f$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class j extends h implements InterfaceC6044i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C6041f c6041f, InterfaceC5082a interfaceC5082a) {
            super(c6041f, interfaceC5082a);
            if (c6041f == null) {
                a(0);
            }
            if (interfaceC5082a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // pf.C6041f.h, ie.InterfaceC5082a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: pf.f$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class k extends i implements InterfaceC6044i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C6041f c6041f, InterfaceC5082a interfaceC5082a) {
            super(c6041f, interfaceC5082a);
            if (c6041f == null) {
                a(0);
            }
            if (interfaceC5082a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // pf.C6041f.i, pf.C6041f.h, ie.InterfaceC5082a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: pf.f$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class l implements InterfaceC6043h {

        /* JADX INFO: renamed from: a */
        private final C6041f f56061a;

        /* JADX INFO: renamed from: b */
        private final ConcurrentMap f56062b;

        /* JADX INFO: renamed from: c */
        private final Function1 f56063c;

        public l(C6041f c6041f, ConcurrentMap concurrentMap, Function1 function1) {
            if (c6041f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (function1 == null) {
                b(2);
            }
            this.f56061a = c6041f;
            this.f56062b = concurrentMap;
            this.f56063c = function1;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError c(Object obj, Object obj2) {
            return (AssertionError) C6041f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f56061a));
        }

        private AssertionError e(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) C6041f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f56061a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError h(Object obj, Throwable th2) {
            return (AssertionError) C6041f.q(new AssertionError("Unable to remove " + obj + " under " + this.f56061a, th2));
        }

        protected o f(Object obj, boolean z10) {
            o oVarP = this.f56061a.p("", obj);
            if (oVarP == null) {
                b(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:86:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:78:0x0020, B:80:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:77:0x0018, B:79:0x0022, B:81:0x002f, B:86:0x003e, B:88:0x0042, B:90:0x004d, B:92:0x0054, B:102:0x007f, B:105:0x008b, B:107:0x008f, B:108:0x0093, B:109:0x0094, B:110:0x0096, B:115:0x009f, B:117:0x00ad, B:118:0x00b1, B:119:0x00b2, B:120:0x00bc, B:122:0x00c2, B:123:0x00cc, B:125:0x00ce, B:126:0x00d2, B:112:0x0098, B:113:0x009c, B:104:0x0085, B:121:0x00bd, B:95:0x005a, B:99:0x0079, B:100:0x007d), top: B:131:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0052  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.C6041f.l.invoke(java.lang.Object):java.lang.Object");
        }

        @Override // pf.InterfaceC6043h
        public boolean q(Object obj) {
            Object obj2 = this.f56062b.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }
    }

    /* JADX INFO: renamed from: pf.f$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class m extends l implements InterfaceC6042g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C6041f c6041f, ConcurrentMap concurrentMap, Function1 function1) {
            super(c6041f, concurrentMap, function1);
            if (c6041f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (function1 == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // pf.C6041f.l, kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            Object objInvoke = super.invoke(obj);
            if (objInvoke == null) {
                b(3);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: pf.f$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: renamed from: pf.f$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class o {

        /* JADX INFO: renamed from: a */
        private final Object f56068a;

        /* JADX INFO: renamed from: b */
        private final boolean f56069b;

        private o(Object obj, boolean z10) {
            this.f56068a = obj;
            this.f56069b = z10;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f56068a;
        }

        public boolean c() {
            return this.f56069b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f56068a);
        }
    }

    /* synthetic */ C6041f(String str, InterfaceC0861f interfaceC0861f, InterfaceC6046k interfaceC6046k, a aVar) {
        this(str, interfaceC0861f, interfaceC6046k);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.C6041f.j(int):void");
    }

    private static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static Throwable q(Throwable th2) {
        if (th2 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f56044d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        th2.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th2;
    }

    @Override // pf.n
    public InterfaceC6036a a() {
        return new d(this, m(), null);
    }

    @Override // pf.n
    public Object b(InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            j(34);
        }
        this.f56046a.lock();
        try {
            return interfaceC5082a.invoke();
        } finally {
        }
    }

    @Override // pf.n
    public InterfaceC6044i c(InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            j(23);
        }
        return new j(this, interfaceC5082a);
    }

    @Override // pf.n
    public InterfaceC6043h d(Function1 function1) {
        if (function1 == null) {
            j(19);
        }
        InterfaceC6043h interfaceC6043hO = o(function1, m());
        if (interfaceC6043hO == null) {
            j(20);
        }
        return interfaceC6043hO;
    }

    @Override // pf.n
    public InterfaceC6044i e(InterfaceC5082a interfaceC5082a, Function1 function1, Function1 function12) {
        if (interfaceC5082a == null) {
            j(28);
        }
        if (function12 == null) {
            j(29);
        }
        return new c(this, interfaceC5082a, function1, function12);
    }

    @Override // pf.n
    public InterfaceC6037b f() {
        return new e(this, m(), null);
    }

    @Override // pf.n
    public InterfaceC6045j g(InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            j(30);
        }
        return new h(this, interfaceC5082a);
    }

    @Override // pf.n
    public InterfaceC6042g h(Function1 function1) {
        if (function1 == null) {
            j(9);
        }
        InterfaceC6042g interfaceC6042gN = n(function1, m());
        if (interfaceC6042gN == null) {
            j(10);
        }
        return interfaceC6042gN;
    }

    @Override // pf.n
    public InterfaceC6044i i(InterfaceC5082a interfaceC5082a, Object obj) {
        if (interfaceC5082a == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, interfaceC5082a, obj);
    }

    public InterfaceC6042g n(Function1 function1, ConcurrentMap concurrentMap) {
        if (function1 == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, function1);
    }

    public InterfaceC6043h o(Function1 function1, ConcurrentMap concurrentMap) {
        if (function1 == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, function1);
    }

    protected o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f56048c + ")";
    }

    private C6041f(String str, InterfaceC0861f interfaceC0861f, InterfaceC6046k interfaceC6046k) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0861f == null) {
            j(5);
        }
        if (interfaceC6046k == null) {
            j(6);
        }
        this.f56046a = interfaceC6046k;
        this.f56047b = interfaceC0861f;
        this.f56048c = str;
    }

    public C6041f(String str) {
        this(str, (Runnable) null, (Function1) null);
    }

    public C6041f(String str, Runnable runnable, Function1 function1) {
        this(str, InterfaceC0861f.f56054a, InterfaceC6046k.f56070a.a(runnable, function1));
    }

    /* JADX INFO: renamed from: pf.f$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class h implements InterfaceC6045j {

        /* JADX INFO: renamed from: a */
        private final C6041f f56057a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC5082a f56058b;

        /* JADX INFO: renamed from: c */
        private volatile Object f56059c;

        public h(C6041f c6041f, InterfaceC5082a interfaceC5082a) {
            if (c6041f == null) {
                a(0);
            }
            if (interfaceC5082a == null) {
                a(1);
            }
            this.f56059c = n.NOT_COMPUTED;
            this.f56057a = c6041f;
            this.f56058b = interfaceC5082a;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected o c(boolean z10) {
            o oVarP = this.f56057a.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:49:0x0012, B:51:0x0018, B:56:0x0026, B:58:0x002a, B:60:0x0039, B:61:0x003e, B:63:0x0042, B:65:0x004d, B:66:0x0052, B:70:0x0061, B:72:0x0067, B:74:0x006d, B:75:0x0073, B:76:0x007d, B:77:0x007e, B:78:0x0084, B:67:0x0054), top: B:83:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:49:0x0012, B:51:0x0018, B:56:0x0026, B:58:0x002a, B:60:0x0039, B:61:0x003e, B:63:0x0042, B:65:0x004d, B:66:0x0052, B:70:0x0061, B:72:0x0067, B:74:0x006d, B:75:0x0073, B:76:0x007d, B:77:0x007e, B:78:0x0084, B:67:0x0054), top: B:83:0x0012, inners: #0 }] */
        @Override // ie.InterfaceC5082a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f56059c
                boolean r1 = r0 instanceof pf.C6041f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = Af.l.f(r0)
                return r0
            Lb:
                pf.f r0 = r4.f56057a
                pf.k r0 = r0.f56046a
                r0.lock()
                java.lang.Object r0 = r4.f56059c     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof pf.C6041f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = Af.l.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                pf.f r1 = r4.f56057a
                pf.k r1 = r1.f56046a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                pf.f$n r1 = pf.C6041f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                pf.f$n r2 = pf.C6041f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f56059c = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                pf.f$o r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                pf.f$n r2 = pf.C6041f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                pf.f$o r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f56059c = r1     // Catch: java.lang.Throwable -> L24
                ie.a r0 = r4.f56058b     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.b(r0)     // Catch: java.lang.Throwable -> L60
                r4.f56059c = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = Af.c.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f56059c     // Catch: java.lang.Throwable -> L24
                pf.f$n r2 = pf.C6041f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = Af.l.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f56059c = r1     // Catch: java.lang.Throwable -> L24
            L73:
                pf.f r1 = r4.f56057a     // Catch: java.lang.Throwable -> L24
                pf.f$f r1 = pf.C6041f.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                pf.f$n r1 = pf.C6041f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f56059c = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                pf.f r1 = r4.f56057a
                pf.k r1 = r1.f56046a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.C6041f.h.invoke():java.lang.Object");
        }

        public boolean o() {
            return (this.f56059c == n.NOT_COMPUTED || this.f56059c == n.COMPUTING) ? false : true;
        }

        protected void b(Object obj) {
        }
    }
}
