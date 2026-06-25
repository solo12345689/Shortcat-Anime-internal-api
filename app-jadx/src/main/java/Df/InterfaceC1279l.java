package Df;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: renamed from: Df.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1279l {

    /* JADX INFO: renamed from: Df.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static b a(InterfaceC1279l interfaceC1279l) {
            return new b(interfaceC1279l);
        }
    }

    /* JADX INFO: renamed from: Df.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1279l f3774a;

        public b(InterfaceC1279l match) {
            AbstractC5504s.h(match, "match");
            this.f3774a = match;
        }

        public final InterfaceC1279l a() {
            return this.f3774a;
        }
    }

    b a();

    List b();

    C5870f c();

    String getValue();

    InterfaceC1279l next();
}
