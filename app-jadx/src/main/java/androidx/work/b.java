package androidx.work;

import android.util.Log;
import i4.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32689b = i.i("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f32690c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f32691a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f32692a = new HashMap();

        public b a() throws Throwable {
            b bVar = new b(this.f32692a);
            b.o(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f32692a.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f32692a.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.f32692a.put(str, b.a((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.f32692a.put(str, b.b((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.f32692a.put(str, b.e((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.f32692a.put(str, b.f((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.f32692a.put(str, b.d((float[]) obj));
                return this;
            }
            if (cls == double[].class) {
                this.f32692a.put(str, b.c((double[]) obj));
                return this;
            }
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }

        public a c(b bVar) {
            d(bVar.f32691a);
            return this;
        }

        public a d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, boolean z10) {
            this.f32692a.put(str, Boolean.valueOf(z10));
            return this;
        }

        public a f(String str, int i10) {
            this.f32692a.put(str, Integer.valueOf(i10));
            return this;
        }

        public a g(String str, String str2) {
            this.f32692a.put(str, str2);
            return this;
        }
    }

    public b(b bVar) {
        this.f32691a = new HashMap(bVar.f32691a);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static byte[] g(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0031 A[EXC_TOP_SPLITTER, PHI: r3
  0x0031: PHI (r3v8 java.io.ObjectInputStream) = (r3v7 java.io.ObjectInputStream), (r3v10 java.io.ObjectInputStream) binds: [B:31:0x0056, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.b h(byte[] r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L76
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
        L1b:
            if (r7 <= 0) goto L31
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r7 = move-exception
            goto L5f
        L2d:
            r7 = move-exception
            goto L51
        L2f:
            r7 = move-exception
            goto L51
        L31:
            r3.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f32689b
            android.util.Log.e(r3, r0, r7)
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L59
        L3f:
            r7 = move-exception
            java.lang.String r2 = androidx.work.b.f32689b
            android.util.Log.e(r2, r0, r7)
            goto L59
        L46:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L5f
        L4a:
            r3 = move-exception
        L4b:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L51
        L4f:
            r3 = move-exception
            goto L4b
        L51:
            java.lang.String r4 = androidx.work.b.f32689b     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L3b
            goto L31
        L59:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L5f:
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.io.IOException -> L65
            goto L6b
        L65:
            r1 = move-exception
            java.lang.String r3 = androidx.work.b.f32689b
            android.util.Log.e(r3, r0, r1)
        L6b:
            r2.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r2 = androidx.work.b.f32689b
            android.util.Log.e(r2, r0, r1)
        L75:
            throw r7
        L76:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.h(byte[]):androidx.work.b");
    }

    public static byte[] o(b bVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(bVar.n());
                    for (Map.Entry entry : bVar.f32691a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f32689b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f32689b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f32689b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f32689b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f32689b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f32689b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f32689b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> setKeySet = this.f32691a.keySet();
        if (!setKeySet.equals(bVar.f32691a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f32691a.get(str);
            Object obj3 = bVar.f32691a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f32691a.hashCode() * 31;
    }

    public boolean i(String str, boolean z10) {
        Object obj = this.f32691a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public byte[] j(String str) {
        Object obj = this.f32691a.get(str);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public int k(String str, int i10) {
        Object obj = this.f32691a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    public Map l() {
        return Collections.unmodifiableMap(this.f32691a);
    }

    public String m(String str) {
        Object obj = this.f32691a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int n() {
        return this.f32691a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f32691a.isEmpty()) {
            for (String str : this.f32691a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f32691a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public b(Map map) {
        this.f32691a = new HashMap(map);
    }
}
