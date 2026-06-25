package com.facebook.react.bridge;

import be.AbstractC3048a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/bridge/ReadableType;", "", "<init>", "(Ljava/lang/String;I)V", "Null", "Boolean", "Number", "String", "Map", "Array", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReadableType extends Enum<ReadableType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReadableType[] $VALUES;
    public static final ReadableType Null = new ReadableType("Null", 0);
    public static final ReadableType Boolean = new ReadableType("Boolean", 1);
    public static final ReadableType Number = new ReadableType("Number", 2);
    public static final ReadableType String = new ReadableType("String", 3);
    public static final ReadableType Map = new ReadableType("Map", 4);
    public static final ReadableType Array = new ReadableType("Array", 5);

    private static final /* synthetic */ ReadableType[] $values() {
        return new ReadableType[]{Null, Boolean, Number, String, Map, Array};
    }

    static {
        ReadableType[] readableTypeArr$values = $values();
        $VALUES = readableTypeArr$values;
        $ENTRIES = AbstractC3048a.a(readableTypeArr$values);
    }

    private ReadableType(String str, int i10) {
        super(str, i10);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ReadableType valueOf(String str) {
        return (ReadableType) Enum.valueOf(ReadableType.class, str);
    }

    public static ReadableType[] values() {
        return (ReadableType[]) $VALUES.clone();
    }
}
