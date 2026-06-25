package com.swmansion.reanimated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class MapUtils {
    public static int getInt(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getInt(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }

    public static String getString(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getString(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }
}
