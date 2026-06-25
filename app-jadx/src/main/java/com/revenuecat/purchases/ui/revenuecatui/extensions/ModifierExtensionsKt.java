package com.revenuecat.purchases.ui.revenuecatui.extensions;

import androidx.compose.ui.e;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\n\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u0007*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\n\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\f*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00000\u000eH\u0000¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/e;", "", "condition", "Lkotlin/Function1;", "modifier", "conditional", "(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;", "T", "value", "Lkotlin/Function2;", "applyIfNotNull", "(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;", "V", "value2", "Lkotlin/Function3;", "(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lie/o;)Landroidx/compose/ui/e;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModifierExtensionsKt {
    public static final <T> e applyIfNotNull(e eVar, T t10, Function2 modifier) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(modifier, "modifier");
        return t10 != null ? eVar.then((e) modifier.invoke(e.f26613a, t10)) : eVar;
    }

    public static final e conditional(e eVar, boolean z10, Function1 modifier) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(modifier, "modifier");
        return z10 ? eVar.then((e) modifier.invoke(e.f26613a)) : eVar;
    }

    public static final <T, V> e applyIfNotNull(e eVar, T t10, V v10, InterfaceC5096o modifier) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(modifier, "modifier");
        return (t10 == null || v10 == null) ? eVar : eVar.then((e) modifier.invoke(e.f26613a, t10, v10));
    }
}
