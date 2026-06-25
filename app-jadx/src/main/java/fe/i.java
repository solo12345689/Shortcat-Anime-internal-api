package fe;

import Ud.AbstractC2262c;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Cf.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f47015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f47016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f47017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f47018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f47019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f47020f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            AbstractC5504s.h(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends AbstractC2262c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f47021c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f47023b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f47024c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f47025d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f47026e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f47027f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                AbstractC5504s.h(rootDir, "rootDir");
                this.f47027f = bVar;
            }

            @Override // fe.i.c
            public File b() {
                if (!this.f47026e && this.f47024c == null) {
                    Function1 function1 = i.this.f47017c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f47024c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = i.this.f47019e;
                        if (function2 != null) {
                            function2.invoke(a(), new C4799a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f47026e = true;
                    }
                }
                File[] fileArr = this.f47024c;
                if (fileArr != null) {
                    int i10 = this.f47025d;
                    AbstractC5504s.e(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f47024c;
                        AbstractC5504s.e(fileArr2);
                        int i11 = this.f47025d;
                        this.f47025d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f47023b) {
                    this.f47023b = true;
                    return a();
                }
                Function1 function12 = i.this.f47018d;
                if (function12 != null) {
                    function12.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: fe.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private final class C0754b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f47028b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f47029c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0754b(b bVar, File rootFile) {
                super(rootFile);
                AbstractC5504s.h(rootFile, "rootFile");
                this.f47029c = bVar;
            }

            @Override // fe.i.c
            public File b() {
                if (this.f47028b) {
                    return null;
                }
                this.f47028b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f47030b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f47031c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f47032d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f47033e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                AbstractC5504s.h(rootDir, "rootDir");
                this.f47033e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // fe.i.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f47030b
                    r1 = 0
                    if (r0 != 0) goto L28
                    fe.i$b r0 = r9.f47033e
                    fe.i r0 = fe.i.this
                    kotlin.jvm.functions.Function1 r0 = fe.i.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f47030b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f47031c
                    if (r0 == 0) goto L47
                    int r2 = r9.f47032d
                    kotlin.jvm.internal.AbstractC5504s.e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    fe.i$b r0 = r9.f47033e
                    fe.i r0 = fe.i.this
                    kotlin.jvm.functions.Function1 r0 = fe.i.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f47031c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f47031c = r0
                    if (r0 != 0) goto L76
                    fe.i$b r0 = r9.f47033e
                    fe.i r0 = fe.i.this
                    kotlin.jvm.functions.Function2 r0 = fe.i.f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    fe.a r3 = new fe.a
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f47031c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.AbstractC5504s.e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    fe.i$b r0 = r9.f47033e
                    fe.i r0 = fe.i.this
                    kotlin.jvm.functions.Function1 r0 = fe.i.g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f47031c
                    kotlin.jvm.internal.AbstractC5504s.e(r0)
                    int r1 = r9.f47032d
                    int r2 = r1 + 1
                    r9.f47032d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: fe.i.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47034a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.f47036a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.f47037b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f47034a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f47021c = arrayDeque;
            if (i.this.f47015a.isDirectory()) {
                arrayDeque.push(g(i.this.f47015a));
            } else if (i.this.f47015a.isFile()) {
                arrayDeque.push(new C0754b(this, i.this.f47015a));
            } else {
                d();
            }
        }

        private final a g(File file) {
            int i10 = d.f47034a[i.this.f47016b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new Td.r();
        }

        private final File i() {
            File fileB;
            while (true) {
                c cVar = (c) this.f47021c.peek();
                if (cVar == null) {
                    return null;
                }
                fileB = cVar.b();
                if (fileB == null) {
                    this.f47021c.pop();
                } else {
                    if (AbstractC5504s.c(fileB, cVar.a()) || !fileB.isDirectory() || this.f47021c.size() >= i.this.f47020f) {
                        break;
                    }
                    this.f47021c.push(g(fileB));
                }
            }
            return fileB;
        }

        @Override // Ud.AbstractC2262c
        protected void b() {
            File fileI = i();
            if (fileI != null) {
                e(fileI);
            } else {
                d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f47035a;

        public c(File root) {
            AbstractC5504s.h(root, "root");
            this.f47035a = root;
        }

        public final File a() {
            return this.f47035a;
        }

        public abstract File b();
    }

    private i(File file, j jVar, Function1 function1, Function1 function12, Function2 function2, int i10) {
        this.f47015a = file;
        this.f47016b = jVar;
        this.f47017c = function1;
        this.f47018d = function12;
        this.f47019e = function2;
        this.f47020f = i10;
    }

    public final i i(Function2 function) {
        AbstractC5504s.h(function, "function");
        return new i(this.f47015a, this.f47016b, this.f47017c, this.f47018d, function, this.f47020f);
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ i(File file, j jVar, Function1 function1, Function1 function12, Function2 function2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? j.f47036a : jVar, function1, function12, function2, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(File start, j direction) {
        this(start, direction, null, null, null, 0, 32, null);
        AbstractC5504s.h(start, "start");
        AbstractC5504s.h(direction, "direction");
    }
}
