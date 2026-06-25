package com.margelo.nitro.mmkv;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0654a f43975a = new C0654a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f43976b;

    /* JADX INFO: renamed from: com.margelo.nitro.mmkv.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0654a {
        public /* synthetic */ C0654a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            if (a.f43976b) {
                return;
            }
            try {
                Log.i("NitroMmkvOnLoad", "Loading NitroMmkv C++ library...");
                System.loadLibrary("NitroMmkv");
                Log.i("NitroMmkvOnLoad", "Successfully loaded NitroMmkv C++ library!");
                a.f43976b = true;
            } catch (Error e10) {
                Log.e("NitroMmkvOnLoad", "Failed to load NitroMmkv C++ library! Is it properly installed and linked? Is the name correct? (see `CMakeLists.txt`, at `add_library(...)`)", e10);
                throw e10;
            }
        }

        private C0654a() {
        }
    }

    public static final void c() {
        f43975a.a();
    }
}
