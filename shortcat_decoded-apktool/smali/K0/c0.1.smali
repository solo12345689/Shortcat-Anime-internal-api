.class public final LK0/c0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/c0$a;,
        LK0/c0$b;
    }
.end annotation


# instance fields
.field private final a:LK0/J;

.field private final b:LK0/c0$c;

.field private final c:LK0/y;

.field private d:LK0/e0;

.field private final e:Landroidx/compose/ui/e$c;

.field private f:Landroidx/compose/ui/e$c;

.field private g:La0/c;

.field private h:La0/c;

.field private final i:La0/c;

.field private j:LK0/c0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/J;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/c0;->a:LK0/J;

    .line 5
    .line 6
    new-instance v0, LK0/c0$c;

    .line 7
    .line 8
    invoke-direct {v0}, LK0/c0$c;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->setAggregateChildKindSet$ui_release(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LK0/c0;->b:LK0/c0$c;

    .line 16
    .line 17
    new-instance v0, LK0/y;

    .line 18
    .line 19
    invoke-direct {v0, p1}, LK0/y;-><init>(LK0/J;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LK0/c0;->c:LK0/y;

    .line 23
    .line 24
    iput-object v0, p0, LK0/c0;->d:LK0/e0;

    .line 25
    .line 26
    invoke-virtual {v0}, LK0/y;->K3()LK0/E0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 31
    .line 32
    iput-object p1, p0, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 33
    .line 34
    new-instance p1, La0/c;

    .line 35
    .line 36
    const/16 v0, 0x10

    .line 37
    .line 38
    new-array v0, v0, [Landroidx/compose/ui/e;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, v0, v1}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LK0/c0;->i:La0/c;

    .line 45
    .line 46
    return-void
.end method

.method private final B(ILa0/c;La0/c;Landroidx/compose/ui/e$c;Z)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move v2, p1

    .line 3
    move-object v3, p2

    .line 4
    move-object v4, p3

    .line 5
    move-object v1, p4

    .line 6
    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, LK0/c0;->j(Landroidx/compose/ui/e$c;ILa0/c;La0/c;Z)LK0/c0$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v3}, La0/c;->p()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    sub-int/2addr p2, v2

    .line 16
    invoke-virtual {v4}, La0/c;->p()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    sub-int/2addr p3, v2

    .line 21
    invoke-static {p2, p3, p1}, LK0/b0;->e(IILK0/q;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, LK0/c0;->C()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final C()V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, LK0/c0;->b:LK0/c0$c;

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    or-int/2addr v1, v2

    .line 19
    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->setAggregateChildKindSet$ui_release(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private final E(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 5

    .line 1
    iget-object v0, p0, LK0/c0;->b:LK0/c0$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    move p1, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p1, v1

    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    const-string p1, "trimChain called on already trimmed chain"

    .line 13
    .line 14
    invoke-static {p1}, LH0/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p1, p0, LK0/c0;->b:LK0/c0$c;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 26
    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->setParent$ui_release(Landroidx/compose/ui/e$c;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, LK0/c0;->b:LK0/c0$c;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Landroidx/compose/ui/e$c;->setChild$ui_release(Landroidx/compose/ui/e$c;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, LK0/c0;->b:LK0/c0$c;

    .line 37
    .line 38
    const/4 v4, -0x1

    .line 39
    invoke-virtual {v3, v4}, Landroidx/compose/ui/e$c;->setAggregateChildKindSet$ui_release(I)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, LK0/c0;->b:LK0/c0$c;

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Landroidx/compose/ui/e$c;->updateCoordinator$ui_release(LK0/e0;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, LK0/c0;->b:LK0/c0$c;

    .line 48
    .line 49
    if-eq p1, v0, :cond_3

    .line 50
    .line 51
    move v1, v2

    .line 52
    :cond_3
    if-nez v1, :cond_4

    .line 53
    .line 54
    const-string v0, "trimChain did not update the head"

    .line 55
    .line 56
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    return-object p1
.end method

.method private final G(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V
    .locals 1

    .line 1
    instance-of p1, p1, LK0/Y;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    instance-of p1, p2, LK0/Y;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    check-cast p2, LK0/Y;

    .line 11
    .line 12
    invoke-static {p2, p3}, LK0/d0;->b(LK0/Y;Landroidx/compose/ui/e$c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p3}, LK0/h0;->e(Landroidx/compose/ui/e$c;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p3, v0}, Landroidx/compose/ui/e$c;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p1, p3, LK0/c;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    move-object p1, p3

    .line 34
    check-cast p1, LK0/c;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, LK0/c;->I1(Landroidx/compose/ui/e$b;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-static {p3}, LK0/h0;->e(Landroidx/compose/ui/e$c;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-virtual {p3, v0}, Landroidx/compose/ui/e$c;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    const-string p1, "Unknown Modifier.Node type"

    .line 54
    .line 55
    invoke-static {p1}, LH0/a;->b(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic a(LK0/c0;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LK0/c0;->g(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LK0/c0;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK0/c0;->h(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(LK0/c0;)I
    .locals 0

    .line 1
    invoke-direct {p0}, LK0/c0;->i()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic d(LK0/c0;)LK0/c0$b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(LK0/c0;Landroidx/compose/ui/e$c;LK0/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LK0/c0;->w(Landroidx/compose/ui/e$c;LK0/e0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(LK0/c0;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LK0/c0;->G(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    instance-of v0, p1, LK0/Y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LK0/Y;

    .line 6
    .line 7
    invoke-virtual {p1}, LK0/Y;->create()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, LK0/h0;->h(Landroidx/compose/ui/e$c;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->setKindSet$ui_release(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, LK0/c;

    .line 20
    .line 21
    invoke-direct {v0, p1}, LK0/c;-><init>(Landroidx/compose/ui/e$b;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    .line 32
    .line 33
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->setInsertedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1, p2}, LK0/c0;->r(Landroidx/compose/ui/e$c;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method private final h(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LK0/h0;->d(Landroidx/compose/ui/e$c;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->runDetachLifecycle$ui_release()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->markAsDetached$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0, p1}, LK0/c0;->x(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final i()I
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private final j(Landroidx/compose/ui/e$c;ILa0/c;La0/c;Z)LK0/c0$a;
    .locals 8

    .line 1
    iget-object v0, p0, LK0/c0;->j:LK0/c0$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LK0/c0$a;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    move-object v3, p1

    .line 9
    move v4, p2

    .line 10
    move-object v5, p3

    .line 11
    move-object v6, p4

    .line 12
    move v7, p5

    .line 13
    invoke-direct/range {v1 .. v7}, LK0/c0$a;-><init>(LK0/c0;Landroidx/compose/ui/e$c;ILa0/c;La0/c;Z)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v2, LK0/c0;->j:LK0/c0$a;

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    move-object v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move v4, p2

    .line 22
    move-object v5, p3

    .line 23
    move-object v6, p4

    .line 24
    move v7, p5

    .line 25
    invoke-virtual {v0, v3}, LK0/c0$a;->g(Landroidx/compose/ui/e$c;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v4}, LK0/c0$a;->h(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, LK0/c0$a;->f(La0/c;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v6}, LK0/c0$a;->a(La0/c;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v7}, LK0/c0$a;->i(Z)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private final r(Landroidx/compose/ui/e$c;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/compose/ui/e$c;->setParent$ui_release(Landroidx/compose/ui/e$c;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->setChild$ui_release(Landroidx/compose/ui/e$c;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p2, p1}, Landroidx/compose/ui/e$c;->setChild$ui_release(Landroidx/compose/ui/e$c;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroidx/compose/ui/e$c;->setParent$ui_release(Landroidx/compose/ui/e$c;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method private final v()Landroidx/compose/ui/e$c;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    iget-object v1, p0, LK0/c0;->b:LK0/c0$c;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "padChain called on already padded chain"

    .line 13
    .line 14
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 18
    .line 19
    iget-object v1, p0, LK0/c0;->b:LK0/c0$c;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->setParent$ui_release(Landroidx/compose/ui/e$c;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LK0/c0;->b:LK0/c0$c;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroidx/compose/ui/e$c;->setChild$ui_release(Landroidx/compose/ui/e$c;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LK0/c0;->b:LK0/c0$c;

    .line 30
    .line 31
    return-object v0
.end method

.method private final w(Landroidx/compose/ui/e$c;LK0/e0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    if-eqz p1, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, LK0/c0;->b:LK0/c0$c;

    .line 8
    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, LK0/c0;->a:LK0/J;

    .line 12
    .line 13
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, LK0/J;->X()LK0/e0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_1
    invoke-virtual {p2, p1}, LK0/e0;->w3(LK0/e0;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, LK0/c0;->d:LK0/e0;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/4 v0, 0x2

    .line 32
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    and-int/2addr v0, v1

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {p1, p2}, Landroidx/compose/ui/e$c;->updateCoordinator$ui_release(LK0/e0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method

.method private final x(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->setParent$ui_release(Landroidx/compose/ui/e$c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroidx/compose/ui/e$c;->setChild$ui_release(Landroidx/compose/ui/e$c;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroidx/compose/ui/e$c;->setChild$ui_release(Landroidx/compose/ui/e$c;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v2}, Landroidx/compose/ui/e$c;->setParent$ui_release(Landroidx/compose/ui/e$c;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method


# virtual methods
.method public final A()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->runDetachLifecycle$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method public final D()V
    .locals 5

    .line 1
    iget-object v0, p0, LK0/c0;->c:LK0/y;

    .line 2
    .line 3
    iget-object v1, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-static {v1}, LK0/k;->d(Landroidx/compose/ui/e$c;)LK0/E;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v3, LK0/F;

    .line 33
    .line 34
    invoke-virtual {v3}, LK0/F;->L3()LK0/E;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v2}, LK0/F;->O3(LK0/E;)V

    .line 39
    .line 40
    .line 41
    if-eq v4, v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3}, LK0/e0;->e3()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v3, LK0/F;

    .line 48
    .line 49
    iget-object v4, p0, LK0/c0;->a:LK0/J;

    .line 50
    .line 51
    invoke-direct {v3, v4, v2}, LK0/F;-><init>(LK0/J;LK0/E;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Landroidx/compose/ui/e$c;->updateCoordinator$ui_release(LK0/e0;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, LK0/e0;->w3(LK0/e0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, LK0/e0;->v3(LK0/e0;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v0}, Landroidx/compose/ui/e$c;->updateCoordinator$ui_release(LK0/e0;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    iget-object v1, p0, LK0/c0;->a:LK0/J;

    .line 74
    .line 75
    invoke-virtual {v1}, LK0/J;->A0()LK0/J;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {v1}, LK0/J;->X()LK0/e0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    const/4 v1, 0x0

    .line 87
    :goto_3
    invoke-virtual {v0, v1}, LK0/e0;->w3(LK0/e0;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, LK0/c0;->d:LK0/e0;

    .line 91
    .line 92
    return-void
.end method

.method public final F(Landroidx/compose/ui/e;)V
    .locals 13

    .line 1
    invoke-direct {p0}, LK0/c0;->v()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    iget-object v7, p0, LK0/c0;->g:La0/c;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz v7, :cond_0

    .line 9
    .line 10
    invoke-virtual {v7}, La0/c;->p()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v0

    .line 16
    :goto_0
    iget-object v2, p0, LK0/c0;->h:La0/c;

    .line 17
    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, La0/c;

    .line 23
    .line 24
    new-array v5, v3, [Landroidx/compose/ui/e$b;

    .line 25
    .line 26
    invoke-direct {v2, v5, v0}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v5, p0, LK0/c0;->i:La0/c;

    .line 30
    .line 31
    invoke-static {p1, v2, v5}, LK0/d0;->a(Landroidx/compose/ui/e;La0/c;La0/c;)La0/c;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v8}, La0/c;->p()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v11, 0x0

    .line 40
    const-string v2, "expected prior modifier list to be non-empty"

    .line 41
    .line 42
    const/4 v12, 0x1

    .line 43
    if-ne p1, v1, :cond_9

    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move v6, v0

    .line 50
    :goto_1
    if-eqz p1, :cond_4

    .line 51
    .line 52
    if-ge v6, v1, :cond_4

    .line 53
    .line 54
    if-eqz v7, :cond_5

    .line 55
    .line 56
    iget-object v3, v7, La0/c;->a:[Ljava/lang/Object;

    .line 57
    .line 58
    aget-object v3, v3, v6

    .line 59
    .line 60
    check-cast v3, Landroidx/compose/ui/e$b;

    .line 61
    .line 62
    iget-object v5, v8, La0/c;->a:[Ljava/lang/Object;

    .line 63
    .line 64
    aget-object v5, v5, v6

    .line 65
    .line 66
    check-cast v5, Landroidx/compose/ui/e$b;

    .line 67
    .line 68
    invoke-static {v3, v5}, LK0/d0;->c(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_3

    .line 73
    .line 74
    if-eq v9, v12, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-direct {p0, v3, v5, p1}, LK0/c0;->G(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_4
    move-object v9, p1

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    invoke-static {v2}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 94
    .line 95
    .line 96
    new-instance p1, LTd/k;

    .line 97
    .line 98
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :goto_3
    if-ge v6, v1, :cond_8

    .line 103
    .line 104
    if-eqz v7, :cond_7

    .line 105
    .line 106
    if-eqz v9, :cond_6

    .line 107
    .line 108
    iget-object p1, p0, LK0/c0;->a:LK0/J;

    .line 109
    .line 110
    invoke-virtual {p1}, LK0/J;->L()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    xor-int/lit8 v10, p1, 0x1

    .line 115
    .line 116
    move-object v5, p0

    .line 117
    invoke-direct/range {v5 .. v10}, LK0/c0;->B(ILa0/c;La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 118
    .line 119
    .line 120
    :goto_4
    move v0, v12

    .line 121
    goto/16 :goto_8

    .line 122
    .line 123
    :cond_6
    move-object v5, p0

    .line 124
    const-string p1, "structuralUpdate requires a non-null tail"

    .line 125
    .line 126
    invoke-static {p1}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 127
    .line 128
    .line 129
    new-instance p1, LTd/k;

    .line 130
    .line 131
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :cond_7
    move-object v5, p0

    .line 136
    invoke-static {v2}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 137
    .line 138
    .line 139
    new-instance p1, LTd/k;

    .line 140
    .line 141
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_8
    move-object v5, p0

    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :cond_9
    move-object v5, p0

    .line 149
    iget-object p1, v5, LK0/c0;->a:LK0/J;

    .line 150
    .line 151
    invoke-virtual {p1}, LK0/J;->L()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_b

    .line 156
    .line 157
    if-nez v1, :cond_b

    .line 158
    .line 159
    move-object p1, v4

    .line 160
    :goto_5
    invoke-virtual {v8}, La0/c;->p()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-ge v0, v1, :cond_a

    .line 165
    .line 166
    iget-object v1, v8, La0/c;->a:[Ljava/lang/Object;

    .line 167
    .line 168
    aget-object v1, v1, v0

    .line 169
    .line 170
    check-cast v1, Landroidx/compose/ui/e$b;

    .line 171
    .line 172
    invoke-direct {p0, v1, p1}, LK0/c0;->g(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    add-int/lit8 v0, v0, 0x1

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_a
    invoke-direct {p0}, LK0/c0;->C()V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_b
    invoke-virtual {v8}, La0/c;->p()I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-nez p1, :cond_f

    .line 188
    .line 189
    if-eqz v7, :cond_e

    .line 190
    .line 191
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    move v1, v0

    .line 196
    :goto_6
    if-eqz p1, :cond_c

    .line 197
    .line 198
    invoke-virtual {v7}, La0/c;->p()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-ge v1, v2, :cond_c

    .line 203
    .line 204
    invoke-direct {p0, p1}, LK0/c0;->h(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    add-int/lit8 v1, v1, 0x1

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_c
    iget-object p1, v5, LK0/c0;->c:LK0/y;

    .line 216
    .line 217
    iget-object v1, v5, LK0/c0;->a:LK0/J;

    .line 218
    .line 219
    invoke-virtual {v1}, LK0/J;->A0()LK0/J;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-eqz v1, :cond_d

    .line 224
    .line 225
    invoke-virtual {v1}, LK0/J;->X()LK0/e0;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    goto :goto_7

    .line 230
    :cond_d
    move-object v1, v11

    .line 231
    :goto_7
    invoke-virtual {p1, v1}, LK0/e0;->w3(LK0/e0;)V

    .line 232
    .line 233
    .line 234
    iget-object p1, v5, LK0/c0;->c:LK0/y;

    .line 235
    .line 236
    iput-object p1, v5, LK0/c0;->d:LK0/e0;

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_e
    invoke-static {v2}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 240
    .line 241
    .line 242
    new-instance p1, LTd/k;

    .line 243
    .line 244
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_f
    if-nez v7, :cond_10

    .line 249
    .line 250
    new-instance v7, La0/c;

    .line 251
    .line 252
    new-array p1, v3, [Landroidx/compose/ui/e$b;

    .line 253
    .line 254
    invoke-direct {v7, p1, v0}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    :cond_10
    move-object v2, v7

    .line 258
    iget-object p1, v5, LK0/c0;->a:LK0/J;

    .line 259
    .line 260
    invoke-virtual {p1}, LK0/J;->L()Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    xor-int/2addr p1, v12

    .line 265
    const/4 v1, 0x0

    .line 266
    move-object v0, v5

    .line 267
    move-object v3, v8

    .line 268
    move v5, p1

    .line 269
    invoke-direct/range {v0 .. v5}, LK0/c0;->B(ILa0/c;La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 270
    .line 271
    .line 272
    move-object v5, v0

    .line 273
    move-object v7, v2

    .line 274
    goto/16 :goto_4

    .line 275
    .line 276
    :goto_8
    iput-object v8, v5, LK0/c0;->g:La0/c;

    .line 277
    .line 278
    if-eqz v7, :cond_11

    .line 279
    .line 280
    invoke-virtual {v7}, La0/c;->i()V

    .line 281
    .line 282
    .line 283
    move-object v11, v7

    .line 284
    :cond_11
    iput-object v11, v5, LK0/c0;->h:La0/c;

    .line 285
    .line 286
    invoke-direct {p0, v4}, LK0/c0;->E(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    iput-object p1, v5, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 291
    .line 292
    if-eqz v0, :cond_12

    .line 293
    .line 294
    invoke-virtual {p0}, LK0/c0;->D()V

    .line 295
    .line 296
    .line 297
    :cond_12
    return-void
.end method

.method public final k()Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LK0/y;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->c:LK0/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()LK0/J;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->a:LK0/J;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, LK0/c0;->g:La0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, La0/c;->p()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    new-instance v2, La0/c;

    .line 15
    .line 16
    new-array v1, v1, [LI0/F;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v1, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    if-eqz v1, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-eq v1, v4, :cond_4

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    invoke-virtual {v4}, LK0/e0;->H2()LK0/o0;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    iget-object v6, p0, LK0/c0;->c:LK0/y;

    .line 45
    .line 46
    invoke-virtual {v6}, LK0/e0;->H2()LK0/o0;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget-object v8, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 55
    .line 56
    if-ne v7, v8, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eq v8, v7, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const/4 v6, 0x0

    .line 70
    :goto_1
    if-nez v5, :cond_2

    .line 71
    .line 72
    move-object v5, v6

    .line 73
    :cond_2
    new-instance v6, LI0/F;

    .line 74
    .line 75
    add-int/lit8 v7, v3, 0x1

    .line 76
    .line 77
    iget-object v8, v0, La0/c;->a:[Ljava/lang/Object;

    .line 78
    .line 79
    aget-object v3, v8, v3

    .line 80
    .line 81
    check-cast v3, Landroidx/compose/ui/e;

    .line 82
    .line 83
    invoke-direct {v6, v3, v4, v5}, LI0/F;-><init>(Landroidx/compose/ui/e;LI0/p;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    move v3, v7

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    const-string v1, "getModifierInfo called on node with no coordinator"

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_4
    invoke-virtual {v2}, La0/c;->h()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0
.end method

.method public final o()LK0/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->d:LK0/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/c0;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c0;->b:LK0/c0$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final t()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->markAsAttached$ui_release()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LK0/c0;->f:Landroidx/compose/ui/e$c;

    .line 12
    .line 13
    iget-object v2, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 14
    .line 15
    const-string v3, "]"

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v4, p0, LK0/c0;->e:Landroidx/compose/ui/e$c;

    .line 47
    .line 48
    if-ne v2, v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string v2, ","

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "toString(...)"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public final u()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->markAsDetached$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->reset$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, LK0/c0;->A()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LK0/c0;->u()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->runAttachLifecycle$ui_release()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getInsertedNodeAwaitingAttachForInvalidation$ui_release()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, LK0/h0;->a(Landroidx/compose/ui/e$c;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getUpdatedNodeAwaitingAttachForInvalidation$ui_release()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, LK0/h0;->e(Landroidx/compose/ui/e$c;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->setInsertedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-void
.end method
