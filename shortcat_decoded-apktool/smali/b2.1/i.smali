.class public abstract Lb2/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(Lkotlin/jvm/functions/Function1;Lie/a;)Lb2/k;
    .locals 1

    .line 1
    new-instance v0, Lb2/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lb2/i$a;-><init>(Lie/a;Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Lie/a;F)Lb2/m;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lb2/i;->a(Lkotlin/jvm/functions/Function1;Lie/a;)Lb2/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lb2/m;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lb2/m;-><init>(Lb2/k;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p1, Lb2/m;

    .line 18
    .line 19
    invoke-direct {p1, p0, p2}, Lb2/m;-><init>(Lb2/k;F)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method
