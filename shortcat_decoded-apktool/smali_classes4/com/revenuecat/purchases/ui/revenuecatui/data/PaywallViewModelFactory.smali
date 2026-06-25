.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;
.super Landroidx/lifecycle/W$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0014\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0011*\u00020\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0019R\"\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;",
        "Landroidx/lifecycle/W$d;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "resourceProvider",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "options",
        "LU/l;",
        "colorScheme",
        "",
        "isDarkMode",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "shouldDisplayBlock",
        "preview",
        "<init>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;Z)V",
        "Landroidx/lifecycle/U;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)Landroidx/lifecycle/U;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "LU/l;",
        "Z",
        "Lkotlin/jvm/functions/Function1;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final colorScheme:LU/l;

.field private final isDarkMode:Z

.field private final options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

.field private final preview:Z

.field private final resourceProvider:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;

.field private final shouldDisplayBlock:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
            "LU/l;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Z)V"
        }
    .end annotation

    const-string v0, "resourceProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorScheme"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroidx/lifecycle/W$d;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->resourceProvider:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;

    .line 4
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->colorScheme:LU/l;

    .line 6
    iput-boolean p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->isDarkMode:Z

    .line 7
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->shouldDisplayBlock:Lkotlin/jvm/functions/Function1;

    .line 8
    iput-boolean p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->preview:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;Z)V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Landroidx/lifecycle/U;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/U;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->resourceProvider:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->options:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 9
    .line 10
    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->colorScheme:LU/l;

    .line 11
    .line 12
    iget-boolean v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->isDarkMode:Z

    .line 13
    .line 14
    iget-boolean v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->preview:Z

    .line 15
    .line 16
    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;->shouldDisplayBlock:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 19
    .line 20
    const/16 v10, 0x82

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    invoke-direct/range {v1 .. v11}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;ZLcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method
