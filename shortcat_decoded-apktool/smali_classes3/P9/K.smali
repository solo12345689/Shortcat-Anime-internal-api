.class public abstract LP9/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(Ljava/util/Comparator;)LP9/K;
    .locals 1

    .line 1
    instance-of v0, p0, LP9/K;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LP9/K;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, LP9/l;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LP9/l;-><init>(Ljava/util/Comparator;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static c()LP9/K;
    .locals 1

    .line 1
    sget-object v0, LP9/H;->a:LP9/H;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Comparator;)LP9/K;
    .locals 1

    .line 1
    new-instance v0, LP9/n;

    .line 2
    .line 3
    invoke-static {p1}, LO9/n;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Comparator;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, LP9/n;-><init>(Ljava/util/Comparator;Ljava/util/Comparator;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method

.method public d(LO9/f;)LP9/K;
    .locals 1

    .line 1
    new-instance v0, LP9/g;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LP9/g;-><init>(LO9/f;LP9/K;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public e()LP9/K;
    .locals 1

    .line 1
    new-instance v0, LP9/S;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP9/S;-><init>(LP9/K;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
