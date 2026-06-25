package xf;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: xf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC7160l {

    /* JADX INFO: renamed from: xf.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC7160l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64495a = new a();

        private a() {
        }

        @Override // xf.InterfaceC7160l
        public boolean a(InterfaceC7235m what, InterfaceC7235m from) {
            AbstractC5504s.h(what, "what");
            AbstractC5504s.h(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2);
}
