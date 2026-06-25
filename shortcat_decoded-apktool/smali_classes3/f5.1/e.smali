.class public Lf5/e;
.super Ld5/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU4/r;


# direct methods
.method public constructor <init>(Lf5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ld5/j;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lf5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/j;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    check-cast v0, Lf5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lf5/c;->i()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public initialize()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/j;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    check-cast v0, Lf5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lf5/c;->e()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/j;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    check-cast v0, Lf5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lf5/c;->stop()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ld5/j;->a:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    check-cast v0, Lf5/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf5/c;->k()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
