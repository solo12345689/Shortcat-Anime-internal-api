package com.revenuecat.purchases.ui.revenuecatui.composables;

import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import w.C6888a;
import w.InterfaceC6904i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode$measure$1", f = "Switch.kt", l = {379}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class ThumbNode$measure$1 extends l implements Function2 {
    final /* synthetic */ float $size;
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThumbNode$measure$1(ThumbNode thumbNode, float f10, e eVar) {
        super(2, eVar);
        this.this$0 = thumbNode;
        this.$size = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new ThumbNode$measure$1(this.this$0, this.$size, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((ThumbNode$measure$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            C6888a c6888a = this.this$0.sizeAnim;
            if (c6888a != null) {
                Float fC = b.c(this.$size);
                InterfaceC6904i interfaceC6904i = this.this$0.isPressed ? SwitchKt.SnapSpec : SwitchKt.AnimationSpec;
                this.label = 1;
                obj = C6888a.f(c6888a, fC, interfaceC6904i, null, null, this, 12, null);
                if (obj == objF) {
                    return objF;
                }
            }
            return L.f17438a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        return L.f17438a;
    }
}
