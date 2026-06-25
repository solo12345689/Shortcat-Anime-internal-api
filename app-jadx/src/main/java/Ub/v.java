package Ub;

import Td.L;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.jni.JavaCallback;
import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Promise {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f19454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f19455b;

        a(Function1 function1, u uVar) {
            this.f19454a = function1;
            this.f19455b = uVar;
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String str) {
            AbstractC5504s.h(code, "code");
            this.f19455b.reject(code, str, null);
        }

        @Override // com.facebook.react.bridge.Promise
        public void resolve(Object obj) {
            this.f19454a.invoke(obj);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, Throwable th2) {
            AbstractC5504s.h(code, "code");
            this.f19455b.reject(code, null, th2);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String str, Throwable th2) {
            AbstractC5504s.h(code, "code");
            this.f19455b.reject(code, str, th2);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(Throwable throwable) {
            AbstractC5504s.h(throwable, "throwable");
            this.f19455b.reject("UnknownCode", null, throwable);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(Throwable throwable, WritableMap userInfo) {
            AbstractC5504s.h(throwable, "throwable");
            AbstractC5504s.h(userInfo, "userInfo");
            this.f19455b.reject("UnknownCode", null, throwable);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, WritableMap userInfo) {
            AbstractC5504s.h(code, "code");
            AbstractC5504s.h(userInfo, "userInfo");
            this.f19455b.reject(code, null, null);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, Throwable th2, WritableMap userInfo) {
            AbstractC5504s.h(code, "code");
            AbstractC5504s.h(userInfo, "userInfo");
            this.f19455b.reject(code, null, th2);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String str, WritableMap userInfo) {
            AbstractC5504s.h(code, "code");
            AbstractC5504s.h(userInfo, "userInfo");
            this.f19455b.reject(code, str, null);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String str, String str2, Throwable th2, WritableMap writableMap) {
            u uVar = this.f19455b;
            if (str == null) {
                str = "UnknownCode";
            }
            uVar.reject(str, str2, th2);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String message) {
            AbstractC5504s.h(message, "message");
            this.f19455b.reject("UnknownCode", message, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {
        b(Object obj) {
            super(1, obj, JavaCallback.class, "invoke", "invoke(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51invoke(obj);
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m51invoke(Object obj) {
            ((JavaCallback) this.receiver).f(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class c extends AbstractC5502p implements Function1 {
        c(Object obj) {
            super(1, obj, u.class, "resolve", "resolve(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m52invoke(obj);
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke(Object obj) {
            ((u) this.receiver).resolve(obj);
        }
    }

    public static final Promise a(u uVar) {
        AbstractC5504s.h(uVar, "<this>");
        return new a(uVar instanceof PromiseImpl ? new b(((PromiseImpl) uVar).getCallback()) : new c(uVar), uVar);
    }
}
