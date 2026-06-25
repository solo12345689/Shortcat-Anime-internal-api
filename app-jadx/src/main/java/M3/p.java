package M3;

import M3.q;
import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a */
    public static final p f12144a = new p();

    private p() {
    }

    public static final q.a a(Context context, Class klass, String str) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(klass, "klass");
        if (str == null || Df.r.l0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new q.a(context, klass, str);
    }

    public static final Object b(Class klass, String suffix) {
        String str;
        AbstractC5504s.h(klass, "klass");
        AbstractC5504s.h(suffix, "suffix");
        Package r02 = klass.getPackage();
        AbstractC5504s.e(r02);
        String fullPackage = r02.getName();
        String canonicalName = klass.getCanonicalName();
        AbstractC5504s.e(canonicalName);
        AbstractC5504s.g(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            AbstractC5504s.g(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = Df.r.J(canonicalName, com.amazon.a.a.o.c.a.b.f34706a, '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + com.amazon.a.a.o.c.a.b.f34706a + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            AbstractC5504s.f(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    public static final q.a c(Context context, Class klass) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(klass, "klass");
        return new q.a(context, klass, null);
    }
}
