package pc;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import jc.InterfaceC5364b;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.K */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5969K {

    /* JADX INFO: renamed from: a */
    public static final C5969K f55891a = new C5969K();

    /* JADX INFO: renamed from: pc.K$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        WritableArray a();

        WritableMap b();
    }

    /* JADX INFO: renamed from: pc.K$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public static final b f55892a = new b();

        private b() {
        }

        @Override // pc.C5969K.a
        public WritableArray a() {
            return Arguments.createArray();
        }

        @Override // pc.C5969K.a
        public WritableMap b() {
            return Arguments.createMap();
        }
    }

    private C5969K() {
    }

    public static /* synthetic */ Object b(C5969K c5969k, Object obj, a aVar, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = b.f55892a;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c5969k.a(obj, aVar, z10);
    }

    public static /* synthetic */ Object d(C5969K c5969k, Object obj, a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = b.f55892a;
        }
        return c5969k.c(obj, aVar);
    }

    public final Object a(Object obj, a containerProvider, boolean z10) {
        AbstractC5504s.h(containerProvider, "containerProvider");
        if (obj == null || (obj instanceof Td.L)) {
            return null;
        }
        return obj instanceof Bundle ? AbstractC5968J.k((Bundle) obj, containerProvider) : obj instanceof Object[] ? AbstractC5968J.i((Object[]) obj, containerProvider) : ((obj instanceof int[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof long[])) ? obj : obj instanceof byte[] ? FollyDynamicExtensionConverter.INSTANCE.put(obj) : obj instanceof Map ? z10 ? AbstractC5968J.u((Map) obj) : AbstractC5968J.l((Map) obj, containerProvider) : obj instanceof Enum ? AbstractC5968J.n((Enum) obj) : obj instanceof InterfaceC5364b ? AbstractC5968J.m((InterfaceC5364b) obj, containerProvider) : obj instanceof URI ? AbstractC5968J.q((URI) obj) : obj instanceof URL ? AbstractC5968J.r((URL) obj) : obj instanceof Uri ? AbstractC5968J.o((Uri) obj) : obj instanceof File ? AbstractC5968J.p((File) obj) : obj instanceof Pair ? AbstractC5968J.d((Pair) obj, containerProvider) : obj instanceof Long ? Double.valueOf(((Number) obj).longValue()) : obj instanceof Ef.a ? Double.valueOf(Ef.a.N(((Ef.a) obj).S(), Ef.d.f5971e)) : obj instanceof oc.i ? ((oc.i) obj).b() : obj instanceof Collection ? z10 ? AbstractC5968J.s((Collection) obj) : AbstractC5968J.c((Collection) obj, containerProvider) : obj;
    }

    public final Object c(Object obj, a containerProvider) {
        AbstractC5504s.h(containerProvider, "containerProvider");
        if (obj == null || (obj instanceof Td.L)) {
            return null;
        }
        return obj instanceof Bundle ? AbstractC5968J.k((Bundle) obj, containerProvider) : obj instanceof Object[] ? AbstractC5968J.i((Object[]) obj, containerProvider) : obj instanceof int[] ? AbstractC5968J.g((int[]) obj, containerProvider) : obj instanceof long[] ? AbstractC5968J.h((long[]) obj, containerProvider) : obj instanceof float[] ? AbstractC5968J.f((float[]) obj, containerProvider) : obj instanceof double[] ? AbstractC5968J.e((double[]) obj, containerProvider) : obj instanceof boolean[] ? AbstractC5968J.j((boolean[]) obj, containerProvider) : obj instanceof byte[] ? FollyDynamicExtensionConverter.INSTANCE.put(obj) : obj instanceof Map ? AbstractC5968J.l((Map) obj, containerProvider) : obj instanceof Enum ? AbstractC5968J.n((Enum) obj) : obj instanceof InterfaceC5364b ? AbstractC5968J.m((InterfaceC5364b) obj, containerProvider) : obj instanceof URI ? AbstractC5968J.q((URI) obj) : obj instanceof URL ? AbstractC5968J.r((URL) obj) : obj instanceof Uri ? AbstractC5968J.o((Uri) obj) : obj instanceof File ? AbstractC5968J.p((File) obj) : obj instanceof Pair ? AbstractC5968J.d((Pair) obj, containerProvider) : obj instanceof Long ? Double.valueOf(((Number) obj).longValue()) : obj instanceof Ef.a ? Double.valueOf(Ef.a.N(((Ef.a) obj).S(), Ef.d.f5971e)) : obj instanceof oc.i ? ((oc.i) obj).b() : obj instanceof Collection ? AbstractC5968J.c((Collection) obj, containerProvider) : obj;
    }
}
