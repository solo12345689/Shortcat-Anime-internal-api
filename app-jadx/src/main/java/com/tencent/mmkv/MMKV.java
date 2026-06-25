package com.tencent.mmkv;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final EnumMap f44824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final EnumMap f44825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tencent.mmkv.a[] f44826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f44827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f44828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f44829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f44830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f44831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f44832i;
    private final long nativeHandle;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44833a;

        static {
            int[] iArr = new int[com.tencent.mmkv.a.values().length];
            f44833a = iArr;
            try {
                iArr[com.tencent.mmkv.a.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44833a[com.tencent.mmkv.a.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44833a[com.tencent.mmkv.a.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44833a[com.tencent.mmkv.a.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44833a[com.tencent.mmkv.a.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        EnumMap enumMap = new EnumMap(b.class);
        f44824a = enumMap;
        enumMap.put(b.OnErrorDiscard, 0);
        enumMap.put(b.OnErrorRecover, 1);
        EnumMap enumMap2 = new EnumMap(com.tencent.mmkv.a.class);
        f44825b = enumMap2;
        com.tencent.mmkv.a aVar = com.tencent.mmkv.a.LevelDebug;
        enumMap2.put(aVar, 0);
        com.tencent.mmkv.a aVar2 = com.tencent.mmkv.a.LevelInfo;
        enumMap2.put(aVar2, 1);
        com.tencent.mmkv.a aVar3 = com.tencent.mmkv.a.LevelWarning;
        enumMap2.put(aVar3, 2);
        com.tencent.mmkv.a aVar4 = com.tencent.mmkv.a.LevelError;
        enumMap2.put(aVar4, 3);
        com.tencent.mmkv.a aVar5 = com.tencent.mmkv.a.LevelNone;
        enumMap2.put(aVar5, 4);
        f44826c = new com.tencent.mmkv.a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f44827d = new HashSet();
        f44828e = false;
        f44829f = null;
        f44830g = true;
        f44831h = new HashMap();
        f44832i = false;
    }

    private native long actualSize(long j10);

    private native String[] allKeys(long j10, boolean z10);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    public static native boolean checkExist(String str, String str2);

    private static native boolean checkProcessMode(long j10);

    private native boolean containsKey(long j10, String str);

    private native long count(long j10, boolean z10);

    private static native long createNB(int i10);

    private native boolean decodeBool(long j10, String str, boolean z10);

    private native byte[] decodeBytes(long j10, String str);

    private native double decodeDouble(long j10, String str, double d10);

    private native float decodeFloat(long j10, String str, float f10);

    private native int decodeInt(long j10, String str, int i10);

    private native long decodeLong(long j10, String str, long j11);

    private native String decodeString(long j10, String str, String str2);

    private native String[] decodeStringSet(long j10, String str);

    private static native void destroyNB(long j10, int i10);

    private native void doCheckReSetCryptKey(String str, boolean z10);

    private native boolean doReKey(String str, boolean z10);

    private static native void enableDisableProcessMode(boolean z10);

    private native boolean encodeBool(long j10, String str, boolean z10);

    private native boolean encodeBool_2(long j10, String str, boolean z10, int i10);

    private native boolean encodeBytes(long j10, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j10, String str, byte[] bArr, int i10);

    private native boolean encodeDouble(long j10, String str, double d10);

    private native boolean encodeDouble_2(long j10, String str, double d10, int i10);

    private native boolean encodeFloat(long j10, String str, float f10);

    private native boolean encodeFloat_2(long j10, String str, float f10, int i10);

    private native boolean encodeInt(long j10, String str, int i10);

    private native boolean encodeInt_2(long j10, String str, int i10, int i11);

    private native boolean encodeLong(long j10, String str, long j11);

    private native boolean encodeLong_2(long j10, String str, long j11, int i10);

    private native boolean encodeSet(long j10, String str, String[] strArr);

    private native boolean encodeSet_2(long j10, String str, String[] strArr, int i10);

    private native boolean encodeString(long j10, String str, String str2);

    private native boolean encodeString_2(long j10, String str, String str2, int i10);

    private static void f(com.tencent.mmkv.a aVar, String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = (Integer) f44825b.get(aVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private static native long getDefaultMMKV(int i10, String str, long j10, boolean z10, int i11, int i12, boolean z11, int i13, int i14);

    private static native long getMMKVWithAshmemFD(String str, int i10, int i11, String str2, boolean z10);

    static native long getMMKVWithID(String str, int i10, String str2, String str3, long j10, boolean z10, int i11, int i12, boolean z11, int i13, int i14);

    private static native boolean getNameSpace(String str);

    private native long importFrom(long j10, long j11);

    private native boolean isCompareBeforeSetEnabled();

    private native boolean isEncryptionEnabled();

    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i10, boolean z10, boolean z11, long j10);

    private static void mmkvLogImp(int i10, String str, int i11, String str2, String str3) {
        int i12 = a.f44833a[f44826c[i10].ordinal()];
        if (i12 == 1) {
            Log.d("MMKV", str3);
            return;
        }
        if (i12 == 2) {
            Log.w("MMKV", str3);
        } else if (i12 == 3) {
            Log.e("MMKV", str3);
        } else {
            if (i12 != 5) {
                return;
            }
            Log.i("MMKV", str3);
        }
    }

    private native void nativeEnableCompareBeforeSet();

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        b bVar = b.OnErrorDiscard;
        f(com.tencent.mmkv.a.LevelInfo, "Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f44824a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        b bVar = b.OnErrorDiscard;
        f(com.tencent.mmkv.a.LevelInfo, "Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f44824a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j10, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z10, boolean z11, long j10);

    private static native void setLogLevel(int i10);

    private static native void setWantsContentChangeNotify(boolean z10);

    private native void sync(boolean z10);

    private native long totalSize(long j10);

    private native int valueSize(long j10, String str, boolean z10);

    public static native String version();

    private native int writeValueToNB(long j10, String str, long j11, int i10);

    public boolean a(String str) {
        return containsKey(this.nativeHandle, str);
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public Set b(String str, Set set) {
        return c(str, set, HashSet.class);
    }

    public Set c(String str, Set set, Class cls) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) cls.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public native void checkContentChangedByOuterProcess();

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return a(str);
    }

    public native String cryptKey();

    public boolean d(String str, Set set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public void e(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native boolean enableAutoKeyExpire(int i10);

    @Override // android.content.SharedPreferences
    public Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        return decodeBool(this.nativeHandle, str, z10);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        return decodeFloat(this.nativeHandle, str, f10);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        return decodeInt(this.nativeHandle, str, i10);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        return decodeLong(this.nativeHandle, str, j10);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        return b(str, set);
    }

    public native boolean isMultiProcess();

    public native boolean isReadOnly();

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z10) {
        encodeBool(this.nativeHandle, str, z10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f10) {
        encodeFloat(this.nativeHandle, str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i10) {
        encodeInt(this.nativeHandle, str, i10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j10) {
        encodeLong(this.nativeHandle, str, j10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set set) {
        d(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        e(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    private static void onContentChangedByOuterProcess(String str) {
    }

    private static void onMMKVContentLoadSuccessfully(String str) {
    }
}
