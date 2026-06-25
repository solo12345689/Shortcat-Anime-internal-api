package com.revenuecat.purchases.utils.serializers;

import Rf.b;
import Td.s;
import Tf.d;
import Tf.e;
import Tf.k;
import Ud.S;
import Uf.f;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0007\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "", "T", "LRf/b;", "", "", "valuesByType", "defaultValue", "<init>", "(Ljava/util/Map;Ljava/lang/Enum;)V", "Lkotlin/Function1;", "typeForValue", "(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/lang/Enum;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/lang/Enum;)V", "Ljava/util/Map;", "Ljava/lang/Enum;", "kotlin.jvm.PlatformType", "enumName", "Ljava/lang/String;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EnumDeserializerWithDefault<T extends Enum<T>> implements b {
    private final T defaultValue;
    private final e descriptor;
    private final String enumName;
    private final Map<String, T> valuesByType;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "value", "invoke", "(Ljava/lang/Enum;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    protected static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(T value) {
            AbstractC5504s.h(value, "value");
            String lowerCase = value.name().toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumDeserializerWithDefault(Map<String, ? extends T> valuesByType, T defaultValue) {
        AbstractC5504s.h(valuesByType, "valuesByType");
        AbstractC5504s.h(defaultValue, "defaultValue");
        this.valuesByType = valuesByType;
        this.defaultValue = defaultValue;
        String enumName = defaultValue.getClass().getSimpleName();
        this.enumName = enumName;
        AbstractC5504s.g(enumName, "enumName");
        this.descriptor = k.b(enumName, d.i.f17511a);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override // Rf.a
    public T deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        T t10 = this.valuesByType.get(decoder.A());
        return t10 == null ? this.defaultValue : t10;
    }

    @Override // Rf.k
    public void serialize(f encoder, T value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        throw new s("Serialization is not implemented because it is not needed.");
    }

    public /* synthetic */ EnumDeserializerWithDefault(Enum r12, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, (i10 & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }

    public EnumDeserializerWithDefault(T defaultValue, Function1 typeForValue) {
        AbstractC5504s.h(defaultValue, "defaultValue");
        AbstractC5504s.h(typeForValue, "typeForValue");
        Object[] enumConstants = defaultValue.getClass().getEnumConstants();
        AbstractC5504s.g(enumConstants, "defaultValue::class.java.enumConstants");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(enumConstants.length), 16));
        for (Object obj : enumConstants) {
            linkedHashMap.put(typeForValue.invoke(obj), obj);
        }
        this(linkedHashMap, defaultValue);
    }
}
