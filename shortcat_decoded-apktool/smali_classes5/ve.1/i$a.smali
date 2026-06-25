.class Lve/i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lve/i;-><init>(Lpf/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lve/i;


# direct methods
.method constructor <init>(Lve/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lve/i$a;->a:Lve/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 6

    .line 1
    iget-object v0, p0, Lve/i$a;->a:Lve/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lve/i;->s()LBe/F;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lve/o;->A:LXe/c;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LBe/F;->S(LXe/c;)Lye/V;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lve/i$a;->a:Lve/i;

    .line 14
    .line 15
    invoke-virtual {v1}, Lve/i;->s()LBe/F;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Lve/o;->C:LXe/c;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, LBe/F;->S(LXe/c;)Lye/V;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lve/i$a;->a:Lve/i;

    .line 26
    .line 27
    invoke-virtual {v2}, Lve/i;->s()LBe/F;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lve/o;->D:LXe/c;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, LBe/F;->S(LXe/c;)Lye/V;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lve/i$a;->a:Lve/i;

    .line 38
    .line 39
    invoke-virtual {v3}, Lve/i;->s()LBe/F;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    sget-object v4, Lve/o;->B:LXe/c;

    .line 44
    .line 45
    invoke-virtual {v3, v4}, LBe/F;->S(LXe/c;)Lye/V;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/4 v4, 0x4

    .line 50
    new-array v4, v4, [Lye/V;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    aput-object v0, v4, v5

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    aput-object v1, v4, v0

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    aput-object v2, v4, v0

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    aput-object v3, v4, v0

    .line 63
    .line 64
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lve/i$a;->a()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
