package expo.modules.kotlin.jni;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/kotlin/jni/JNIUtils;", "", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class JNIUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: expo.modules.kotlin.jni.JNIUtils$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(JavaScriptModuleObject_ javaScriptModuleObject_, JSIContext jSIContext, String str, Map map) {
            JNIUtils.emitEvent(javaScriptModuleObject_, jSIContext, str, (Map<String, ? extends Object>) map);
        }

        public final void b(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr) {
            JNIUtils.emitEvent(javaScriptWeakObject, jSIContext, str, objArr);
        }

        private Companion() {
        }
    }

    public static final native void emitEvent(JavaScriptModuleObject_ javaScriptModuleObject_, JSIContext jSIContext, String str, Map<String, ? extends Object> map);

    public static final native void emitEvent(JavaScriptObject javaScriptObject, JSIContext jSIContext, String str, Object[] objArr);

    public static final native void emitEvent(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr);
}
