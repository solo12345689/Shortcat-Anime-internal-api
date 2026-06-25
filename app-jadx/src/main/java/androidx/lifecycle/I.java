package androidx.lifecycle;

import P3.f;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import k2.C5439b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30165c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C5439b f30167b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new I();
            }
            ClassLoader classLoader = I.class.getClassLoader();
            AbstractC5504s.e(classLoader);
            bundle.setClassLoader(classLoader);
            return new I(P3.c.g(P3.c.a(bundle)));
        }

        private a() {
        }
    }

    public I(Map initialState) {
        AbstractC5504s.h(initialState, "initialState");
        this.f30166a = new LinkedHashMap();
        this.f30167b = new C5439b(initialState);
    }

    public final f.b a() {
        return this.f30167b.b();
    }

    public I() {
        this.f30166a = new LinkedHashMap();
        this.f30167b = new C5439b(null, 1, null);
    }
}
