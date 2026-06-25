.class public final LD4/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD4/d;


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
.method public bridge synthetic a(Ljava/lang/Object;LG4/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ldg/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LD4/c;->b(Ldg/u;LG4/m;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Ldg/u;LG4/m;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ldg/u;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
