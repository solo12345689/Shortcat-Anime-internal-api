package com.revenuecat.purchases.utils.serializers;

import Rf.a;
import Rf.b;
import Rf.j;
import Td.s;
import Tf.e;
import Tf.k;
import Uf.f;
import Wf.C;
import Wf.E;
import Wf.h;
import Wf.i;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "", "T", "LRf/b;", "", "serialName", "", "Lkotlin/Function0;", "serializerByType", "Lkotlin/Function1;", "defaultValue", "typeDiscriminator", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/lang/Object;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/lang/Object;)V", "Ljava/lang/String;", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SealedDeserializerWithDefault<T> implements b {
    private final Function1 defaultValue;
    private final e descriptor;
    private final String serialName;
    private final Map<String, InterfaceC5082a> serializerByType;
    private final String typeDiscriminator;

    /* JADX WARN: Multi-variable type inference failed */
    public SealedDeserializerWithDefault(String serialName, Map<String, ? extends InterfaceC5082a> serializerByType, Function1 defaultValue, String typeDiscriminator) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(serializerByType, "serializerByType");
        AbstractC5504s.h(defaultValue, "defaultValue");
        AbstractC5504s.h(typeDiscriminator, "typeDiscriminator");
        this.serialName = serialName;
        this.serializerByType = serializerByType;
        this.defaultValue = defaultValue;
        this.typeDiscriminator = typeDiscriminator;
        this.descriptor = k.c(serialName, new e[0], new SealedDeserializerWithDefault$descriptor$1(this));
    }

    @Override // Rf.a
    public T deserialize(Uf.e decoder) {
        InterfaceC5082a interfaceC5082a;
        AbstractC5504s.h(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new j("Can only deserialize " + this.serialName + " from JSON, got: " + O.b(decoder.getClass()));
        }
        i iVarG = hVar.g();
        C c10 = iVarG instanceof C ? (C) iVarG : null;
        if (c10 == null) {
            return (T) this.defaultValue.invoke("null");
        }
        Object obj = c10.get(this.typeDiscriminator);
        E e10 = obj instanceof E ? (E) obj : null;
        String strB = e10 != null ? e10.b() : null;
        if (strB == null || (interfaceC5082a = this.serializerByType.get(strB)) == null) {
            return (T) this.defaultValue.invoke(strB != null ? strB : "null");
        }
        try {
            return (T) hVar.d().c((a) interfaceC5082a.invoke(), c10);
        } catch (Exception unused) {
            return (T) this.defaultValue.invoke(strB);
        }
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, T value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        throw new s("Serialization is not implemented because it is not needed.");
    }

    public /* synthetic */ SealedDeserializerWithDefault(String str, Map map, Function1 function1, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, function1, (i10 & 8) != 0 ? "type" : str2);
    }
}
