package Re;

import He.I;
import Qe.x;
import Re.a;
import Xe.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import df.C4597f;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ye.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class b implements x.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f15487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f15488k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f15489a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15490b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15491c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15492d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f15493e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f15494f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f15495g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a.EnumC0265a f15496h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f15497i = null;

    /* JADX INFO: renamed from: Re.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class AbstractC0267b implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f15498a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Qe.x.b
        public void a() {
            g((String[]) this.f15498a.toArray(new String[0]));
        }

        @Override // Qe.x.b
        public x.a b(Xe.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // Qe.x.b
        public void c(Xe.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // Qe.x.b
        public void d(C4597f c4597f) {
            if (c4597f == null) {
                f(2);
            }
        }

        @Override // Qe.x.b
        public void e(Object obj) {
            if (obj instanceof String) {
                this.f15498a.add((String) obj);
            }
        }

        protected abstract void g(String[] strArr);
    }

    static {
        try {
            f15487j = com.amazon.a.a.o.b.f34640af.equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f15487j = false;
        }
        HashMap map = new HashMap();
        f15488k = map;
        map.put(Xe.b.k(new Xe.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0265a.f15479e);
        map.put(Xe.b.k(new Xe.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0265a.f15480f);
        map.put(Xe.b.k(new Xe.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0265a.f15482h);
        map.put(Xe.b.k(new Xe.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0265a.f15483i);
        map.put(Xe.b.k(new Xe.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0265a.f15481g);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        a.EnumC0265a enumC0265a = this.f15496h;
        return enumC0265a == a.EnumC0265a.f15479e || enumC0265a == a.EnumC0265a.f15480f || enumC0265a == a.EnumC0265a.f15483i;
    }

    @Override // Qe.x.c
    public x.a b(Xe.b bVar, h0 h0Var) {
        a.EnumC0265a enumC0265a;
        if (bVar == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        Xe.c cVarA = bVar.a();
        if (cVarA.equals(I.f8444a)) {
            return new c();
        }
        if (cVarA.equals(I.f8463t)) {
            return new d();
        }
        if (f15487j || this.f15496h != null || (enumC0265a = (a.EnumC0265a) f15488k.get(bVar)) == null) {
            return null;
        }
        this.f15496h = enumC0265a;
        return new e();
    }

    public Re.a m(Ue.c cVar) {
        if (this.f15496h == null || this.f15489a == null) {
            return null;
        }
        Ue.c cVar2 = new Ue.c(this.f15489a, (this.f15491c & 8) != 0);
        if (!cVar2.h(cVar)) {
            this.f15495g = this.f15493e;
            this.f15493e = null;
        } else if (o() && this.f15493e == null) {
            return null;
        }
        String[] strArr = this.f15497i;
        return new Re.a(this.f15496h, cVar2, this.f15493e, this.f15495g, this.f15494f, this.f15490b, this.f15491c, this.f15492d, strArr != null ? We.a.e(strArr) : null);
    }

    public Re.a n() {
        return m(Ue.c.f19575i);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c implements x.a {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AbstractC0267b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // Re.b.AbstractC0267b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f15493e = strArr;
            }
        }

        /* JADX INFO: renamed from: Re.b$c$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0268b extends AbstractC0267b {
            C0268b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // Re.b.AbstractC0267b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f15494f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0268b();
        }

        @Override // Qe.x.a
        public void b(f fVar, Xe.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // Qe.x.a
        public x.a c(f fVar, Xe.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // Qe.x.a
        public void d(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("k".equals(strB)) {
                if (obj instanceof Integer) {
                    b.this.f15496h = a.EnumC0265a.c(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    b.this.f15489a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f15490b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    b.this.f15491c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strB) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f15492d = str2;
            }
        }

        @Override // Qe.x.a
        public x.b e(f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("d1".equals(strB)) {
                return h();
            }
            if ("d2".equals(strB)) {
                return i();
            }
            return null;
        }

        @Override // Qe.x.a
        public void f(f fVar, C4597f c4597f) {
            if (c4597f == null) {
                g(0);
            }
        }

        @Override // Qe.x.a
        public void a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements x.a {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AbstractC0267b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // Re.b.AbstractC0267b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f15497i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        @Override // Qe.x.a
        public void b(f fVar, Xe.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // Qe.x.a
        public x.a c(f fVar, Xe.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // Qe.x.a
        public x.b e(f fVar) {
            if ("b".equals(fVar != null ? fVar.b() : null)) {
                return h();
            }
            return null;
        }

        @Override // Qe.x.a
        public void f(f fVar, C4597f c4597f) {
            if (c4597f == null) {
                g(0);
            }
        }

        @Override // Qe.x.a
        public void a() {
        }

        @Override // Qe.x.a
        public void d(f fVar, Object obj) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e implements x.a {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AbstractC0267b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // Re.b.AbstractC0267b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f15493e = strArr;
            }
        }

        /* JADX INFO: renamed from: Re.b$e$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0269b extends AbstractC0267b {
            C0269b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // Re.b.AbstractC0267b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f15494f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0269b();
        }

        @Override // Qe.x.a
        public void b(f fVar, Xe.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // Qe.x.a
        public x.a c(f fVar, Xe.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // Qe.x.a
        public void d(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if (DiagnosticsEntry.VERSION_KEY.equals(strB)) {
                if (obj instanceof int[]) {
                    b.this.f15489a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                b.this.f15490b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // Qe.x.a
        public x.b e(f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return h();
            }
            if ("strings".equals(strB)) {
                return i();
            }
            return null;
        }

        @Override // Qe.x.a
        public void f(f fVar, C4597f c4597f) {
            if (c4597f == null) {
                g(0);
            }
        }

        @Override // Qe.x.a
        public void a() {
        }
    }

    @Override // Qe.x.c
    public void a() {
    }
}
