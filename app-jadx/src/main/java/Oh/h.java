package Oh;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f13176a = new ThreadLocal();

    static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13177a;

        a(String str) {
            this.f13177a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return Security.getProperty(this.f13177a);
        }
    }

    static class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13178a;

        b(String str) {
            this.f13178a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(this.f13178a);
        }
    }

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f13176a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new b(str)) : str2;
    }

    public static boolean b(String str) {
        try {
            return c(a(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean c(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
    }
}
