package hc;

import dc.r;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5969K;

/* JADX INFO: renamed from: hc.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4939k {

    /* JADX INFO: renamed from: a */
    private final String f47838a;

    /* JADX INFO: renamed from: b */
    private final r f47839b;

    /* JADX INFO: renamed from: c */
    private final r f47840c;

    public C4939k(String name, r rVar, r rVar2) {
        AbstractC5504s.h(name, "name");
        this.f47838a = name;
        this.f47839b = rVar;
        this.f47840c = rVar2;
    }

    public static final Object d(C4939k c4939k, Ub.d dVar, Object[] args) {
        AbstractC5504s.h(args, "args");
        return C5969K.b(C5969K.f55891a, c4939k.f47839b.o(args, dVar), null, true, 2, null);
    }

    public static final Object e(C4939k c4939k, Ub.d dVar, Object[] args) {
        AbstractC5504s.h(args, "args");
        c4939k.f47840c.o(args, dVar);
        return null;
    }

    public final void c(final Ub.d appContext, JSDecoratorsBridgingObject jsObject) {
        ExpectedType[] expectedTypeArr;
        ExpectedType[] expectedTypeArr2;
        List listE;
        List listE2;
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(jsObject, "jsObject");
        JNIFunctionBody jNIFunctionBody = this.f47839b != null ? new JNIFunctionBody() { // from class: hc.i
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return C4939k.d(this.f47834a, appContext, objArr);
            }
        } : null;
        JNIFunctionBody jNIFunctionBody2 = this.f47840c != null ? new JNIFunctionBody() { // from class: hc.j
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return C4939k.e(this.f47836a, appContext, objArr);
            }
        } : null;
        String str = this.f47838a;
        r rVar = this.f47839b;
        boolean z10 = rVar != null && rVar.i();
        r rVar2 = this.f47839b;
        if (rVar2 == null || (listE2 = rVar2.e()) == null || (expectedTypeArr = (ExpectedType[]) listE2.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr = new ExpectedType[0];
        }
        ExpectedType[] expectedTypeArr3 = expectedTypeArr;
        r rVar3 = this.f47840c;
        boolean z11 = rVar3 != null && rVar3.i();
        r rVar4 = this.f47840c;
        if (rVar4 == null || (listE = rVar4.e()) == null || (expectedTypeArr2 = (ExpectedType[]) listE.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr2 = new ExpectedType[0];
        }
        jsObject.registerProperty(str, z10, expectedTypeArr3, jNIFunctionBody, z11, expectedTypeArr2, jNIFunctionBody2);
    }
}
