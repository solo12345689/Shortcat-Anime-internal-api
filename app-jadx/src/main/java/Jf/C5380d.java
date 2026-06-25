package jf;

import Ud.AbstractC2279u;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5380d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f51760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f51766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f51767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f51768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f51769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5380d f51771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5380d f51772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5380d f51773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5380d f51774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5380d f51775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5380d f51776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5380d f51777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5380d f51778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C5380d f51779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C5380d f51780x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List f51781y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f51782z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51784b;

    /* JADX INFO: renamed from: jf.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: jf.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0816a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f51785a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f51786b;

            public C0816a(int i10, String name) {
                AbstractC5504s.h(name, "name");
                this.f51785a = i10;
                this.f51786b = name;
            }

            public final int a() {
                return this.f51785a;
            }

            public final String b() {
                return this.f51786b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = C5380d.f51760d;
            C5380d.f51760d <<= 1;
            return i10;
        }

        public final int b() {
            return C5380d.f51767k;
        }

        public final int c() {
            return C5380d.f51768l;
        }

        public final int d() {
            return C5380d.f51765i;
        }

        public final int e() {
            return C5380d.f51761e;
        }

        public final int f() {
            return C5380d.f51764h;
        }

        public final int g() {
            return C5380d.f51762f;
        }

        public final int h() {
            return C5380d.f51763g;
        }

        public final int i() {
            return C5380d.f51766j;
        }

        private a() {
        }
    }

    static {
        a.C0816a c0816a;
        a.C0816a c0816a2;
        a aVar = new a(null);
        f51759c = aVar;
        f51760d = 1;
        int iJ = aVar.j();
        f51761e = iJ;
        int iJ2 = aVar.j();
        f51762f = iJ2;
        int iJ3 = aVar.j();
        f51763g = iJ3;
        int iJ4 = aVar.j();
        f51764h = iJ4;
        int iJ5 = aVar.j();
        f51765i = iJ5;
        int iJ6 = aVar.j();
        f51766j = iJ6;
        int iJ7 = aVar.j() - 1;
        f51767k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f51768l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f51769m = i11;
        int i12 = iJ5 | iJ6;
        f51770n = i12;
        int i13 = 2;
        f51771o = new C5380d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51772p = new C5380d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51773q = new C5380d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51774r = new C5380d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51775s = new C5380d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51776t = new C5380d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51777u = new C5380d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51778v = new C5380d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51779w = new C5380d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f51780x = new C5380d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = C5380d.class.getFields();
        AbstractC5504s.g(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C5380d c5380d = obj instanceof C5380d ? (C5380d) obj : null;
            if (c5380d != null) {
                int i14 = c5380d.f51784b;
                String name = field2.getName();
                AbstractC5504s.g(name, "getName(...)");
                c0816a2 = new a.C0816a(i14, name);
            } else {
                c0816a2 = null;
            }
            if (c0816a2 != null) {
                arrayList2.add(c0816a2);
            }
        }
        f51781y = arrayList2;
        Field[] fields2 = C5380d.class.getFields();
        AbstractC5504s.g(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC5504s.c(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC5504s.g(name2, "getName(...)");
                c0816a = new a.C0816a(iIntValue, name2);
            } else {
                c0816a = null;
            }
            if (c0816a != null) {
                arrayList5.add(c0816a);
            }
        }
        f51782z = arrayList5;
    }

    public C5380d(int i10, List excludes) {
        AbstractC5504s.h(excludes, "excludes");
        this.f51783a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC5379c) it.next()).a();
        }
        this.f51784b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f51784b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C5380d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C5380d c5380d = (C5380d) obj;
        return AbstractC5504s.c(this.f51783a, c5380d.f51783a) && this.f51784b == c5380d.f51784b;
    }

    public int hashCode() {
        return (this.f51783a.hashCode() * 31) + this.f51784b;
    }

    public final List l() {
        return this.f51783a;
    }

    public final int m() {
        return this.f51784b;
    }

    public final C5380d n(int i10) {
        int i11 = i10 & this.f51784b;
        if (i11 == 0) {
            return null;
        }
        return new C5380d(i11, this.f51783a);
    }

    public String toString() {
        Object next;
        Iterator it = f51781y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0816a) next).a() == this.f51784b) {
                break;
            }
        }
        a.C0816a c0816a = (a.C0816a) next;
        String strB = c0816a != null ? c0816a.b() : null;
        if (strB == null) {
            List<a.C0816a> list = f51782z;
            ArrayList arrayList = new ArrayList();
            for (a.C0816a c0816a2 : list) {
                String strB2 = a(c0816a2.a()) ? c0816a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = AbstractC2279u.w0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f51783a + ')';
    }

    public /* synthetic */ C5380d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? AbstractC2279u.m() : list);
    }
}
