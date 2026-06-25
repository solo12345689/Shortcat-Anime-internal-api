.class public Lp1/f;
.super Lp1/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>([C)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lp1/b;-><init>([C)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public Z()Lp1/f;
    .locals 1

    .line 1
    invoke-super {p0}, Lp1/b;->v()Lp1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lp1/f;

    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic c()Lp1/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp1/f;->Z()Lp1/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp1/f;->Z()Lp1/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lp1/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp1/f$a;-><init>(Lp1/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic v()Lp1/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp1/f;->Z()Lp1/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
