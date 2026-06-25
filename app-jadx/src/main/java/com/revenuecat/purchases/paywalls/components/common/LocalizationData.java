package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "", "Companion", "Image", "Text", "Video", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LocalizationData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return LocalizationDataSerializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Image implements LocalizationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemeImageUrls value;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return LocalizationData$Image$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Image(ThemeImageUrls themeImageUrls) {
            this.value = themeImageUrls;
        }

        /* JADX INFO: renamed from: box-impl */
        public static final /* synthetic */ Image m316boximpl(ThemeImageUrls themeImageUrls) {
            return new Image(themeImageUrls);
        }

        /* JADX INFO: renamed from: constructor-impl */
        public static ThemeImageUrls m317constructorimpl(ThemeImageUrls value) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        /* JADX INFO: renamed from: equals-impl */
        public static boolean m318equalsimpl(ThemeImageUrls themeImageUrls, Object obj) {
            return (obj instanceof Image) && AbstractC5504s.c(themeImageUrls, ((Image) obj).m322unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0 */
        public static final boolean m319equalsimpl0(ThemeImageUrls themeImageUrls, ThemeImageUrls themeImageUrls2) {
            return AbstractC5504s.c(themeImageUrls, themeImageUrls2);
        }

        /* JADX INFO: renamed from: hashCode-impl */
        public static int m320hashCodeimpl(ThemeImageUrls themeImageUrls) {
            return themeImageUrls.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl */
        public static String m321toStringimpl(ThemeImageUrls themeImageUrls) {
            return "Image(value=" + themeImageUrls + ')';
        }

        public boolean equals(Object obj) {
            return m318equalsimpl(this.value, obj);
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return m320hashCodeimpl(this.value);
        }

        public String toString() {
            return m321toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl */
        public final /* synthetic */ ThemeImageUrls m322unboximpl() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Text implements LocalizationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return LocalizationData$Text$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Text(String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: box-impl */
        public static final /* synthetic */ Text m325boximpl(String str) {
            return new Text(str);
        }

        /* JADX INFO: renamed from: constructor-impl */
        public static String m326constructorimpl(String value) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        /* JADX INFO: renamed from: equals-impl */
        public static boolean m327equalsimpl(String str, Object obj) {
            return (obj instanceof Text) && AbstractC5504s.c(str, ((Text) obj).m331unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0 */
        public static final boolean m328equalsimpl0(String str, String str2) {
            return AbstractC5504s.c(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl */
        public static int m329hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl */
        public static String m330toStringimpl(String str) {
            return "Text(value=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m327equalsimpl(this.value, obj);
        }

        public final /* synthetic */ String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m329hashCodeimpl(this.value);
        }

        public String toString() {
            return m330toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl */
        public final /* synthetic */ String m331unboximpl() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Video implements LocalizationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemeVideoUrls value;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return LocalizationData$Video$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Video(ThemeVideoUrls themeVideoUrls) {
            this.value = themeVideoUrls;
        }

        /* JADX INFO: renamed from: box-impl */
        public static final /* synthetic */ Video m334boximpl(ThemeVideoUrls themeVideoUrls) {
            return new Video(themeVideoUrls);
        }

        /* JADX INFO: renamed from: constructor-impl */
        public static ThemeVideoUrls m335constructorimpl(ThemeVideoUrls value) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        /* JADX INFO: renamed from: equals-impl */
        public static boolean m336equalsimpl(ThemeVideoUrls themeVideoUrls, Object obj) {
            return (obj instanceof Video) && AbstractC5504s.c(themeVideoUrls, ((Video) obj).m340unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0 */
        public static final boolean m337equalsimpl0(ThemeVideoUrls themeVideoUrls, ThemeVideoUrls themeVideoUrls2) {
            return AbstractC5504s.c(themeVideoUrls, themeVideoUrls2);
        }

        /* JADX INFO: renamed from: hashCode-impl */
        public static int m338hashCodeimpl(ThemeVideoUrls themeVideoUrls) {
            return themeVideoUrls.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl */
        public static String m339toStringimpl(ThemeVideoUrls themeVideoUrls) {
            return "Video(value=" + themeVideoUrls + ')';
        }

        public boolean equals(Object obj) {
            return m336equalsimpl(this.value, obj);
        }

        public final /* synthetic */ ThemeVideoUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return m338hashCodeimpl(this.value);
        }

        public String toString() {
            return m339toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl */
        public final /* synthetic */ ThemeVideoUrls m340unboximpl() {
            return this.value;
        }
    }
}
