package X6;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21660c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f21661d = {"", "_bold", "_italic", "_bold_italic"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f21662e = {".ttf", ".otf"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f21663f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21664a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21665b = new LinkedHashMap();

    /* JADX INFO: renamed from: X6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0373a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f21666a = new SparseArray(4);

        public final Typeface a(int i10) {
            return (Typeface) this.f21666a.get(i10);
        }

        public final void b(int i10, Typeface typeface) {
            this.f21666a.put(i10, typeface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface b(String str, int i10, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = a.f21661d[i10];
                for (String str3 : a.f21662e) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                        AbstractC5504s.g(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(str, i10);
            AbstractC5504s.g(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        public final a c() {
            return a.f21663f;
        }

        private b() {
        }
    }

    public final Typeface d(String fontFamilyName, int i10, AssetManager assetManager) {
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        return f(fontFamilyName, new c(i10, 0, 2, null), assetManager);
    }

    public final Typeface e(String fontFamilyName, int i10, boolean z10, AssetManager assetManager) {
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        return f(fontFamilyName, new c(i10, z10), assetManager);
    }

    public final Typeface f(String fontFamilyName, c typefaceStyle, AssetManager assetManager) {
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        AbstractC5504s.h(typefaceStyle, "typefaceStyle");
        if (this.f21665b.containsKey(fontFamilyName)) {
            return typefaceStyle.a((Typeface) this.f21665b.get(fontFamilyName));
        }
        Map map = this.f21664a;
        Object c0373a = map.get(fontFamilyName);
        if (c0373a == null) {
            c0373a = new C0373a();
            map.put(fontFamilyName, c0373a);
        }
        C0373a c0373a2 = (C0373a) c0373a;
        int iB = typefaceStyle.b();
        Typeface typefaceA = c0373a2.a(iB);
        if (typefaceA != null) {
            return typefaceA;
        }
        Typeface typefaceB = f21660c.b(fontFamilyName, iB, assetManager);
        c0373a2.b(iB, typefaceB);
        return typefaceB;
    }

    public final void g(String fontFamilyName, int i10, Typeface typeface) {
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        if (typeface != null) {
            Map map = this.f21664a;
            Object c0373a = map.get(fontFamilyName);
            if (c0373a == null) {
                c0373a = new C0373a();
                map.put(fontFamilyName, c0373a);
            }
            ((C0373a) c0373a).b(i10, typeface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0374a f21667c = new C0374a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f21668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21669b;

        /* JADX INFO: renamed from: X6.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0374a {
            public /* synthetic */ C0374a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0374a() {
            }
        }

        public c(int i10, boolean z10) {
            this.f21668a = z10;
            this.f21669b = i10 == -1 ? 400 : i10;
        }

        public final Typeface a(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, b());
                AbstractC5504s.e(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.f21669b, this.f21668a);
            AbstractC5504s.e(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int b() {
            return this.f21669b < 700 ? this.f21668a ? 2 : 0 : this.f21668a ? 3 : 1;
        }

        public /* synthetic */ c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? -1 : i11);
        }

        public c(int i10, int i11) {
            i10 = i10 == -1 ? 0 : i10;
            this.f21668a = (i10 & 2) != 0;
            this.f21669b = i11 == -1 ? (i10 & 1) != 0 ? ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD : 400 : i11;
        }
    }
}
