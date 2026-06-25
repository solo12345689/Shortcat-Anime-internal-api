.class final LQ/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroidx/compose/ui/platform/A1;

.field private b:I

.field private c:LE0/C;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/A1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ/d;->a:Landroidx/compose/ui/platform/A1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LQ/d;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b(LE0/C;LE0/C;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ/d;->a:Landroidx/compose/ui/platform/A1;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, LQ/s;->b(Landroidx/compose/ui/platform/A1;LE0/C;LE0/C;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final c(LE0/C;LE0/C;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, LE0/C;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, LE0/C;->o()J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    sub-long/2addr v0, p1

    .line 10
    iget-object p1, p0, LQ/d;->a:Landroidx/compose/ui/platform/A1;

    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/compose/ui/platform/A1;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    cmp-long p1, v0, p1

    .line 17
    .line 18
    if-gez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final d(LE0/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ/d;->c:LE0/C;

    .line 2
    .line 3
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LE0/C;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, LQ/d;->c(LE0/C;LE0/C;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, LQ/d;->b(LE0/C;LE0/C;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget v0, p0, LQ/d;->b:I

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    iput v0, p0, LQ/d;->b:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v1, p0, LQ/d;->b:I

    .line 36
    .line 37
    :goto_0
    iput-object p1, p0, LQ/d;->c:LE0/C;

    .line 38
    .line 39
    return-void
.end method
