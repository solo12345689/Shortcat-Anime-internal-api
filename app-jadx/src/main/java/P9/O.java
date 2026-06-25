package P9;

import P9.AbstractC2012v;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O extends AbstractC2012v {

    /* JADX INFO: renamed from: h */
    static final AbstractC2012v f13601h = new O(null, new Object[0], 0);

    /* JADX INFO: renamed from: e */
    private final transient Object f13602e;

    /* JADX INFO: renamed from: f */
    final transient Object[] f13603f;

    /* JADX INFO: renamed from: g */
    private final transient int f13604g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends AbstractC2013w {

        /* JADX INFO: renamed from: c */
        private final transient AbstractC2012v f13605c;

        /* JADX INFO: renamed from: d */
        private final transient Object[] f13606d;

        /* JADX INFO: renamed from: e */
        private final transient int f13607e;

        /* JADX INFO: renamed from: f */
        private final transient int f13608f;

        /* JADX INFO: renamed from: P9.O$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0221a extends AbstractC2011u {
            C0221a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: P */
            public Map.Entry get(int i10) {
                O9.n.h(i10, a.this.f13608f);
                int i11 = i10 * 2;
                Object obj = a.this.f13606d[a.this.f13607e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f13606d[i11 + (a.this.f13607e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // P9.AbstractC2009s
            public boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f13608f;
            }
        }

        a(AbstractC2012v abstractC2012v, Object[] objArr, int i10, int i11) {
            this.f13605c = abstractC2012v;
            this.f13606d = objArr;
            this.f13607e = i10;
            this.f13608f = i11;
        }

        @Override // P9.AbstractC2009s
        int c(Object[] objArr, int i10) {
            return b().c(objArr, i10);
        }

        @Override // P9.AbstractC2009s, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f13605c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // P9.AbstractC2009s
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: l */
        public X iterator() {
            return b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f13608f;
        }

        @Override // P9.AbstractC2013w
        AbstractC2011u x() {
            return new C0221a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC2013w {

        /* JADX INFO: renamed from: c */
        private final transient AbstractC2012v f13610c;

        /* JADX INFO: renamed from: d */
        private final transient AbstractC2011u f13611d;

        b(AbstractC2012v abstractC2012v, AbstractC2011u abstractC2011u) {
            this.f13610c = abstractC2012v;
            this.f13611d = abstractC2011u;
        }

        @Override // P9.AbstractC2013w, P9.AbstractC2009s
        public AbstractC2011u b() {
            return this.f13611d;
        }

        @Override // P9.AbstractC2009s
        int c(Object[] objArr, int i10) {
            return b().c(objArr, i10);
        }

        @Override // P9.AbstractC2009s, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f13610c.get(obj) != null;
        }

        @Override // P9.AbstractC2009s
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: l */
        public X iterator() {
            return b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f13610c.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC2011u {

        /* JADX INFO: renamed from: c */
        private final transient Object[] f13612c;

        /* JADX INFO: renamed from: d */
        private final transient int f13613d;

        /* JADX INFO: renamed from: e */
        private final transient int f13614e;

        c(Object[] objArr, int i10, int i11) {
            this.f13612c = objArr;
            this.f13613d = i10;
            this.f13614e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            O9.n.h(i10, this.f13614e);
            Object obj = this.f13612c[(i10 * 2) + this.f13613d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // P9.AbstractC2009s
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13614e;
        }
    }

    private O(Object obj, Object[] objArr, int i10) {
        this.f13602e = obj;
        this.f13603f = objArr;
        this.f13604g = i10;
    }

    static O q(int i10, Object[] objArr) {
        return t(i10, objArr, null);
    }

    static O t(int i10, Object[] objArr, AbstractC2012v.a aVar) {
        if (i10 == 0) {
            return (O) f13601h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC1999h.a(obj, obj2);
            return new O(null, objArr, 1);
        }
        O9.n.m(i10, objArr.length >> 1);
        Object objU = u(objArr, i10, AbstractC2013w.t(i10), 0);
        if (objU instanceof Object[]) {
            Object[] objArr2 = (Object[]) objU;
            AbstractC2012v.a.C0224a c0224a = (AbstractC2012v.a.C0224a) objArr2[2];
            if (aVar == null) {
                throw c0224a.a();
            }
            aVar.f13737e = c0224a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objU = obj3;
            i10 = iIntValue;
        }
        return new O(objU, objArr, i10);
    }

    private static Object u(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        AbstractC2012v.a.C0224a c0224a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC1999h.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC1999h.a(obj3, obj4);
                int iB = AbstractC2008q.b(obj3.hashCode());
                while (true) {
                    int i20 = iB & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                    } else {
                        if (obj3.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj5 = objArr[i22];
                            Objects.requireNonNull(obj5);
                            c0224a = new AbstractC2012v.a.C0224a(obj3, obj4, obj5);
                            objArr[i22] = obj4;
                            break;
                        }
                        iB = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0224a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC1999h.a(obj6, obj7);
                int iB2 = AbstractC2008q.b(obj6.hashCode());
                while (true) {
                    int i27 = iB2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                    } else {
                        if (obj6.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj8 = objArr[i29];
                            Objects.requireNonNull(obj8);
                            c0224a = new AbstractC2012v.a.C0224a(obj6, obj7, obj8);
                            objArr[i29] = obj7;
                            break;
                        }
                        iB2 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0224a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            AbstractC1999h.a(obj9, obj10);
            int iB3 = AbstractC2008q.b(obj9.hashCode());
            while (true) {
                int i34 = iB3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj9.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = objArr[i36];
                        Objects.requireNonNull(obj11);
                        c0224a = new AbstractC2012v.a.C0224a(obj9, obj10, obj11);
                        objArr[i36] = obj10;
                        break;
                    }
                    iB3 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0224a;
        return objArr2;
    }

    static Object v(Object[] objArr, int i10, int i11, int i12) {
        Object objU = u(objArr, i10, i11, i12);
        if (objU instanceof Object[]) {
            throw ((AbstractC2012v.a.C0224a) ((Object[]) objU)[2]).a();
        }
        return objU;
    }

    static Object w(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC2008q.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC2008q.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC2008q.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // P9.AbstractC2012v
    AbstractC2013w e() {
        return new a(this, this.f13603f, 0, this.f13604g);
    }

    @Override // P9.AbstractC2012v
    AbstractC2013w f() {
        return new b(this, new c(this.f13603f, 0, this.f13604g));
    }

    @Override // P9.AbstractC2012v
    AbstractC2009s g() {
        return new c(this.f13603f, 1, this.f13604g);
    }

    @Override // P9.AbstractC2012v, java.util.Map
    public Object get(Object obj) {
        Object objW = w(this.f13602e, this.f13603f, this.f13604g, 0, obj);
        if (objW == null) {
            return null;
        }
        return objW;
    }

    @Override // P9.AbstractC2012v
    boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f13604g;
    }
}
