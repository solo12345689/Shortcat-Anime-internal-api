package com.google.android.gms.dynamite;

import R8.AbstractC2113n;
import R8.AbstractC2115p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f39029h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f39030i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f39031j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f39032k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f39033l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f39039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static o f39040s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39041a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f39034m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f39035n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f39036o = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f39023b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39024c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f39025d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f39026e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f39027f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f39028g = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f39037p = new k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f39038q = new com.google.android.gms.dynamite.a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th2, byte[] bArr) {
            super(str, th2);
        }

        /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class C0637b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f39042a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f39043b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f39044c = 0;
        }

        C0637b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC2115p.l(context);
        this.f39041a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC2113n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {all -> 0x00c3, blocks: (B:5:0x0045, B:9:0x00bc, B:16:0x00c8, B:19:0x00ce, B:32:0x00ec, B:109:0x027d, B:110:0x0288, B:118:0x0298, B:120:0x02c0, B:122:0x02cf, B:132:0x02ef, B:133:0x02f7, B:113:0x028b, B:114:0x028c, B:115:0x0294, B:134:0x02f8, B:135:0x0319, B:136:0x031a, B:137:0x036c), top: B:151:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.dynamite.DynamiteModule$b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule d(android.content.Context r30, com.google.android.gms.dynamite.DynamiteModule.b r31, java.lang.String r32) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018f A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:65:0x00e9, B:67:0x00ef, B:75:0x011d, B:103:0x0181, B:107:0x018f, B:125:0x01ec, B:126:0x01ef, B:120:0x01e3, B:73:0x00fa, B:128:0x01f1, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:63:0x00e6, B:22:0x004d, B:46:0x00a5, B:49:0x00a8, B:56:0x00c0, B:64:0x00e8, B:62:0x00c6), top: B:141:0x0006, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4 A[Catch: all -> 0x003a, TryCatch #12 {, blocks: (B:10:0x002a, B:12:0x0036, B:53:0x00bd, B:17:0x003f, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:32:0x0061, B:34:0x0069, B:37:0x0070, B:44:0x009c, B:45:0x00a4, B:40:0x0077, B:42:0x007d, B:43:0x008e, B:48:0x00a7, B:51:0x00aa, B:52:0x00b4, B:18:0x0042), top: B:144:0x002a, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f39033l)) {
            return true;
        }
        boolean z10 = false;
        if (f39033l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.l.g() ? 0 : 268435456);
            if (com.google.android.gms.common.b.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f39033l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f39031j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:328), block:B:92:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static boolean h(Cursor cursor) {
        l lVar = (l) f39034m.get();
        if (lVar == null || lVar.f39045a != null) {
            return false;
        }
        lVar.f39045a = cursor;
        return true;
    }

    private static DynamiteModule i(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void j(ClassLoader classLoader) throws a {
        o oVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                oVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                oVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
            }
            f39040s = oVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static n k(Context context) {
        n nVar;
        synchronized (DynamiteModule.class) {
            n nVar2 = f39039r;
            if (nVar2 != null) {
                return nVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    nVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
                }
                if (nVar != null) {
                    f39039r = nVar;
                    return nVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.f39041a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
