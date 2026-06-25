package J7;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.revenuecat.purchases.common.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9452a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f9453b = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private c() {
    }

    public static final String a(String message, ReadableArray stack) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(stack, "stack");
        StringBuilder sb2 = new StringBuilder(message);
        sb2.append(", stack:\n");
        int size = stack.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = stack.getMap(i10);
            if (map != null) {
                sb2.append(map.getString("methodName"));
                sb2.append("@");
                sb2.append(f9452a.b(map));
                if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                    sb2.append(map.getInt("lineNumber"));
                } else {
                    sb2.append(-1);
                }
                if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb2.append(map.getInt("column"));
                }
                sb2.append("\n");
            }
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    private final String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f9453b.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
    }
}
