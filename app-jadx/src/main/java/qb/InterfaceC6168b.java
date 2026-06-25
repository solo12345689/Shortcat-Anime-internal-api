package qb;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: qb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6168b {
    default List a(String str) {
        return d(str, null);
    }

    Object b(String str);

    default InterfaceC6168b c(String str) {
        Object objB = b(str);
        if (objB instanceof Map) {
            return new C6167a((Map) objB);
        }
        return null;
    }

    List d(String str, List list);

    Map e(String str, Map map);

    boolean f(String str);

    default boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    boolean getBoolean(String str, boolean z10);

    default int getInt(String str) {
        return getInt(str, 0);
    }

    int getInt(String str, int i10);

    default Map getMap(String str) {
        return e(str, null);
    }

    default String getString(String str) {
        return getString(str, null);
    }

    String getString(String str, String str2);
}
