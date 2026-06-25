package z5;

import android.util.Log;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: renamed from: z5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7284b implements InterfaceC7285c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C7284b f65610c = new C7284b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65611a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65612b = 5;

    private C7284b() {
    }

    public static C7284b h() {
        return f65610c;
    }

    private static String j(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    private String k(String str) {
        if (this.f65611a == null) {
            return str;
        }
        return this.f65611a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str;
    }

    private void l(int i10, String str, String str2) {
        Log.println(i10, k(str), str2);
    }

    private void m(int i10, String str, String str2, Throwable th2) {
        Log.println(i10, k(str), i(str2, th2));
    }

    @Override // z5.InterfaceC7285c
    public void a(String str, String str2, Throwable th2) {
        m(3, str, str2, th2);
    }

    @Override // z5.InterfaceC7285c
    public void b(String str, String str2, Throwable th2) {
        m(5, str, str2, th2);
    }

    @Override // z5.InterfaceC7285c
    public void c(String str, String str2) {
        l(6, str, str2);
    }

    @Override // z5.InterfaceC7285c
    public void d(String str, String str2) {
        l(3, str, str2);
    }

    @Override // z5.InterfaceC7285c
    public void e(String str, String str2, Throwable th2) {
        m(6, str, str2, th2);
    }

    @Override // z5.InterfaceC7285c
    public void f(String str, String str2, Throwable th2) {
        m(6, str, str2, th2);
    }

    @Override // z5.InterfaceC7285c
    public boolean g(int i10) {
        return this.f65612b <= i10;
    }

    @Override // z5.InterfaceC7285c
    public void i(String str, String str2) {
        l(4, str, str2);
    }

    @Override // z5.InterfaceC7285c
    public void v(String str, String str2) {
        l(2, str, str2);
    }

    @Override // z5.InterfaceC7285c
    public void w(String str, String str2) {
        l(5, str, str2);
    }

    private static String i(String str, Throwable th2) {
        return str + '\n' + j(th2);
    }

    @Override // z5.InterfaceC7285c
    public void e(String str, String str2) {
        l(6, str, str2);
    }
}
