package io.invertase.firebase.messaging;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public static Pd.b a(String str, Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("messageId", str);
        writableMapCreateMap.putMap(LogEvent.LEVEL_ERROR, Pd.m.b(exc));
        return new Pd.b("messaging_message_send_error", writableMapCreateMap);
    }

    public static Pd.b b(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("messageId", str);
        return new Pd.b("messaging_message_sent", writableMapCreateMap);
    }

    public static Pd.b c() {
        return new Pd.b("messaging_message_deleted", Arguments.createMap());
    }

    public static Pd.b d(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("token", str);
        return new Pd.b("messaging_token_refresh", writableMapCreateMap);
    }

    static W e(ReadableMap readableMap) {
        W.b bVar = new W.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.f(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.d(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.e(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.c(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey("data")) {
            ReadableMap map = readableMap.getMap("data");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                bVar.a(strNextKey, map.getString(strNextKey));
            }
        }
        return bVar.b();
    }

    public static Pd.b f(WritableMap writableMap, Boolean bool) {
        return new Pd.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", writableMap);
    }

    static WritableMap g(W.c cVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (cVar.w() != null) {
            writableMapCreateMap.putString(com.amazon.a.a.o.b.f34626S, cVar.w());
        }
        if (cVar.y() != null) {
            writableMapCreateMap.putString("titleLocKey", cVar.y());
        }
        if (cVar.x() != null) {
            writableMapCreateMap.putArray("titleLocArgs", Arguments.fromJavaArgs((Object[]) cVar.x()));
        }
        if (cVar.a() != null) {
            writableMapCreateMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            writableMapCreateMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            writableMapCreateMap.putArray("bodyLocArgs", Arguments.fromJavaArgs((Object[]) cVar.b()));
        }
        if (cVar.d() != null) {
            writableMapCreateMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            writableMapCreateMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            writableMapCreateMap2.putString("color", cVar.f());
        }
        if (cVar.k() != null) {
            writableMapCreateMap2.putString("smallIcon", cVar.k());
        }
        if (cVar.l() != null) {
            writableMapCreateMap2.putString("imageUrl", cVar.l().toString());
        }
        if (cVar.n() != null) {
            writableMapCreateMap2.putString("link", cVar.n().toString());
        }
        if (cVar.q() != null) {
            writableMapCreateMap2.putInt("count", cVar.q().intValue());
        }
        if (cVar.r() != null) {
            writableMapCreateMap2.putInt("priority", cVar.r().intValue());
        }
        if (cVar.s() != null) {
            writableMapCreateMap2.putString("sound", cVar.s());
        }
        if (cVar.v() != null) {
            writableMapCreateMap2.putString("ticker", cVar.v());
        }
        if (cVar.A() != null) {
            writableMapCreateMap2.putInt("visibility", cVar.A().intValue());
        }
        writableMapCreateMap.putMap("android", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public static Pd.b h(W w10, Boolean bool) {
        return new Pd.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", i(w10));
    }

    static WritableMap i(W w10) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (w10.c() != null) {
            writableMapCreateMap.putString("collapseKey", w10.c());
        }
        if (w10.e() != null) {
            writableMapCreateMap.putString("from", w10.e());
        }
        if (w10.y() != null) {
            writableMapCreateMap.putString("to", w10.y());
        }
        if (w10.f() != null) {
            writableMapCreateMap.putString("messageId", w10.f());
        }
        if (w10.l() != null) {
            writableMapCreateMap.putString("messageType", w10.l());
        }
        if (w10.d().size() > 0) {
            for (Map.Entry entry : w10.d().entrySet()) {
                writableMapCreateMap2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        writableMapCreateMap.putMap("data", writableMapCreateMap2);
        writableMapCreateMap.putDouble("ttl", w10.z());
        writableMapCreateMap.putDouble("sentTime", w10.x());
        writableMapCreateMap.putInt("priority", w10.w());
        writableMapCreateMap.putInt("originalPriority", w10.s());
        if (w10.r() != null) {
            writableMapCreateMap.putMap("notification", g(w10.r()));
        }
        return writableMapCreateMap;
    }
}
