.class final Landroidx/compose/foundation/layout/j;
.super Landroidx/compose/foundation/layout/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LC/x;

.field private b:Z


# direct methods
.method public constructor <init>(LC/x;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/layout/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/j;->a:LC/x;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/layout/j;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public E1(Landroidx/compose/ui/layout/l;LI0/A;J)J
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/layout/j;->a:LC/x;

    .line 2
    .line 3
    sget-object v0, LC/x;->a:LC/x;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-interface {p2, p1}, LI0/l;->Z(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-interface {p2, p1}, LI0/l;->I(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    if-gez p1, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    :cond_1
    sget-object p2, Li1/b;->b:Li1/b$a;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Li1/b$a;->d(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1
.end method

.method public F1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/j;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public G1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/j;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public final H1(LC/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/j;->a:LC/x;

    .line 2
    .line 3
    return-void
.end method

.method public maxIntrinsicHeight(LI0/m;LI0/l;I)I
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/layout/j;->a:LC/x;

    .line 2
    .line 3
    sget-object v0, LC/x;->a:LC/x;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p2, p3}, LI0/l;->Z(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-interface {p2, p3}, LI0/l;->I(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public minIntrinsicHeight(LI0/m;LI0/l;I)I
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/layout/j;->a:LC/x;

    .line 2
    .line 3
    sget-object v0, LC/x;->a:LC/x;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p2, p3}, LI0/l;->Z(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-interface {p2, p3}, LI0/l;->I(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method
