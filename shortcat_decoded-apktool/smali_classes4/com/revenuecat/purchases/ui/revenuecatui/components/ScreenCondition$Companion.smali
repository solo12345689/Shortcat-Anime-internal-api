.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition$Companion;",
        "",
        "<init>",
        "()V",
        "Lb4/c;",
        "sizeClass",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;",
        "from",
        "(Lb4/c;)Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic from(Lb4/c;)Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;
    .locals 3

    .line 1
    const-string v0, "sizeClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb4/c;->c:Lb4/c;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->COMPACT:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object v0, Lb4/c;->d:Lb4/c;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->MEDIUM:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    sget-object v0, Lb4/c;->e:Lb4/c;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->EXPANDED:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "Unexpected WindowWidthSizeClass: \'"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, "\'. Falling back to COMPACT."

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;->COMPACT:Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;

    .line 67
    .line 68
    return-object p1
.end method
