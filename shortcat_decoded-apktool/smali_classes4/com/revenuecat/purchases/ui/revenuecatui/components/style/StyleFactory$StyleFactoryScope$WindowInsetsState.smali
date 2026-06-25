.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "WindowInsetsState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\"\u0010\n\u001a\u00020\t8F@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8F@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u0011\u0010\r\"\u0004\u0008\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u000b\u001a\u0004\u0008\u0014\u0010\r\"\u0004\u0008\u0015\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u000bR\u0018\u0010\u0017\u001a\u00020\t*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\t*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0018R\u0018\u0010\u001a\u001a\u00020\t*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;",
        "",
        "<init>",
        "()V",
        "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;",
        "component",
        "LTd/L;",
        "handleHeaderMediaViewWindowInsets",
        "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V",
        "",
        "applyTopWindowInsets",
        "Z",
        "getApplyTopWindowInsets",
        "()Z",
        "setApplyTopWindowInsets",
        "(Z)V",
        "ignoreTopWindowInsets",
        "getIgnoreTopWindowInsets",
        "setIgnoreTopWindowInsets",
        "topWindowInsetsApplied",
        "getTopWindowInsetsApplied",
        "setTopWindowInsetsApplied",
        "stillLookingForHeaderMedia",
        "isHeaderMedia",
        "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z",
        "isHeaderImage",
        "isHeaderVideo",
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


# instance fields
.field private applyTopWindowInsets:Z

.field private ignoreTopWindowInsets:Z

.field private stillLookingForHeaderMedia:Z

.field private topWindowInsetsApplied:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 6
    .line 7
    return-void
.end method

.method private final isHeaderImage(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move p1, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    instance-of p1, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 30
    .line 31
    :goto_0
    if-eqz p1, :cond_2

    .line 32
    .line 33
    move p1, v1

    .line 34
    :goto_1
    if-eqz p1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_2
    new-instance p1, LTd/r;

    .line 38
    .line 39
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_3
    return v1
.end method

.method private final isHeaderMedia(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->isHeaderImage(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->isHeaderVideo(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method private final isHeaderVideo(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move p1, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    instance-of p1, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 30
    .line 31
    :goto_0
    if-eqz p1, :cond_2

    .line 32
    .line 33
    move p1, v1

    .line 34
    :goto_1
    if-eqz p1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_2
    new-instance p1, LTd/r;

    .line 38
    .line 39
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_3
    return v1
.end method


# virtual methods
.method public final getApplyTopWindowInsets()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->applyTopWindowInsets:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->applyTopWindowInsets:Z

    .line 5
    .line 6
    return v0
.end method

.method public final getIgnoreTopWindowInsets()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->ignoreTopWindowInsets:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->ignoreTopWindowInsets:Z

    .line 5
    .line 6
    return v0
.end method

.method public final getTopWindowInsetsApplied()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->topWindowInsetsApplied:Z

    .line 2
    .line 3
    return v0
.end method

.method public final handleHeaderMediaViewWindowInsets(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V
    .locals 4

    .line 1
    const-string v0, "component"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/StackComponent;->getDimension()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v2, v0, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/StackComponent;->getComponents()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->isHeaderMedia(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-ne p1, v3, :cond_0

    .line 43
    .line 44
    move v1, v3

    .line 45
    :cond_0
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->topWindowInsetsApplied:Z

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    instance-of p1, v0, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    instance-of v3, v0, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;

    .line 54
    .line 55
    :goto_0
    if-eqz v3, :cond_3

    .line 56
    .line 57
    :goto_1
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->applyTopWindowInsets:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    new-instance p1, LTd/r;

    .line 61
    .line 62
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_4
    return-void

    .line 67
    :cond_5
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;

    .line 68
    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->isHeaderImage(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->ignoreTopWindowInsets:Z

    .line 80
    .line 81
    :cond_6
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 82
    .line 83
    return-void

    .line 84
    :cond_7
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    .line 85
    .line 86
    if-eqz v0, :cond_9

    .line 87
    .line 88
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 89
    .line 90
    if-eqz v0, :cond_8

    .line 91
    .line 92
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->isHeaderVideo(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->ignoreTopWindowInsets:Z

    .line 97
    .line 98
    :cond_8
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 99
    .line 100
    return-void

    .line 101
    :cond_9
    iput-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->stillLookingForHeaderMedia:Z

    .line 102
    .line 103
    return-void
.end method

.method public final setApplyTopWindowInsets(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->applyTopWindowInsets:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setIgnoreTopWindowInsets(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->ignoreTopWindowInsets:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTopWindowInsetsApplied(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;->topWindowInsetsApplied:Z

    .line 2
    .line 3
    return-void
.end method
