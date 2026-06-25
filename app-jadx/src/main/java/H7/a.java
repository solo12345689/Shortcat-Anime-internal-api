package H7;

import android.content.Context;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0102a f8019b = new C0102a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f8020a;

    /* JADX INFO: renamed from: H7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0102a {
        public /* synthetic */ C0102a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final r b(ReadableMap readableMap, Context context) {
            if (readableMap.hasKey("type") && readableMap.getType("type") == ReadableType.String) {
                String string = readableMap.getString("type");
                if (AbstractC5504s.c(string, "linear-gradient")) {
                    return s.f8100c.a(readableMap, context);
                }
                if (AbstractC5504s.c(string, "radial-gradient")) {
                    return x.f8143e.a(readableMap, context);
                }
            }
            return null;
        }

        public final a a(ReadableMap readableMap, Context context) {
            r rVarB;
            AbstractC5504s.h(context, "context");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (readableMap == null || (rVarB = b(readableMap, context)) == null) {
                return null;
            }
            return new a(rVarB, defaultConstructorMarker);
        }

        private C0102a() {
        }
    }

    public /* synthetic */ a(r rVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar);
    }

    public final Shader a(float f10, float f11) {
        r rVar = this.f8020a;
        if (rVar == null) {
            AbstractC5504s.u("gradient");
            rVar = null;
        }
        return rVar.a(f10, f11);
    }

    public a() {
    }

    private a(r rVar) {
        this();
        this.f8020a = rVar;
    }
}
