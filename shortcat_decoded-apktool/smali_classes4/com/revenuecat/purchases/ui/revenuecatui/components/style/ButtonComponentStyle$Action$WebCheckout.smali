.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WebCheckout"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;",
        "rcPackage",
        "Lcom/revenuecat/purchases/Package;",
        "autoDismiss",
        "",
        "openMethod",
        "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;",
        "(Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V",
        "getAutoDismiss",
        "()Z",
        "getOpenMethod",
        "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;",
        "getRcPackage",
        "()Lcom/revenuecat/purchases/Package;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final autoDismiss:Z

.field private final openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

.field private final rcPackage:Lcom/revenuecat/purchases/Package;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V
    .locals 1

    .line 1
    const-string v0, "openMethod"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 12
    .line 13
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->copy(Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/revenuecat/purchases/Package;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 2
    .line 3
    return v0
.end method

.method public final component3()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;
    .locals 1

    .line 1
    const-string v0, "openMethod"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;-><init>(Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

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
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;

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
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 25
    .line 26
    iget-boolean v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 34
    .line 35
    if-eq v1, p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public final getAutoDismiss()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getOpenMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRcPackage()Lcom/revenuecat/purchases/Package;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Package;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
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
    const-string v1, "WebCheckout(rcPackage="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->rcPackage:Lcom/revenuecat/purchases/Package;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", autoDismiss="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->autoDismiss:Z

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", openMethod="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->openMethod:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x29

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
