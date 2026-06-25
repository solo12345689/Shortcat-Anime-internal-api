.class public Ly6/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Landroid/graphics/Bitmap$Config;

.field private i:Landroid/graphics/Bitmap$Config;

.field private j:LC6/c;

.field private k:Landroid/graphics/ColorSpace;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x64

    .line 5
    .line 6
    iput v0, p0, Ly6/e;->a:I

    .line 7
    .line 8
    const v0, 0x7fffffff

    .line 9
    .line 10
    .line 11
    iput v0, p0, Ly6/e;->b:I

    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    iput-object v0, p0, Ly6/e;->h:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    iput-object v0, p0, Ly6/e;->i:Landroid/graphics/Bitmap$Config;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a()Ly6/d;
    .locals 1

    .line 1
    new-instance v0, Ly6/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly6/d;-><init>(Ly6/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b()Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/e;->i:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/e;->h:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LN6/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public e()Landroid/graphics/ColorSpace;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/e;->k:Landroid/graphics/ColorSpace;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LC6/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/e;->j:LC6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly6/e;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly6/e;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly6/e;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly6/e;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Ly6/e;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Ly6/e;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly6/e;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly6/e;->d:Z

    .line 2
    .line 3
    return v0
.end method
