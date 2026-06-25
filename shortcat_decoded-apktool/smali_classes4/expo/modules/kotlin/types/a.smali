.class public abstract Lexpo/modules/kotlin/types/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/types/b;


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


# virtual methods
.method public a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/kotlin/types/a;->d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance p1, Lcc/s;

    .line 9
    .line 10
    invoke-direct {p1}, Lcc/s;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/types/b$a;->b(Lexpo/modules/kotlin/types/b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public abstract d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
.end method
