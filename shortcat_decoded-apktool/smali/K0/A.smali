.class public final LK0/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LK0/J;

.field private final b:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/J;LI0/B;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/A;->a:LK0/J;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {p2, p1, v0, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LK0/A;->b:LY/C0;

    .line 13
    .line 14
    return-void
.end method

.method private final a()LI0/B;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/A;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LI0/B;

    .line 8
    .line 9
    return-object v0
.end method

.method private final j(LI0/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/A;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->O()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->maxIntrinsicHeight(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final c(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->O()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->maxIntrinsicWidth(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final d(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->N()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->maxIntrinsicHeight(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final e(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->N()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->maxIntrinsicWidth(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final f(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->O()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->minIntrinsicHeight(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final g(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->O()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->minIntrinsicWidth(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final h(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->N()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->minIntrinsicHeight(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final i(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LK0/A;->a()LI0/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/A;->a:LK0/J;

    .line 6
    .line 7
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LK0/A;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {v2}, LK0/J;->N()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, LI0/B;->minIntrinsicWidth(LI0/m;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final k(LI0/B;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK0/A;->j(LI0/B;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
