package V4;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f19762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f19763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f19764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f19765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f19766h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f19767a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f19768b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19769c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19770a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f19770a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19770a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19770a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19770a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f19771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f19773c;

        public b(c cVar) {
            this.f19771a = cVar;
        }

        @Override // V4.l
        public void a() {
            this.f19771a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f19772b = i10;
            this.f19773c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f19772b == bVar.f19772b && o5.l.e(this.f19773c, bVar.f19773c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f19772b * 31;
            Bitmap.Config config = this.f19773c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f19772b, this.f19773c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends V4.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // V4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f19762d = configArr;
        f19763e = configArr;
        f19764f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f19765g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f19766h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private V4.m.b g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            V4.m$c r0 = r8.f19767a
            V4.m$b r0 = r0.e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.j(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            V4.m$c r9 = r8.f19767a
            r9.c(r0)
            V4.m$c r9 = r8.f19767a
            int r10 = r5.intValue()
            V4.m$b r9 = r9.e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.m.g(int, android.graphics.Bitmap$Config):V4.m$b");
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f19763e;
        }
        int i10 = a.f19770a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f19766h : f19765g : f19764f : f19762d;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f19769c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f19769c.put(config, treeMap);
        return treeMap;
    }

    @Override // V4.k
    public String a(Bitmap bitmap) {
        return h(o5.l.i(bitmap), bitmap.getConfig());
    }

    @Override // V4.k
    public String b(int i10, int i11, Bitmap.Config config) {
        return h(o5.l.h(i10, i11, config), config);
    }

    @Override // V4.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f19767a.e(o5.l.i(bitmap), bitmap.getConfig());
        this.f19768b.d(bVarE, bitmap);
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f19772b));
        navigableMapJ.put(Integer.valueOf(bVarE.f19772b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // V4.k
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(o5.l.h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f19768b.a(bVarG);
        if (bitmap != null) {
            f(Integer.valueOf(bVarG.f19772b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // V4.k
    public int e(Bitmap bitmap) {
        return o5.l.i(bitmap);
    }

    @Override // V4.k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f19768b.f();
        if (bitmap != null) {
            f(Integer.valueOf(o5.l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f19768b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f19769c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f19769c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
