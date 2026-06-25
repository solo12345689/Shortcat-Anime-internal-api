package Qg;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: Qg.a$a, reason: collision with other inner class name */
    static class C0255a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14921a;

        C0255a(String str) {
            this.f14921a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return ClassLoader.getSystemClassLoader().loadClass(this.f14921a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C0255a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
