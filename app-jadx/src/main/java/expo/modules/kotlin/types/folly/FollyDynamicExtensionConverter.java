package expo.modules.kotlin.types.folly;

import Df.r;
import android.util.ArrayMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.C6169a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;", "", "<init>", "()V", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FollyDynamicExtensionConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayMap f46200b = new ArrayMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f46201c;

    /* JADX INFO: renamed from: expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized Object get(String payload) {
            String strSubstring;
            AbstractC5504s.h(payload, "payload");
            if (!r.Q(payload, "__expo_dynamic_extension__#", false, 2, null)) {
                throw new C6169a();
            }
            strSubstring = payload.substring(27);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return FollyDynamicExtensionConverter.f46200b.remove(Integer.valueOf(Integer.parseInt(strSubstring)));
        }

        public final synchronized String put(Object any) {
            int i10;
            AbstractC5504s.h(any, "any");
            i10 = FollyDynamicExtensionConverter.f46201c;
            FollyDynamicExtensionConverter.f46201c = i10 + 1;
            FollyDynamicExtensionConverter.f46200b.put(Integer.valueOf(i10), any);
            return "__expo_dynamic_extension__#" + i10;
        }

        private Companion() {
        }
    }

    public static final synchronized Object get(String str) {
        return INSTANCE.get(str);
    }

    public static final synchronized String put(Object obj) {
        return INSTANCE.put(obj);
    }
}
