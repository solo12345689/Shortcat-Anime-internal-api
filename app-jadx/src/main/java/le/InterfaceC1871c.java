package Le;

import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Le.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1871c {

    /* JADX INFO: renamed from: Le.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1871c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11478a = new a();

        private a() {
        }

        @Override // Le.InterfaceC1871c
        public Set a() {
            return Ud.a0.d();
        }

        @Override // Le.InterfaceC1871c
        public Oe.w b(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return null;
        }

        @Override // Le.InterfaceC1871c
        public Set d() {
            return Ud.a0.d();
        }

        @Override // Le.InterfaceC1871c
        public Set e() {
            return Ud.a0.d();
        }

        @Override // Le.InterfaceC1871c
        public Oe.n f(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return null;
        }

        @Override // Le.InterfaceC1871c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List c(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return AbstractC2279u.m();
        }
    }

    Set a();

    Oe.w b(Xe.f fVar);

    Collection c(Xe.f fVar);

    Set d();

    Set e();

    Oe.n f(Xe.f fVar);
}
