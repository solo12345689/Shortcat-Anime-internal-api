package Ub;

import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface u {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static void a(u uVar, CodedException exception) {
            AbstractC5504s.h(exception, "exception");
            uVar.reject(exception.getCode(), exception.getLocalizedMessage(), exception.getCause());
        }

        public static void b(u uVar) {
            uVar.resolve((Object) null);
        }

        public static void c(u uVar, double d10) {
            uVar.resolve(Double.valueOf(d10));
        }

        public static void d(u uVar, float f10) {
            uVar.resolve(Float.valueOf(f10));
        }

        public static void e(u uVar, int i10) {
            uVar.resolve(Integer.valueOf(i10));
        }

        public static void f(u uVar, String result) {
            AbstractC5504s.h(result, "result");
            uVar.resolve((Object) result);
        }

        public static void g(u uVar, Collection result) {
            AbstractC5504s.h(result, "result");
            uVar.resolve(result);
        }

        public static void h(u uVar, Map result) {
            AbstractC5504s.h(result, "result");
            uVar.resolve(result);
        }

        public static void i(u uVar, boolean z10) {
            uVar.resolve(Boolean.valueOf(z10));
        }
    }

    void a(boolean z10);

    void b();

    void c(int i10);

    void d(double d10);

    void e(float f10);

    void f(Map map);

    void g(Collection collection);

    void h(CodedException codedException);

    void reject(String str, String str2, Throwable th2);

    void resolve(Object obj);

    void resolve(String str);
}
