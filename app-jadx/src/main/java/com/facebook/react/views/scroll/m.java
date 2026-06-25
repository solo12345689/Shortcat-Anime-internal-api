package com.facebook.react.views.scroll;

import Td.z;
import Ud.S;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38114a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollTo(obj, new c(Math.round(B.h(readableArray.getDouble(0))), Math.round(B.h(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        }

        private final void e(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollToEnd(obj, new d(readableArray.getBoolean(0)));
        }

        public final Map a() {
            return S.k(z.a("scrollTo", 1), z.a("scrollToEnd", 2), z.a("flashScrollIndicators", 3));
        }

        public final void b(b viewManager, Object obj, int i10, ReadableArray readableArray) {
            AbstractC5504s.h(viewManager, "viewManager");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (i10 == 1) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, obj, readableArray);
                return;
            }
            if (i10 == 2) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                e(viewManager, obj, readableArray);
            } else {
                if (i10 == 3) {
                    viewManager.flashScrollIndicators(obj);
                    return;
                }
                throw new IllegalArgumentException("Unsupported command " + i10 + " received by " + viewManager.getClass().getSimpleName() + ".");
            }
        }

        public final void c(b viewManager, Object obj, String commandType, ReadableArray readableArray) {
            AbstractC5504s.h(viewManager, "viewManager");
            AbstractC5504s.h(commandType, "commandType");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iHashCode = commandType.hashCode();
            if (iHashCode != -402165208) {
                if (iHashCode != 28425985) {
                    if (iHashCode == 2055114131 && commandType.equals("scrollToEnd")) {
                        if (readableArray == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        e(viewManager, obj, readableArray);
                        return;
                    }
                } else if (commandType.equals("flashScrollIndicators")) {
                    viewManager.flashScrollIndicators(obj);
                    return;
                }
            } else if (commandType.equals("scrollTo")) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, obj, readableArray);
                return;
            }
            throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, c cVar);

        void scrollToEnd(Object obj, d dVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f38117c;

        public c(int i10, int i11, boolean z10) {
            this.f38115a = i10;
            this.f38116b = i11;
            this.f38117c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f38118a;

        public d(boolean z10) {
            this.f38118a = z10;
        }
    }
}
