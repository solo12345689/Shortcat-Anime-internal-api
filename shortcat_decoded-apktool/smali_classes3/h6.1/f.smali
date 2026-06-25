.class public Lh6/f;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/graphics/drawable/Animatable;
.implements LN5/a;


# instance fields
.field private a:La6/a;

.field private final b:Lh6/c;

.field private c:Lh6/d;

.field private final d:LV5/d;

.field private final e:Lh6/f$a;


# direct methods
.method public constructor <init>(La6/a;)V
    .locals 2

    .line 1
    const-string v0, "animationBackend"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lh6/f;->a:La6/a;

    .line 10
    .line 11
    new-instance p1, Lh6/c;

    .line 12
    .line 13
    new-instance v0, Lj6/a;

    .line 14
    .line 15
    iget-object v1, p0, Lh6/f;->a:La6/a;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lj6/a;-><init>(La6/d;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Lh6/c;-><init>(Lj6/b;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lh6/f;->b:Lh6/c;

    .line 24
    .line 25
    new-instance p1, Lh6/e;

    .line 26
    .line 27
    invoke-direct {p1}, Lh6/e;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lh6/f;->c:Lh6/d;

    .line 31
    .line 32
    new-instance p1, LV5/d;

    .line 33
    .line 34
    invoke-direct {p1}, LV5/d;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, LV5/d;->a(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lh6/f;->d:LV5/d;

    .line 41
    .line 42
    new-instance p1, Lh6/f$a;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Lh6/f$a;-><init>(Lh6/f;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lh6/f;->e:Lh6/f$a;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 2
    .line 3
    invoke-interface {v0}, La6/a;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/f;->b:Lh6/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lh6/c;->a()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 17
    .line 18
    invoke-interface {v0}, La6/d;->a()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    iget-object v1, p0, Lh6/f;->b:Lh6/c;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lh6/c;->g(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lh6/f;->c:Lh6/d;

    .line 30
    .line 31
    invoke-interface {v1, p0}, Lh6/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lh6/f;->b:Lh6/c;

    .line 38
    .line 39
    invoke-virtual {v1}, Lh6/c;->h()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lh6/f;->c:Lh6/d;

    .line 46
    .line 47
    invoke-interface {v1, p0}, Lh6/d;->a(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lh6/f;->a:La6/a;

    .line 51
    .line 52
    invoke-interface {v1, p0, p1, v0}, La6/a;->h(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Lh6/f;->c:Lh6/d;

    .line 59
    .line 60
    invoke-interface {p1, p0, v0}, Lh6/d;->d(Landroid/graphics/drawable/Drawable;I)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lh6/f;->b:Lh6/c;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lh6/c;->f(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object p1, p0, Lh6/f;->b:Lh6/c;

    .line 70
    .line 71
    invoke-virtual {p1}, Lh6/c;->e()V

    .line 72
    .line 73
    .line 74
    :goto_1
    iget-object p1, p0, Lh6/f;->b:Lh6/c;

    .line 75
    .line 76
    invoke-virtual {p1}, Lh6/c;->c()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    const-wide/16 v3, -0x1

    .line 81
    .line 82
    cmp-long p1, v0, v3

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Lh6/f;->e:Lh6/f$a;

    .line 87
    .line 88
    invoke-virtual {p0, p1, v0, v1}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    iget-object p1, p0, Lh6/f;->c:Lh6/d;

    .line 93
    .line 94
    invoke-interface {p1, p0}, Lh6/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lh6/f;->b:Lh6/c;

    .line 98
    .line 99
    invoke-virtual {p1, v2}, Lh6/c;->g(Z)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 2
    .line 3
    invoke-interface {v0}, La6/a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 2
    .line 3
    invoke-interface {v0}, La6/a;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->b:Lh6/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh6/c;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "bounds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 7
    .line 8
    invoke-interface {v0, p1}, La6/a;->d(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->d:LV5/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV5/d;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 7
    .line 8
    invoke-interface {v0, p1}, La6/a;->l(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->d:LV5/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV5/d;->c(Landroid/graphics/ColorFilter;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 7
    .line 8
    invoke-interface {v0, p1}, La6/a;->f(Landroid/graphics/ColorFilter;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->a:La6/a;

    .line 2
    .line 3
    invoke-interface {v0}, La6/d;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lh6/f;->b:Lh6/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lh6/c;->i()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lh6/f;->c:Lh6/d;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Lh6/d;->b(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/f;->b:Lh6/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh6/c;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/f;->c:Lh6/d;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Lh6/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lh6/f;->e:Lh6/f$a;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
