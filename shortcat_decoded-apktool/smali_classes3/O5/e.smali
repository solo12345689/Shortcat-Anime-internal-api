.class public LO5/e;
.super LS5/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final M:Ljava/lang/Class;


# instance fields
.field private final A:LD6/a;

.field private final B:Ly5/f;

.field private final C:Lx6/x;

.field private D:Ls5/d;

.field private E:Ly5/n;

.field private F:Z

.field private G:Ly5/f;

.field private H:LP5/a;

.field private I:Ljava/util/Set;

.field private J:LK6/b;

.field private K:[LK6/b;

.field private L:LK6/b;

.field private final z:Landroid/content/res/Resources;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, LO5/e;

    .line 2
    .line 3
    sput-object v0, LO5/e;->M:Ljava/lang/Class;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;LR5/a;LD6/a;LD6/a;Ljava/util/concurrent/Executor;Lx6/x;Ly5/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, p5, v0, v0}, LS5/a;-><init>(LR5/a;Ljava/util/concurrent/Executor;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LO5/e;->z:Landroid/content/res/Resources;

    .line 6
    .line 7
    new-instance p2, LO5/a;

    .line 8
    .line 9
    invoke-direct {p2, p1, p3, p4}, LO5/a;-><init>(Landroid/content/res/Resources;LD6/a;LD6/a;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, LO5/e;->A:LD6/a;

    .line 13
    .line 14
    iput-object p7, p0, LO5/e;->B:Ly5/f;

    .line 15
    .line 16
    iput-object p6, p0, LO5/e;->C:Lx6/x;

    .line 17
    .line 18
    return-void
.end method

.method public static l0(Landroid/graphics/drawable/Drawable;)LV5/o;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, LV5/o;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, LV5/o;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, LV5/c;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, LV5/c;

    .line 17
    .line 18
    invoke-interface {p0}, LV5/c;->b()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, LO5/e;->l0(Landroid/graphics/drawable/Drawable;)LV5/o;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    instance-of v1, p0, LV5/a;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    check-cast p0, LV5/a;

    .line 32
    .line 33
    invoke-virtual {p0}, LV5/a;->d()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0, v2}, LV5/a;->b(I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, LO5/e;->l0(Landroid/graphics/drawable/Drawable;)LV5/o;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object v0
.end method

.method private r0(Ly5/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO5/e;->E:Ly5/n;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, LO5/e;->v0(LE6/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private u0(Ly5/f;LE6/e;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LD6/a;

    .line 20
    .line 21
    invoke-interface {v1, p2}, LD6/a;->a(LE6/e;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1, p2}, LD6/a;->b(LE6/e;)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_2
    return-object v0
.end method

.method private v0(LE6/e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LO5/e;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, LS5/a;->s()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, LT5/a;

    .line 13
    .line 14
    invoke-direct {v0}, LT5/a;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, LU5/a;

    .line 18
    .line 19
    invoke-direct {v1, v0}, LU5/a;-><init>(LU5/b;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, LS5/a;->k(LS5/d;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, LS5/a;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, LS5/a;->s()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v0, v0, LT5/a;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, LS5/a;->s()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LT5/a;

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, LO5/e;->C0(LE6/e;LT5/a;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected A()Landroid/net/Uri;
    .locals 4

    .line 1
    iget-object v0, p0, LO5/e;->J:LK6/b;

    .line 2
    .line 3
    iget-object v1, p0, LO5/e;->L:LK6/b;

    .line 4
    .line 5
    iget-object v2, p0, LO5/e;->K:[LK6/b;

    .line 6
    .line 7
    sget-object v3, LK6/b;->A:Ly5/e;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Ll6/l;->a(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Ly5/e;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public A0(Ly5/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO5/e;->G:Ly5/f;

    .line 2
    .line 3
    return-void
.end method

.method public B0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LO5/e;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method protected C0(LE6/e;LT5/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LS5/a;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2, v0}, LT5/a;->j(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LS5/a;->f()LY5/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, LY5/b;->d()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LO5/e;->l0(Landroid/graphics/drawable/Drawable;)LV5/o;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, LV5/o;->A()LV5/q;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    invoke-virtual {p2, v1}, LT5/a;->m(LV5/q;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, LO5/e;->n0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-string v1, "cc"

    .line 39
    .line 40
    invoke-virtual {p2, v1, v0}, LT5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-interface {p1}, LE6/e;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {p1}, LE6/e;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p2, v0, v1}, LT5/a;->k(II)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, LE6/e;->A()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p2, p1}, LT5/a;->l(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    invoke-virtual {p2}, LT5/a;->i()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public bridge synthetic L(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, LE6/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO5/e;->w0(LE6/m;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected bridge synthetic N(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LO5/e;->x0(Ljava/lang/String;LC5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected Q(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    instance-of v0, p1, LN5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LN5/a;

    .line 6
    .line 7
    invoke-interface {p1}, LN5/a;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method protected bridge synthetic S(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO5/e;->y0(LC5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(LY5/b;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LS5/a;->g(LY5/b;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, LO5/e;->v0(LE6/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public declared-synchronized j0(LG6/e;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LO5/e;->I:Ljava/util/Set;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LO5/e;->I:Ljava/util/Set;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object v0, p0, LO5/e;->I:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method protected k0(LC5/a;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PipelineDraweeController#createDrawable"

    .line 8
    .line 9
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    invoke-static {p1}, LC5/a;->H(LC5/a;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ly5/k;->i(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, LC5/a;->C()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, LE6/e;

    .line 27
    .line 28
    invoke-direct {p0, p1}, LO5/e;->v0(LE6/e;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LO5/e;->G:Ly5/f;

    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, LO5/e;->u0(Ly5/f;LE6/e;)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-static {}, LL6/b;->d()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-static {}, LL6/b;->b()V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-object v0

    .line 49
    :cond_2
    :try_start_1
    iget-object v0, p0, LO5/e;->B:Ly5/f;

    .line 50
    .line 51
    invoke-direct {p0, v0, p1}, LO5/e;->u0(Ly5/f;LE6/e;)Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-static {}, LL6/b;->d()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-static {}, LL6/b;->b()V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-object v0

    .line 67
    :cond_4
    :try_start_2
    iget-object v0, p0, LO5/e;->A:LD6/a;

    .line 68
    .line 69
    invoke-interface {v0, p1}, LD6/a;->b(LE6/e;)Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-static {}, LL6/b;->d()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-static {}, LL6/b;->b()V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-object v0

    .line 85
    :cond_6
    :try_start_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 86
    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v2, "Unrecognized image class: "

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    :goto_1
    invoke-static {}, LL6/b;->d()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    invoke-static {}, LL6/b;->b()V

    .line 115
    .line 116
    .line 117
    :cond_7
    throw p1
.end method

.method protected bridge synthetic m(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO5/e;->k0(LC5/a;)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected m0()LC5/a;
    .locals 3

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PipelineDraweeController#getCachedImage"

    .line 8
    .line 9
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, LO5/e;->C:Lx6/x;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v2, p0, LO5/e;->D:Ls5/d;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {v0, v2}, Lx6/x;->get(Ljava/lang/Object;)LC5/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, LC5/a;->C()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, LE6/e;

    .line 33
    .line 34
    invoke-interface {v2}, LE6/e;->x1()LE6/p;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2}, LE6/p;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, LC5/a;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-static {}, LL6/b;->d()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-static {}, LL6/b;->b()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-object v1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {}, LL6/b;->d()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-static {}, LL6/b;->b()V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-object v0

    .line 69
    :cond_5
    :goto_0
    invoke-static {}, LL6/b;->d()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-static {}, LL6/b;->b()V

    .line 76
    .line 77
    .line 78
    :cond_6
    return-object v1

    .line 79
    :goto_1
    invoke-static {}, LL6/b;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    invoke-static {}, LL6/b;->b()V

    .line 86
    .line 87
    .line 88
    :cond_7
    throw v0
.end method

.method protected n0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LS5/a;->p()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method protected bridge synthetic o()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO5/e;->m0()LC5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected o0(LC5/a;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LC5/a;->D()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method protected p0(LC5/a;)LE6/m;
    .locals 1

    .line 1
    invoke-static {p1}, LC5/a;->H(LC5/a;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ly5/k;->i(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LC5/a;->C()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LE6/e;

    .line 13
    .line 14
    invoke-interface {p1}, LE6/e;->B1()LE6/m;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public declared-synchronized q0()LG6/e;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LO5/e;->I:Ljava/util/Set;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, LG6/c;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LG6/c;-><init>(Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-object v1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method public s0(Ly5/n;Ljava/lang/String;Ls5/d;Ljava/lang/Object;Ly5/f;)V
    .locals 1

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PipelineDraweeController#initialize"

    .line 8
    .line 9
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p2, p4}, LS5/a;->E(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, LO5/e;->r0(Ly5/n;)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, LO5/e;->D:Ls5/d;

    .line 19
    .line 20
    invoke-virtual {p0, p5}, LO5/e;->A0(Ly5/f;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-direct {p0, p1}, LO5/e;->v0(LE6/e;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, LL6/b;->d()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-static {}, LL6/b;->b()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method protected t()LI5/c;
    .locals 3

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PipelineDraweeController#getDataSource"

    .line 8
    .line 9
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    invoke-static {v0}, Lz5/a;->w(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object v0, LO5/e;->M:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "controller %x: getDataSource"

    .line 30
    .line 31
    invoke-static {v0, v2, v1}, Lz5/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, LO5/e;->E:Ly5/n;

    .line 35
    .line 36
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LI5/c;

    .line 41
    .line 42
    invoke-static {}, LL6/b;->d()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-static {}, LL6/b;->b()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-object v0
.end method

.method protected declared-synchronized t0(Ll6/g;LS5/b;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LO5/e;->H:LP5/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LP5/a;->f()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, LO5/e;->H:LP5/a;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, LP5/a;

    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/common/time/AwakeTimeSinceBootClock;->get()Lcom/facebook/common/time/AwakeTimeSinceBootClock;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1, p0}, LP5/a;-><init>(LF5/b;LO5/e;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LO5/e;->H:LP5/a;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, LO5/e;->H:LP5/a;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, LP5/a;->c(Ll6/g;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LO5/e;->H:LP5/a;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p1, v0}, LP5/a;->g(Z)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p2}, LS5/b;->l()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, LK6/b;

    .line 45
    .line 46
    iput-object p1, p0, LO5/e;->J:LK6/b;

    .line 47
    .line 48
    invoke-virtual {p2}, LS5/b;->k()[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, [LK6/b;

    .line 53
    .line 54
    iput-object p1, p0, LO5/e;->K:[LK6/b;

    .line 55
    .line 56
    invoke-virtual {p2}, LS5/b;->m()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, LK6/b;

    .line 61
    .line 62
    iput-object p1, p0, LO5/e;->L:LK6/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ly5/i;->b(Ljava/lang/Object;)Ly5/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "super"

    .line 6
    .line 7
    invoke-super {p0}, LS5/a;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Ly5/i$a;->b(Ljava/lang/String;Ljava/lang/Object;)Ly5/i$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "dataSourceSupplier"

    .line 16
    .line 17
    iget-object v2, p0, LO5/e;->E:Ly5/n;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ly5/i$a;->b(Ljava/lang/String;Ljava/lang/Object;)Ly5/i$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ly5/i$a;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public w0(LE6/m;)Ljava/util/Map;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, LE6/l;->getExtras()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method protected x0(Ljava/lang/String;LC5/a;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LS5/a;->N(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    throw p1
.end method

.method protected bridge synthetic y(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO5/e;->o0(LC5/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method protected y0(LC5/a;)V
    .locals 0

    .line 1
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected bridge synthetic z(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO5/e;->p0(LC5/a;)LE6/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public declared-synchronized z0(LG6/e;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LO5/e;->I:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    throw p1
.end method
