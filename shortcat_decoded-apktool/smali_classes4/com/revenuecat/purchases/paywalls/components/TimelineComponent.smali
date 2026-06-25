.class public final Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;,
        Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;,
        Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;,
        Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;,
        Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0007\u0018\u0000 ?2\u00020\u0001:\u0005@?ABCBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0093\u0001\u0008\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u000f\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0015\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u00c1\u0001\u00a2\u0006\u0004\u0008!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010$\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008%\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010$\u0012\u0004\u0008*\u0010(\u001a\u0004\u0008)\u0010&R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010$\u0012\u0004\u0008,\u0010(\u001a\u0004\u0008+\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010-\u0012\u0004\u00080\u0010(\u001a\u0004\u0008.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00085\u00106R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u00088\u00109R\u0017\u0010\u000e\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00107\u001a\u0004\u0008:\u00109R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010;\u001a\u0004\u0008<\u0010=R#\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010;\u001a\u0004\u0008>\u0010=\u00a8\u0006D"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;",
        "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;",
        "",
        "itemSpacing",
        "textSpacing",
        "columnGutter",
        "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;",
        "iconAlignment",
        "",
        "visible",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "size",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
        "padding",
        "margin",
        "",
        "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;",
        "items",
        "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;",
        "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;",
        "overrides",
        "<init>",
        "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;)V",
        "seen1",
        "LVf/t0;",
        "serializationConstructorMarker",
        "(IIIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;LVf/t0;)V",
        "self",
        "LUf/d;",
        "output",
        "LTf/e;",
        "serialDesc",
        "LTd/L;",
        "write$Self$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;LUf/d;LTf/e;)V",
        "write$Self",
        "I",
        "getItemSpacing",
        "()I",
        "getItemSpacing$annotations",
        "()V",
        "getTextSpacing",
        "getTextSpacing$annotations",
        "getColumnGutter",
        "getColumnGutter$annotations",
        "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;",
        "getIconAlignment",
        "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;",
        "getIconAlignment$annotations",
        "Ljava/lang/Boolean;",
        "getVisible",
        "()Ljava/lang/Boolean;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "getSize",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
        "getPadding",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
        "getMargin",
        "Ljava/util/List;",
        "getItems",
        "()Ljava/util/List;",
        "getOverrides",
        "Companion",
        "$serializer",
        "Connector",
        "IconAlignment",
        "Item",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final $childSerializers:[LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LRf/b;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;


# instance fields
.field private final columnGutter:I

.field private final iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

.field private final itemSpacing:I

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;",
            ">;"
        }
    .end annotation
.end field

.field private final margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

.field private final overrides:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride<",
            "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;",
            ">;>;"
        }
    .end annotation
.end field

.field private final padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

.field private final size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

.field private final textSpacing:I

.field private final visible:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->Companion:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;

    .line 8
    .line 9
    new-instance v0, LVf/e;

    .line 10
    .line 11
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item$$serializer;

    .line 12
    .line 13
    invoke-direct {v0, v2}, LVf/e;-><init>(LRf/b;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, LVf/e;

    .line 17
    .line 18
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;->Companion:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;

    .line 19
    .line 20
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent$$serializer;

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;->serializer(LRf/b;)LRf/b;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v2, v3}, LVf/e;-><init>(LRf/b;)V

    .line 27
    .line 28
    .line 29
    const/16 v3, 0xa

    .line 30
    .line 31
    new-array v3, v3, [LRf/b;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    aput-object v1, v3, v4

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    aput-object v1, v3, v4

    .line 38
    .line 39
    const/4 v4, 0x2

    .line 40
    aput-object v1, v3, v4

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    aput-object v1, v3, v4

    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    aput-object v1, v3, v4

    .line 47
    .line 48
    const/4 v4, 0x5

    .line 49
    aput-object v1, v3, v4

    .line 50
    .line 51
    const/4 v4, 0x6

    .line 52
    aput-object v1, v3, v4

    .line 53
    .line 54
    const/4 v4, 0x7

    .line 55
    aput-object v1, v3, v4

    .line 56
    .line 57
    const/16 v1, 0x8

    .line 58
    .line 59
    aput-object v0, v3, v1

    .line 60
    .line 61
    const/16 v0, 0x9

    .line 62
    .line 63
    aput-object v2, v3, v0

    .line 64
    .line 65
    sput-object v3, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->$childSerializers:[LRf/b;

    .line 66
    .line 67
    return-void
.end method

.method public synthetic constructor <init>(IIIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;LVf/t0;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    and-int/lit8 p12, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;

    invoke-virtual {p12}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object p12

    invoke-static {p1, v0, p12}, LVf/f0;->a(IILTf/e;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    iput p3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    iput p4, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    iput-object p5, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    .line 2
    new-instance p2, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object p3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    sget-object p4, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    invoke-direct {p2, p3, p4}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    .line 4
    sget-object p2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;->getZero()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object p2

    .line 5
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    .line 6
    sget-object p2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;->getZero()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object p2

    .line 7
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    :goto_3
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_5

    .line 8
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object p2

    .line 9
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    :goto_4
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_6

    .line 10
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    return-void

    :cond_6
    iput-object p11, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;",
            "Ljava/lang/Boolean;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;",
            ">;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride<",
            "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "iconAlignment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "margin"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overrides"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 14
    iput p2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 15
    iput p3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 16
    iput-object p4, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 17
    iput-object p5, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 18
    iput-object p6, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 19
    iput-object p7, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 20
    iput-object p8, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 21
    iput-object p9, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 22
    iput-object p10, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    .line 23
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    invoke-direct {v1, v2, v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 24
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;->getZero()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    .line 25
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;->getZero()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-result-object v1

    move-object v10, v1

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    .line 26
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v1

    move-object v11, v1

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_5

    .line 27
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v0

    move-object v12, v0

    :goto_5
    move-object v2, p0

    move v3, p1

    move v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    goto :goto_6

    :cond_5
    move-object/from16 v12, p10

    goto :goto_5

    .line 28
    :goto_6
    invoke-direct/range {v2 .. v12}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;-><init>(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getColumnGutter$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getIconAlignment$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getItemSpacing$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getTextSpacing$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final synthetic write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;LUf/d;LTf/e;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 5
    .line 6
    invoke-interface {p1, p2, v1, v2}, LUf/d;->p(LTf/e;II)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 11
    .line 12
    invoke-interface {p1, p2, v1, v2}, LUf/d;->p(LTf/e;II)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    iget v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 17
    .line 18
    invoke-interface {p1, p2, v1, v2}, LUf/d;->p(LTf/e;II)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    :goto_0
    sget-object v2, LVf/h;->a:LVf/h;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-interface {p1, p2, v1, v2, v3}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/4 v1, 0x5

    .line 49
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 57
    .line 58
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 59
    .line 60
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 61
    .line 62
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 63
    .line 64
    invoke-direct {v3, v4, v5}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    :goto_1
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 74
    .line 75
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 76
    .line 77
    invoke-interface {p1, p2, v1, v2, v3}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    const/4 v1, 0x6

    .line 81
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 89
    .line 90
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;

    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;->getZero()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    :goto_2
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 103
    .line 104
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 105
    .line 106
    invoke-interface {p1, p2, v1, v2, v3}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    const/4 v1, 0x7

    .line 110
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 118
    .line 119
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->Companion:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;

    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;->getZero()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_7

    .line 130
    .line 131
    :goto_3
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 132
    .line 133
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 134
    .line 135
    invoke-interface {p1, p2, v1, v2, v3}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    const/16 v1, 0x8

    .line 139
    .line 140
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_8

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_8
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 148
    .line 149
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-nez v2, :cond_9

    .line 158
    .line 159
    :goto_4
    aget-object v2, v0, v1

    .line 160
    .line 161
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {p1, p2, v1, v2, v3}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_9
    const/16 v1, 0x9

    .line 167
    .line 168
    invoke-interface {p1, p2, v1}, LUf/d;->g(LTf/e;I)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_a
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 176
    .line 177
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-nez v2, :cond_b

    .line 186
    .line 187
    :goto_5
    aget-object v0, v0, v1

    .line 188
    .line 189
    iget-object p0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {p1, p2, v1, v0, p0}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_b
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    .line 12
    .line 13
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 14
    .line 15
    iget v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 21
    .line 22
    iget v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 28
    .line 29
    iget v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 35
    .line 36
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 42
    .line 43
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_6

    .line 50
    .line 51
    return v2

    .line 52
    :cond_6
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 53
    .line 54
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 55
    .line 56
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 64
    .line 65
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 66
    .line 67
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 75
    .line 76
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 86
    .line 87
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_a

    .line 94
    .line 95
    return v2

    .line 96
    :cond_a
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    return v0
.end method

.method public final synthetic getColumnGutter()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getIconAlignment()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getItemSpacing()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getItems()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getOverrides()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getTextSpacing()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getVisible()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v0, v1

    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :goto_0
    add-int/2addr v0, v1

    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v0, v1

    .line 44
    mul-int/lit8 v0, v0, 0x1f

    .line 45
    .line 46
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v0, v1

    .line 53
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    mul-int/lit8 v0, v0, 0x1f

    .line 63
    .line 64
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v0, v1

    .line 71
    mul-int/lit8 v0, v0, 0x1f

    .line 72
    .line 73
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/2addr v0, v1

    .line 80
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "TimelineComponent(itemSpacing="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->itemSpacing:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", textSpacing="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->textSpacing:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", columnGutter="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->columnGutter:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", iconAlignment="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->iconAlignment:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", visible="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->visible:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", size="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", padding="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", margin="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", items="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->items:Ljava/util/List;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", overrides="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->overrides:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const/16 v1, 0x29

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method
