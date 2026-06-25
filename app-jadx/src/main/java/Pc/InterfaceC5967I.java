package pc;

import android.net.Uri;
import android.os.Bundle;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import jc.InterfaceC5364b;
import kotlin.Pair;
import pc.C5969K;

/* JADX INFO: renamed from: pc.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5967I {

    /* JADX INFO: renamed from: pc.I$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Uri uri = (Uri) obj;
            if (uri != null) {
                return AbstractC5968J.o(uri);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45867f;
        }
    }

    /* JADX INFO: renamed from: pc.I$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            return C5969K.b(C5969K.f55891a, obj, null, true, 2, null);
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45863b;
        }
    }

    /* JADX INFO: renamed from: pc.I$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr != null) {
                return AbstractC5968J.i(objArr, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45870i;
        }
    }

    /* JADX INFO: renamed from: pc.I$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr != null) {
                return AbstractC5968J.j(zArr, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45883v;
        }
    }

    /* JADX INFO: renamed from: pc.I$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                return AbstractC5968J.k(bundle, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45871j;
        }
    }

    /* JADX INFO: renamed from: pc.I$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return FollyDynamicExtensionConverter.INSTANCE.put(bArr);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45867f;
        }
    }

    /* JADX INFO: renamed from: pc.I$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Collection collection = (Collection) obj;
            if (collection != null) {
                return AbstractC5968J.s(collection);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45878q;
        }
    }

    /* JADX INFO: renamed from: pc.I$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            double[] dArr = (double[]) obj;
            if (dArr != null) {
                return AbstractC5968J.e(dArr, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45879r;
        }
    }

    /* JADX INFO: renamed from: pc.I$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Ef.a aVar = (Ef.a) obj;
            if (aVar != null) {
                return Double.valueOf(Ef.a.N(aVar.S(), Ef.d.f5971e));
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45864c;
        }
    }

    /* JADX INFO: renamed from: pc.I$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Enum r12 = (Enum) obj;
            if (r12 != null) {
                return AbstractC5968J.n(r12);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45863b;
        }
    }

    /* JADX INFO: renamed from: pc.I$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            File file = (File) obj;
            if (file != null) {
                return AbstractC5968J.p(file);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45867f;
        }
    }

    /* JADX INFO: renamed from: pc.I$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            float[] fArr = (float[]) obj;
            if (fArr != null) {
                return AbstractC5968J.f(fArr, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45882u;
        }
    }

    /* JADX INFO: renamed from: pc.I$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45877p;
        }
    }

    /* JADX INFO: renamed from: pc.I$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                return AbstractC5968J.g(iArr, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45880s;
        }
    }

    /* JADX INFO: renamed from: pc.I$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            if (((Long) obj) != null) {
                return Double.valueOf(r3.longValue());
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45866e;
        }
    }

    /* JADX INFO: renamed from: pc.I$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                return AbstractC5968J.u(map);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45877p;
        }
    }

    /* JADX INFO: renamed from: pc.I$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            Pair pair = (Pair) obj;
            if (pair != null) {
                return AbstractC5968J.d(pair, C5969K.b.f55892a);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45870i;
        }
    }

    /* JADX INFO: renamed from: pc.I$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            oc.i iVar = (oc.i) obj;
            if (iVar != null) {
                return iVar.b();
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45874m;
        }
    }

    /* JADX INFO: renamed from: pc.I$t */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            InterfaceC5364b interfaceC5364b = (InterfaceC5364b) obj;
            if (interfaceC5364b != null) {
                return AbstractC5968J.v(interfaceC5364b);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45877p;
        }
    }

    /* JADX INFO: renamed from: pc.I$u */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            URI uri = (URI) obj;
            if (uri != null) {
                return AbstractC5968J.q(uri);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45867f;
        }
    }

    /* JADX INFO: renamed from: pc.I$v */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            URL url = (URL) obj;
            if (url != null) {
                return AbstractC5968J.r(url);
            }
            return null;
        }

        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45867f;
        }
    }

    Object a(Object obj);

    ec.i getReturnType();

    /* JADX INFO: renamed from: pc.I$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements InterfaceC5967I {
        @Override // pc.InterfaceC5967I
        public ec.i getReturnType() {
            return ec.i.f45863b;
        }

        @Override // pc.InterfaceC5967I
        public Object a(Object obj) {
            return obj;
        }
    }
}
