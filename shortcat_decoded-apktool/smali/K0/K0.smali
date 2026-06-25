.class public final LK0/K0;
.super LY/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, LY/a;->d:I

    .line 2
    .line 3
    sput v0, LK0/K0;->e:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(LK0/J;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/a;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/a;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LK0/J;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LK0/J;->z1(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(III)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/a;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LK0/J;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, LK0/J;->p1(III)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic e(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LK0/J;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LK0/K0;->p(ILK0/J;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-super {p0}, LY/d;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LY/a;->l()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LK0/J;

    .line 9
    .line 10
    invoke-virtual {v0}, LK0/J;->z0()LK0/p0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, LK0/p0;->G()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public bridge synthetic g(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LK0/J;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LK0/K0;->o(ILK0/J;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/a;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LK0/J;

    .line 6
    .line 7
    invoke-virtual {v0}, LK0/J;->s1()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected m()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/a;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LK0/J;

    .line 6
    .line 7
    invoke-virtual {v0}, LK0/J;->y1()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o(ILK0/J;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/a;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LK0/J;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LK0/J;->O0(ILK0/J;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(ILK0/J;)V
    .locals 0

    .line 1
    return-void
.end method
