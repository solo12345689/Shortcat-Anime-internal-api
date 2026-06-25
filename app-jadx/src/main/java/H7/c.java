package H7;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8026c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f8027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f8028b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final d b(ReadableMap readableMap, String str) {
            String string;
            if (readableMap.hasKey(str) && readableMap.getType(str) == ReadableType.String && (string = readableMap.getString(str)) != null) {
                switch (string.hashCode()) {
                    case -934531685:
                        if (string.equals("repeat")) {
                            return d.f8029a;
                        }
                        break;
                    case -724648153:
                        if (string.equals("no-repeat")) {
                            return d.f8032d;
                        }
                        break;
                    case 108704142:
                        if (string.equals("round")) {
                            return d.f8031c;
                        }
                        break;
                    case 109637894:
                        if (string.equals("space")) {
                            return d.f8030b;
                        }
                        break;
                }
            }
            return null;
        }

        public final c a(ReadableMap readableMap) {
            if (readableMap == null) {
                return null;
            }
            d dVarB = b(readableMap, "x");
            if (dVarB == null) {
                dVarB = d.f8029a;
            }
            d dVarB2 = b(readableMap, "y");
            if (dVarB2 == null) {
                dVarB2 = d.f8029a;
            }
            return new c(dVarB, dVarB2);
        }

        private a() {
        }
    }

    public c(d x10, d y10) {
        AbstractC5504s.h(x10, "x");
        AbstractC5504s.h(y10, "y");
        this.f8027a = x10;
        this.f8028b = y10;
    }

    public final d a() {
        return this.f8027a;
    }

    public final d b() {
        return this.f8028b;
    }
}
