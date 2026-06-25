.class public final Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;,
        Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$PaywallViewAttributes;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;",
        "",
        "()V",
        "Companion",
        "PaywallViewAttributes",
        "revenuecatui_defaultsBc8Release"
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;

.field public static final DEFAULT_CONDENSED:Z = false

.field private static final styleablesByStyleSet:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "[I",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;

    .line 8
    .line 9
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallView:[I

    .line 10
    .line 11
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;->OfferingId:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;

    .line 12
    .line 13
    sget v2, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallView_offeringIdentifier:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;->ShouldDisplayDismissButton:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;

    .line 24
    .line 25
    sget v4, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallView_shouldDisplayDismissButton:I

    .line 26
    .line 27
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v3, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;->FontFamily:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;

    .line 36
    .line 37
    sget v5, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallView_android_fontFamily:I

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v4, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    filled-new-array {v2, v3, v5}, [Lkotlin/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallFooterView:[I

    .line 60
    .line 61
    sget v3, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallFooterView_offeringIdentifier:I

    .line 62
    .line 63
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget v3, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallFooterView_android_fontFamily:I

    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    filled-new-array {v1, v3}, [Lkotlin/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;->styleablesByStyleSet:Ljava/util/Map;

    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getStyleablesByStyleSet$cp()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;->styleablesByStyleSet:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
