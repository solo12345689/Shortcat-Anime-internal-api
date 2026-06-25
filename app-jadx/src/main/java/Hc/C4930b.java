package hc;

import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5969K;

/* JADX INFO: renamed from: hc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4930b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f47799b;

    public C4930b(String name, InterfaceC5082a getter) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(getter, "getter");
        this.f47798a = name;
        this.f47799b = getter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(C4930b c4930b) {
        return C5969K.b(C5969K.f55891a, c4930b.f47799b.invoke(), null, false, 6, null);
    }

    public final void b(JSDecoratorsBridgingObject jsObject) {
        AbstractC5504s.h(jsObject, "jsObject");
        jsObject.registerConstant(this.f47798a, new JNINoArgsFunctionBody() { // from class: hc.a
            @Override // expo.modules.kotlin.jni.JNINoArgsFunctionBody
            public final Object invoke() {
                return C4930b.c(this.f47797a);
            }
        });
    }
}
