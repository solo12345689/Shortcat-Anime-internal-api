package jb;

import Td.L;
import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pb.C5957b;
import q7.g;
import sb.InterfaceC6446a;
import sb.d;
import sb.f;
import tb.InterfaceC6659b;
import y1.AbstractC7194b;

/* JADX INFO: renamed from: jb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5362c implements d, Rb.a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC6446a f51732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rb.c f51734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f51735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Queue f51736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rb.c f51737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SharedPreferences f51738h;

    public C5362c(Context context) {
        AbstractC5504s.h(context, "context");
        this.f51731a = context;
        this.f51736f = new LinkedList();
    }

    private final void h(String[] strArr) {
        SharedPreferences sharedPreferences = this.f51738h;
        if (sharedPreferences == null) {
            AbstractC5504s.u("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str, true);
        }
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C5362c c5362c, Rb.c cVar, Map map) {
        int i10 = c5362c.t() ? 0 : -1;
        AbstractC5504s.e(map);
        map.put("android.permission.WRITE_SETTINGS", c5362c.s("android.permission.WRITE_SETTINGS", i10));
        cVar.a(map);
    }

    private final void k() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.f51731a.getPackageName()));
        intent.addFlags(268435456);
        this.f51733c = true;
        this.f51731a.startActivity(intent);
    }

    private final boolean l(String str) {
        Activity activityA;
        InterfaceC6446a interfaceC6446a = this.f51732b;
        return (interfaceC6446a == null || (activityA = interfaceC6446a.a()) == null || !androidx.core.app.b.u(activityA, str)) ? false : true;
    }

    private final g m() {
        return new g() { // from class: jb.a
            @Override // q7.g
            public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                return C5362c.n(this.f51728a, i10, strArr, iArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C5362c c5362c, int i10, String[] receivePermissions, int[] grantResults) {
        AbstractC5504s.h(receivePermissions, "receivePermissions");
        AbstractC5504s.h(grantResults, "grantResults");
        if (i10 != 13) {
            return false;
        }
        synchronized (c5362c) {
            try {
                Rb.c cVar = c5362c.f51737g;
                if (cVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.a(c5362c.v(receivePermissions, grantResults));
                c5362c.f51737g = null;
                Pair pair = (Pair) c5362c.f51736f.poll();
                if (pair != null) {
                    InterfaceC6446a interfaceC6446a = c5362c.f51732b;
                    Activity activityA = interfaceC6446a != null ? interfaceC6446a.a() : null;
                    q7.f fVar = activityA instanceof q7.f ? (q7.f) activityA : null;
                    if (fVar != null) {
                        c5362c.f51737g = (Rb.c) pair.d();
                        fVar.c((String[]) pair.c(), 13, c5362c.m());
                        return false;
                    }
                    Rb.c cVar2 = (Rb.c) pair.d();
                    String[] strArr = (String[]) pair.c();
                    int length = ((Object[]) pair.c()).length;
                    int[] iArr = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr[i11] = -1;
                    }
                    cVar2.a(c5362c.v(strArr, iArr));
                    for (Pair pair2 : c5362c.f51736f) {
                        Rb.c cVar3 = (Rb.c) pair2.d();
                        String[] strArr2 = (String[]) pair2.c();
                        int length2 = ((Object[]) pair2.c()).length;
                        int[] iArr2 = new int[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            iArr2[i12] = -1;
                        }
                        cVar3.a(c5362c.v(strArr2, iArr2));
                    }
                    c5362c.f51736f.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean p(String str) {
        SharedPreferences sharedPreferences = this.f51738h;
        if (sharedPreferences == null) {
            AbstractC5504s.u("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    private final int q(String str) {
        Activity activityA;
        InterfaceC6446a interfaceC6446a = this.f51732b;
        return (interfaceC6446a == null || (activityA = interfaceC6446a.a()) == null || !(activityA instanceof q7.f)) ? r(str) : AbstractC7194b.a(activityA, str);
    }

    private final Rb.b s(String str, int i10) {
        Rb.d dVar = i10 == 0 ? Rb.d.GRANTED : p(str) ? Rb.d.DENIED : Rb.d.UNDETERMINED;
        return new Rb.b(dVar, dVar == Rb.d.DENIED ? l(str) : true);
    }

    private final boolean t() {
        return Settings.System.canWrite(this.f51731a.getApplicationContext());
    }

    private final boolean u(String str) {
        return AbstractC5504s.c(str, "android.permission.WRITE_SETTINGS") ? t() : q(str) == 0;
    }

    private final Map v(String[] strArr, int[] iArr) {
        HashMap map = new HashMap();
        for (Pair pair : AbstractC2273n.l1(iArr, strArr)) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            String str = (String) pair.getSecond();
            map.put(str, s(str, iIntValue));
        }
        return map;
    }

    @Override // Rb.a
    public void a(Rb.c responseListener, String... permissions) {
        AbstractC5504s.h(responseListener, "responseListener");
        AbstractC5504s.h(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.length);
        for (String str : permissions) {
            arrayList.add(Integer.valueOf(u(str) ? 0 : -1));
        }
        responseListener.a(v(permissions, AbstractC2279u.a1(arrayList)));
    }

    @Override // Rb.a
    public void b(final Rb.c responseListener, String... permissions) {
        AbstractC5504s.h(responseListener, "responseListener");
        AbstractC5504s.h(permissions, "permissions");
        if (permissions.length == 0) {
            responseListener.a(new LinkedHashMap());
            return;
        }
        if (!AbstractC2273n.R(permissions, "android.permission.WRITE_SETTINGS")) {
            i(permissions, responseListener);
            return;
        }
        List listE1 = AbstractC2273n.e1(permissions);
        listE1.remove("android.permission.WRITE_SETTINGS");
        String[] strArr = (String[]) listE1.toArray(new String[0]);
        Rb.c cVar = new Rb.c() { // from class: jb.b
            @Override // Rb.c
            public final void a(Map map) {
                C5362c.j(this.f51729a, responseListener, map);
            }
        };
        if (t()) {
            if (strArr.length == 0) {
                cVar.a(new LinkedHashMap());
                return;
            } else {
                i(strArr, cVar);
                return;
            }
        }
        if (this.f51734d != null) {
            throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
        }
        this.f51734d = cVar;
        this.f51735e = strArr;
        h(new String[]{"android.permission.WRITE_SETTINGS"});
        k();
    }

    @Override // sb.d
    public List c() {
        return AbstractC2279u.e(Rb.a.class);
    }

    @Override // sb.k
    public void f(C5957b moduleRegistry) {
        AbstractC5504s.h(moduleRegistry, "moduleRegistry");
        InterfaceC6446a interfaceC6446a = (InterfaceC6446a) moduleRegistry.b(InterfaceC6446a.class);
        if (interfaceC6446a == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        this.f51732b = interfaceC6446a;
        ((InterfaceC6659b) moduleRegistry.b(InterfaceC6659b.class)).b(this);
        this.f51738h = this.f51731a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
    }

    protected void i(String[] permissions, Rb.c listener) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(listener, "listener");
        o((String[]) Arrays.copyOf(permissions, permissions.length), listener);
    }

    protected final void o(String[] permissions, Rb.c listener) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(listener, "listener");
        h(permissions);
        InterfaceC6446a interfaceC6446a = this.f51732b;
        ComponentCallbacks2 componentCallbacks2A = interfaceC6446a != null ? interfaceC6446a.a() : null;
        if (!(componentCallbacks2A instanceof q7.f)) {
            int length = permissions.length;
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = -1;
            }
            listener.a(v(permissions, iArr));
            return;
        }
        synchronized (this) {
            try {
                if (this.f51737g != null) {
                    this.f51736f.add(z.a(permissions, listener));
                } else {
                    this.f51737g = listener;
                    ((q7.f) componentCallbacks2A).c(permissions, 13, m());
                    L l10 = L.f17438a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.f
    public void onHostResume() {
        if (this.f51733c) {
            this.f51733c = false;
            Rb.c cVar = this.f51734d;
            AbstractC5504s.e(cVar);
            String[] strArr = this.f51735e;
            AbstractC5504s.e(strArr);
            this.f51734d = null;
            this.f51735e = null;
            if (strArr.length == 0) {
                cVar.a(new LinkedHashMap());
            } else {
                i(strArr, cVar);
            }
        }
    }

    protected int r(String permission) {
        AbstractC5504s.h(permission, "permission");
        return AbstractC7194b.a(this.f51731a, permission);
    }

    @Override // sb.f
    public void onHostDestroy() {
    }

    @Override // sb.f
    public void onHostPause() {
    }
}
