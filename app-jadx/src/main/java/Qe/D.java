package Qe;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface D {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14803a = new a();

        private a() {
        }

        @Override // Qe.D
        public List a(String packageFqName) {
            AbstractC5504s.h(packageFqName, "packageFqName");
            return AbstractC2279u.m();
        }
    }

    List a(String str);
}
