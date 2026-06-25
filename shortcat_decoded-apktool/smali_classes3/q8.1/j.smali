.class public abstract Lq8/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/util/List;)Lq8/j;
    .locals 1

    .line 1
    new-instance v0, Lq8/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lq8/d;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b()Lfa/a;
    .locals 2

    .line 1
    new-instance v0, Lha/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lha/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lq8/b;->a:Lga/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lha/d;->j(Lga/a;)Lha/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lha/d;->k(Z)Lha/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lha/d;->i()Lfa/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
.end method
