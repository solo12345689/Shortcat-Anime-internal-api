package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: e */
    public static final a f24195e = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f24196a;

    /* JADX INFO: renamed from: b */
    private final int f24197b;

    /* JADX INFO: renamed from: c */
    private final int f24198c;

    /* JADX INFO: renamed from: d */
    private final Function1 f24199d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: androidx.activity.M$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0421a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final C0421a f24200a = new C0421a();

            C0421a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public final Boolean invoke(Resources resources) {
                AbstractC5504s.h(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ M b(a aVar, int i10, int i11, Function1 function1, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                function1 = C0421a.f24200a;
            }
            return aVar.a(i10, i11, function1);
        }

        public final M a(int i10, int i11, Function1 detectDarkMode) {
            AbstractC5504s.h(detectDarkMode, "detectDarkMode");
            return new M(i10, i11, 0, detectDarkMode, null);
        }

        private a() {
        }
    }

    public /* synthetic */ M(int i10, int i11, int i12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, function1);
    }

    public final int a() {
        return this.f24197b;
    }

    public final Function1 b() {
        return this.f24199d;
    }

    public final int c() {
        return this.f24198c;
    }

    public final int d(boolean z10) {
        return z10 ? this.f24197b : this.f24196a;
    }

    public final int e(boolean z10) {
        if (this.f24198c == 0) {
            return 0;
        }
        return z10 ? this.f24197b : this.f24196a;
    }

    private M(int i10, int i11, int i12, Function1 function1) {
        this.f24196a = i10;
        this.f24197b = i11;
        this.f24198c = i12;
        this.f24199d = function1;
    }
}
