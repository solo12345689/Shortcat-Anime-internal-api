.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySetKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u001c\n\u0000\u001a5\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u0008H\u0000\u00a8\u0006\t"
    }
    d2 = {
        "nonEmptySetOf",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;",
        "A",
        "head",
        "t",
        "",
        "(Ljava/lang/Object;[Ljava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;",
        "toNonEmptySetOrNull",
        "",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final varargs synthetic nonEmptySetOf(Ljava/lang/Object;[Ljava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;
    .locals 1

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;

    .line 7
    .line 8
    invoke-static {p1}, LUd/n;->L([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;-><init>(Ljava/lang/Object;Ljava/lang/Iterable;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final synthetic toNonEmptySetOrNull(Ljava/lang/Iterable;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1;

    .line 25
    .line 26
    invoke-direct {v2, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1;-><init>(Ljava/util/Iterator;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;-><init>(Ljava/lang/Object;Ljava/lang/Iterable;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
